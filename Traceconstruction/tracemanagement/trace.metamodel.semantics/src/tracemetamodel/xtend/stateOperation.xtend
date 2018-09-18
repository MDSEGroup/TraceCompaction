package tracemetamodel.xtend

import java.util.Collections
import java.util.List
import java.util.ListIterator
import java.util.Set
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import trace.CompositeObjectState
import trace.LeafObjectState
import trace.ObjectState
import trace.State
import trace.Trace
import trace.TraceFactory
import trace.TransientObjectState
import trace.Value

class stateOperation {
	// /////////////////////////////////////////////////////////////////////////////////
	// /*****RETRIVE VALUES OF ObjectState and values reference**************************************************************
		def static   EList<Value> getobjectStateValuelist(ObjectState objectstate, EList<Value> templist) {
			getobjectStateValues(objectstate, templist)
			if (!objectstate.value.empty)
			    templist.addAll(objectstate.value)
			return templist	
	}
	// /////////////////////////////////////////////////////////////////////////////////
	// /*****RETRIVE VALUES OF ObjectState**************************************************************
	// /////////////////////////////////////////////////////////////////////////////////
	def static EList<Value> getobjectStateValues(ObjectState objectstate, EList<Value> templist) {

		var ObjectState f1 = null;
		var int i = 0;

		if(objectstate == null) return templist;

		if (objectstate instanceof CompositeObjectState) {
			while (i < (objectstate as CompositeObjectState).objectstates.size) {
				f1 = (objectstate as CompositeObjectState).objectstates.get(i)

				getobjectStateValues(f1, templist);

				i = i + 1;
			}
			templist.addAll((objectstate as CompositeObjectState).value)
		} else {
			for (Value v : (objectstate as LeafObjectState).value)
				// templist.addAll((objectstate as LeafObjectState).value);
				templist.add(v)
		// featurelist.addAll(trace.state.filter[s| s.transientObjectsStates.findFirst[t| t.objectstate == objstate].transientobject.eClass.EStructuralFeatures])
//		    	  featurelist.addAll(tranobjstate.estructuralfeature)
		}

		return templist
	}

	// /////////////////////////////////////////////////////////////////////////////////////////
	// ////finding a objectstate included in param//////
	// /*****************
	// ////////////////////////////////////////////////////////
//		def  public static ObjectState findIncludedObjectState (EList<ObjectState> frequentobjectstates, EList<Value> Currentobjectvaluelist,List<ObjectState> similarobjects)
//			{
////				frequentobjectstates.sortBy[b | (b as LeafObjectState).value.size]
////				var int i=0
////				i=frequentobjectstates.size-1
////				while ( i>0)
////				{
////					if (frequentobjectstates.get(i) instanceof LeafObjectState)
////			              frequentObjectvaluelist.addAll((frequentobjectstates.get(i) as LeafObjectState).value)
////			       else
////			        getobjectStateValuelist(frequentobjectstates.get(i),frequentObjectvaluelist);
////				   if 	(Currentobjectvaluelist.containsAll(frequentObjectvaluelist))
////				       
////				   
////				}
////				return null
//				var int distance=9999999
//				var int mindistance	=9999999;
//				var ObjectState minobj=null;
//				var EList<Value> templist = new BasicEList<Value>();
//				
//				
//			
//			 
//			        
//		//		for (ObjectState o : objectstatelist)
//			   for (ObjectState o : frequentobjectstates)
//				{
//					if (o instanceof LeafObjectState)
//					{  
//					     if (Currentobjectvaluelist.containsAll((o as LeafObjectState).value))
//					     	distance=Currentobjectvaluelist.size - (o as LeafObjectState).value.size
//					   }
//					else  
//					{
//						templist.clear();
//						getobjectStateValuelist(o,templist);
//						if (Currentobjectvaluelist.containsAll(templist))
//						   distance=Currentobjectvaluelist.size - templist.size
//					}
//					if (distance ==0)
//				    		{
//				    			similarobjects.add(o);
//				    			return o;
//				    		}
//				    else
//					 if (distance<mindistance)
//		    			{
//		    				mindistance=distance;
//		    				minobj=o;
//		    			
//		    			}  
//				}
//				if (mindistance<=Currentobjectvaluelist.size) // if similarity is more than 50% we use compositobjectstate otherwise create a new leafobjectstate
//				  return minobj
//				else
//			      return null	
//			
//			
//				}
	// /////////////////////////////////////////////////////////////////////////////////////////
	//
	def static int findfrequency(EList<Value> Currentobjectvaluelist, EList<Value> objectvaluelist) {
		var int f = 0
		var int min = 999
		for (Value value : objectvaluelist) {
			f = Collections.frequency(Currentobjectvaluelist, value);
			if (f < min)
				min = f
		}
		return min
	}

