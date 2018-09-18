package tracemetamodel.xtend

import trace.ParameterList
import trace.Trace
import trace.ParameterValue
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.BasicEList
import trace.CompositParameterList
import trace.TraceFactory
import trace.LeafParameterList
import java.util.List
import java.util.ListIterator
import java.util.Collections

class parameterOperation {
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
// **************************************************************************************************
// recreating objectstates by traversingg all objectstates and finding the most similar ones 
// **************************************************************************************************
// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def static ParameterList findApproprateParameterlist(Trace trace, EList<ParameterList> objectstatelist,
		EList<ParameterValue> Currentparametervaluelist) {

		var boolean found = false
		// var ParameterList existparameterlist=null
		val EList<ParameterList> similarObjects = new BasicEList<ParameterList>

		val EList<ParameterValue> copyparametervaluelist = new BasicEList<ParameterValue>

		copyparametervaluelist.addAll(Currentparametervaluelist)
		// similarobjectstate=findIncludedObjectState(trace.objectstate, Currentobjectvaluelist,similarObjects)
		found = findParameterListsinparameterlist(objectstatelist, Currentparametervaluelist, similarObjects)
		if (found) {
			if (similarObjects.size == 1) { // leafparameterlist
				return (similarObjects.get(0))
			} else // compositeparameterlist
			{
				val CompositParameterList comparam = TraceFactory.eINSTANCE.createCompositParameterList
				comparam.parameterlist.addAll(similarObjects)
				var ParameterList existparameterlist = (trace.parameterlist.findFirst [o |
					(o instanceof CompositParameterList) &&
						((o as CompositParameterList).parameterlist.elementsEqual(comparam.parameterlist)) &&
						(o as CompositParameterList).parametervalue.elementsEqual(comparam.parametervalue)
				])
				if (existparameterlist == null) {
					trace.parameterlist.add(comparam)
					return (comparam as ParameterList)
				} else
					return existparameterlist

			}
		} else {
			if ((similarObjects.size != 0)) {
				val CompositParameterList comparam = TraceFactory.eINSTANCE.createCompositParameterList
				comparam.parameterlist.addAll(similarObjects)
				comparam.parametervalue.addAll(Currentparametervaluelist)
				var ParameterList existparameterlist = (trace.parameterlist.findFirst [o |
					(o instanceof CompositParameterList) &&
						((o as CompositParameterList).parameterlist.elementsEqual(comparam.parameterlist)) &&
						(o as CompositParameterList).parametervalue.elementsEqual(comparam.parametervalue)
				])
				if (existparameterlist == null) {
					trace.parameterlist.add(comparam)
					return comparam
				} else
					return existparameterlist
			} else {
				var LeafParameterList obj = TraceFactory.eINSTANCE.createLeafParameterList
				obj.parametervalue.addAll(copyparametervaluelist)
				var ParameterList existparameterlist = (trace.parameterlist.findFirst [o |
					(o instanceof LeafParameterList) &&
						((o as LeafParameterList).parametervalue.elementsEqual(copyparametervaluelist))
				])
				if (existparameterlist == null) {
					trace.parameterlist.add(obj)
					return (obj as ParameterList)
				} else
					return existparameterlist

			}

		}
	}

// /////////////////////////////////////////////////////////////////////////////////////////
// ////finding a objectstate included in param//////
// /*****************
// ////////////////////////////////////////////////////////
	def public static boolean findParameterListsinparameterlist(EList<ParameterList> frequentparameterlists,
		EList<ParameterValue> Currentobjectvaluelist, List<ParameterList> similarobjects) {

		var EList<ParameterValue> templist = new BasicEList<ParameterValue>();
		var int frequency = 0
		var int j = 0

		var int i = frequentparameterlists.size - 1
		var boolean iscontain = false

		while (i >= 0 && Currentobjectvaluelist.size > 0) {
			val ParameterList o = frequentparameterlists.get(i)
			templist.clear
			iscontain = false
			if (o instanceof LeafParameterList) {
				if (Currentobjectvaluelist.size == (o as LeafParameterList).parametervalue) {

					if (Currentobjectvaluelist.containsAll((o as LeafParameterList).parametervalue) &&
						(o as LeafParameterList).parametervalue.containsAll(Currentobjectvaluelist))
						iscontain = true
				} else {
					if (Currentobjectvaluelist.containsAll((o as LeafParameterList).parametervalue))
						iscontain = true
				}
				if (iscontain) {
					frequency = findfrequency(Currentobjectvaluelist, (o as LeafParameterList).parametervalue)
					for (; j < frequency; j++)
						similarobjects.add(o)

					subtractList(frequency, Currentobjectvaluelist, (o as LeafParameterList).parametervalue)

					if (Currentobjectvaluelist.empty)
						return (true)
					else
						findParameterListsinparameterlist(frequentparameterlists, Currentobjectvaluelist,
							similarobjects)

				}
			} else {
				templist.clear();
				getParameterValuelist(o, templist);
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
						findParameterListsinparameterlist(frequentparameterlists, Currentobjectvaluelist,
							similarobjects)
				}

			}
			i = i - 1
		}
		if (Currentobjectvaluelist.empty)
			return (true)
		else
			return false

	}

	// /////////////////////////////////////////////////////////////////////////////////////////////
	// ///			
	def static void subtractList(int frequency, EList<ParameterValue> list1, EList<ParameterValue> list2) {
		// var i=0
		var j = 0
		var found = false
		var ListIterator<ParameterValue> iter = null
		var ParameterValue v2 = null
		for (j = 0; j < frequency; j++) {

			for (ParameterValue v1 : list2) {
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
	//
	def static int findfrequency(EList<ParameterValue> Currentobjectvaluelist, EList<ParameterValue> objectvaluelist) {
		var int f = 0
		var int min = 999
		for (ParameterValue value : objectvaluelist) {
			f = Collections.frequency(Currentobjectvaluelist, value);
			if (f < min)
				min = f
		}
		return min
	}

	// /////////////////////////////////////////////////////////////////////////////////////////
	//
	def static boolean isContain(EList<ParameterValue> list1, EList<ParameterValue> list2) {

		var int i;
		for (i = 0; i < list2.size(); i++) {
			if (!(list1.contains(list2.get(i)))) {
				return false
			}
		}
		return true

	}

	// /*****RETRIVE VALUES OF PARAMETERSET**************************************************************
	// /////////////////////////////////////////////////////////////////////////////////
	def static EList<ParameterValue> getParameterValuelist(ParameterList paramset, EList<ParameterValue> templist) {

		var ParameterList f1 = null;
		var int i = 0;

		if(paramset == null) return templist;

		if (paramset instanceof CompositParameterList) {

			while (i < (paramset as CompositParameterList).getParameterlist().size()) {
				f1 = (paramset as CompositParameterList).getParameterlist().get(i);

				getParameterValuelist(f1, templist);
				i = i + 1;
			}
			templist.addAll((paramset as CompositParameterList).parametervalue)
		} else {
			for (ParameterValue v : (paramset as LeafParameterList).getParametervalue())
				templist.add(v);

		}

		return templist;
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	//
	def static void CreateValueOrder(EList<Integer> porder, EList<ParameterValue> p1value,
		EList<ParameterValue> p2value) {
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
