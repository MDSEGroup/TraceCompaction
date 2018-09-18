package tracemetamodel.java;

import static tracemetamodel.xtend.stateOperation.findDifferencetraceobjectstate;
import static tracemetamodel.xtend.stateOperation.getobjectStateValues;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import trace.CompositeObjectState;
import trace.LeafObjectState;
import trace.ObjectState;
import trace.State;
import trace.Trace;
import trace.TransientObject;
import trace.TransientObjectState;
import trace.Value;

public class stateOperations {

	protected static Set<TransientObjectState> traceobjectlist = new HashSet<TransientObjectState>();

	public static int findDifference(EList<Value> l, EList<Value> objectstate) {
		// LeafObjectState
		// difflist=TraceFactory.eINSTANCE.createLeafObjectState();
		int similarnumber = 0;

		// EList<ParameterValue> difflist = (EList<ParameterValue>)
		// TraceFactory.eINSTANCE.createParameterValue();
		for (int i = 0; i < objectstate.size(); ++i) {
			if (l.size() == i)
				return objectstate.size() - similarnumber;
			else if (objectstate.contains(l.get(i)))
				similarnumber = similarnumber + 1;
			// difflist.getValue().add(objectstate.get(i));
		}
		return objectstate.size() - similarnumber; // difflist.getValue().size();

	}

	@SuppressWarnings("unchecked")
	public static void preparevalueCollection(EObject p, EList<EObject> list, boolean _iscollection) {

		if (_iscollection)

			list.addAll((EList<EObject>) p);
		else// if (value instanceof EObject)
			list.add((EObject) p);
		// list.add(value);}
	}

	@SuppressWarnings("unchecked")
	public static void preparevalueCollection(Object p, EList<Object> list, boolean _iscollection) {
		if (_iscollection)

			list.addAll((EList<Object>) p);
		else// if (value instanceof EObject)
			list.add((Object) p);
		// list.add(value);}
	}

	@SuppressWarnings("unchecked")
	public static void preparevalueCollection(EStructuralFeature p, EList<Object> list, boolean _iscollection) {
		if (_iscollection) {
			EList<EObject> templist = new BasicEList<EObject>();
			templist.addAll((EList<EObject>) p);
			// list.addAll((EList<Object>)p);
		} else// if (value instanceof EObject)
			list.add((Object) p);
		// list.add(value);}
	}

	@SuppressWarnings("unchecked")
	public static void preparevalueCollectionforReference(EObject p, EStructuralFeature f, EList<EObject> list,
			boolean _iscollection) {
		final Object value = p.eGet(f);

		if (value != null) {
			if (_iscollection)
				// if (value instanceof Collection)
				// list.addAll((Collection)value);
				list.addAll((EList<EObject>) value);
			else// if (value instanceof EObject)
				list.add((EObject) value);
		}
		// list.add(value);}
	}

	public static void preparevalueCollectionforAttribute(EObject p, EStructuralFeature f, EList<Object> list,
			boolean _iscollection) {
		final Object value = p.eGet(f);
		if (value != null) {
			if (_iscollection)

				list.addAll((Collection<?>) value);
			else
				// list.add((EObject)value);}
				list.add(value);
		}
	}

	// /////////////////////////////////////////////////////////////////////////////////////////
	// ////Traversing to the trace for finding a objectstate//////
	// /*****************
	// /////////////////////////////////////////////////////////////////////////////////////////
	public static ObjectState CalculateObjectStateIsomorphic(Trace trace, LeafObjectState param,
			EList<ObjectState> similarobjects) {
		ObjectState minobj = null;
		int mindistance = 9999999;
		EList<Value> templist = new BasicEList<Value>();
		int distance = 0;
		for (Iterator<ObjectState> i = trace.getObjectstate().iterator(); i.hasNext();) {
			ObjectState p = i.next();
			if (p instanceof LeafObjectState)
				distance = findDifference(((LeafObjectState) p).getValue(), param.getValue());
			if (p instanceof CompositeObjectState) {
				templist.clear();
				getobjectStateValues(p, templist);
				distance = findDifference(templist, param.getValue());
				// distance=findDifference(getobjectStateValuelist(p),
				// param.getValue());
			}
			if (distance == 0) {
				similarobjects.add(p);
				return p;
			} else

			if (distance < mindistance) {
				mindistance = distance;
				minobj = p;

			}
		}
		if (mindistance == param.getValue().size())
			return null;
		else
			return (minobj);
	}

	/////////////////////////////////////////////////////////////////////////////////////////
	//// Traversing to the trace for finding basestate//////
	// *****************
	/////////////////////////////////////////////////////////////////////////////////////////
	public static State CalculateBaseStateIsomorphic(Trace trace, Set<TransientObjectState> param) {
		State minobj = null;
		int mindistance = 9999999;

		int distance = 0;
		for (Iterator<State> i = trace.getState().iterator(); i.hasNext();) {
			State p = i.next();

			distance = findDifferencetraceobjectstate(ExtractState(p), param);

			if (distance == 0)
				return p;
			else if (distance < mindistance) {
				mindistance = distance;
				minobj = p;
			}
		}
		return (minobj);
	}

	/////////////////////////////////////////////////////////////////////////////////////////
	//// getting the real data of basestate by calling recursively the method to
	///////////////////////////////////////////////////////////////////////////////////////// get
	///////////////////////////////////////////////////////////////////////////////////////// tracedobjectstate//////
	// *****************
	/////////////////////////////////////////////////////////////////////////////////////////
	public static Set<TransientObjectState> ExtractState(State basestate) {

		if (basestate == null)
			return null;
		else {

			ExtractState(basestate.getBasestate());

			for (Iterator<TransientObjectState> j = basestate.getTransientObjectsStates().iterator(); j.hasNext();) {
				TransientObjectState traceobjstate = j.next();
				TransientObject traceobj = traceobjstate.getTransientobject();
				for (Iterator<TransientObjectState> k = traceobjectlist.iterator(); k.hasNext();) {
					TransientObjectState objstatek = k.next();
					if (objstatek.getTransientobject() == traceobj) {
						traceobjectlist.remove(objstatek);
						break;

					}
				}
				traceobjectlist.add(traceobjstate);
			} // end if
		} // end for
			// extract ِ deleted collection
		return traceobjectlist;

	}

}