	// /////////////////////////////////////////////////////////////////////////////////////////
	//
	def static boolean isContain(EList<Value> list1, EList<Value> list2) {

		var int i;
		for (i = 0; i < list2.size(); i++) {
			if (!(list1.contains(list2.get(i)))) {
				return false
			}
		}
		return true

	}

	// /////////////////////////////////////////////////////////////////////////////////////////
	// ////finding a objectstate included in param//////
	// /*****************
	// ////////////////////////////////////////////////////////
	def public static boolean findObjectStatesinobjectstate(EList<ObjectState> frequentobjectstates,
		EList<Value> Currentobjectvaluelist, List<ObjectState> similarobjects) {

		var EList<Value> templist = new BasicEList<Value>();
		var int frequency = 0
		var int j = 0

		var int i = frequentobjectstates.size - 1
		var boolean iscontain = false

		while (i >= 0 && Currentobjectvaluelist.size > 0) {
			val ObjectState o = frequentobjectstates.get(i)
			templist.clear
			iscontain = false
			if (o instanceof LeafObjectState) {
				if (Currentobjectvaluelist.size == (o as LeafObjectState).value) {

					if (Currentobjectvaluelist.containsAll((o as LeafObjectState).value) &&
						(o as LeafObjectState).value.containsAll(Currentobjectvaluelist))
						iscontain = true
				} else {
					if (Currentobjectvaluelist.containsAll((o as LeafObjectState).value))
						iscontain = true
				}
				if (iscontain) {
					frequency = findfrequency(Currentobjectvaluelist, (o as LeafObjectState).value)
					for (; j < frequency; j++)
						similarobjects.add(o)

					subtractList(frequency, Currentobjectvaluelist, (o as LeafObjectState).value)

					if (Currentobjectvaluelist.empty)
						return (true)
					else
						findObjectStatesinobjectstate(frequentobjectstates, Currentobjectvaluelist, similarobjects)

				}
			} else {
				templist.clear();
				getobjectStateValues(o, templist);
				if (Currentobjectvaluelist.size == templist.size) {

					if (Currentobjectvaluelist.containsAll(templist) && templist.containsAll(Currentobjectvaluelist))
						iscontain = true
				} else {
					if (Currentobjectvaluelist.containsAll(templist))
						iscontain = true
				}
				if (iscontain) {

					frequency = findfrequency(Currentobjectvaluelist, templist)
					for (; j < frequency; j++)
						similarobjects.add(o)

					subtractList(frequency, Currentobjectvaluelist, templist)

					if (Currentobjectvaluelist.empty)
						return (true)
					else
						findObjectStatesinobjectstate(frequentobjectstates, Currentobjectvaluelist, similarobjects)
				}

			}
			i = i - 1
		}
		if (Currentobjectvaluelist.empty)
			return (true)
		else
			return false

	}

	// ///////////////////////////////////////////////////////////////
	// //
	def static void subtractList(int frequency, EList<Value> list1, EList<Value> list2) {
		//var i = 0
		var j = 0
		var found = false
		var ListIterator<Value> iter = null
		var Value v2 = null
		for (j = 0; j < frequency; j++) {

			for (Value v1 : list2) {
				found = false
				iter = list1.listIterator();
				while (iter.hasNext() && !found) {
					v2 = iter.next
					if (v1 == v2) {
						iter.remove
						found = true
					}
				}
			}
		}

	}

