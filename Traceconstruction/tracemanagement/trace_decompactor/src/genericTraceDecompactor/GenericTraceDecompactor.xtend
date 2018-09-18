package genericTraceDecompactor

import java.util.ArrayList
import java.util.HashSet
import java.util.List
import java.util.Set
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.TreeIterator
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import trace.CompositParameterList
import trace.LeafObjectState
import trace.LeafParameterList
import trace.NormalStep
import trace.ObjectState
import trace.ParameterList
import trace.ParameterValue
import trace.PatternOccurrenceStepData
import trace.PatternOcurrence
import trace.RepeatingStep
import trace.State
import trace.Step
import trace.StepPattern
import trace.Trace
import trace.TraceFactory
import trace.TransientObjectState
import trace.Value

import static tracemetamodel.java.stateOperations.*
import static tracemetamodel.xtend.Util.*
import static tracemetamodel.xtend.parameterOperation.*
import static tracemetamodel.xtend.stateOperation.*

class GenericTraceDecompactor {
	var static List<PatternOcurrenceStep> PatternList = new ArrayList<PatternOcurrenceStep>();

	new() {
	}

	// **************************************************************************************************
	// //////// this  method gets a trace data and generate the original trace data by calling the relevant methods
	// **************************************************************************************************   
	def void Decompactor(Trace trace, String filename) {

		deC_State(trace)
		deC_steppattern(trace)
		deC_Parameterlist(trace)
		var decompactorMain d
		d = new decompactorMain()
		d.createSerializedTraceforGeneral(trace, "Original" + filename + ".xmi")

	}

	// **************************************************************************************************
	// //////// this  method gets a trace data and generate the original basestate data 
	// **************************************************************************************************   
	def void deC_steppattern(Trace trace) {
		findandReplacepatternOcuurence(trace)

	}

	// **************************************************************************************************
	// //////// this  method gets a trace data and generate the original parameterlist data 
	// **************************************************************************************************   
	def void deC_Parameterlist(Trace trace) {
		var EList<ParameterValue> templist = new BasicEList<ParameterValue>();
		var EList<ParameterValue> realvaluelist = new BasicEList<ParameterValue>();
		var EList<Integer> orderlist = new BasicEList<Integer>

		var Step t = null
		var EObject e = null

		trace.parameterlist.clear
		var TreeIterator<EObject> iter = trace.eAllContents
		while (iter.hasNext()) {
			e = iter.next
			if (e instanceof Step) {
				t = e
				realvaluelist.clear
				templist.clear
				orderlist.clear
				val LeafParameterList newparamlist = TraceFactory.eINSTANCE.createLeafParameterList
				if (t.parameterlist instanceof LeafParameterList) {

					newparamlist.parametervalue.addAll(t.parameterlist.parametervalue)
				} else {
					getParameterValuelist(t.parameterlist, templist);
					if (!(t.parameterlist as CompositParameterList).paramtervaluesOrder.empty) {
						orderlist.addAll((t.parameterlist as CompositParameterList).paramtervaluesOrder)

						CreateValueOrder(orderlist, templist, realvaluelist)

						newparamlist.parametervalue.addAll(realvaluelist)

					} else {
						newparamlist.parametervalue.addAll(templist)
					}

				}
				var ParameterList existparamlist = trace.parameterlist.findFirst [p |
					p.parametervalue.elementsEqual(newparamlist.parametervalue)
				]
				if (existparamlist == null) {
					trace.parameterlist.add(newparamlist)
					t.parameterlist = newparamlist
				} else
					t.parameterlist = existparamlist

			} // end while
		}

	}

	// **************************************************************************************************
	// //////// this  method gets a trace data and generate the original objectstate data 
	// **************************************************************************************************   
	def ObjectState deC_Objectstate(Trace trace, TransientObjectState t) {
		var EList<Value> templist = new BasicEList<Value>();
		var EList<EStructuralFeature> featurelist = new BasicEList<EStructuralFeature>
		val LeafObjectState newobjstate = TraceFactory.eINSTANCE.createLeafObjectState
		var i = 0
		var n = 0
		var boolean found = false
		if (t.objectstate instanceof LeafObjectState) {
			newobjstate.value.addAll(t.objectstate.value)
		} else {
			getobjectStateValues(t.objectstate, templist);
			if (!t.estructuralfeature.empty) {
				var EList<Value> templist2 = new BasicEList<Value>();
				createfeaturelist(t.transientobject, featurelist)
				if (!featurelist.elementsEqual(t.estructuralfeature)) {
					n = t.estructuralfeature.size
					for (EStructuralFeature f : featurelist) {
						i = 0
						found = false
						while (i < n && !found) {
							if (f == t.estructuralfeature.get(i)) {
								templist2.add(templist.get(i))
								found = true
							}
							i = i + 1
						}
					}
					newobjstate.value.addAll(templist2)
				}

			} else {
				newobjstate.value.addAll(templist)
			}

		}

		trace.objectstate.add(newobjstate)
		return newobjstate
	}

