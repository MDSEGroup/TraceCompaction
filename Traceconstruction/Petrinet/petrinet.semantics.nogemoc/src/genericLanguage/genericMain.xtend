package genericLanguage

 //----- this class is not required by using gemoc addon
import petrinet.Net
import petrinet.PetrinetFactory

import static tracemetamodel.java.modelInstance.*

import genericLanguage.NetAspect


class genericMain {
	    def static void main(String[] args) {
			
    
          var Net net  = PetrinetFactory.eINSTANCE.createNet

	       net=  load()
	       NetAspect.run(net)
	       
         //  net.run() 
          
	 }
	


}	 

	

	 
	 

	

