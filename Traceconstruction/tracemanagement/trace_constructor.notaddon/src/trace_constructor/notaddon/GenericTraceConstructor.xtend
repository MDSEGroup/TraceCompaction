package trace_constructor.notaddon

import ca.pfv.spmf.algorithms.frequentpatterns.lcm.myAlgoLCMFreq
import ca.pfv.spmf.patterns.itemset_array_integers_with_count.Itemset
import ca.pfv.spmf.patterns.itemset_array_integers_with_count.Itemsets
import genericTraceDecompactor.GenericTraceDecompactor
import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.ListIterator
import java.util.Set
import java.util.Stack
import java.util.regex.Matcher
import java.util.regex.Pattern
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.TreeIterator
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEClass
import trace.CompositParameterList
import trace.CompositeObjectState
import trace.DynamicTransientObject
import trace.LeafObjectState
import trace.LeafParameterList
import trace.LiteralBoolean
import trace.LiteralFloat
import trace.LiteralInteger
import trace.LiteralString
import trace.NormalStep
import trace.ObjectState
import trace.ParameterList
import trace.ParameterValue
import trace.ParamterKindEnum
import trace.PatternOccurrenceStepData
import trace.PatternOcurrence
import trace.RefValue
import trace.RepeatingStep
import trace.State
import trace.StaticTransientObject
import trace.Step
import trace.StepPattern
import trace.StepType
import trace.Trace
import trace.TraceFactory
import trace.TransientObject
import trace.TransientObjectState
import trace.Value
import tracemetamodel.java.StepMap
import tracemetamodel.java.StepStatus
import tracemetamodel.java.pattern

import static tracemetamodel.java.modelInstance.*
import static tracemetamodel.java.stateOperations.*
import static tracemetamodel.java.stepOperations.*
import static tracemetamodel.xtend.Util.*
import static tracemetamodel.xtend.parameterOperation.*
import static tracemetamodel.xtend.stateOperation.*
import static tracemetamodel.xtend.stepOperation.*

import static extension trace.aspects.StepAspect.*
import static extension trace.aspects.StepSpecAspect.*


public class GenericTraceConstructor {

	public var Trace trace = TraceFactory.eINSTANCE.createTrace
	var Stack<NormalStep> stepstack = new Stack<NormalStep>();
	var HashMap<EObject, TransientObject> tracedobjectMap = new HashMap<EObject, TransientObject>;
	var Object implicitObject;
	var List<NormalStep> RemoveSteps = new ArrayList<NormalStep>();
	var HashMap<EObject, TransientObject> transientobjectMap = new HashMap<EObject, TransientObject>;
	var String IMPLICITSTEP = "ImplicitStep"
	var int stepMapIndex = 1
	var int removestepIndex = 1

	var int conter = 0

	// val int minsup = 70 // for caluculating frequent item sets in objectstate and parameterlist
	var int stepposition = 1
	var List<EObject> executedModel;

	// //////////////////////////////////////////
	// //DEFINITION OF  VARIABLES FOR TYPE OF COMPACTION
	// //////////////////////////////////////////
//	val boolean statecompaction=false
//	val boolean parametercompaction=false
//	val boolean objectstatecompaction=false
//	val boolean stepcompaction=false
//	val String tracetype="CompactlessTrace"
	// /////////////////////////////////////////
	val boolean statecompaction
	val boolean parametercompaction
	val boolean objectstatecompaction
	val boolean stepcompaction
	val String tracetype = "GenericTrace"

	// //////////////////////////////////////////

	// / Constructor of CompactTraceConstructor
	new() {
		println("Generation of Compact trace")

		statecompaction = true
		parametercompaction = false
		objectstatecompaction = false
		stepcompaction = false

	}

	// **************************************************************************************************
	// //////// INITIALIZATION OF TRACE 
	// **************************************************************************************************   
	def void initTrace(List<EObject> executedModelelements) {

		executedModel = executedModelelements

		createfirstBaseState(executedModel)

		println("initTrace finished")
	}

	// **************************************************************************************************
	// //////// BEFORE FIRE OF A TRANSITION- run for smallstep
	// **************************************************************************************************   
	def void beforeStep(
		String stepName,
		Object caller,
		List<Object> params,
		Collection<EObject> newObjects,
		Collection<ObjectFeature> NonCollectionFieldobjects,
		Collection<ObjectFeature> PotentialCollectionFieldobjects,
		Collection<EObject> removedObjects
	) {
		var NormalStep bigstep = null
		var Object o = caller
		// ///////////////////////////////////////////IMPLICIT STEP
		if (!newObjects.empty || !NonCollectionFieldobjects.empty || !PotentialCollectionFieldobjects.empty ||
			!removedObjects.empty) {
			val State laststate = trace.state.last
			val State implicitstate = createState(newObjects, NonCollectionFieldobjects,
				PotentialCollectionFieldobjects, removedObjects)
			if (!isEqual(implicitstate, laststate)) { // in this case, there is an implicit step 
				var NormalStep implicitstep = createImplicitstep()
				var StepMap stepmap = new StepMap()
				// I assume that this kind of step is not repeated with the same object
				var int k = getKeyFromValueStepMap(implicitObject)
				if (k != 0) {
					StepMap.get(k).StepSet.add(implicitstep)
				} else {
					stepmap.object = implicitObject
					stepmap.steptype = implicitstep.steptype.stepName
					stepmap.StepSet.add(implicitstep)
					StepMap.put(stepMapIndex, stepmap)
					stepMapIndex = stepMapIndex + 1

				}
				// adding step to the stack
				if (!stepstack.empty()) {
					bigstep = stepstack.pop()
					bigstep.children.add(implicitstep)
					implicitstep.parent = bigstep
				}
				var StepStatus stepstatus2 = new StepStatus()
				stepstatus2.step = implicitstep
				// setting the state of step
				implicitstep.state = implicitstate

			}

		}
		// Create Step
		var NormalStep step = TraceFactory.eINSTANCE.createNormalStep
		step = createNormalStep(stepName)

		// createfirstBaseState(executedModel)
		// ////////////////////////////////////////////
		var int k = getKeyFromValueStepMap(o)
		if (k != 0) {
			StepMap.get(k).StepSet.add(step)
		} else {
			var StepMap stepmap = new StepMap()
			stepmap.object = o
			stepmap.steptype = step.steptype.stepName
			stepmap.StepSet.add(step)
			StepMap.put(stepMapIndex, stepmap)
			stepMapIndex = stepMapIndex + 1
		}
		params.add(caller)

		// /////////////////////////////////////////
		if (!params.empty)
			// Creation of Input parameter
			createInputParameter(params, step)
		if (bigstep != null) {
			bigstep.children.add(step)
			step.parent = bigstep
			stepstack.push(bigstep)
		} else if (!stepstack.empty()) {
			bigstep = stepstack.pop()
			bigstep.children.add(step)
			step.parent = bigstep
			stepstack.push(bigstep)
		}

		stepstack.push(step)

		println("before fire finished for :" + stepName)

	}

	// **************************************************************************************************
	// //////// AFTER FIRE OF A TRANSITION- run for smallstep
	// **************************************************************************************************   
	def void afterStep(List<EObject> executedModelelements, List<Object> params, Collection<EObject> newObjects,
		Collection<ObjectFeature> NonCollectionFieldobjects, Collection<ObjectFeature> PotentialCollectionFieldobjects,
		Collection<EObject> removedObjects) {

		executedModel = executedModelelements

		var Step step = TraceFactory.eINSTANCE.createNormalStep
		step = stepstack.pop

		// Creation of output parameter
		createOutputParameter(params, step)

		if (!newObjects.empty || !NonCollectionFieldobjects.empty || !PotentialCollectionFieldobjects.empty ||
			!removedObjects.empty)
			step.state = (createState(newObjects, NonCollectionFieldobjects, PotentialCollectionFieldobjects,
				removedObjects))
		else
			step.state = trace.state.last
		// ////// this is for the case that we dont use Gemoc change addon
		step.state = (createState(newObjects, NonCollectionFieldobjects, PotentialCollectionFieldobjects,
			removedObjects))

//		if (objectstatecompaction==true)
//           CreateCompactObjectstates()
	// STEPARRAY.put(stepposition,smallstep)
	// storing the current transition for using in Run_methods
	}

	// **************************************************************************************************
	// //////// FINISH OF TRACE 
	// ************************************************************************************************** 
	def void finishTrace(String filename) {
		// TODO: for now, if the count of executiong afterstep and before step is not equal, stack is not emtpy
		if (!stepstack.empty()) {
			val Step step = stepstack.pop
			var rstep = trace.step.findFirst[s|s == step]
			rstep.state = trace.state.last
			var LeafParameterList leafparamset = step.parameterlist as LeafParameterList
			createParameterList(leafparamset, rstep)
		}
		
        long nano_startTime = System.nanoTime(); 
        long millis_startTime = System.currentTimeMillis(); 
  
        // Perform the work whose time is to be measured 
       


		if (parametercompaction == true)
			CreateCompactParameterlists()

		if (objectstatecompaction == true)
			CreateCompactObjectstates()
		if (stepcompaction == true) // create a compacted trace in the part of step
		{
			compactStep(trace)
			PatternDetection()
		}

		// find dangling objectstate
		val danglingObjectsAfterClear = findDangling(trace)
		if (!danglingObjectsAfterClear.empty)
			removedanglingObjectState(trace)

		createSerializedTrace(trace, maketracefilename(filename))
		println("compactingTrace finished")
		// // 
		// decompacting trace
		if (objectstatecompaction == true || statecompaction == true || stepcompaction == true ||
			parametercompaction == true) {
			var GenericTraceDecompactor decompactor
			decompactor = new GenericTraceDecompactor()
			decompactor.Decompactor(trace, filename)
		}
		// Get the current system time in both 
        // nano and milli-seconds after 
        // the function returns. 
        long nano_endTime = System.nanoTime(); 
		
		
		// Print the time taken by subtracting 
        // the end-time from the start-time 
        System.out.println("Time taken in nano seconds: "
                           + (nano_endTime - nano_startTime)); 
        System.out.println("Time taken in milli seconds: "
                           + (millis_endTime - millis_startTime)); 
	}