	// **************************************************************************************************
	// //////// this  method gets a trace data and generate the original basestate data 
	// **************************************************************************************************   
	def void deC_State(Trace trace) {

		var Set<TransientObjectState> traceobjectlist = new HashSet<TransientObjectState>();
		// removing all objectstate before creating new ones
		trace.objectstate.clear

		for (State b : trace.state) {

			traceobjectlist = ExtractState(b)
			// val BaseState basestate = TraceFactory.eINSTANCE.createBaseState
			b.transientObjectsStates.clear

			for (TransientObjectState t : traceobjectlist) {
				var TransientObjectState tbs = TraceFactory.eINSTANCE.createTransientObjectState
				tbs.transientobject = t.transientobject

				tbs.objectstate = deC_Objectstate(trace, t)
				tbs.estructuralfeature.clear
				// basestate.tracedObjectsStates.add(tbs)
				b.transientObjectsStates.add(tbs)

			}
			b.basestate = null
			traceobjectlist.clear
		// basestatelist.add(basestate)
		}

	}

	// **************************************************************************************************
	// //////// this  method gets a trace data and generate the original step data 
	// **************************************************************************************************   
	def static PatternOcurrenceStep deC_PatternOcurrence(Trace trace, PatternOcurrence b, int pos) {
		var int i = 0

		var int k = 0
		var PatternOcurrenceStep pt = new PatternOcurrenceStep()
		pt.patternocurrence = b
		var int numberstepinpattern = 0
		var int rep = 0

		// numberstepinpattern=b.pattern.repeatingstep.size
		var List<RepeatingStep> rlist = getallrepeatingstepPattern(b.pattern)
		numberstepinpattern = rlist.size
		while (rep < b.repet) {
			i = 0
			for (PatternOccurrenceStepData p : (b as PatternOcurrence).stepdata) {
				val NormalStep step = TraceFactory.eINSTANCE.createNormalStep
				step.steptype = p.step.steptype
				step.state = p.states.get(rep)
				if (p.parameterlists.get(rep) != null)
					step.parameterlist = p.parameterlists.get(rep)
				k = getParentofRepeatingStep(i, rlist)

				if (k != -1) {
					step.parent = pt.steplist.get(rep * numberstepinpattern + k)
					pt.steplist.get(rep * numberstepinpattern + k).children.add(step)
				} else
					step.parent = null
				pt.steplist.add(step)

				i = i + 1
			} // end for
			rep = rep + 1
		} // end while
		val Step pstep = b.parent
		if (pstep != null) {
			i = (pstep as NormalStep).children.indexOf(b)
			(pstep as NormalStep).children.remove(b)

		} else {
			i = trace.step.indexOf(b)
			trace.step.remove(b)
		}

		// adding a set of steps instead of patternoccurence 
		for (NormalStep s : pt.steplist) {
			if (s.parent == null) {
				if (pstep != null)
					(pstep as NormalStep).children.add(i, s)
				else
					trace.step.add(i, s)
				i = i + 1
			}

		}
//	      if (pstep!=null)
//			  (pstep as NormalStep).children.addAll(pos,pt.steplist)
//		  else
//	   		   trace.step.addAll(pos,pt.steplist)
		return pt

//         for (n=0;n<numberstepinpattern;n++){
//        	if (i==0){
//        		p=b.stepdata.get(i*numberstepinpattern +n)
//                val NormalStep step=TraceFactory.eINSTANCE.createNormalStep
//			 	step.steptype= p.step.steptype
//			 	step.state=p.states.get(i)
//			 	step.parameterset=p.parameterSets.get(i)
//			 	 if (b.parent!=null)
//			 	     (b.parent as NormalStep).children.add(step)
//			 	 else
//	   		 	     trace.step.add(step)
//			 	
//       			    //extracting list of included repeatingstep in steppattern
//                 	o=b.pattern.repeatingstep.get(n) as EObject
//				    val iterator2 = o.eAllContents
//				    val rlist = new ArrayList<RepeatingStep>
//				    while (iterator2.hasNext) {
//						var eo2 = iterator2.next()
//						rlist.add(eo2 as RepeatingStep)
//                 	}
//        			k=0
//					while (k<rlist.size)
//        			{
//        				p=b.stepdata.get(i*numberstepinpattern +n)
//        	 			val NormalStep step2=TraceFactory.eINSTANCE.createNormalStep
//			 			step2.steptype=rlist.get(k).steptype
//			 			step.state=p.states.get(i)
//			 			step.parameterset=p.parameterSets.get(i)
//    					newpatternoccurstepdata2.step=rlist.get(k)
//							newpatternoccurstepdata2.states.add(step.state)
//							if (step.parameterlist!=null)
//						    	newpatternoccurstepdata2.parameterlists.add(step.parameterlist)
//							patternoccur.stepdata.add(newpatternoccurstepdata2)
//							RemoveSteps.add(step as NormalStep) //TODO : if step is patternoccurence this should be updated
//                  			removestepIndex=removestepIndex+1
//							k=k+1
//						}
//						
//        		
//        	}
	// (b as PatternOcurrence).stepdata.forEach[p |
	// } //end if
	// k=k+1
	// }   //end for
//
	// trace.repeatingstep.clear
	// trace.steppattern.clear
	}

