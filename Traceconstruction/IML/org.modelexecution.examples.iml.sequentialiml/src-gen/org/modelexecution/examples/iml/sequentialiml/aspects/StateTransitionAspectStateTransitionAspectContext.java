package org.modelexecution.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.examples.iml.sequentialiml.aspects.StateTransitionAspectStateTransitionAspectProperties;
import org.modelexecution.examples.iml.sequentialiml.iml.StateTransition;

@SuppressWarnings("all")
public class StateTransitionAspectStateTransitionAspectContext {
  public final static StateTransitionAspectStateTransitionAspectContext INSTANCE = new StateTransitionAspectStateTransitionAspectContext();
  
  public static StateTransitionAspectStateTransitionAspectProperties getSelf(final StateTransition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.examples.iml.sequentialiml.aspects.StateTransitionAspectStateTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StateTransition, StateTransitionAspectStateTransitionAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.examples.iml.sequentialiml.iml.StateTransition, org.modelexecution.examples.iml.sequentialiml.aspects.StateTransitionAspectStateTransitionAspectProperties>();
  
  public Map<StateTransition, StateTransitionAspectStateTransitionAspectProperties> getMap() {
    return map;
  }
}
