package petrinet.traceconstruction
/*  --- this class in not required it is only for petrinet. we use GenericTraceConstructor 
import java.util.LinkedHashMap
import petrinet.Net
import petrinet.PetrinetFactory
import petrinet.Place
import petrinet.Transition
import trace.BaseState

import trace.CompositParameterSet
import trace.LeafObjectState
import trace.LeafParameterSet
import trace.LiteralInteger
import trace.ObjectState
import trace.ParameterSet
import trace.ParameterValue
import trace.ParamterKindEnum
import trace.PatternOccurrenceStepData
import trace.PatternOcurrence

import trace.Step
import trace.StepPattern
import trace.StepType
import trace.Trace
import trace.TraceFactory
import trace.TracedObject
import trace.TracedObjectState
import trace.Value

import static petrinet.java.modelInstance.*
import static tracemetamodel.java.stepOperations.*
import static tracemetamodel.xtend.stepOperation.*
import static tracemetamodel.java.parameterOperation.*

import static extension trace.aspects.StepAspect.*
import static extension trace.aspects.StepSpecAspect.*
import static tracemetamodel.java.stateOperations.*
import org.eclipse.emf.ecore.EObject
import java.util.Stack
import trace.RefValue
import org.eclipse.emf.common.util.EList
import trace.RepeatingStep
import java.util.List
import java.util.ArrayList
import org.eclipse.emf.common.util.BasicEList
import trace.NormalStep

//import usingtracemetamodel.Tracedobject

class CompactTraceConstructor {
	
	val Trace trace = TraceFactory.eINSTANCE.createTrace
	var Stack<NormalStep> stepstack = new Stack<NormalStep>();
	//var SmallStep currentSmallStep = TraceFactory.eINSTANCE.createSmallStep
//	var BigStep currentBigStep = TraceFactory.eINSTANCE.createBigStep
	
	var Transition currentTransition = PetrinetFactory.eINSTANCE.createTransition
	//This variable is for storing the input parameter of step in beforefire event and using it for afterfire event
	var ParameterValue currentPrametervalue =TraceFactory.eINSTANCE.createParameterValue
	var int stepposition=1


	////////////////////////////////////////////
	////DEFINITION OF  VARIABLES FOR TYPE OF COMPACTION
	////////////////////////////////////////////
//	val boolean statecompaction=false
//	val boolean parametercompaction=false
//	val boolean objectstatecompaction=false

//	val boolean stepcompaction=false
//	val String filename="CompactlessTrace.xmi"
	////////////////////////////////////////////
	val boolean statecompaction=true
	val boolean parametercompaction=true
	val boolean objectstatecompaction=true

	val boolean stepcompaction=true
	val String filename="CompactTrace.xmi"
	////////////////////////////////////////////
	// if performance is more important than memory footprint, we use LinkedHashMap for storing step data 
//	public val static LinkedHashMap<Integer, Step> STEPARRAY = new LinkedHashMap<Integer, Step>;

	/// Constructor of CompactTraceConstructor
	new() 
	 {
		println ("Generation of Compact trace")
	
	
	 }
	// **************************************************************************************************
	// //////// INITIALIZATION OF TRACE 
	// **************************************************************************************************   
	def void initTrace(Net net) {

		// create tracedobject, fist basestate and assign newobjects and tracedobjectstate
		createTracedObject(net)

		println("initTrace finished")
	}

	// **************************************************************************************************
	// //////// BEFORE FIRE OF A TRANSITION- run for smallstep
	// **************************************************************************************************   
	def void beforeFire(Net net, Transition transition) {
		// Create Step
		var NormalStep  step = TraceFactory.eINSTANCE.createNormalStep
		step = createSmallStep("fire", transition)
	
		// Creation of Input parameter
		createInputParameter(transition, step)

        if (!stepstack.empty())
	     {
	     	var NormalStep bigstep=stepstack.pop()
	     	bigstep.children.add(step)
	     	step.parent=bigstep
	     	stepstack.push(bigstep)
	     	
	     }
	      stepstack.push(step)
		// Setting previousSmallStep with current Step
		//currentSmallStep = smallstep

		println("before fire finished for :" + transition.name)

	// throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	// **************************************************************************************************
	// //////// AFTER FIRE OF A TRANSITION- run for smalstep
	// **************************************************************************************************   
	def void afterFire(Net net, Transition transition) {

		var NormalStep smallstep = TraceFactory.eINSTANCE.createNormalStep
	    smallstep=stepstack.pop 
		// Creation of output parameter
		createOutputParameter(transition, smallstep)

		// Create state and assign to current smallstep
		smallstep.state = createState(net)
		
		//STEPARRAY.put(stepposition,smallstep)
		// storing the current transition for using in Run_methods
		currentTransition = transition

		println("afterfire finished for :" + transition.name)

	// throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	// **************************************************************************************************
	// //////// BEFORE RUNING OF A NETWORK  - run for BigStep
	// ************************************************************************************************** 
	def void beforeRun(Net net) {

		// Creating bigstep and  Setting previousSmallStep with current Step
		
		var NormalStep bigstep= TraceFactory.eINSTANCE.createNormalStep
		bigstep=createBigstep(net)
		stepstack.push(bigstep)

	
		// Creation of Input parameter
		createInputParameter(currentTransition, bigstep)
	  // STEPARRAY.put(stepposition,bigstep)

		// throw new UnsupportedOperationException("TODO: auto-generated method stub")
		println("beforeRun finished")
	}

	// **************************************************************************************************
	// //////// AFTER RUNING OF A NETWORK- run for BigStep
	// ************************************************************************************************** 
	def void afterRun(Net net) {

	    var NormalStep bigstep= TraceFactory.eINSTANCE.createNormalStep
		bigstep=stepstack.pop 
		// assigning state for bigstate
		bigstep.state = trace.basestate.last
		//currentBigStep.state=trace.basestate.last
		// Creation of Output parameter
		createOutputParameter(currentTransition, bigstep)
		
	 
	     
		println("afterRun finished")
	// throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	// **************************************************************************************************
	// //////// FINISH OF TRACE 
	// ************************************************************************************************** 
	def void finishTrace(Net net) {
		// throw new UnsupportedOperationException("TODO: auto-generated method stub")
	
	   if (stepcompaction==true)
	   //create a compacted trace in the part of step
		  compactStep2(trace)
	   	
		createSerializedTrace(trace, filename)
		
		println("finishTrace finished")

	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE STATE OF MODEL
	// WITH OUT COMPATION	
	// **************************************************************************************************
	// /////////////////////////////////////////////////////////////////////////////////////////////////// 	
	def BaseState createState(Net net) {
	
	if (statecompaction==true)
	 //create a compacted trace in the part of state
	 {
	
	 	var List<TracedObjectState> traceobjectlist = new ArrayList<TracedObjectState>();
	 	var List<TracedObjectState> similartraceobjectlist = new ArrayList<TracedObjectState>();
	 	var List<TracedObjectState> basestatetraceobjectlist = new ArrayList<TracedObjectState>();
	 	
	
		// storing state after run
		// /initialize first BaseState   
		val BaseState basestate = TraceFactory.eINSTANCE.createBaseState
		
			
		
		// creating objectstate for each traceobject 
		// for each place a objectstate is created regardless of duplication
		// for each objectstate a tracedobjectstate is created and its tracedobject and objectstate are assigned
	   // executedModel.forEach[p |
	   	net.place.forEach [ p |
			// definition of objectstate
			println(p.tokens.toString + " " + p.name)
			
			
			]

	     for (Place p : net.place)
	     {
			// definition of objectstate
 	        var ObjectState objstate = TraceFactory.eINSTANCE.createLeafObjectState
			// Create Objectstate
			
		 	objstate = createObjectState(p)
			var TracedObject tracedobject=findtracedobject(p)
			var TracedObjectState traceobjstate = TraceFactory.eINSTANCE.createTracedObjectState
			if (tracedobject==null) 
			{
			    //there is no objectstate for the tracedobject until now, so it is new objectstate
		//	    tracedobject=createTracedObject(p) 
			    basestate.newobjects.add(tracedobject)
			
			}
				// assign Objectstate to TracedObjectState
			traceobjstate.objectstate = objstate

			traceobjstate.tracedobject =tracedobject
		   
		    traceobjectlist.add(traceobjstate)
		 }  
		 //calling a method to find the closest basestate to the current basestate
		 var BaseState _basebasestate=CalculateBaseStateIsomorphic(trace,traceobjectlist)
		basestate.basestate = _basebasestate
		basestatetraceobjectlist=ExtractState(_basebasestate)
	
		 
 		 ///Control of Existance of ObjectState in BaseState
	    //////////////CHANGE OBJECT STATES
		  for (TracedObjectState p : traceobjectlist)
		  {
     		 if (basestatetraceobjectlist.exists[obj | obj.objectstate==p.objectstate && obj.tracedobject==p.tracedobject])
     		   { //If objectstate exists in base basestate, we remove from the new basestate 
   			    	similartraceobjectlist.add(p)
     		   }
          }
	    traceobjectlist.removeAll(similartraceobjectlist)
	    // control for finding deleteobjects
		// if in there is an objectstate in previuse state that not exists in the new basestate and also 
		// there is no other objectstate with the same tracedobject, it means this objectstate has been deleted. 
         ///////DELETED OBJECT STATE
	    //there is no deleted object in petrinet
		  
		/// if state doesn't have any change, all reference will be empty		   
		   if (traceobjectlist.empty && basestate.newobjects.empty && basestate.deletedobjects.empty)
		   {
		      return _basebasestate
		   }
		  
		   else
		   {
		   	 if (!traceobjectlist.empty)
		   	  	  basestate.tracedObjectsStates.addAll(traceobjectlist)
		   	  trace.basestate.add(basestate)
		      return basestate
		      
		   }
	   }
	   else
	   	 //create the original trace in the part of basestate
	   {
		val BaseState basestate = TraceFactory.eINSTANCE.createBaseState
		basestate.basestate = null // //////////FOR NOW
		// creating objectstate for each traceobject 
		// for each place a objectstate is created regardless of duplication
		// for each objectstate a tracedobjectstate is created and its tracedobject and objectstate are assigned
		net.place.forEach [ p |
			// definition of objectstate
			println(p.tokens.toString + " " + p.name)

			var TracedObjectState traceobjstate = TraceFactory.eINSTANCE.createTracedObjectState

			// Create Objectstate and assign to TracedObjectState
			traceobjstate.objectstate = createObjectState(p)

		   traceobjstate.tracedobject = findtracedobject(p)
			basestate.tracedObjectsStates.add(traceobjstate)
		]

		trace.basestate.add(basestate)
		return basestate
	   }
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE INPUT PARAMETER AND PARAMETERSET
	// WITH OUT COMPATION	
	// **************************************************************************************************
	// /////////////////////////////////////////////////////////////////////////////////////////////////// 	
	def void createInputParameter(Transition transition, Step smallstep) { // Definition of input parameter
		val LeafParameterSet leafparamset = TraceFactory.eINSTANCE.createLeafParameterSet
		val ParameterValue paramvalue = TraceFactory.eINSTANCE.createParameterValue
		
		paramvalue.directionKind = ParamterKindEnum.IN
		if (!transition.input.empty) {
			transition.input.forEach [ in |
				println(transition.name + " " + in.name + " " + in.tokens)

				// Create Value and assign to parametervalue
				paramvalue.values.add(createRefValue(in))

			]
			currentPrametervalue=createParameterValue(paramvalue)
				
			
		}

	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE OUT PARAMETER AND PARAMETERSET
	// WITH  COMPATION	
	// **************************************************************************************************
	// /////////////////////////////////////////////////////////////////////////////////////////////////// 
	def void createOutputParameter(Transition transition, Step step) {
		val LeafParameterSet leafparamset = TraceFactory.eINSTANCE.createLeafParameterSet

		val ParameterValue paramvalue = TraceFactory.eINSTANCE.createParameterValue
		var ParameterValue parvalue = TraceFactory.eINSTANCE.createParameterValue
		
		paramvalue.directionKind = ParamterKindEnum.OUT

		if (!transition.output.empty) {
			transition.output.forEach [ out |
				println(transition.name + " " + out.name + "" + out.tokens)
				// Create Value and assign to parametervalue
				paramvalue.values.add(createRefValue(out))

			]
			//if there is a parametervalue the same as paramvalue, return that one else return paramvalue
			parvalue=createParameterValue(paramvalue)
			leafparamset.values.add(createParameterValue(paramvalue))
			//if there is values in input parameter of transition, they are added as the parameter of transition
			if (currentPrametervalue!=null)
			    leafparamset.values.add(currentPrametervalue)
	
				//existleafparamset=createParameterSet(leafparamset)
				//step.parameterset = createParameterSet(leafparamset, step )
				createParameterSet(leafparamset, step )
		}
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE SMALL STEP
	// WITH OUT COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def NormalStep createSmallStep(String stepname, Transition transition) {
		
	
		// /creation of smallstep  && Create Steptype
		val NormalStep smallstep = TraceFactory.eINSTANCE.createNormalStep
		smallstep.steptype = createstepType(stepname)
		smallstep.originalobject=transition
	
		trace.step.add(smallstep)
		
		//smallstep.parent = currentBigStep
		
		smallstep.position =  stepposition
	   // StepSpecAspect.position(smallstep,stepposition)
	    stepposition=stepposition+1
	   

			
		return smallstep
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE BIG STEP
	// WITH OUT COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def NormalStep createBigstep(Net net) {
		
		// create steptype
		val String stepName = "Run" // //// This is added to specify between BigStep and smallStep
	
		var NormalStep bigstep = TraceFactory.eINSTANCE.createNormalStep
		bigstep.steptype = 	createstepType(stepName)
	    //set position of step for accessing to the next step
	    bigstep.position = stepposition
	 //   StepSpecAspect.position(bigstep,stepposition)
	    stepposition=stepposition+1
	    
		trace.step.add(bigstep)

		// Seting rootstep of trace
		if (trace.rootStep == null)
			trace.rootStep = bigstep

		return bigstep
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE VALUE
	// WITH  COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def Value createValue(Place p) {
		val value = trace.value.findFirst [ l |
			l instanceof LiteralInteger && (l as LiteralInteger).intvalue == p.tokens
		]
		if (value == null) {
			// definition of a literal value for input tokens
			val LiteralInteger intvalue = TraceFactory.eINSTANCE.createLiteralInteger
			intvalue.intvalue = p.tokens
			trace.value.add(intvalue)
			return (intvalue as Value)
		} else
			
			return value
	}
	
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// Find TracedObject corresponding to a Place
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def TracedObject findtracedobject(Place p) {
	
		val TracedObject t2 = trace.tracedobject.findFirst [ t |
			t.originalObject==p	]
			return t2
			}
	
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE REFVALUE
	// WITH  COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def Value createRefValue(Place p) {
		
		val value = trace.value.findFirst [ l |
			l instanceof RefValue && (l as RefValue).tracedobject.originalObject == p
		]
	
		if (value == null) {
			// definition of a refvalue for input objects
			val RefValue refvalue = TraceFactory.eINSTANCE.createRefValue
			refvalue.tracedobject=findtracedobject(p)
			trace.value.add(refvalue)
			return (refvalue as Value)
		} else
			
			return value
    }
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE STEPTYPE
	// WITH  COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def StepType createstepType(String stepname) {
		val StepType _steptype = trace.steptype.findFirst [ l |
			l.stepName ==stepname
		]
		if (_steptype == null) {
			// definition of a steptype
				var StepType steptype = TraceFactory.eINSTANCE.createStepType
				steptype.stepName = stepname
				trace.steptype.add(steptype)
				return (steptype)
		} else
			
				return _steptype
	}
		// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CONTROL THE EXISTANCE OF PRAMETERVALUE IN TRACE, IF THAT IS EXISTS, RETURN IT, 
	// ELSE ADD NEW PARATERVALUE TO TRACE
	// WITH COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def ParameterValue createParameterValue(ParameterValue paramvalue) {
		val parvalue = trace.parameterValues.findFirst[l |
	
		  (l.values.sortBy[ v | v.hashCode].equals(paramvalue.values.sortBy[p | p.hashCode]) && l.directionKind==paramvalue.directionKind)
			]
		if (parvalue == null) {
			
			trace.parameterValues.add(paramvalue)
			return (paramvalue)
		} 
		else
			
			return parvalue
	}



	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CONTROL THE EXISTANCE OF PRAMETERSET IN TRACE, IF THAT IS EXISTS, RETURN IT, 
	// ELSE ADD NEW PARATERSET TO TRACE
	// WITH COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def void createParameterSet(LeafParameterSet paramset, Step step) {
		
	if (parametercompaction==true)
	{ /// create compacted version of trace
//	   val ParameterSet leafparamset=trace.parametersets.findFirst[p | 
//
//	   	if (p instanceof LeafParameterSet) 
//             (p as LeafParameterSet).values.sortBy[ v | v.hashCode].equals(paramset.values.sortBy[ v | v.hashCode])
//      //  else
//      //    getParameterValuelist(p).sortBy[ v | v.hashCode].equals(paramset.values.sortBy[ v | v.hashCode])
//	   ]
//	   
//	   	if (leafparamset == null) {
//			trace.parametersets.add(paramset)
//			return (paramset)
//		 } 
//		 else
//			 return leafparamset
	 
	   var ParameterSet similarparamset=null
    	similarparamset=CalculateParameterSetIsomorphic (trace, paramset)
    	if (similarparamset==null)
    	{
    		trace.parametersets.add(paramset)
    		step.parameterset=paramset
    		return;
    	}	
    	if (similarparamset instanceof LeafParameterSet)
    	{
     	   if ((similarparamset as LeafParameterSet).values.sortBy[ v | v.hashCode].equals(paramset.values.sortBy[ v | v.hashCode]))
     	      step.parameterset=similarparamset
    	   	  // return similarparamset
    	   else
    	   {
    	  	if (paramset.values.containsAll((similarparamset as LeafParameterSet).values)) 
    	  		{
    	  				val CompositParameterSet comset = TraceFactory.eINSTANCE.createCompositParameterSet
    	  				comset.parametersets.add(similarparamset)
						paramset.values.removeAll((similarparamset as LeafParameterSet).values)
						comset.parametersets.add(paramset)
						trace.parametersets.add(comset)
						step.parameterset=comset
    	  		}
    	  		else
    	  		{
		    		trace.parametersets.add(paramset)
		    		step.parameterset=paramset
		    		return;
    			}	
    	  	}
    	  	
    	 } // similarparamset is a composit parameterset
		else
       	{
       	   (similarparamset as CompositParameterSet).parametersets.forEach[ p |
       	   var CompositParameterSet comset = TraceFactory.eINSTANCE.createCompositParameterSet
       	   if (!paramset.values.empty)
            {
       	   
       	   	if (p instanceof LeafParameterSet)
       	   	{
       	    	if (paramset.values.containsAll((p as LeafParameterSet).values))
    	  		{
    	  				comset.parametersets.add(p)
						paramset.values.removeAll((p as LeafParameterSet).values)
    	  		}
    	  		
    	  	}
            else
            { 
            
           	var List<ParameterValue> plist= getParameterValuelist(p)
       	   	if (paramset.values.containsAll(plist))
       	   		{
       	   			comset.parametersets.add(p)
					paramset.values.removeAll(plist)
       	   		}
      	 }
      	 
      	 }
      	    comset.parametersets.add(paramset)
			trace.parametersets.add(comset)
			step.parameterset=comset
				
      	   ]
       	  
       	}
       				
    	       	   
    
	
//	val CompositParameterSet comset = TraceFactory.eINSTANCE.createCompositParameterSet
//		trace.parametersets.forEach [ p |
//			
//			paramset.values.retainAll((p as CompositParameterSet).parametersets.
//		 if (!paramset.values.empty)
//			if (!comset.parametersets.empty) {
//				if (p instanceof LeafParameterSet) {
//					if (paramset.values.containsAll((p as LeafParameterSet).values)) {
//						comset.parametersets.add(p)
//						paramset.values.removeAll((p as LeafParameterSet).values)
//						
//					
//					}
//				}
//				if (p instanceof CompositParameterSet) {
//				//	println("comset1" )
//					if (comset.parametersets.containsAll((p as CompositParameterSet).parametersets)) {
//				//		println("comset2" + p.parametersets.last )
//						comset.parametersets.add(p)
//						comset.parametersets.removeAll((p as CompositParameterSet).parametersets)
//				//		println("comset3" + comset.parametersets.last )
//					
//					}
//				}
//			}
//
//			// else 
//			if (comset.parametersets.empty) {
//				//println("aftercosmet0" + p.toString)
//				if (p instanceof LeafParameterSet) {
//				//	println("Leaf" + p.values.get(0))
//					if (paramset.values.containsAll((p as LeafParameterSet).values)) {
//					//	println("containsall" + p.values.get(0))
//						comset.parametersets.add(p)
//						paramset.values.removeAll((p as LeafParameterSet).values)
//				
//					}
//				}
//			}
//		
//	
//		]
//
//	
//			
//		if (comset.parametersets.empty) {
//			val existleafparamset = trace.parametersets.findFirst [ l |
//				((l instanceof LeafParameterSet) && (l as LeafParameterSet).values.sortBy[ v | v.hashCode].equals(paramset.values.sortBy[ v | v.hashCode]))
//			// println ("param" + l.values.get(0).toString())
//			]
//
//			if (existleafparamset == null) {
//			trace.parametersets.add(paramset)
//			return (paramset)
//		 } 
//		 else
//		 {
//		 return existleafparamset
//		 }
//		}
//
//		if (!comset.parametersets.empty) {
//		if (!paramset.values.empty)
//		{
//			val LeafParameterSet remainparamset = TraceFactory.eINSTANCE.createLeafParameterSet
//			paramset.values.forEach[v | remainparamset.values.add(v)]
//			trace.parametersets.add(remainparamset)
//			comset.parametersets.add(remainparamset)
//		}
//			
//			
//			
////			comset.parametersets.forEach[l | 
////				println ("start loop")
////				if (l instanceof CompositParameter)
////				println("comset" + (l as CompositParameter).parametersets.get(0) + "size" + (l as CompositParameter).parametersets.size + "last" + (l as CompositParameter).parametersets.last + "traceset" + trace.parametersets.last)
////				else
////				println("comsetvalue" + (l as LeafParameterSet).values.get(0))
////			]
//
//			val existcomparamset = trace.parametersets.findFirst [ l |
//				if (l instanceof CompositParameterSet)
//				   (l instanceof CompositParameterSet) && ((l as CompositParameterSet).parametersets.sortBy[hashCode].equals(comset.parametersets.sortBy[hashCode]))
//				  else
//				   (l instanceof LeafParameterSet) && (l as LeafParameterSet).equals(comset)
//				   
//			]
//
//			if (existcomparamset == null) {
//				trace.parametersets.add(comset)
//				return (comset)
//			} else {
//				return existcomparamset
//			}
//		}
	}
	else
	{ //create original trace with out compaction in the part of parameterset
		val existleafparamset = trace.parametersets.findFirst [ l |
			((l instanceof LeafParameterSet) && 
				(l as LeafParameterSet).values.sortBy[ v | v.hashCode].equals(paramset.values.sortBy[ v | v.hashCode])
			)


			// println ("param" + l.values.get(0).toString())
			]

			if (existleafparamset == null) {
			trace.parametersets.add(paramset)
			step.parameterset=paramset
		
		 } 
		 else
			 step.parameterset=existleafparamset
	}

}
	


	
	
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE OBJECT STATE
	// WITH COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def ObjectState createObjectState(Place p) {
	
	if (objectstatecompaction==true)
	{//create compacted trace in the part of objectstate
		val LeafObjectState objstate = TraceFactory.eINSTANCE.createLeafObjectState

		// Create value and assign to objectstate
		objstate.value.add(createValue(p))
		
       if  (trace.objectstate.exists[o | 
       	
       	(o instanceof LeafObjectState) && ((o as LeafObjectState).value.containsAll(objstate.value))])
       	
     
		{
			//in this case objectstate is  exists
			return (trace.objectstate.findFirst[o | 
				(o instanceof LeafObjectState) && ((o as LeafObjectState).value.containsAll(objstate.value))])
		}
		else
		{
			//in this case objectstate is not exists
			trace.objectstate.add(objstate)
			return (objstate as ObjectState)			
		}
		
		}
	else
	{ //create original trace with out compaction in the part of objectstate
		val LeafObjectState objstate = TraceFactory.eINSTANCE.createLeafObjectState

		// Create value and assign to objectstate
		objstate.value.add(createValue(p))
		
       if  (trace.objectstate.exists[o | 
       	
       	(o instanceof LeafObjectState) && ((o as LeafObjectState).value.containsAll(objstate.value))])
       	
     
		{
			//in this case objectstate is  exists
			return (trace.objectstate.findFirst[o | 
				(o instanceof LeafObjectState) && ((o as LeafObjectState).value.containsAll(objstate.value))])
		}
		else
		{
			//in this case objectstate is not exists
			trace.objectstate.add(objstate)
			return (objstate as ObjectState)			
		}
	}			
				 
		
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE TREACEDOBJECT, CREATE FIRST BASESTATE AND ASSIGN NEWOBJECTS AND TRACEDOBJECTSTATE
	// WITH  COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def void createTracedObject(Net net) {
		// /initialize first BaseState   
		val BaseState basestate0 = TraceFactory.eINSTANCE.createBaseState
		basestate0.basestate = null
  		
  		
		// Creation of Tracedobject
		net.place.forEach [ p |
			var TracedObject traceobj = TraceFactory.eINSTANCE.createTracedObject
			
			
			var EObject e1=p
			traceobj.originalObject=e1 // Assiging a new object to the tracedobject
			
			
			trace.tracedobject.add(traceobj)
			// assigning newobjects reference
			basestate0.newobjects.add(traceobj)

			var ObjectState objstate = TraceFactory.eINSTANCE.createLeafObjectState
			// Create Objectstate
			objstate = createObjectState(p)
			if (objstate != null) 
			{
				// Creation of objectstate and Traceobjstate of the first basestate
				val TracedObjectState Traceobjstate = TraceFactory.eINSTANCE.createTracedObjectState

				// Create Objectstate and assign to TracedObjectState
				Traceobjstate.objectstate = objstate
				Traceobjstate.tracedobject = traceobj

				// assigning tracedObjectsStates reference
				basestate0.tracedObjectsStates.add(Traceobjstate)
			}

		]
		trace.basestate.add(basestate0)
	}

// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE REPEATING SMALL STEP
	// WITH  COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	public def static RepeatingStep createSmallRepeatingstep(Trace trace, String stepname) {
		
	
		// /creation of RepeatingSmallStep  && Create Steptype
        var reptsmallstep =findRepeatingStep (trace,stepname)
//		var reptsmallstep = trace.stepspec.findFirst [ l  |
//			(l instanceof RepeatingSmallStep) && (l as RepeatingSmallStep).steptype.stepName == stepname
//		] as RepeatingSmallStep
		
		if (reptsmallstep == null) {
			// definition of a RepeatingSmallStep for  trace
			var RepeatingStep newreptsmallstep = TraceFactory.eINSTANCE.createRepeatingStep
			newreptsmallstep.steptype = trace.steptype.findFirst [ l |
			l.stepName ==stepname]
		//	newreptsmallstep.signature(stepname) //TODO : is signature needed for step compaction??
			//trace.stepspec.add(newreptsmallstep)
			trace.repeatingstep.add(newreptsmallstep)
			return (newreptsmallstep)
		} else
			
			return reptsmallstep as RepeatingSmallStep
      }
      
      // ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE REPEATING SMALL STEP
	// WITH  COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	public def static RepeatingStep createBigRepeatingstep(Trace trace, String sig) {
		
	
		// /creation of RepeatingSmallStep  && Create Steptype
	  var reptbigstep=findRepeatingStep ( trace, sig.substring(0,sig.indexOf("/")))
//		var reptbigstep = trace.stepspec.findFirst [ l  |
//			(l instanceof RepeatingBigStep) && (l as RepeatingBigStep).steptype.stepName == sig.substring(0,sig.indexOf("/"))
//		] as RepeatingBigStep
//		
		if (reptbigstep == null) {
			// definition of a RepeatingSmallStep for  trace
			var RepeatingStep newreptbigstep = TraceFactory.eINSTANCE.createRepeatingStep
			newreptbigstep.steptype = trace.steptype.findFirst [ l |
			l.stepName ==sig.substring(0,sig.indexOf("/"))]
		//	newreptbigstep.signature(sig)
			//trace.stepspec.add(newreptbigstep)
			trace.repeatingstep.add(newreptbigstep)
			return (newreptbigstep)
		} else
			
			return reptbigstep 
      }
      
      // ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE STEPPATTERN
	// WITH   COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	public def static StepPattern createSteppatttern(Trace trace, String content, StepPattern steppattern) {
	 var StepPattern steppattern1=TraceFactory.eINSTANCE.createStepPattern
			if (!content.contains("@"))
			{
				// is a small repeating step
				
			var RepeatsmallStep=findRepeatingStep (trace,content)
			if (RepeatsmallStep !=null){
				 if (steppattern==null)
				 {
					steppattern1.repeatingstep.add(RepeatsmallStep)
					trace.steppattern.add(steppattern1)	
					return steppattern1
				 }
				 else 
				 {
				 	steppattern.repeatingstep.add(RepeatsmallStep)
				 	return steppattern
				 }
				
				}
			}
			else
			{ // is a repeating big step
				
				var StepPattern steppattern2=TraceFactory.eINSTANCE.createStepPattern
			
			//	var RepeatBigStep=findRepeatingStep (trace,MYHASH.get(Integer.valueOf(content)).sig.substring(0,content.indexOf("/")-1))
			var RepeatBigStep=findRepeatingStep (trace,content.substring(0,content.indexOf("/")))

			if (RepeatBigStep !=null)
				{
				 if (steppattern==null)
				 {
					steppattern2.repeatingstep.add(RepeatBigStep)
					trace.steppattern.add(steppattern2)	
					return steppattern2
				 }
				 else 
				 {
				 	steppattern.repeatingstep.add(RepeatBigStep)
				 	return steppattern
				 }

				
			}
		}	
	}
      
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE Patternocurrence  for each pattern recognized in the trace
	// WITH  COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////

public def static PatternOcurrence createPatternOcurrence(Trace trace,String sig,String certificatepattern, int rept,StepPattern steppattern) {
		//find the right position in the trace for creating Patternocurrence 
	   		   var PatternOcurrence patternoccur = TraceFactory.eINSTANCE.createPatternOcurrence
			   patternoccur.pattern = steppattern
			   patternoccur.repet = rept
			
			   var Step step=findSpecificStepbySig(trace.rootStep,sig) as Step
			 	   
			   patternoccur.position(step.position)
			   var Step prevstep= step //getPreviuseStep(trace,step) as Step // for specifying the right position of the trace for adding the patternoccurrence
			    val Step stepparent=step.parent
			    var int stepposition=0
			  ////TODO : I AM NOT SURE ABOUT THIS STATEMENT
			    if (prevstep.parent!=null)
					 	stepposition=prevstep.parent.children.indexOf(prevstep)
				else
						stepposition=trace.step.indexOf(prevstep)
			   var int posinterval=getCountstepinPattern(trace,patternoccur.pattern)
			   
		       createPatternOccurStepData(trace,sig,rept,patternoccur,posinterval)
			       //find the relevant step in the trace with the specific sig for replacing with a patternoccurrence
		        if (prevstep !=null)
		        {
				 if (stepparent!=null)
				  	 (stepparent as NormalStep).children.add( stepposition,patternoccur)
					 	
				  else
				   	 trace.step.add(stepposition,patternoccur)
				}
					      
				return patternoccur

}

// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// get repeatingstep of each steppattern by recursive call
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	public def static void getStepdataforrepeatingStep(Trace trace,RepeatingStep repeatingstep , int rept , PatternOcurrence patternoccur,int numberstepinpattern) {
	
		if (repeatingstep instanceof RepeatingSmallStep )//|| r instanceof RepeatingSmallStep) 
 	    	{
 	    	createStepdataforrepeatingStep (trace, repeatingstep ,  rept ,  patternoccur, numberstepinpattern)
 	    	return;
 	        }
 	 
 	    if  (repeatingstep instanceof RepeatingBigStep )
 	    {
 	    	var int i=0
 	    	var RepeatingStep f1=null
 	     while (i<(repeatingstep as RepeatingBigStep).children.size)
			  {
			   
			   f1=(repeatingstep as RepeatingBigStep).children.get(i)
			  	  getStepdataforrepeatingStep(trace, f1 ,  rept ,  patternoccur, numberstepinpattern)
			  	   i=i+1
			    }
			    createStepdataforrepeatingStep(trace, repeatingstep ,  rept ,  patternoccur, numberstepinpattern)
			    
		   }
	}

// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE state data for each repeatingstep of steppattern in the trace
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
public def static void createStepdataforrepeatingStep(Trace trace,RepeatingStep repeatingstep , int rept , PatternOcurrence patternoccur,int numberstepinpattern) {
	    	var int i=0;
 	    	var PatternOccurrenceStepData patternoccurstepdata = TraceFactory.eINSTANCE.createPatternOccurrenceStepData
			var Step step=findSpecificStepbySig(trace.rootStep,repeatingstep.signature) as Step
			var ParameterSet tempparamset=TraceFactory.eINSTANCE.createCompositParameterSet
			patternoccurstepdata.step =repeatingstep
			var Step prestep=null;
			//var Step step=null;
			while (i<rept)	
			{

				patternoccurstepdata.states.add(step.state)
				if (patternoccurstepdata.parameterSets.contains(step.parameterset))
				{
				    tempparamset=step.parameterset
					patternoccurstepdata.parameterSets.add( tempparamset)
					
				}
				else
					patternoccurstepdata.parameterSets.add(step.parameterset)
				prestep=step
				//step.enabled=true
			//	posinterval=step.position+ numberstepinpattern
			//if (step.parent!=null)
		    // 	step = getNextStepafterPos(step.parent,step,step.position+ numberstepinpattern)
		 //   else
		        step = getNextStepafterPos(trace.rootStep,step,step.position+ numberstepinpattern)
				if (prestep.parent!=null)
				 // node is not a smallstep, it is a bigstep
					  prestep.parent.children.remove(prestep)
					else
					   trace.step.remove(prestep)
				i=i+1
		   } //end while
		
		   patternoccur.stepdata.add(patternoccurstepdata)
	  }

// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE state data for Patternocurrence in the trace
	//  the state and parametersets of each repeating step in a pattern occurence store sequentionaly 
	// WITH  COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
public def static void createPatternOccurStepData(Trace trace,String content, int rept , PatternOcurrence patternoccur,int numberstepinpattern) {

 	    patternoccur.pattern.repeatingstep.forEach[r | 
 	              getStepdataforrepeatingStep(trace, r ,  rept ,  patternoccur, numberstepinpattern)]
     	    
	    return ;
	

} 
 }
*/