	// /////////////////////////////////////////////////////////////////////////////////
// ////get allcontents of pattern repeating steps
// /*****************
// /////////////////////////////////////////////////////////////////////////////////
	def static int getParentofRepeatingStep(int i, List<RepeatingStep> rlist) {
		var int k = 0
		for (k = i - 1; k >= 0; k--)
			if (rlist.get(i).parent == rlist.get(k))
				return k
		return -1
	}

// /////////////////////////////////////////////////////////////////////////////////
// ////get allcontents of pattern repeating steps
// /*****************
// /////////////////////////////////////////////////////////////////////////////////
	def static List<RepeatingStep> getallrepeatingstepPattern(StepPattern pattern) {
		var EObject o = null
		val rlist = new ArrayList<RepeatingStep>
		for (RepeatingStep r : pattern.repeatingstep) {
			rlist.add(r)
			o = r as EObject
			val iterator = o.eAllContents
			while (iterator.hasNext) {
				var eo2 = iterator.next()
				rlist.add(eo2 as RepeatingStep)
			}
		}
		return rlist

	}

	// /////////////////////////////////////////////////////////////////////////////////
// ////Traversing to the trace for finding a  patternoccurence//////
// /****************************************************
// /////////////////////////////////////////////////////////////////////////////////
	def static public void findandReplacepatternOcuurence(Trace trace, Step root, int pos) {
		if(root == null) return;
		// var  PatternOcurrenceStep pt=null
		var Step f1 = null
		if (root instanceof PatternOcurrence) {
			PatternList.add(deC_PatternOcurrence(trace, root, pos))
			return;
		}
		var int i = 0

		if ((root as NormalStep).children.size != 0) {
			while ((i < (root as NormalStep).children.size)) {
				if ((root as NormalStep).children.get(i) instanceof NormalStep) {
					f1 = (root as NormalStep).children.get(i) as NormalStep
					findandReplacepatternOcuurence(trace, f1, i)
				} else
//			  	    PatternList.add(deC_PatternOcurrence(trace,(root as NormalStep).children.get(i) as PatternOcurrence, i))
					deC_PatternOcurrence(trace, (root as NormalStep).children.get(i) as PatternOcurrence, i)
				i = i + 1
			}
		}
		return;

	}

	// /////////////////////////////////////////////////////////////////////////////////
// ////Traversing to the trace for finding a  patternoccurence//////
// /****************************************************
// /////////////////////////////////////////////////////////////////////////////////
	def static public void findandReplacepatternOcuurence(Trace trace) {

		var int i = 0
		var List<Step> steplist = new ArrayList<Step>();
		steplist.addAll(trace.step)
		for (Step p : steplist) {
			findandReplacepatternOcuurence(trace, p, i)
			i = i + 1

		}
		trace.steppattern.clear
		trace.repeatingstep.clear

	}