	// ***************************************************************************************************
	// ///////remove    objectstate in states
	def static removedanglingObjectState(Trace trace) {
		var TransientObjectState t = null
		for (State b1 : trace.state) {
			var ListIterator<TransientObjectState> iter1 = b1.transientObjectsStates.listIterator();
			while (iter1.hasNext()) {

				t = iter1.next
				t.objectstate = null
			}
		}

	}

	// **************************************************************************************************
	// ////////makinf tracefilename based on the kind of compaction in the trace
	// ************************************************************************************************** 
	def String maketracefilename(String tracefilename) {
		var String strextension = ""
		if (statecompaction == true)
			strextension = strextension + "1"
		else
			strextension = strextension + "0"
		if (objectstatecompaction == true)
			strextension = strextension + "1"
		else
			strextension = strextension + "0"
		if (stepcompaction == true)
			strextension = strextension + "1"
		else
			strextension = strextension + "0"
		if (parametercompaction == true)
			strextension = strextension + "1"
		else
			strextension = strextension + "0"

		return (strextension + tracetype + tracefilename + ".xmi")
	}

	// **************************************************************************************************
	// //////// create a implicit step that occurs between two explicit step and makes changes on state of model
	// ************************************************************************************************** 
	def NormalStep createImplicitstep() {
		// /creation of smallstep  && Create Steptype
		val NormalStep step = TraceFactory.eINSTANCE.createNormalStep
		step.steptype = createstepType(IMPLICITSTEP)

		trace.step.add(step)

		step.position = stepposition

		stepposition = stepposition + 1

		return step
	}

	// **************************************************************************************************
	// //////// calling a function to create shared object stated based on the results of LCM algorithm
	// ************************************************************************************************** 
	def void generatefrequentParameterList(Itemsets frequentItemsets, EList<ParameterList> frequentparameterlists) {
		var int i = 0

		var int nitems = 0
		for (i = 0; i < frequentItemsets.levels.size; i++) {
			nitems = frequentItemsets.levels.get(i).size

			createfrequentParameterList(frequentItemsets.levels.get(i), frequentparameterlists)

		}

	}

	// **************************************************************************************************
	// //////// calling a function to create shared object stated based on the results of LCM algorithm
	// ************************************************************************************************** 
	def void generatefrequentObjectstate(Itemsets frequentItemsets, EList<ObjectState> frequentobjectstates) {
		var int i = 0

		var int nitems = 0
		for (i = 0; i < frequentItemsets.levels.size; i++) {
			nitems = frequentItemsets.levels.get(i).size
			createfrequentObjectstate(frequentItemsets.levels.get(i), frequentobjectstates)

		}

	}

	// **************************************************************************************************
	// //////// creating shared object stated based on the results of LCM algorithm
	// ************************************************************************************************** 
	def void createfrequentObjectstate(List<Itemset> listvalue, EList<ObjectState> frequentobjectstates) {
		var int i = 0
		var int j = 0
		var nitems = 0

		while (i < listvalue.size) {

			val LeafObjectState objstat = TraceFactory.eINSTANCE.createLeafObjectState
			nitems = listvalue.get(i).items.size

			for (j = 0; j < nitems; j++) {
				objstat.value.add(trace.value.get(listvalue.get(i).items.get(j)))

			}
			if (!trace.objectstate.exists[p|p.value.elementsEqual(objstat.value)])
				frequentobjectstates.add(objstat)
			i = i + 1
		}
	}

