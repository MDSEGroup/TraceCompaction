package trace_constructor.notaddon.test

import java.io.IOException
import java.util.Collections
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import trace.NormalStep
import trace.Trace
import trace.TraceFactory
import trace.TracePackage
import trace_constructor.notaddon.GenericTraceConstructor
import tracemetamodel.java.StepMap

import static tracemetamodel.xtend.stepOperation.*

import static extension trace.aspects.StepAspect.*

class generaltestmain {
	var static int _position = 0
	var static int stepMapIndex = 1

	def static void main(String[] args) {

		var traceconstructor = new GenericTraceConstructor

		// val String filename="GenericTraceTFSM_simpleTrafficLight.xmiparallelpetrinet"
		val String filename = "1100GenericTrace2557-2.xmi"
		// val String filename="GenericTraceIML_SimpleMovingRobot.xmi"
		var Trace trace = TraceFactory.eINSTANCE.createTrace

		trace = loadTrace2(filename);
		// load()
		traceconstructor.trace = trace
		setPositionStep(trace.step.get(0) as NormalStep);

//  	
		compactStep(traceconstructor.trace)

//	    var Set<Integer> keys = MYHASH.keySet();
//		
//		for (int key : keys) {
//			System.out.println(key + ":" + MYHASH.get(key).sig);
//
//		
//		} // end for
		traceconstructor.PatternDetection()
		createSerializedTraceforGeneral(traceconstructor.trace, filename)
	}

	// createSerializedTraceforGeneral(trace, filename)
//	      var Step e2=null
//    var Step e3=null
//		e2= getNextStep(trace.rootStep,e2 ) as Step
//		var int i=0
//		while (e2!=null)
//		{ 
//			
//		    e3=getNextStepafterPos(trace.rootStep,e2)
//		    println((e3.steptype.stepName + " :" + e3.position) + "after " + e2.steptype.stepName) 
//	
//			e2= getNextStepafterPos(trace.rootStep,e2 ) as Step
//			
//			
//		}
	def static void setPositionStep(NormalStep root) {
//	 	if (step!=null)
//	 	{
//	 	  _position=_position+1
//   	    	step.position=_position 
//   	    	println(step.steptype.stepName + " : " + _position)
//   	    	STEPARRAY.put(_position,step)
//   	    	if  (step instanceof SmallStep)
//   	    	{
//   	    	  return;
//   	    	   
//   	    	   }
//		 	else
//		 
//	 	     (step as BigStep).children.forEach[p |
//		           	         	 setPositionStep(trace,p)
//		           	       ]
//}
//			return;
//}
		var NormalStep f1 = null
		var int i = 0
		// Avoid infinite loops
		if(root == null) return;
		_position = _position + 1
		root.position = _position
		// println(root.steptype.stepName + " : " + _position)
		var Object o = root.parameterlist
		var int k = getKeyFromValueStepMap(o)
		if (k != 0) {
			StepMap.get(k).StepSet.add(root)
		} else {
			var StepMap stepmap = new StepMap()
			stepmap.object = o
			stepmap.steptype = root.steptype.stepName
			stepmap.StepSet.add(root)
			StepMap.put(stepMapIndex, stepmap)
			stepMapIndex = stepMapIndex + 1
		}
		// /////////////////////////////////////////
		// /////////////////////////////////////////////
//		var StepStatus stepstatus = new StepStatus()
//		stepstatus.step=root
//		AllStepMap.put(_position,stepstatus)
		// STEPARRAY.put(_position,root)
		if (root.children.size == 0)
			return;
		if (root.children.size != 0)
			while (i < root.children.size) {
				f1 = root.children.get(i) as NormalStep

				setPositionStep(f1)

				i = i + 1
			}

		return;
	}

	// **************************************************************************************************
	// ////////Load a trace file for decompaction  :::TODO : not used for now
	// **************************************************************************************************   
	def static Trace loadTrace2(String file) {

		TracePackage.eINSTANCE.eClass();
		// Register the XMI resource factory 
		var Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		var Map<String, Object> m = reg.getExtensionToFactoryMap();
		// m.put("uml1000", new XMIResourceFactoryImpl());
		m.put("xmi", new XMIResourceFactoryImpl());
		// Obtain a new resource set
		var ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		var Resource resource = resSet.getResource(URI.createURI("trace/" + file), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		var Trace trace = resource.getContents().get(0) as Trace;

		return trace;

	}

	def static void createSerializedTraceforGeneral(Trace trace, String file) {

		// Register the XMI resource factory for the .trace extension
		var Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		val Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		val ResourceSet resSet = new ResourceSetImpl();
		// create a resource7y7y
		val Resource resource = resSet.createResource(URI.createURI("trace/" + "StepCompacted" + file));
		// Resource resource = resSet.createResource(URI.createURI("trace/" + filename   ));
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resource.getContents().add(trace);

		try {
			resource.save(Collections.EMPTY_MAP);
			System.out.print("saving Xmi successfull");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
//	 def void createSerializedTraceforgeneraltest(Trace trace,String tracename) {
//		
//		
//		// Register the XMI resource factory for the .trace extension
//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		Map<String, java.lang.Object> m = reg.getExtensionToFactoryMap();
//		m.put("xmi", new XMIResourceFactoryImpl());
//
//		// Obtain a new resource set
//		ResourceSet resSet = new ResourceSetImpl();
//		// create a resource7y7y
//	 // String strpath=modelInstance.class.getClassLoader().getResource("").getPath();
//		Resource resource = resSet.createResource(URI.createURI("trace/" + tracename+filename   ));
//		
//		
//		//Resource resource = resSet.createResource(URI.createURI( strpath + "trace/" + "AutoGen.xmi"));
//		// Get the first model element and cast it to the right type, in my
//		// example everything is hierarchical included in this first node
//		resource.getContents().add(trace);
//	
//
//		
//		try {
//			resource.save(Collections.EMPTY_MAP);
//			System.out.print("saving Xmi successfull");
//	
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
}
