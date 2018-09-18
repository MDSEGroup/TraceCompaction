package tracemetamodel.java;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import trace.Step;

public class StepMap {


			public Object object;
			public String steptype;
		    public  Set<Step> StepSet = new HashSet<Step>();
		    
			public Object getObject() {
				return object;
			}
			public Set<Step> getStepSet() {
				return StepSet;
			}
			public void setObject(EObject object) {
				this.object = object;
			}
			public void setStepSet(Set<Step> stepSet) {
				StepSet = stepSet;
			}
		  
			

}
