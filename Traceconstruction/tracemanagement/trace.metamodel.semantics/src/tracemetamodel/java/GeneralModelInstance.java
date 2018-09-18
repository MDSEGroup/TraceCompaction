//package tracemetamodel.java;
//	import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Map;
//
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
//
//
//import trace.ObjectState;
//import trace.Trace;
//import trace.TracePackage;
//
//public class GeneralModelInstance {
//	protected List<ObjectState> objectlist2 = new ArrayList<ObjectState>();
//	
//	static String filename="generaltest2.xmi";
//	//static String filename="generaltest.xmi";
//	//static String filename="parallelpetrinet.xmi";
////	static String filename="Netsamplemodel2.xmi";
//
////	public static Trace loadTracedata2(String file) {
////	    // Initialize the model
////		TracePackage.eINSTANCE.eClass();
////
////		 // Register the XMI resource factory 
////	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
////	    Map<String, Object> m = reg.getExtensionToFactoryMap();
////	    m.put("xmi", new XMIResourceFactoryImpl());
////
////	    // Obtain a new resource set
////	    ResourceSet resSet = new ResourceSetImpl();
////	   
////
////	    // Get the resource
////	    Resource resource = resSet.getResource(URI
////	        .createURI("model/" + file), true);
////	    // Get the first model element and cast it to the right type, in my
////	    // example everything is hierarchical included in this first node
////	    Trace trace = (Trace) resource.getContents().get(0);
////	    
////	    return trace;
////	
////	}
//	//**************************************************************************************************
//	//////////Load a trace file for decompaction  :::TODO : not used for now
//	//**************************************************************************************************   
//	public static  Trace loadTrace(String file) {
//
//	
//	// Register the XMI resource factory 
//	Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//	Map<String, Object> m = reg.getExtensionToFactoryMap();
//	m.put("xmi", new XMIResourceFactoryImpl());
//	
//	// Obtain a new resource set
//	ResourceSet resSet = new ResourceSetImpl();
//	
//	
//	// Get the resource
//	Resource resource = resSet.getResource(URI
//	.createURI("trace/" + file), true);
//	// Get the first model element and cast it to the right type, in my
//	// example everything is hierarchical included in this first node
//	
//	Trace trace = (Trace) resource.getContents().get(0);
//	
//	return trace;
//	
//	
//	}
//	
//	public static void createSerializedTraceforGeneral(Trace trace,String tracename) {
//
//		// Register the XMI resource factory for the .trace extension
//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		Map<String, java.lang.Object> m = reg.getExtensionToFactoryMap();
//		m.put("xmi", new XMIResourceFactoryImpl());
//
//		// Obtain a new resource set
//		ResourceSet resSet = new ResourceSetImpl();
//		// create a resource7y7y
//
//		Resource resource = resSet.createResource(URI.createURI("trace/" + tracename+filename   ));
//	//	Resource resource = resSet.createResource(URI.createURI("trace/" + filename   ));
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
//	
//
//	
//	
////
////
////		public static void createSerializedTrace(Trace trace,String tracename) {
////
////			// Register the XMI resource factory for the .trace extension
////			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
////			Map<String, java.lang.Object> m = reg.getExtensionToFactoryMap();
////			m.put("xmi", new XMIResourceFactoryImpl());
////
////			// Obtain a new resource set
////			ResourceSet resSet = new ResourceSetImpl();
////			// create a resource7y7y
////
////			Resource resource = resSet.createResource(URI.createURI("trace/" + filename +tracename  ));
////			// Get the first model element and cast it to the right type, in my
////			// example everything is hierarchical included in this first node
////			resource.getContents().add(trace);
////		
////
////			
////			try {
////				resource.save(Collections.EMPTY_MAP);
////				System.out.print("saving Xmi successfull");
////		
////			} catch (IOException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
////
////		}
////		
//
//	}
//	 
//
//
//