	// /////////////////////////////////////////////////////////////////////////////////
// ////removing pattern occuernce in the trace
// /*****************
// /////////////////////////////////////////////////////////////////////////////////
	def static void removePatternOccurence(Trace trace, Step step, Step stepparent) {
//	var int i=0
//	var Step f1=null
		// removing patternoccurence
//	      if (pstep!=null)
//	          (pstep as NormalStep).children.remove(b)
//	      else
//	         trace.step.remove(b)
//	         //adding a set of steps instead of patternoccurence    
//	      if (pstep!=null)
//			  (pstep as NormalStep).children.addAll(pos,steplist)
//		  else
//	   		   trace.step.addAll(pos,steplist)
//	  if (step instanceof BigStep)
//	  {
//	  	
//    	  //	for(val Iterator<Step> it = (step as BigStep).children.iterator(); it.hasNext();) {
//          //  var Step s2 = (it as Step).next();
//	  	//while (i<(step as BigStep).children.size)
//	  		for (Step s1: (step as BigStep).children)
//	     	{
//			  	println((step as BigStep).children.size + " i : " + i)
//			//   f1=(step as BigStep).children.get(i)
//			   f1=s1
//		
//			   removePatternOccurence(trace, f1,step)
//			  	   i=i+1
//		   }
//	  }
//	
//	  if (step instanceof PatternOcurrence)
//	    {
//	 	if (stepparent !=null)
//	  	   (stepparent as BigStep).children.remove(step)
//	  	else
//	  	  trace.stepspec.remove(step)
//	  	 return  ;
//	  	}
//	 if (step instanceof SmallStep)
//	   return;
//      final ListIterator<E> li = list.listIterator();
//     while (li.hasNext()) {
//         li.set(operator.apply(li.next()));
//     }
// 
	}

// /////////////////////////////////////////////////////////////////////////////////
// ////Removing pattern occurrence
// /*****************
// /////////////////////////////////////////////////////////////////////////////////
//def static void deC_Step(Trace trace, Step step, int pos)
//	{
//	var int i=0
//	var Step f1=null
//
//	  if (step instanceof NormalStep)
//	  {
//	  	while (i<(step as NormalStep).children.size)
//			  {
//			  	println((step as NormalStep).children.size + " i : " + i + "step" + step)
//			   f1=(step as NormalStep).children.get(i)
//			   deC_Step(trace, f1,i)
//			  	   i=i+1
//			   }
//	  }
//	
//	  if (step instanceof PatternOcurrence)
//	  {
//	  	deC_PatternOcurrence (trace,step,pos)
//	  	   return  ;
//	  }
// 
//
//	}
//	
// /////////////////////////////////////////////////////////////////////////////////
// ////this method get the original parameterset for the trace
// /*****************
// /////////////////////////////////////////////////////////////////////////////////
//def static void deC_ParameterSet(Trace trace)
//	{
//
//  trace.parametersets.forEach[o | 
//  	if (o instanceof CompositParameterSet)
//  	{
//  	 var int i=0  
//     var EList<ParameterValue> plist= new BasicEList<ParameterValue>
//   //     plist.addAll(getParameterValuelist(o))
//     var LeafParameterSet leafparamset=TraceFactory.eINSTANCE.createLeafParameterSet
//    // leafparamset=getParameterValuelist(o)
//     getParameterValuelist(o).forEach[t | 
//  	 println t.values
//  ]
//    // leafparamset.values.addAll(getParameterValuelist(o))
//     for (ParameterValue p:getParameterValuelist(o) )
//     {
//         leafparamset.values.add(plist.get(i))
//         i=i+1
//     }    	
//     trace.parametersets.remove(o)
//     trace.parametersets.add(leafparamset)
//     deC_updateParamset(trace,trace.rootStep, o,leafparamset )
//  }
//     
//  ]
//	  if (objectstate instanceof CompositeObjectState)
//	  {
//	  	while (i<(objectstate as CompositeObjectState).objectstates.size)
//			  {
//			  
//			   f1=(objectstate as CompositeObjectState).objectstates.get(i)
//			   deC_State(trace, f1)
//			  	i=i+1
//			   }
//	  }
//	
//	  if (objectstate instanceof LeafObjectState)
//	  {
//	  	if (objectstate instanceof LeafObjectState).
//	  	deC_PatternOcurrence (trace,step)
//	  	   return  ;
//	}
// /////////////////////////////////////////////////////////////////////////////////
// ////updating parameterset of steps
// /*****************
// /////////////////////////////////////////////////////////////////////////////////
//def static void deC_updateParamset(Trace trace, Step step, ParameterSet oldparam,ParameterSet newparam)
//	{
//	var int i=0
//	var Step f1=null
//
//	  if (step instanceof BigStep)
//	  {
//	  	while (i<(step as BigStep).children.size)
//			  {
//			 // 	println((step as BigStep).children.size + " i : " + i + "step" + step)
//			   f1=(step as BigStep).children.get(i)
//			   deC_updateParamset(trace, f1,oldparam,newparam)
//			  	   i=i+1
//			   }
//	  }
//	
//	  if (step.parameterset == oldparam)
//	  {
//	       step.parameterset = newparam
//	  	   return  ;
//	  }
// 
//
//	}
}
