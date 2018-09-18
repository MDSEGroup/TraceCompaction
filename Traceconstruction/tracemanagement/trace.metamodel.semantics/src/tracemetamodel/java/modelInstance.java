package tracemetamodel.java;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import trace.Trace;







public class modelInstance {
	

//static String filename="generaltest1.xmi";
//	static String filename="Netsamplemodel.xmi";
//static String filename="parallelpetrinet.xmi";
	static String filename="";
//**************************************************************************************************
// //////// Load a executed model for geneeral case 
// **************************************************************************************************   
public static EList<EObject> genericload(String file) {


	 // Register the XMI resource factory 
    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("xmi", new XMIResourceFactoryImpl());

    // Obtain a new resource set
    ResourceSet resSet = new ResourceSetImpl();
   

    // Get the resource
    Resource resource = resSet.getResource(URI
        .createURI("model/" + file), true);
    // Get the first model element and cast it to the right type, in my
    // example everything is hierarchical included in this first node
   
    return (resource.getContents());
  
  
}
//**************************************************************************************************
////////// Load a trace file for decompaction  
//**************************************************************************************************   
public static  Trace loadTrace(String file) {


	 // Register the XMI resource factory 
 Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
 Map<String, Object> m = reg.getExtensionToFactoryMap();
 m.put("xmi", new XMIResourceFactoryImpl());

 // Obtain a new resource set
 ResourceSet resSet = new ResourceSetImpl();


 // Get the resource
 Resource resource = resSet.getResource(URI
     .createURI("trace/" + file), true);
 // Get the first model element and cast it to the right type, in my
 // example everything is hierarchical included in this first node

 Trace trace = (Trace) resource.getContents().get(0);
 
 return trace;


}
//**************************************************************************************************
////////// store the generated trace as an xml 
//**************************************************************************************************   

	public static void createSerializedTrace(Trace trace,String tracename) {
		
		
		// Register the XMI resource factory for the .trace extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, java.lang.Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		// create a resource7y7y
	 // String strpath=modelInstance.class.getClassLoader().getResource("").getPath();
		Resource resource = resSet.createResource(URI.createURI("trace/" + tracename+filename   ));
		
		
		//Resource resource = resSet.createResource(URI.createURI( strpath + "trace/" + "AutoGen.xmi"));
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
	
	
}
 

