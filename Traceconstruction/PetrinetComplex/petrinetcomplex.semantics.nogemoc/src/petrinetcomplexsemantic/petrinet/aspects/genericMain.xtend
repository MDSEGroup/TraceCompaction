package petrinetcomplexsemantic.petrinet.aspects

 //----- this class is not required by using gemoc addon
import petrinet.Net
import petrinet.PetrinetFactory

import static tracemetamodel.java.modelInstance.*

import petrinetcomplexsemantic.petrinet.aspects.NetAspect
import org.eclipse.emf.common.util.URI
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.ResourceSet
import petrinet.PetrinetPackage


class genericMain {
	static String filename="GenericTraceTFSM_simpleTrafficLight.xmiparallelpetrinet";
	    def static void main(String[] args) {
			
    
          var Net net  = PetrinetFactory.eINSTANCE.createNet

	       net=  load2()
	       NetAspect.run(net)
	       
         //  net.run() 
          
	 }
	



//	static String filename="generaltest2.xmi";

//**************************************************************************************************
////////// Load a executed model for petrinets 
//**************************************************************************************************   
def static Net load2() {
	
	PetrinetPackage.eINSTANCE.eClass();

	 // Register the XMI resource factory 
    var Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    var Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("xmi", new XMIResourceFactoryImpl());

    // Obtain a new resource set
    var ResourceSet resSet = new ResourceSetImpl();
   

    // Get the resource
    var Resource resource = resSet.getResource(URI
        .createURI("model/" + filename), true);
    // Get the first model element and cast it to the right type, in my
    // example everything is hierarchical included in this first node
   
   val Net net =  resource.getContents().get(0) as Net
    
    return net;
}
   	//**************************************************************************************************
	//////////Load a trace file for decompaction  :::TODO : not used for now
	//**************************************************************************************************   
	
}	 

	

	 
	 

	