	// /////////////////////////////////////////////////////////////////////////////////////////
	// ////Traversing to the trace for finding difference between to arraylist of tracedobjectstate//////
	// /*****************
	// /////////////////////////////////////////////////////////////////////////////////////////
	// @SuppressWarnings("unchecked")
	def static int findDifferencetraceobjectstate(Set<TransientObjectState> l1, Set<TransientObjectState> l2) {

		var int numberofsimilarobj = 0;
		for (TransientObjectState  p : l2)
			if (l1.exists[obj|obj.objectstate == p.objectstate && obj.transientobject == p.transientobject])
				numberofsimilarobj = numberofsimilarobj + 1;

		return l2.size() - numberofsimilarobj;

	}

// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def static TransientObjectState findoriginalobject(Trace trace, ObjectState o) {
		for (State b : trace.state) {
			for (TransientObjectState t : b.transientObjectsStates)
				if (t.objectstate.value.elementsEqual(o.value))
					return t
		}
	}

// ///////////////////////////////////////////////////////////////////////////////////////////////////
// **************************************************************************************************
// recreating objectstates by traversingg all objectstates and finding the most similar ones 
// **************************************************************************************************
// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def static ObjectState findApproprateObjectstate(Trace trace, EList<ObjectState> objectstatelist,
		EList<Value> Currentobjectvaluelist) {

		var boolean found = false
		var ObjectState existobjectstate = null
		val EList<ObjectState> similarObjects = new BasicEList<ObjectState>

		val EList<Value> copyobjectvaluelist = new BasicEList<Value>

		// 1 : finding completely similar object state or an objectstate included in the new objectstate
		copyobjectvaluelist.addAll(Currentobjectvaluelist)
		// similarobjectstate=findIncludedObjectState(trace.objectstate, Currentobjectvaluelist,similarObjects)
		found = findObjectStatesinobjectstate(objectstatelist, Currentobjectvaluelist, similarObjects)
		if (found) {
			if (similarObjects.size == 1) { // leafobjectstate
				return (similarObjects.get(0))
			} else // compositeobjectstate
			{
				val CompositeObjectState comobj = TraceFactory.eINSTANCE.createCompositeObjectState
				comobj.objectstates.addAll(similarObjects)
				existobjectstate = (trace.objectstate.findFirst [o |
					(o instanceof CompositeObjectState) &&
						((o as CompositeObjectState).objectstates.elementsEqual(comobj.objectstates)) &&
						(o as CompositeObjectState).value.elementsEqual(comobj.value)
				])
				if (existobjectstate == null) {
					trace.objectstate.add(comobj)
					return (comobj as ObjectState)
				} else
					return existobjectstate

			}
		} else {
			if ((similarObjects.size != 0)) {
				val CompositeObjectState comobj = TraceFactory.eINSTANCE.createCompositeObjectState
				comobj.objectstates.addAll(similarObjects)
				comobj.value.addAll(Currentobjectvaluelist)
				existobjectstate = (trace.objectstate.findFirst [o |
					(o instanceof CompositeObjectState) &&
						((o as CompositeObjectState).objectstates.elementsEqual(comobj.objectstates) ) &&
						(o as CompositeObjectState).value.elementsEqual(comobj.value)
				])
				if (existobjectstate == null) {
					trace.objectstate.add(comobj)
					return comobj
				} else
					return existobjectstate
			} else {
				var LeafObjectState obj = TraceFactory.eINSTANCE.createLeafObjectState
				obj.value.addAll(copyobjectvaluelist)
				existobjectstate = (trace.objectstate.findFirst [o |
					(o instanceof LeafObjectState) && ((o as LeafObjectState).value.elementsEqual(copyobjectvaluelist))
				])
				if (existobjectstate == null) {
					trace.objectstate.add(obj)
					return (obj as ObjectState)
				} else
					return existobjectstate

			}

		}
	// TODO : for now, we assume that each if all the values of an objectstate are in the frequentobjectstates, we 
	// don't need to store it again, but if only the part of objectstate is the same with frequent objectstate, we 
	// store a new objectstate, we don't consider creating a compositobjectstate.
	// for this reason all following code is commented.
//			if (similarobjectstate instanceof LeafObjectState) {
//						val CompositeObjectState comobj = TraceFactory.eINSTANCE.createCompositeObjectState
//						comobj.objectstates.add(similarobjectstate)
//						Currentobjectvaluelist.removeAll(similarobjectstate.value)
//					    existobjectstate=findObjectState(trace,Currentobjectvaluelist)
//					    if (existobjectstate==null) {
//					       var LeafObjectState obj=TraceFactory.eINSTANCE.createLeafObjectState
//	    	               obj.value.addAll(Currentobjectvaluelist)
//						   comobj.objectstates.add(obj)
//						   trace.objectstate.add(obj)
//						   }
//						else
//						   comobj.objectstates.add(existobjectstate)
//						   
//						existobjectstate=(trace.objectstate.findFirst [o |
//					    (o instanceof CompositeObjectState) && ((o as CompositeObjectState).objectstates.containsAll(comobj.objectstates))])
//					    if (existobjectstate==null) {
//						  	trace.objectstate.add(comobj)
//						    return (comobj as ObjectState)
//					   }
//					   else
//					   return (existobjectstate )
//			}
//			else
//			{
//				 getobjectStateValuelist(similarobjectstate,plist) 
//				 val CompositeObjectState comobj = TraceFactory.eINSTANCE.createCompositeObjectState
//					comobj.objectstates.add(similarobjectstate)
//					Currentobjectvaluelist.removeAll(plist)
//					existobjectstate=findObjectState(trace,Currentobjectvaluelist)
//					    if (existobjectstate==null) {
//					    	var LeafObjectState obj=TraceFactory.eINSTANCE.createLeafObjectState
//	    	               obj.value.addAll(Currentobjectvaluelist)
//					       comobj.objectstates.add(obj)
//						   trace.objectstate.add(obj)
//						   }
//						else
//						   comobj.objectstates.add(existobjectstate)
//						   
//						existobjectstate=(trace.objectstate.findFirst [o |
//					    (o instanceof CompositeObjectState) && ((o as CompositeObjectState).objectstates.containsAll(comobj.objectstates))])
//					    if (existobjectstate==null) {
//						  	trace.objectstate.add(comobj)
//						    return (comobj as ObjectState)
//					   }
//					   else
//					   return (existobjectstate )
//
//			}
	// till here we have the first part of compaction for finding similar objectstates or the ones that included in the current obejctstate
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
// **************************************************************************************************
// finding objectstate 
// **************************************************************************************************
// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def static ObjectState findObjectState(Trace trace, EList<Value> valuelist) {
		val EList<Value> plist = new BasicEList<Value>();
		(trace.objectstate.findFirst [o |
			if (o instanceof LeafObjectState)
				((o as LeafObjectState).value.elementsEqual(valuelist))
			else
				getobjectStateValues(o, plist)
			plist.elementsEqual(valuelist)
		])

	}

	// /////////////////////////////////////////////////////////////////////////////////
	def static void CreateValueOrder(EList<Integer> porder, EList<Value> p1value, EList<Value> p2value) {
		var int i = 0
		var j = 0
		var found = false
		var n = porder.size
		if (!porder.empty)
			for (Integer po : porder) {
				j = 0
				found = false
				while (j < n && !found) {
					if (porder.get(j) == i) {
						p2value.add(p1value.get(j))

						found = true
					}
					j = j + 1
				}
				i = i + 1
			}
		else
			p2value.addAll(p1value)

	}

}
