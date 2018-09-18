package petrinet.xdsml;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	petrinet.PetrinetPackage.eNS_URI,
    	petrinet.PetrinetPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor petrinet = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"petrinet.xdsml.Petrinet", "", "petrinet", "petrinet.xdsml.PetrinetMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"petrinet.xdsml.Petrinet",
    	petrinet
    );
    MelangeRegistry.ModelTypeDescriptor petrinetMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"petrinet.xdsml.PetrinetMT", "", "http://petrinet.xdsml.petrinetmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"petrinet.xdsml.PetrinetMT",
    	petrinetMT
    );
  }
}
