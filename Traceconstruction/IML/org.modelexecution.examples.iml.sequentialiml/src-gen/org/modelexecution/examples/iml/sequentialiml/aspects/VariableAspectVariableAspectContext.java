package org.modelexecution.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.examples.iml.sequentialiml.aspects.VariableAspectVariableAspectProperties;
import org.modelexecution.examples.iml.sequentialiml.iml.Variable;

@SuppressWarnings("all")
public class VariableAspectVariableAspectContext {
  public final static VariableAspectVariableAspectContext INSTANCE = new VariableAspectVariableAspectContext();
  
  public static VariableAspectVariableAspectProperties getSelf(final Variable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.examples.iml.sequentialiml.aspects.VariableAspectVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Variable, VariableAspectVariableAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.examples.iml.sequentialiml.iml.Variable, org.modelexecution.examples.iml.sequentialiml.aspects.VariableAspectVariableAspectProperties>();
  
  public Map<Variable, VariableAspectVariableAspectProperties> getMap() {
    return map;
  }
}
