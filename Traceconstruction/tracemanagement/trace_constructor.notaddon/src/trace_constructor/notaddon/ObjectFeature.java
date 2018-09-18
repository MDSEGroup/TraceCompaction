package trace_constructor.notaddon;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ObjectFeature {

	    private EObject object;
	    private EStructuralFeature feature;
	    public void setObject(EObject object) {
			this.object = object;
		}public void setFeature(EStructuralFeature feature) {
			this.feature = feature;
		}public EObject getObject() {
			return object;
		}public EStructuralFeature getFeature() {
			return feature;
		}
	    
}