	// **************************************************************************************************
	// //////// creating shared object stated based on the results of LCM algorithm
	// ************************************************************************************************** 
	def void createfrequentParameterList(List<Itemset> listvalue, EList<ParameterList> frequentparameterlists) {
		var int i = 0
		var int j = 0
		var nitems = 0

		while (i < listvalue.size) {
			var LeafParameterList copyparameterlist = TraceFactory.eINSTANCE.createLeafParameterList

			val LeafParameterList paramlist = TraceFactory.eINSTANCE.createLeafParameterList
			copyparameterlist.parametervalue.clear
			nitems = listvalue.get(i).items.size

			for (j = 0; j < nitems; j++) {
				paramlist.parametervalue.add(trace.parameterValues.get(listvalue.get(i).items.get(j)))

			}
			if (!trace.parameterlist.exists[p|p.parametervalue.elementsEqual(paramlist.parametervalue)])
				frequentparameterlists.add(paramlist)
			i = i + 1
		}
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// CREATE STATE OF MODEL
	// /////////////////////////////////////////////////////////////////////////////////////////////////// 	
	def State createState(Collection<EObject> newObjects, Collection<ObjectFeature> NonCollectionFieldobjects,
		Collection<ObjectFeature> PotentialCollectionFieldobjects, Collection<EObject> removedObjects) {

		var Set<TransientObjectState> basestatetraceobjectlist = new HashSet<TransientObjectState>();
		var Set<TransientObjectState> traceobjectlist = new HashSet<TransientObjectState>();
		var EList<TransientObjectState> statetraceobjectlist = new BasicEList<TransientObjectState>();
		if (statecompaction == true) // create a compacted trace in the part of state
		{

			var List<TransientObjectState> similartraceobjectlist = new ArrayList<TransientObjectState>();

			val State basestate = TraceFactory.eINSTANCE.createState
			var State basestate0 = null
			// creating objectstate for each traceobject 
			// for each objectstate a transientobjectstate is created and its transientobject and objectstate are assigned
			if (!NonCollectionFieldobjects.empty) {
				basestate0 = createObjectstateSet(NonCollectionFieldobjects)
				traceobjectlist.addAll(basestate0.transientObjectsStates)
			}

			if (!PotentialCollectionFieldobjects.empty) {
				basestate0 = createObjectstateSet(PotentialCollectionFieldobjects)
				traceobjectlist.addAll(basestate0.transientObjectsStates)
			}
			// adding new objects to state  
			if (!newObjects.empty) {
				basestate0 = createObjectstateSetforNewobjects(newObjects)
				traceobjectlist.addAll(basestate0.transientObjectsStates)
				basestate.newobjects.addAll(basestate0.newobjects)
			}

			// adding deleted objects to state  
			for (EObject p : removedObjects.toList) {
				val TransientObject t = findtracedobject(p)
				if (t == null) {
					var trobj = createTracedObject(p, isDynamic(p))
					basestate.deletedobjects.add(trobj)
				} else
					basestate.deletedobjects.add(t)
			}

			// Since change addon only return objects that have changes, for getting all objects in list of objectstate, 
			// we compare last state with the current objectstate list to create a new list of objectstate
			var State laststate = TraceFactory.eINSTANCE.createState
			laststate = trace.state.last
			basestatetraceobjectlist.addAll(ExtractState(laststate))

			for (TransientObject t : trace.transientobject) {
				if (!traceobjectlist.exists[obj|obj.transientobject == t] && !basestate.deletedobjects.contains(t)) { // If objectstate exists in base basestate, we remove from the new basestate 
					var TransientObjectState trobjstate = basestatetraceobjectlist.findLast[tr|tr.transientobject == t]
					var TransientObjectState tr2objstate = TraceFactory.eINSTANCE.createTransientObjectState
					tr2objstate.transientobject = t
					tr2objstate.objectstate = trobjstate.objectstate

					// statetraceobjectlist.add(tr2objstate)
					traceobjectlist.add(tr2objstate)
				}
			}
			// calling a method to find the closest basestate to the current basestate
			var State _basebasestate = CalculateBaseStateIsomorphic(trace, traceobjectlist)
			basestate.basestate = _basebasestate
			basestatetraceobjectlist = ExtractState(_basebasestate)

			// /Control of Existance of ObjectState in State
			// ////////////CHANGE OBJECT STATES
			for (TransientObjectState p : traceobjectlist) {
				if (basestatetraceobjectlist.exists [ obj |
					obj.objectstate == p.objectstate && obj.transientobject == p.transientobject
				]) { // If objectstate exists in base basestate, we remove from the new basestate 
					similartraceobjectlist.add(p)
				}
			}
			traceobjectlist.removeAll(similartraceobjectlist)

			// / if state doesn't have any change, all reference will be empty		   
			if (traceobjectlist.empty && basestate.newobjects.empty && basestate.deletedobjects.empty) {
				return _basebasestate
			} else {
				if (!traceobjectlist.empty) // TODO  : ordering is not important here
					basestate.transientObjectsStates.addAll(traceobjectlist)

				val State bs = trace.state.findFirst [ b |
					b.basestate == basestate.basestate && b.deletedobjects.elementsEqual(basestate.deletedobjects) &&
						b.newobjects.elementsEqual(basestate.newobjects) &&
						b.transientObjectsStates.elementsEqual(basestate.transientObjectsStates)
				]
				if (bs != null)
					return bs
				else {
					trace.state.add(basestate)
					return basestate
				}

			}
		} else // create the original trace in the part of basestate
		{
			val State basestate = TraceFactory.eINSTANCE.createState
			var State basestate0 = null
			basestate.basestate = null // //////////FOR NOW
			conter = conter + 1

			// adding new objects to state  
			if (!newObjects.empty) {
				basestate0 = createObjectstateSetforNewobjects(newObjects)
				basestate.transientObjectsStates.addAll(basestate0.transientObjectsStates)
			}
			// adding deleted objects to state  
			for (EObject p : removedObjects.toList) {
				val TransientObject t = findtracedobject(p)
				if (t == null) {
					var trobj = createTracedObject(p, isDynamic(p))
					basestate.deletedobjects.add(trobj)
				} else
					basestate.deletedobjects.add(t)
			}
			// no matter object changed or not, it creates an objetstate for each object
			if (!NonCollectionFieldobjects.empty) {
				basestate0 = createObjectstateSet(NonCollectionFieldobjects)
				if (!basestate0.transientObjectsStates.empty)
					basestate.transientObjectsStates.addAll(basestate0.transientObjectsStates)

			}

			if (!PotentialCollectionFieldobjects.empty) {
				basestate0 = createObjectstateSet(PotentialCollectionFieldobjects)

				if (!basestate0.transientObjectsStates.empty)
					basestate.transientObjectsStates.addAll(basestate0.transientObjectsStates)

			}

			for (TransientObject t : trace.transientobject) {
				if (!basestate.transientObjectsStates.exists[obj|obj.transientobject == t] &&
					!basestate.deletedobjects.contains(t)) { // If objectstate exists in base basestate, we remove from the new basestate 
					var TransientObjectState trobjstate = trace.state.last.transientObjectsStates.findLast [ tr |
						tr.transientobject == t
					]
					var TransientObjectState tr2objstate = TraceFactory.eINSTANCE.createTransientObjectState
					tr2objstate.transientobject = t

					if (trobjstate.objectstate instanceof LeafObjectState) {
						var LeafObjectState newobj = TraceFactory.eINSTANCE.createLeafObjectState
						newobj.value.addAll((trobjstate.objectstate as LeafObjectState).value)
						trace.objectstate.add(newobj)
						tr2objstate.objectstate = newobj
					} else {
						var CompositeObjectState newobj = TraceFactory.eINSTANCE.createCompositeObjectState
						newobj.value.addAll((trobjstate as CompositeObjectState).value)
						newobj.objectstates.addAll((trobjstate.objectstate as CompositeObjectState).objectstates)
						trace.objectstate.add(newobj)
						tr2objstate.objectstate = newobj
					}

					statetraceobjectlist.add(tr2objstate)
				}
			}

			basestate.transientObjectsStates.addAll(statetraceobjectlist)

			val State bs = trace.state.findFirst [ b |
				b.basestate == basestate.basestate && b.deletedobjects.elementsEqual(basestate.deletedobjects) &&
					b.newobjects.elementsEqual(basestate.newobjects) &&
					b.transientObjectsStates.elementsEqual(basestate.transientObjectsStates)
			]
			if (bs != null)
				return bs
			else {
				trace.state.add(basestate)

				return basestate
			}

		}
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// control equality of two state
	// /////////////////////////////////////////////////////////////////////////////////////////////////// 	
	def boolean isEqual(State newstate, State oldstate) {
		return (newstate.basestate == oldstate.basestate &&
			newstate.deletedobjects.elementsEqual(oldstate.deletedobjects) &&
			newstate.newobjects.elementsEqual(oldstate.newobjects) &&
			newstate.transientObjectsStates.elementsEqual(oldstate.transientObjectsStates))
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// CREATE INPUT PARAMETER AND PARAMETERSET
	// /////////////////////////////////////////////////////////////////////////////////////////////////// 	
	def void createInputParameter(List<Object> params, Step step) { // Definition of input parameter
		val LeafParameterList leafparamset = TraceFactory.eINSTANCE.createLeafParameterList
		val ParameterValue paramvalue = TraceFactory.eINSTANCE.createParameterValue
		var ParameterValue parvalue = TraceFactory.eINSTANCE.createParameterValue

		paramvalue.directionKind = ParamterKindEnum.IN

		params.forEach [ in |
			// Create Value and assign to parametervalue
			if (in instanceof EObject) {
				var RefValue refvalue = prepareReferencevalue(in)
				if (refvalue != null)
					paramvalue.values.add(refvalue)

			} else
				paramvalue.values.add(createValueforparameter(in))

		]

		// if there is a parametervalue the same as paramvalue, return that one else return paramvalue
		parvalue = createParameterValue(paramvalue)

		leafparamset.parametervalue.add(parvalue)
		// ////////////////////////////////
		var ParameterList l = trace.parameterlist.findFirst [ p |
			p.parametervalue.elementsEqual(leafparamset.parametervalue)
		]
		if (l == null)
			step.parameterlist = leafparamset
		else
			step.parameterlist = l

	}

	// **************************************************************************************************
	// CREATE OUT PARAMETER AND SET
	// WITH  COMPATION	
	// **************************************************************************************************
	def void createOutputParameter(List<Object> params, Step step) {
		var LeafParameterList leafparamset = TraceFactory.eINSTANCE.createLeafParameterList

		val ParameterValue paramvalue = TraceFactory.eINSTANCE.createParameterValue
		var ParameterValue parvalue = TraceFactory.eINSTANCE.createParameterValue

		paramvalue.directionKind = ParamterKindEnum.OUT

		if (!params.empty) {
			params.forEach [ out |
				// Create Value and assign to parametervalue
				if (out instanceof EObject) {
					// if in.class.typeName
					var RefValue refvalue = prepareReferencevalue(out)
					if (refvalue != null)
						paramvalue.values.add(refvalue)
				} else
					paramvalue.values.add(createValueforparameter(out))

			]

			// if there is a parametervalue the same as paramvalue, return that one else return paramvalue
			parvalue = createParameterValue(paramvalue)

		}
		// after creating parametervalue, the parametervalue will be added to the parameterlist of the step if exists
		if (step.parameterlist instanceof LeafParameterList)
			leafparamset = step.parameterlist as LeafParameterList
		else {
			val EList<ParameterValue> valuelist = new BasicEList<ParameterValue>
			getParameterValuelist(step.parameterlist, valuelist)
			leafparamset.parametervalue.addAll(valuelist)
		}
		if (!parvalue.values.empty) // this control is for the time that there is no outputparameter for the step
			leafparamset.parametervalue.add(parvalue)

		createParameterList(leafparamset, step)
		CreateCompactParameterlists()
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE Normal STEP
	// WITH  COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def NormalStep createNormalStep(String stepName) {

		// /creation of smallstep  && Create Steptype
		val NormalStep step = TraceFactory.eINSTANCE.createNormalStep
		step.steptype = createstepType(stepName)

		trace.step.add(step)

		step.position = stepposition
		stepposition = stepposition + 1

		return step
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// control type of feature
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def boolean definedTyped(EStructuralFeature f) {
		return ((f as EAttribute).EAttributeType.name == "String" || (f as EAttribute).EAttributeType.name == "Int" ||
			(f as EAttribute).EAttributeType.name == "Float" || (f as EAttribute).EAttributeType.name == "Boolean"
		)
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// CREATE VALUE 
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def Value createValue(EObject p, EStructuralFeature f, boolean type) {
		if (f instanceof EReference)
			// // for staticobjects refvalue refers to EObject 
			return (prepareReferencevalue(p, f, type))
		else {
			var EList<Object> featuredatalist = new BasicEList<Object>();

			if (f instanceof EAttribute) {
				preparevalueCollectionforAttribute(p, f, featuredatalist, isCollection(f))
				// if (featuredatalist.size>0){
				// if (dataType == EcorePackage.eINSTANCE. TODO :
				switch (f as EAttribute).EAttributeType.name {
					case "EInt":
						return (createIntegervalue(featuredatalist, isOrdered(f)))
					case "EIntegerObject":
						// return(createIntegerObjectvalue (p,f,featuredatalist,type))
						// return(createRefvalue(p,f,featuredatalist,type))
						return (createIntegervalue(featuredatalist, isOrdered(f)))
					case "EString":
						return (createEstringvalue (featuredatalist, isOrdered(f)))
					case "EBoolean":
						return (createBooleanvalue (featuredatalist, isOrdered(f)))
					case "EFloat":
						return (createFloatvalue (featuredatalist, isOrdered(f)))
					// ////
					case "Int":
						return (createIntegervalue(featuredatalist, isOrdered(f)))
					case "Integer":
						return (createIntegervalue(featuredatalist, isOrdered(f)))
					case "String":
						return (createstringvalue(p, f, featuredatalist))
					case "Boolean":
						return (createBooleanvalue (featuredatalist, isOrdered(f)))
				}
			}

		}

	}

	// **************************************************************************************************
	// CREATE EString VALUE 
	// **************************************************************************************************
	def Value createEstringvalue(List<Object> list, boolean ordertype) {
		val EList<String> valuelist = new BasicEList<String>();
		var i = 0
		while (i < list.size) {
			var String o = list.get(i) as String
			valuelist.add(o)
			i = i + 1
		}
		var Value value = null
		if (ordertype)
			value = trace.value.findFirst [ l |
				l instanceof LiteralString && (l as LiteralString).stringvalue.elementsEqual(valuelist)
			]
		else
			value = trace.value.findFirst [ l |
				l instanceof LiteralString && (l as LiteralString).stringvalue.containsAll(valuelist) &&
					valuelist.containsAll((l as LiteralString).stringvalue)
			]
		if (value == null) {
			// definition of a literal value for input tokens
			var LiteralString objvalue = TraceFactory.eINSTANCE.createLiteralString

			// objvalue.eSet(objvalue.eClass.EStructuralFeatures.get(0), p.eGet(f))
			objvalue.stringvalue.addAll(valuelist)
			trace.value.add(objvalue)
			return (objvalue as Value)
		} else
			return value

	}

	// **************************************************************************************************
	// CREATE reference VALUE based on the type of EStructuralFeature, for collection creates a list of value, otherwise a single value
	// **************************************************************************************************
	def RefValue prepareReferencevalue(EObject p, EStructuralFeature f, boolean type) {
		var EList<EObject> featuredatalist = new BasicEList<EObject>();
		preparevalueCollectionforReference(p, f, featuredatalist, isCollection(f))
		return (createRefvalue(p, featuredatalist, isOrdered(f)))
	}

//**************************************************************************************************
	// CREATE reference VALUE 
	// **************************************************************************************************
	def RefValue createRefvalue(EObject p, EList<EObject> list, boolean ordertype) {
		val EList<EObject> dynamicobjectlist = new BasicEList<EObject>();
		var i = 0
		while (i < list.size) {

			var EObject o = list.get(i)

			if (isDynamic(o)) { // for dynamic object
				val TransientObject t = findtracedobject(o)
				if (t == null)
					dynamicobjectlist.add(createTracedObject(o, true))
				else
					dynamicobjectlist.add(t)
			} else // for static objects
			{
				dynamicobjectlist.add(o)
			}
			i = i + 1
		}
		var RefValue value = null
		// if ordering is important
		if (ordertype)
			value = trace.value.findFirst [ l |
				l instanceof RefValue && (l as RefValue).originalobject.elementsEqual(dynamicobjectlist)
			] as RefValue
		else
			value = trace.value.findFirst [ l |
				l instanceof RefValue && (l as RefValue).originalobject.containsAll(dynamicobjectlist) &&
					dynamicobjectlist.containsAll((l as RefValue).originalobject)
			] as RefValue
		if (value == null) {

			// definition of a ref value for input tokens
			var RefValue objvalue = TraceFactory.eINSTANCE.createRefValue
			objvalue.originalobject.addAll(dynamicobjectlist)
			// objvalue.eSet(objvalue.eClass.EStructuralFeatures.get(0),p.eGet(f))
			trace.value.add(objvalue)
			return (objvalue)
		} else
			return value

	}

//**************************************************************************************************
	// CREATE EString VALUE 
	// **************************************************************************************************
	def Value createstringvalue(EObject p, EStructuralFeature f, List<Object> list) {
		val EList<String> valuelist = new BasicEList<String>();
		var i = 0
		while (i < list.size) {
			var String o = list.get(i) as String
			valuelist.add(o)
			i = i + 1
		}
		var Value value = null
		if (isOrdered(f))
			value = trace.value.findFirst [ l |
				l instanceof LiteralString && (l as LiteralString).stringvalue.elementsEqual(valuelist)
			]
		else
			value = trace.value.findFirst [ l |
				l instanceof LiteralString && (l as LiteralString).stringvalue.containsAll(valuelist) &&
					valuelist.containsAll((l as LiteralString).stringvalue)
			]
		if (value == null) {
			// definition of a literal value for input tokens
			var LiteralString objvalue = TraceFactory.eINSTANCE.createLiteralString

			objvalue.stringvalue.addAll(valuelist)
			trace.value.add(objvalue)
			return (objvalue as Value)
		} else
			return value

	}

	// **************************************************************************************************
	// CREATE Boolean VALUE 
	// **************************************************************************************************
	def Value createBooleanvalue(List<Object> list, boolean ordertype) {
		val EList<Boolean> valuelist = new BasicEList<Boolean>();
		var i = 0
		while (i < list.size) {
			var Boolean o = list.get(i) as Boolean
			valuelist.add(o)
			i = i + 1
		}
		var Value value = null
		if (ordertype)
			value = trace.value.findFirst [ l |
				l instanceof LiteralBoolean && (l as LiteralBoolean).boolvalue.elementsEqual(valuelist)
			]
		else
			value = trace.value.findFirst [ l |
				l instanceof LiteralBoolean && (l as LiteralBoolean).boolvalue.containsAll(valuelist) &&
					valuelist.containsAll((l as LiteralBoolean).boolvalue)
			]
		if (value == null) {
			// definition of a literal value for input tokens
			var LiteralBoolean objvalue = TraceFactory.eINSTANCE.createLiteralBoolean

			// objvalue.eSet(objvalue.eClass.EStructuralFeatures.get(0), p.eGet(f))
			objvalue.boolvalue.addAll(valuelist)
			trace.value.add(objvalue)
			return (objvalue as Value)
		} else
			return value

	}

	// **************************************************************************************************
	// CREATE Float VALUE 
	// **************************************************************************************************
	def Value createFloatvalue(List<Object> list, boolean ordertype) {
		val EList<Float> valuelist = new BasicEList<Float>();
		var i = 0
		while (i < list.size) {
			var Float o = list.get(i) as Float
			valuelist.add(o)
			i = i + 1
		}
		var Value value = null
		if (ordertype)
			value = trace.value.findFirst [ l |
				l instanceof LiteralFloat && (l as LiteralFloat).floatvalue.elementsEqual(valuelist)
			]
		else
			value = trace.value.findFirst [ l |
				l instanceof LiteralFloat && (l as LiteralFloat).floatvalue.containsAll(valuelist) &&
					valuelist.containsAll((l as LiteralFloat).floatvalue)
			]
		if (value == null) {
			// definition of a literal value for input tokens
			var LiteralFloat objvalue = TraceFactory.eINSTANCE.createLiteralFloat
			objvalue.floatvalue.addAll(valuelist)
			// objvalue.eSet(objvalue.eClass.EStructuralFeatures.get(0), p.eGet(f))
			trace.value.add(objvalue)
			return (objvalue as Value)
		} else
			return value

	}

	// **************************************************************************************************
	// CREATE Integer VALUE 
	// **************************************************************************************************
	def Value createIntegervalue(List<Object> list, boolean ordertype) {

		val EList<Integer> valuelist = new BasicEList<Integer>();
		var i = 0
		while (i < list.size) {
			var Integer o = list.get(i) as Integer
			valuelist.add(o)
			i = i + 1
		}
		var Value value = null
		if (ordertype)
			value = trace.value.findFirst [ l |
				l instanceof LiteralInteger && (l as LiteralInteger).intvalue.elementsEqual(valuelist)
			]
		else
			value = trace.value.findFirst [ l |
				l instanceof LiteralInteger && (l as LiteralInteger).intvalue.containsAll(valuelist) &&
					valuelist.containsAll((l as LiteralInteger).intvalue)
			]

		if (value == null) {
			// definition of a literal value for input tokens
			var LiteralInteger objvalue = TraceFactory.eINSTANCE.createLiteralInteger
			// assigning intvalue of LiteralInteger
			objvalue.intvalue.addAll(valuelist)

			trace.value.add(objvalue)
			return (objvalue as Value)
		} else
			return value
	}

	// **************************************************************************************************
	// CREATE Integer VALUE 
	// **************************************************************************************************
	def Value createIntegerObjectvalue(EObject p, EStructuralFeature f, boolean type) {

		// case true: {
		if (type == true) {
			// IntegerObject is similar to a dynamic object, we need to create a tracedobject refering to object and a Refvalue
			// refering to the trcaedobject
			val TransientObject t = findtracedobject(p)
			if (t != null) {
				val RefValue value = trace.value.findFirst [ l |
					l instanceof RefValue && (l as RefValue).originalobject == t
				] as RefValue
				if (value == null) {
					// definition of a literal value for input tokens
					var RefValue objvalue = TraceFactory.eINSTANCE.createRefValue
					objvalue.originalobject.add(t)
					// objvalue.eSet(objvalue.eClass.EStructuralFeatures.get(0),p.eGet(f))
					trace.value.add(objvalue)
					return (objvalue as Value)
				} else
					return value
			} else {
				// for the case that there is no tracedobject for the object  //TODO : be sure, is it dynamic or static. if it is static we dont need creation of tracedobject
				var RefValue objvalue = TraceFactory.eINSTANCE.createRefValue
				objvalue.originalobject.add(createTracedObject(p, type)) // IntegerObject is a dynamicobject
				// objvalue.eSet(objvalue.eClass.EStructuralFeatures.get(0),p.eGet(f))
				trace.value.add(objvalue)
				return (objvalue as Value)
			}

		}

		// case false: {
		if (type == false) {
			val RefValue value = trace.value.
				findFirst[l|l instanceof RefValue && (l as RefValue).originalobject == p] as RefValue
			if (value == null) {
				// definition of a literal value for input tokens
				var RefValue objvalue = TraceFactory.eINSTANCE.createRefValue
				objvalue.originalobject.add(p)
				// objvalue.eSet(objvalue.eClass.EStructuralFeatures.get(0),p.eGet(f))
				trace.value.add(objvalue)
				return (objvalue)
			} else
				return value
		}

	}

	// **************************************************************************************************
	// Check a feature is ordered
	// **************************************************************************************************
	def static boolean isOrdered(EStructuralFeature f) {
		// return f instanceof Collection // || ob instanceof Map;
		return (f.ordered )
	}

	// **************************************************************************************************
	// Check a feature is instance of collection
	// **************************************************************************************************
	def static boolean isCollection(EStructuralFeature f) {
		// return f instanceof Collection // || ob instanceof Map;
		return (f.upperBound == -1)
	}

	// **************************************************************************************************
	// Check an Eobject is instance of collection
	// **************************************************************************************************
	def static boolean isCollection(EObject p) {
		return p instanceof Collection<?> // || ob instanceof Map;
	}

	// **************************************************************************************************
	// Check an object is instance of collection
	// **************************************************************************************************
	def static boolean isCollection(Object p) {
		return p instanceof Collection<?> // || ob instanceof Map;
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// CREATE VALUE for parameters
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def Value createValueforparameter(Object p) {
		var EList<Object> featuredatalist = new BasicEList<Object>();

		preparevalueCollection(p, featuredatalist, isCollection(p))
		val ordertype = true

		if (featuredatalist.size > 0) {
			switch p {
				case p instanceof Integer:
					return (createIntegervalue(featuredatalist, ordertype))
				case p instanceof String:
					return (createEstringvalue (featuredatalist, ordertype))
				case p instanceof Boolean:
					return (createBooleanvalue (featuredatalist, ordertype))
				case p instanceof Float:
					return (createFloatvalue (featuredatalist, ordertype))
			}
		} else
			return null

	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// Find TransientObject corresponding to an object
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def TransientObject findtracedobject(EObject p) {
		return transientobjectMap.get(p)
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// CREATE REFVALUE for parametervalue of steps
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def RefValue prepareReferencevalue(EObject p) {

		var EList<EObject> featuredatalist = new BasicEList<EObject>();

		preparevalueCollection(p, featuredatalist, isCollection(p))
		if (featuredatalist.size > 0)
			return (createRefvalue(p, featuredatalist, true)) // ordering is assumed true for input parameter collections
		else
			return null

	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// CREATE STEPTYPE
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def StepType createstepType(String stepname) {
		val StepType _steptype = trace.steptype.findFirst [ l |
			l.stepName == stepname
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
	// CONTROL THE EXISTANCE OF PRAMETERVALUE IN TRACE, IF THAT IS EXISTS, RETURN IT, 
	// ELSE ADD NEW PARATERVALUE TO TRACE
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def ParameterValue createParameterValue(ParameterValue paramvalue) {
		val parvalue = trace.parameterValues.findFirst [ l |
			(l.values.elementsEqual(paramvalue.values) && l.directionKind == paramvalue.directionKind)
		]
		if (parvalue == null) {

			trace.parameterValues.add(paramvalue)
			return (paramvalue)
		} else
			return parvalue
	}

	// /////////////////////////////////////////////////////////////////////////////////
	// ////
	// /*****RETRIVE VALUES OF PARAMETERSET**************************************************************
	// /////////////////////////////////////////////////////////////////////////////////
	def static EList<ParameterValue> getParameterValuelist(ParameterList paramset) {

		var ParameterList f1 = null;
		// var LeafParameterList leafpar=TraceFactory.eINSTANCE.createLeafParameterList
		var int i = 0;
		var EList<ParameterValue> templist = new BasicEList<ParameterValue>();

		if(paramset == null) return templist;

		if (paramset instanceof CompositParameterList) {
			while (i < (paramset as CompositParameterList).parameterlist.size) {
				f1 = (paramset as CompositParameterList).parameterlist.get(i)

				getParameterValuelist(f1);

				i = i + 1;
			}
		} else {
			// templist.addAll((paramset as LeafParameterList).values)
			for (ParameterValue p : (paramset as LeafParameterList).parametervalue) {
				var ParameterValue par = TraceFactory.eINSTANCE.createParameterValue
				par = p
				templist.add(par)

			}
		}

		return templist
	}

	// **************************************************************************************************
	// CREATE OBJECT STATE
	// **************************************************************************************************
	def ObjectState createObjectState(LeafObjectState objstate) {
		if (objectstatecompaction == true && statecompaction == true) {
			val ObjectState existobjstate = trace.objectstate.findFirst [ o |
				(o instanceof LeafObjectState) && ((o as LeafObjectState).value.elementsEqual(objstate.value))
			]
			if (existobjstate == null) {
				trace.objectstate.add(objstate)
				return objstate
			} else
				return existobjstate
		} else { // generate objectstate in original form without compaction
			trace.objectstate.add(objstate)
			return objstate
		}
	}

	// **************************************************************************************************
	// CREATE ParameterList
	// **************************************************************************************************
	def void createParameterList(LeafParameterList paramlist, Step step) {

		val ParameterList existparamelist = trace.parameterlist.findFirst [ o |
			(o instanceof LeafParameterList) &&
				((o as LeafParameterList).parametervalue.elementsEqual(paramlist.parametervalue))
		]
		if (existparamelist == null) {
			trace.parameterlist.add(paramlist)
			step.parameterlist = paramlist
		} else
			step.parameterlist = existparamelist
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// This method is for the case that we dont use gemoc changeaddon***********************************
	// CREATE OBJECT STATE
	// **************************************************************************************************
	def ObjectState createObjectState(EObject p, boolean type) {

		val LeafObjectState objstate = TraceFactory.eINSTANCE.createLeafObjectState
		if (type == true) {

			val Value value = createValue(p, null, type)
			if (value !== null)
				objstate.value.add(value)
		} else {

			p.eClass.EStructuralFeatures.filter[f|isDynamic(f)].forEach [ f |
				// val aValue = o.eGet(f);	
				// Create value and assign to objectstate
				val Value value = createValue(p, f, type)
				if (value !== null)
					objstate.value.add(value)
			]

		}
		if (objstate.value.size > 0) {
			// Create value and assign to objectstate
			if (trace.objectstate.exists [ o |

				(o instanceof LeafObjectState) && ((o as LeafObjectState).value.containsAll(objstate.value))
			]) {
				// in this case objectstate is  exists
				return (trace.objectstate.findFirst [ o |
					(o instanceof LeafObjectState) && ((o as LeafObjectState).value.containsAll(objstate.value))
				])
			} else {
				// in this case objectstate is not exists
				trace.objectstate.add(objstate)
				return (objstate as ObjectState)
			}

		}
	}

// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// calling relevant methods to find frequent itemsets of parameterlist and create paramterlist again
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def void CreateCompactParameterlists() {
		val EList<ParameterList> frequentparameterlists = new BasicEList<ParameterList>();

		val EList<Integer> ordervaluenew = new BasicEList<Integer>
		val EList<ParameterValue> valuelistold = new BasicEList<ParameterValue>
		val EList<ParameterValue> realvaluelistold = new BasicEList<ParameterValue>
		val EList<ParameterValue> valuelistnew = new BasicEList<ParameterValue>();

		var int j = 0
		// var ParameterList t2 = null
		// finding frequent itemsets for parameterlist
		var Itemsets frequentItemsets;

		var myAlgoLCMFreq fppattern = new myAlgoLCMFreq()

		frequentItemsets = fppattern.findFrequentPatternParameterList(trace)
		var boolean found = false

		// ////////////
		generatefrequentParameterList(frequentItemsets, frequentparameterlists)

		var ListIterator<ParameterList> itr = frequentparameterlists.listIterator();
		var ParameterList o = null
		while (itr.hasNext()) {
			o = itr.next
			if (o.parametervalue.size != 1)
				itr.remove
		}

		if (!frequentparameterlists.empty) {
			trace.parameterlist.clear

			// adding only frequentparameterlists that exist in parameterlist list
			trace.parameterlist.addAll(frequentparameterlists)

			var Step t = null
			var EObject e = null
			var TreeIterator<EObject> iter = trace.eAllContents
			while (iter.hasNext()) {
				e = iter.next
				if (e instanceof Step) {

					t = e
					valuelistold.clear
					valuelistnew.clear
					realvaluelistold.clear
					ordervaluenew.clear

					if (t.parameterlist instanceof LeafParameterList) {
						valuelistold.addAll((t.parameterlist as LeafParameterList).parametervalue)
						realvaluelistold.addAll(valuelistold)
					} else {
						getParameterValuelist(t.parameterlist, valuelistold)
						if ((t.parameterlist as CompositParameterList).paramtervaluesOrder.empty)
							ordervaluenew.addAll((t.parameterlist as CompositParameterList).paramtervaluesOrder)
						CreateValueOrder(ordervaluenew, valuelistold, realvaluelistold)
					}

					var ParameterList newparam = findApproprateParameterlist(trace, frequentparameterlists,
						valuelistold)
					t.parameterlist = newparam
					if (newparam instanceof CompositParameterList) {
						valuelistnew.clear
						getParameterValuelist(newparam, valuelistnew)

						// create ordervaluenew
						ordervaluenew.clear
						if (!valuelistnew.elementsEqual(realvaluelistold)) {
							for (ParameterValue pv : valuelistnew) {

								j = 0
								found = false
								for (ParameterValue vo : realvaluelistold) {
									if (!found)
										if (pv == vo && !ordervaluenew.contains(j)) {

											ordervaluenew.add(j)
											found = true

										}
									j = j + 1
								} // end for
							} // end for
							(newparam as CompositParameterList).paramtervaluesOrder.clear()

							(newparam as CompositParameterList).paramtervaluesOrder.addAll(ordervaluenew)
							t.parameterlist = newparam
						} // end if
					} // end if
				}
			} // end while
		} // end if
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// calling relevant methods to find frequent itemsets of parameterlist and create paramterlist again
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def void CreateCompactObjectstates() {
		val EList<ObjectState> frequentobjectstates = new BasicEList<ObjectState>();

		val EList<Integer> ordervaluenew = new BasicEList<Integer>
		val EList<Value> valuelistold = new BasicEList<Value>
		val EList<Value> realvaluelistold = new BasicEList<Value>();
		val EList<Value> valuelistnew = new BasicEList<Value>();

		var int j = 0

		// finding frequent itemsets for parameterlist
		var Itemsets frequentItemsets;

		var myAlgoLCMFreq fppattern = new myAlgoLCMFreq()

		frequentItemsets = fppattern.findFrequentPatternObjectstate(trace)
		var boolean found = false

		// ////////////
		generatefrequentObjectstate(frequentItemsets, frequentobjectstates)

		var ListIterator<ObjectState> itr = frequentobjectstates.listIterator
		var ObjectState o = null
		while (itr.hasNext()) {
			o = itr.next
			if (o.value.size == 1)
				itr.remove
		}

		// TODO debug code to remove
		val danglingObjectsBeforeClear = findDangling(trace)
		println("Before clear: " + danglingObjectsBeforeClear)

		if (!frequentobjectstates.empty) {
			trace.objectstate.clear
			trace.objectstate.addAll(frequentobjectstates)

			var TransientObjectState t = null
			if (!frequentobjectstates.empty) {
				for (State b : trace.state) {
					var ListIterator<TransientObjectState> iter = b.transientObjectsStates.listIterator();
					while (iter.hasNext()) {

						t = iter.next
						valuelistold.clear
						valuelistnew.clear
						realvaluelistold.clear
						ordervaluenew.clear

						if (t.objectstate instanceof LeafObjectState) {
							valuelistold.addAll(t.objectstate.value)
							realvaluelistold.addAll(valuelistold)
						} else {
							getobjectStateValues(t.objectstate, valuelistold)
							if ((t.objectstate as CompositeObjectState).objectstatesOrder.empty)
								ordervaluenew.addAll((t.objectstate as CompositeObjectState).objectstatesOrder)
							CreateValueOrder(ordervaluenew, valuelistold, realvaluelistold)
						}

						var ObjectState newparam = findApproprateObjectstate(trace, frequentobjectstates, valuelistold)
						t.objectstate = newparam
						if (newparam instanceof CompositeObjectState) {
							valuelistnew.clear
							getobjectStateValues(newparam, valuelistnew)

							// create ordervaluenew
							ordervaluenew.clear
							if (!valuelistnew.elementsEqual(realvaluelistold)) {
								for (Value pv : valuelistnew) {

									j = 0
									found = false
									for (Value vo : realvaluelistold) {
										if (!found)
											if (pv == vo && !ordervaluenew.contains(j)) {

												ordervaluenew.add(j)
												found = true

											}
										j = j + 1
									} // end for
								} // end for
								(newparam as CompositeObjectState).objectstatesOrder.clear()

								(newparam as CompositeObjectState).objectstatesOrder.addAll(ordervaluenew)
								t.objectstate = newparam
							} // end if
						} // end if
					}
				} // end while
			} // end if
		}
	}

// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// finding dynamic objects for fuml models
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def static boolean extendsStaticClass(BehavioredEClass c) {
		c.EAllSuperTypes.exists[s|(!(s instanceof BehavioredEClass) && c.name.equals(s.name + "Configuration"))]
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// CREATE First basestate for the trace including creating all tracedobject	
	// create tracedobject, fist basestate and assign newobjects and tracedobjectstate
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def void createfirstBaseState(List<EObject> executedModel) {
		// /initialize first BaseState   
		var Set<EObject> objectlist1 = new HashSet<EObject>();
		val State basestate = TraceFactory.eINSTANCE.createState
		var State basestate0 = null
		// ///////////////////////////
		objectlist1 = executedModel.filter[e|e.eClass.EStructuralFeatures.exists[f|isDynamic(f)]].toSet
		basestate0 = createFirstObjectstateSet(objectlist1)
		if (!basestate0.transientObjectsStates.empty)
			basestate.transientObjectsStates.addAll(basestate0.transientObjectsStates)
		basestate.newobjects.addAll(basestate0.newobjects)
		// TODO : delete this commented code i think at the first time, there is no dynamic object
		basestate0.transientObjectsStates.clear
		objectlist1.clear
		objectlist1 = executedModel.filter[p|isDynamic(p)].toSet
		basestate0 = createFirstObjectstateSet(objectlist1) // false for static objects
		if (!basestate0.transientObjectsStates.empty)
			basestate.transientObjectsStates.addAll(basestate0.transientObjectsStates)
		basestate.newobjects.addAll(basestate0.newobjects)
		if (!basestate.transientObjectsStates.empty)
			trace.state.add(basestate)

	}

	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE a set of objectstate and related tracedobject for first base state
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def State createFirstObjectstateSet(Collection<EObject> objectlist) {
		var boolean type = false
		val State basestate = TraceFactory.eINSTANCE.createState
		val EList<EStructuralFeature> featurelist = new BasicEList<EStructuralFeature>();
		var TransientObject traceobj = null
		basestate.basestate = null
		for (EObject p : objectlist) {
			traceobj = transientobjectMap.get(p)
			if (traceobj == null) {
				if (isDynamic(p))
					type = true
				else
					type = false

				traceobj = createTracedObject(p, type)
				// assigning newobjects reference
				basestate.newobjects.add(traceobj)
			}
			val LeafObjectState objstate = TraceFactory.eINSTANCE.createLeafObjectState
			featurelist.clear
			p.eClass.EStructuralFeatures.filter[f|isDynamic(f)].forEach [ f |

				// Create value and assign to objectstate
				val Value value = createValue(p, f, isDynamic(p))

				if (value !== null) {
					objstate.value.add(value)
					featurelist.add(f)
				}
			]

			// Create Objectstate
			if (!objstate.value.empty) {
				// if all values are null, we dont create transient objectstate and we dont store objectstate
				// if (objstate.value.exists[v | v!=null]){
				// Creation of objectstate and Traceobjstate of the first basestate
				val TransientObjectState Traceobjstate = TraceFactory.eINSTANCE.createTransientObjectState

				// Create Objectstate and assign to TransientObjectState
				Traceobjstate.objectstate = createObjectState(objstate)
				Traceobjstate.transientobject = traceobj
				// Traceobjstate.estructuralfeature.addAll(featurelist)
				// assigning transientObjectsStates reference
				basestate.transientObjectsStates.add(Traceobjstate)
			}
		}

		return basestate
	}

	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE a set of objectstate and related tracedobject based on the type parameter
	// true for dynamic and false for static Tracedobject
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def State createObjectstateSet(Collection<ObjectFeature> objectlist) {
		var boolean type = false
		val EList<EStructuralFeature> featurelist = new BasicEList<EStructuralFeature>();
		val State basestate = TraceFactory.eINSTANCE.createState
		var TransientObject traceobj = null
		basestate.basestate = null

		for (ObjectFeature p : objectlist.toList) {
			traceobj = findtracedobject(p.object)

			if (traceobj == null) {
				if (isDynamic(p.object))
					type = true
				else
					type = false

				traceobj = createTracedObject(p.object, type)
			}
			val LeafObjectState objstate = TraceFactory.eINSTANCE.createLeafObjectState

			p.object.eClass.EStructuralFeatures.filter[f|isDynamic(f)].forEach [ f |

				// Create value and assign to objectstate
				val Value value = createValue(p.object, f, isDynamic(p.object))

				if (value !== null) {
					objstate.value.add(value)
					featurelist.add(f)
				}
			]

			// other features and values of objectstate
			// Create Objectstate
			if (!objstate.value.empty) {
				// Creation of objectstate and Traceobjstate of the first basestate
				val TransientObjectState Traceobjstate = TraceFactory.eINSTANCE.createTransientObjectState

				// Create Objectstate and assign to TransientObjectState
				Traceobjstate.objectstate = createObjectState(objstate)
				Traceobjstate.transientobject = traceobj
				// assigning transientObjectsStates reference
				basestate.transientObjectsStates.add(Traceobjstate)
			}
		}

		return basestate
	}

	// **************************************************************************************************
	// This method isfor the case that we dont use gemoc changeaddon 
	// CREATE a set of objectstate and related trnsientobject based on the type parameter
	// true for dynamic and false for static Tracedobject
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def State createObjectstateSet(Set<EObject> objectlist, boolean type) {
		val State basestate = TraceFactory.eINSTANCE.createState
		var TransientObject traceobj = null
		basestate.basestate = null
		for (EObject p : objectlist) {

			traceobj = findtracedobject(p)

			if (traceobj == null) {
				traceobj = createTracedObject(p, type)
				// assigning newobjects reference
				basestate.newobjects.add(traceobj)
			}

			var ObjectState objstate = TraceFactory.eINSTANCE.createLeafObjectState
			objstate = createObjectState(p, type)

			// Create Objectstate
			if (objstate != null) {
				// Creation of objectstate and Traceobjstate of the first basestate
				val TransientObjectState Traceobjstate = TraceFactory.eINSTANCE.createTransientObjectState

				// Create Objectstate and assign to TracedObjectState
				Traceobjstate.objectstate = objstate
				Traceobjstate.transientobject = traceobj

				// assigning tracedObjectsStates reference
				basestate.transientObjectsStates.add(Traceobjstate)
			}
		}

		return basestate
	}

// **************************************************************************************************
	// **************************************************************************************************
	// CREATE a set of objectstate and related tracedobject based on the type parameter
	// true for dynamic and false for static Tracedobject
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def State createObjectstateSetforNewobjects(Collection<EObject> newObjects) {

		val EList<EStructuralFeature> featurelist = new BasicEList<EStructuralFeature>();
		val State basestate = TraceFactory.eINSTANCE.createState
		var TransientObject traceobj = null
		basestate.basestate = null
		for (EObject p : newObjects.toList) {
			val TransientObject t = findtracedobject(p)
			if (t == null) {
				var trobj = createTracedObject(p, isDynamic(p))
				basestate.newobjects.add(trobj)
			} else
				basestate.newobjects.add(t)

			val LeafObjectState objstate = TraceFactory.eINSTANCE.createLeafObjectState
			featurelist.clear
			p.eClass.EStructuralFeatures.filter[f|isDynamic(f)].forEach [ f |

				// Create value and assign to objectstate
				val Value value = createValue(p, f, isDynamic(p))

				if (value !== null) {
					objstate.value.add(value)
					featurelist.add(f)
				}
			]

			// other features and values of objectstate
			// Create Objectstate
			if (objstate.value.exists[v|v != null]) {
				// Creation of objectstate and Traceobjstate of the first basestate
				val TransientObjectState Traceobjstate = TraceFactory.eINSTANCE.createTransientObjectState

				// Create Objectstate and assign to TransientObjectState
				Traceobjstate.objectstate = createObjectState(objstate)
				Traceobjstate.transientobject = traceobj
				// assigning transientObjectsStates reference
				basestate.transientObjectsStates.add(Traceobjstate)
			}

		}

		return basestate
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE TREACEDOBJECT
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def TransientObject createTracedObject(EObject o, boolean type) {

		if (type == true) // for dynamic tracedobject
		{
			var DynamicTransientObject traceobj = TraceFactory.eINSTANCE.createDynamicTransientObject
			traceobj.type = o.eClass // Assiging a new object to the tracedobject
			transientobjectMap.put(o, traceobj)
			trace.transientobject.add(traceobj)
			return traceobj
		} else {
			var StaticTransientObject traceobj = TraceFactory.eINSTANCE.createStaticTransientObject
			traceobj.originalObject = o // Assiging a new object to the transientobject
			transientobjectMap.put(o, traceobj)
			trace.transientobject.add(traceobj)
			return traceobj
		}
	}

// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE REPEATING STEP
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def RepeatingStep createEachRepeatingstep(String stepkey) {

		// definition of a RepeatingSmallStep for  trace
		var RepeatingStep existrepstep = trace.repeatingstep.findFirst [ l |
			l.steptype.stepName == StepMap.get(Integer.valueOf(stepkey)).steptype && (l.children.size == 0)
		]
		if (existrepstep == null) {
			var RepeatingStep newreptstep = TraceFactory.eINSTANCE.createRepeatingStep

			newreptstep.steptype = trace.steptype.findFirst [ l |
				l.stepName == StepMap.get(Integer.valueOf(stepkey)).steptype
			]

			newreptstep.signature(stepkey)
			return (newreptstep)
		} else
			return existrepstep
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// compare two repeating steps with all their children that are the same or  not
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def static boolean isEqual(RepeatingStep r1, RepeatingStep r2) {
		if (r1.getChildren().size() != r2.getChildren().size())
			return false;
		if (r1.eAllContents().size() != r2.eAllContents.size())
			return false
		var EList<RepeatingStep> r1list = new BasicEList<RepeatingStep>();
		var EList<RepeatingStep> r2list = new BasicEList<RepeatingStep>();

		getRepeatingStepallContent(r1, r1list)
		getRepeatingStepallContent(r2, r2list)

		var int i = 0;
		var int count = r1list.size
		var same = true
		while (i < count && same) {
			if (r1list.get(i).steptype != r2list.get(i).steptype)
				same = false
			i = i + 1
		}
		return same

	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// CREATE STEPPATTERN
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def StepPattern createSteppatttern(String pattern, StepPattern steppattern1) {
		var int i = 1
		var String interncert = ""
		var String compositpattern = ""
		var String sig = ""
		// creation of repeatingsteps
		var RepeatingStep repstep = null;
		var StepPattern steppattern = TraceFactory.eINSTANCE.createStepPattern

		if (!pattern.contains("&")) {
			sig = MYHASH.get(Integer.valueOf(pattern)).sig.replaceAll("&&", "&")
			// is a small repeating step
			// var String steptype = StepMap.get(Integer.valueOf(content)).steptype
			val RepeatingStep repeatingstep = createRepeatingStep(sig)
			// if (repeatingstep.children.size==0){
			repstep = trace.repeatingstep.findFirst [ r |
				r.steptype.stepName == repeatingstep.steptype.stepName && isEqual(r, repeatingstep)
			// r.children.elementsEqual(repeatingstep.children)
			]
			if (repstep == null) {
				trace.repeatingstep.add(repeatingstep)
				steppattern.repeatingstep.add(repeatingstep)
			// addRepeatingstepToList(repeatingstep)
			} else {
				steppattern.repeatingstep.add(repstep)
			// addRepeatingstepToList(repstep)
			}

		} // }
		// } 
		else { // is a repetitive pattern of different nodes: like  '2@3@4@2@3@4@2@3@4@'
			compositpattern = pattern

			interncert = compositpattern.substring(1, compositpattern.indexOf("&", 1))
			i = i + interncert.length

			while (interncert != "") {

				sig = MYHASH.get(Integer.valueOf(interncert)).sig.replaceAll("&&", "&")

				val RepeatingStep repeatingbigstep = createRepeatingStep(sig)
				// repstep= trace.repeatingstep.findFirst[r | r.steptype.stepName==repeatingbigstep.steptype.stepName] //TODO : comparing two tree of repeatingsteps
				repstep = trace.repeatingstep.findFirst [ r |
					r.steptype.stepName == repeatingbigstep.steptype.stepName && isEqual(r, repeatingbigstep)
				// r.children.elementsEqual(repeatingstep.children)
				] // TODO : comparing two tree of repeatingsteps
				if (repstep == null) {
					trace.repeatingstep.add(repeatingbigstep)
					steppattern.repeatingstep.add(repeatingbigstep)
				// addRepeatingstepToList(repeatingbigstep)
				} else {
					steppattern.repeatingstep.add(repstep)
				// addRepeatingstepToList(repstep)
				}

				if (i < compositpattern.length - 1)
					interncert = compositpattern.substring(i + 1, compositpattern.indexOf("&", i + 1))
				else
					interncert = ""
				i = i + interncert.length + 1

			}

		}

		return steppattern

	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE Patternocurrence  for each pattern recognized in the trace
	// WITH  COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def PatternOcurrence createPatternOcurrence(int rept, StepPattern steppattern, ArrayList<Step> steplist,
		int stepposition, int numberstepinpattern) {

		// find the right position in the trace for creating Patternocurrence 
		var PatternOcurrence patternoccur = TraceFactory.eINSTANCE.createPatternOcurrence
		patternoccur.pattern = steppattern
		patternoccur.repet = rept

		// var Step step = findSpecificStepbySig(trace, sig)
		patternoccur.position(steplist.get(0).position)

		var Step prevstep = steplist.get(0)
		val Step stepparent = steplist.get(0).parent

		createPatternOccurStepData(rept, patternoccur, steplist, numberstepinpattern)
		// find the relevant step in the trace with the specific sig for replacing with a patternoccurrence
		if (prevstep != null) {
			if (stepparent != null)
				(stepparent as NormalStep).children.add(stepposition, patternoccur)
			else
				trace.step.add(stepposition, patternoccur)
		}

		// removing steps that are in patternoccurence from the trace
		for (Step s : RemoveSteps) {
			// if (s instanceof NormalStep)
			removeStepfromTrace(trace, s as NormalStep)

		}
		RemoveSteps.clear
		return patternoccur
	}

// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE state data for Patternocurrence in the trace
	// the state and parameterlists of each repeating step in a pattern occurence store sequentionaly 
	// WITH  COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def void createPatternOccurStepData(int rept, PatternOcurrence patternoccur, ArrayList<Step> steplist,
		int numberstepinpattern) {

		var int i = 0
		var int n = 0
		var int j = 0
		var int k = 0
		var int numberofstepdata = 0
		var EObject o = null
		var PatternOccurrenceStepData patternoccurstepdata = null
		var RepeatingStep repeatingstep = null
		var Step step = null
		while (i < rept) {
			for (n = 0; n < numberstepinpattern; n++) {
				if (i == 0) {
					var PatternOccurrenceStepData newpatternoccurstepdata = TraceFactory.eINSTANCE.
						createPatternOccurrenceStepData
					step = steplist.get(i * numberstepinpattern + n)

					// repeatingstep=SteppatternRepeatingStep.get(k)
					repeatingstep = patternoccur.pattern.repeatingstep.get(n)
					newpatternoccurstepdata.step = repeatingstep
					newpatternoccurstepdata.states.add(step.state)
					if (step.parameterlist != null)
						newpatternoccurstepdata.parameterlists.add(step.parameterlist)
					patternoccur.stepdata.add(newpatternoccurstepdata)
					RemoveSteps.add(step as NormalStep) // TODO : if step is patternoccurence this should be updated
					removestepIndex = removestepIndex + 1
					// extracting list of included step
					val EObject o1 = step as EObject
					val iterator = o1.eAllContents
					val list = new ArrayList<Step>
					while (iterator.hasNext) {
						var eo = iterator.next()
						list.add(eo as Step)
					}
					// extracting list of included repeatingstep in steppattern
					val EObject o2 = patternoccur.pattern.repeatingstep.get(n) as EObject
					val iterator2 = o2.eAllContents
					val rlist = new ArrayList<RepeatingStep>
					while (iterator2.hasNext) {
						var eo2 = iterator2.next()
						rlist.add(eo2 as RepeatingStep)
					}
					k = 0
					while (k < list.size) {
						var PatternOccurrenceStepData newpatternoccurstepdata2 = TraceFactory.eINSTANCE.
							createPatternOccurrenceStepData
						step = list.get(k)
						// repeatingstep=SteppatternRepeatingStep.get(k+1) // TODO : this array can be removed
						newpatternoccurstepdata2.step = rlist.get(k)
						newpatternoccurstepdata2.states.add(step.state)
						if (step.parameterlist != null)
							newpatternoccurstepdata2.parameterlists.add(step.parameterlist)
						patternoccur.stepdata.add(newpatternoccurstepdata2)
						RemoveSteps.add(step as NormalStep) // TODO : if step is patternoccurence this should be updated
						removestepIndex = removestepIndex + 1
						k = k + 1
					}

				} else {
					j = 0
					numberofstepdata = 0
					while (j < n) {
						o = steplist.get(j) as EObject
						numberofstepdata = numberofstepdata + o.eAllContents.size()
						j = j + 1
					}
					patternoccurstepdata = patternoccur.stepdata.get(i * numberofstepdata + n)
					step = steplist.get(i * numberstepinpattern + n)
					patternoccurstepdata.states.add(step.state)
					if (step.parameterlist != null)
						patternoccurstepdata.parameterlists.add(step.parameterlist)

					RemoveSteps.add(step as NormalStep) // TODO : if step is patternoccurence this should be updated
					removestepIndex = removestepIndex + 1
					// extracting list of included step
					val o3 = step as EObject
					val iterator = o3.eAllContents
					val list = new ArrayList<Step>
					while (iterator.hasNext) {
						var eo = iterator.next()
						list.add(eo as Step)

					}

					k = 0
					while (k < list.size) {
						patternoccurstepdata = patternoccur.stepdata.get(i * numberofstepdata + n + k + 1)
						step = list.get(k)
						patternoccurstepdata.states.add(step.state)
						if (step.parameterlist != null)
							patternoccurstepdata.parameterlists.add(step.parameterlist)
						RemoveSteps.add(step as NormalStep) // TODO : if step is patternoccurence this should be updated
						removestepIndex = removestepIndex + 1
						k = k + 1
					}

				}
			}
			i = i + 1
		}

	}

// ///////////////////////////////////////////////////////////////////////////////////////////////////
// **************************************************************************************************
// **************************************************************************************************
// **************************************************************************************************
// CREATE RepeatingStep in the form of recursive for generating repeating steps of pattern in the trace
// WITH  COMPATION	
// **************************************************************************************************
// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def RepeatingStep createRepeatingStep(String content) {
		var String sig = ""

		var String interncert = "";
		var int i = 0;

		var RepeatingStep newreptsmallstep = TraceFactory.eINSTANCE.createRepeatingStep
		if (!content.contains("&")) {
			newreptsmallstep = createEachRepeatingstep(content)
//			if (repBigStep != null) {
//				repBigStep.children.add(newreptsmallstep)
//				
//			}
			return newreptsmallstep;
		} else {

			val RepeatingStep repBigStep = TraceFactory.eINSTANCE.createRepeatingStep
			repBigStep.steptype = trace.steptype.findFirst [ l |
				l.stepName == StepMap.get(Integer.valueOf(content.substring(0, content.indexOf("/")))).steptype
			]
			repBigStep.signature(content)
			// repBigStep = createEachRepeatingstep(content.substring(0,content.indexOf("/")))
			i = content.indexOf("&")
			interncert = content.substring(i + 1, content.indexOf("&", i + 1))

			while (interncert != "") {
				sig = MYHASH.get(Integer.valueOf(interncert)).sig.replaceAll("&&", "&")
				val RepeatingStep newreptbigstep = createRepeatingStep(sig)
				if (newreptbigstep != null)
					// retreptstep.parent=newreptbigstep
					repBigStep.children.add(newreptbigstep)
				i = i + interncert.length + 1

				if (i < content.length - 1)
					interncert = content.substring(i + 1, content.indexOf("&", i + 1))
				else
					interncert = ""
			}

			val RepeatingStep existrepstep = trace.repeatingstep.findFirst [ r |
				r.steptype.stepName == repBigStep.steptype.stepName && isEqual(r, repBigStep)
			]
			if (existrepstep != null)
				return existrepstep
			else
				return repBigStep;
		}
	//
	}

// ///////////////////////////////////////////////////////////////////////////////////////////////////
// **************************************************************************************************
// **************************************************************************************************
// **************************************************************************************************
// Get key belong to a specific Tracedobject in transientobjectMap
// **************************************************************************************************
// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def EObject getKeyFromValueTracedobjectMap(TransientObject t) {
		for (EObject key : transientobjectMap.keySet) {
			if (transientobjectMap.get(key) == t) {
				return key;
			}

		}
		return null;
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
// **************************************************************************************************
// **************************************************************************************************
// **************************************************************************************************
// CREATE STEPPatterns in the form of recursive  in the trace
// WITH  COMPATION	
// **************************************************************************************************
// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def void createTracePattern(String pattern, int rept, ArrayList<Step> steplist, int stepposition,
		int numberstepinpattern) {

		val String newpattern = pattern.replaceAll("&&", "&")
		val StepPattern steppattern2 = createSteppatttern(newpattern, null)
		// check the existence of steppattern
		val existingpattern2 = trace.steppattern.findFirst [ l |

			l.repeatingstep.elementsEqual(steppattern2.repeatingstep)
		]
		if (existingpattern2 == null) {
			trace.steppattern.add(steppattern2)
			createPatternOcurrence(rept, steppattern2, steplist, stepposition, numberstepinpattern)
		} else {
			createPatternOcurrence(rept, existingpattern2, steplist, stepposition, numberstepinpattern)
		}

		return;

	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
// **************************************************************************************************
// **************************************************************************************************
// **************************************************************************************************
// Detection of pattern, creation of repeatingstep and patternsetps,calling methods to create patternoccurence	
// **************************************************************************************************
// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def void PatternDetection() {
		// finding patterns and replacing with patternOccurence in the trace		
		FindTracePattern(trace)
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
// **************************************************************************************************
// **************************************************************************************************
// **************************************************************************************************
// CREATE PATTERNSTEP in the form of recursive for generating repeating steps of pattern in the trace
// WITH  COMPATION	
// **************************************************************************************************
// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def void FindTracePattern(Trace trace) {
		var Pattern pattern = null
		var Matcher matcher = null
		var String str2 = ""
		var Set<Integer> keys = MYHASH.keySet();
		var List<pattern> patternlist = new ArrayList<pattern>()
		val steplist = new ArrayList<Step>
		var int startpatternPos = 0
		var Step step = null
		var String str = "(&.+?&)\\1+" // "(&.+?)\\1+"; // "(\\w+)" ;   //"(.+?)\'1+"///(.+)(?=\1+)" ////"@2";
		pattern = Pattern.compile(str);
		var numberstepinpattern = 0

		val list = new ArrayList<Step>
		var String strsig = ""
		val String s = "&";
		var int counter = 0;

		var int i = 0
		var k = 0
		var j = 0
		var p = ""
		var found = false
		var repeatedsig = ""
		var String strwithouttwosymbol = ""
		var String st = ""
		patternlist.clear

		for (int key : keys) {
			matcher = pattern.matcher(MYHASH.get(key).sig);
			str2 = MYHASH.get(key).sig

			while (matcher.find()) {
				var pattern onepattern = new pattern()
				onepattern.signature = str2
				onepattern.repeatedpattern = matcher.group(1)
				onepattern.rept = matcher.group(0).length() / matcher.group(1).length()
				onepattern.certificate = key.toString()
				onepattern.startposinpattern = matcher.start
				patternlist.add(onepattern)

				System.out.println(
					str2 + "pattern: " + matcher.group(1) + "repeated for " +
						matcher.group(0).length() / matcher.group(1).length() + "times with certificate :" + key);

				k = k + 1

			}
		}

		for (i = 0; i < patternlist.size; i++) {
			k = 0
			found = false
			list.clear
			while (!found && k < patternlist.size) // if a pattern occuernece include a pattern, the nested pattern 
			// is not considered in step compaction
			{
				p = "&" + patternlist.get(i).certificate + "&"
				if (k != i) {
					if (patternlist.get(k).repeatedpattern.contains(p))
						found = true
				}
				k = k + 1
			}
			if (!found) { // compact repetitions which are not include of patternoccurence
				repeatedsig = patternlist.get(i).signature
				startpatternPos = patternlist.get(i).startposinpattern
				strwithouttwosymbol = repeatedsig.substring(0, startpatternPos)
				strsig = strwithouttwosymbol.replace("&&", "&")
				counter = 0;

				str = "&.+?&+?"
				pattern = Pattern.compile(str);
				matcher = pattern.matcher(strsig);
				if (matcher.find()) // if (strwithouttwosymbol.contains("&&"))
				{
					for (k = 0; k < strsig.length; k++) {

						st = strsig.charAt(k).toString
						if (st == s) {
							counter++;
						}
					}
					counter = counter - 1 // there is one more & in the string
				}

				if (i > 0 && patternlist.get(i).certificate == patternlist.get(i - 1).certificate) {
					k = i - 1
					while (k >= 0 && patternlist.get(i).certificate == patternlist.get(k).certificate) // this means that multiple pattern included in a signature, we should modify counter to get the right position after adding patternocurrence.
					{
						numberstepinpattern = 0
						strsig = patternlist.get(k).repeatedpattern.replace("&&", "&")
						for (j = 0; j < strsig.length; j++) {
							st = strsig.charAt(j).toString
							if (st == s) {
								numberstepinpattern++;
							}
						}
						numberstepinpattern = numberstepinpattern - 1

						counter = counter - (patternlist.get(k).rept * numberstepinpattern) + 1 // increase one to the results because we added a new patternocur instead of step repetitions
						k = k - 1
					}
				}

				if (repeatedsig.substring(0, repeatedsig.indexOf("/")) == "VTS")
					for (j = 0; j < trace.step.size; j++)
						list.add(trace.step.get(j))
				// step=AllStepMap.get(counter).step 
				else {
					// step = findSpecificStepbySig(trace, MYHASH.get(key).sig)
					step = findSpecificStepbySig(trace, repeatedsig.replace("&&", "&"))

					val o = step as EObject
					val iterator = o.eContents

					for (j = 0; j < iterator.size; j++)
						list.add(iterator.get(j) as Step)

				}
				numberstepinpattern = 0
				strsig = patternlist.get(i).repeatedpattern.replace("&&", "&")
				for (j = 0; j < strsig.length; j++) {
					st = strsig.charAt(j).toString
					if (st == s) {
						numberstepinpattern++;
					}
				}

				numberstepinpattern = numberstepinpattern - 1
				steplist.clear
				val c = patternlist.get(i).rept * numberstepinpattern
				for (j = 0; j < c; j++)
					steplist.add(list.get(counter + j))

				createTracePattern(patternlist.get(i).repeatedpattern, patternlist.get(i).rept, steplist, counter,
					numberstepinpattern)

			}

		}

	}

}
