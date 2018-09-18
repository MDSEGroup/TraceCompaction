package petrinet.traceconstruction
//it is not needed any more
// the content rewriten to compacttraceconstructor
/*
import petrinet.Net
import petrinet.Transition
import trace.BaseState

import trace.LeafObjectState
import trace.LeafParameterSet
import trace.LiteralInteger
import trace.ParameterSet
import trace.ParameterValue
import trace.ParamterKindEnum

import trace.StepType
import trace.Trace
import trace.TraceFactory
import trace.TracedObject
import trace.TracedObjectState

import static petrinet.java.modelInstance.*
import petrinet.Place
import trace.Value
import trace.ObjectState
import trace.Step
import petrinet.PetrinetFactory
import java.util.Stack

public class TraceConstructor {

	val Trace trace = TraceFactory.eINSTANCE.createTrace
    var Stack<Step> stepstack = new Stack<Step>();
	var BigStep currentBigStep = TraceFactory.eINSTANCE.createBigStep
	val String filename="CompactlessTrace.xmi"

	var Transition currentTransition = PetrinetFactory.eINSTANCE.createTransition
    
    /// Constructor of CompactTraceConstructor
	new () 
	{
				println ("Generation of trace with out compaction")
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
		var SmallStep smallstep = TraceFactory.eINSTANCE.createSmallStep
		smallstep = createSmallStep(net, transition)
	
		// Creation of Input parameter
		createInputParameter(transition, smallstep)

	    stepstack.push(smallstep)
		// Setting previousSmallStep with current Step
		//currentSmallStep = smallstep

		println("before fire finished for :" + transition.name)

	// throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	// **************************************************************************************************
	// //////// AFTER FIRE OF A TRANSITION- run for smalstep
	// **************************************************************************************************   
	def void afterFire(Net net, Transition transition) {

		// Creation of output parameter
    	var SmallStep smallstep = TraceFactory.eINSTANCE.createSmallStep
	    smallstep=(stepstack.pop as SmallStep)
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

		var BigStep bigstep= TraceFactory.eINSTANCE.createBigStep
		bigstep=createBigstep(net)
		stepstack.push(bigstep)

		currentBigStep=bigstep
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

	  var BigStep bigstep= TraceFactory.eINSTANCE.createBigStep
		bigstep=stepstack.pop as BigStep
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
		createSerializedTrace(trace,filename)
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
		// storing state after run
		// /initialize first BaseState   
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

			//TODO traceobjstate.tracedobject = trace.tracedobject.findFirst[t|t.objname == p.name]
			basestate.tracedObjectsStates.add(traceobjstate)
		]

		trace.basestate.add(basestate)
		return basestate
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
				paramvalue.values.add(createValue(in))

			]

			leafparamset.values.add(paramvalue)

			smallstep.parameterset = leafparamset

			trace.parameterValues.add(paramvalue)
			trace.parametersets.add(leafparamset)
		}

	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE OUT PARAMETER AND PARAMETERSET
	// WITH OUT COMPATION	
	// **************************************************************************************************
	// /////////////////////////////////////////////////////////////////////////////////////////////////// 
	def void createOutputParameter(Transition transition, Step smallstep) {
		val LeafParameterSet leafparamset = TraceFactory.eINSTANCE.createLeafParameterSet
		val ParameterValue paramvalue = TraceFactory.eINSTANCE.createParameterValue
		paramvalue.directionKind = ParamterKindEnum.OUT

		if (!transition.output.empty) {
			transition.output.forEach [ out |
				println(transition.name + " " + out.name + "" + out.tokens)
				// Create Value and assign to parametervalue
				paramvalue.values.add(createValue(out))

			]

			leafparamset.values.add(paramvalue)
			var ParameterSet parameterset = TraceFactory.eINSTANCE.createLeafParameterSet

			parameterset = smallstep.parameterset
			// IF there is no input parameter for transition, we create a new ParameterSet and add to trace
			if (parameterset == null) {
				trace.parametersets.add(leafparamset)
				smallstep.parameterset = leafparamset
			}
//
			if (parameterset instanceof LeafParameterSet)
				parameterset.values.add(paramvalue)

			trace.parameterValues.add(paramvalue)
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
	def SmallStep createSmallStep(Net net, Transition transition) {
		// /Steptype
		var StepType steptype = TraceFactory.eINSTANCE.createStepType
		steptype.stepName = transition.name
		trace.steptype.add(steptype)

		// /creation of smallstep
		val SmallStep smallstep = TraceFactory.eINSTANCE.createSmallStep
		smallstep.steptype = steptype

		trace.stepspec.add(smallstep)
		smallstep.parent = currentBigStep
		
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
	def BigStep createBigstep(Net net) {
		// create steptype
		var StepType steptype = TraceFactory.eINSTANCE.createStepType
		steptype.stepName = "Big" + net.transition.get(0).name // //// This is added to specify between BigStep and smallStep
		trace.steptype.add(steptype)

		var BigStep bigstep = TraceFactory.eINSTANCE.createBigStep
		bigstep.steptype = steptype
		trace.stepspec.add(bigstep)

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
	// WITH OUT COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def Value createValue(Place p) {

		val LiteralInteger intvalue = TraceFactory.eINSTANCE.createLiteralInteger
		intvalue.intvalue = p.tokens
		trace.value.add(intvalue)
		return (intvalue as Value)
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE OBJECT STATE
	// WITH OUT COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def createObjectState(Place p) {
		val LeafObjectState objstate = TraceFactory.eINSTANCE.createLeafObjectState

		// Create value and assign to objectstate
		objstate.value.add(createValue(p))

		trace.objectstate.add(objstate)
		return (objstate as ObjectState)
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// **************************************************************************************************
	// **************************************************************************************************
	// CREATE TREACEDOBJECT, CREATE FIRST BASESTATE AND ASSIGN NEWOBJECTS AND TRACEDOBJECTSTATE
	// WITH OUT COMPATION	
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def void createTracedObject(Net net) {
		// /initialize first BaseState   
		val BaseState basestate0 = TraceFactory.eINSTANCE.createBaseState
		basestate0.basestate = null

		// Creation of Tracedobject
		net.place.forEach [ p |
			var TracedObject traceobj = TraceFactory.eINSTANCE.createTracedObject
			traceobj.objname = p.name
			trace.tracedobject.add(traceobj)

			// assigning newobjects reference
			basestate0.newobjects.add(traceobj)

			// Creation of objectstate and Traceobjstate of the first basestate
			val TracedObjectState Traceobjstate = TraceFactory.eINSTANCE.createTracedObjectState

			// Create Objectstate and assign to TracedObjectState
			Traceobjstate.objectstate = createObjectState(p)
			Traceobjstate.tracedobject = traceobj

			// assigning tracedObjectsStates reference
			basestate0.tracedObjectsStates.add(Traceobjstate)
		]
		trace.basestate.add(basestate0)
	}





}
*/