package genericTraceDecompactor

//import static tracemetamodel.java.GeneralModelInstance.*
import trace.Trace
import trace.TraceFactory
import trace.TracePackage
import org.eclipse.emf.common.util.URI
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.ResourceSet
import java.util.Collections
import java.io.IOException

class decompactorMain {
	

    def static void main(String[] args) {
		   
		 val String filename=""
		 
         var Trace trace = TraceFactory.eINSTANCE.createTrace
         var tracedecompactor = new GenericTraceDecompactor

	      trace=loadTracedata(filename);

		  tracedecompactor.Decompactor(trace,filename);
		  
		
	 }
	


def static Trace loadTracedata(String file) {
	    // Initialize the model
		TracePackage.eINSTANCE.eClass();

		 // Register the XMI resource factory 
	    var Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	   var  Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    val ResourceSet resSet = new ResourceSetImpl();
	   

	    // Get the resource
	    val Resource resource = resSet.getResource(URI
	        .createURI("trace/" + file), true);
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	   val Trace trace =  resource.getContents().get(0) as Trace;
	    
	    return trace;
	
	}
	
	def  void createSerializedTraceforGeneral(Trace trace,String file) {

		// Register the XMI resource factory for the .trace extension
		var Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		val Map<String, java.lang.Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		val ResourceSet resSet = new ResourceSetImpl();
		// create a resource7y7y

		val Resource resource = resSet.createResource(URI.createURI("trace/" + file ));
	//	Resource resource = resSet.createResource(URI.createURI("trace/" + filename   ));
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