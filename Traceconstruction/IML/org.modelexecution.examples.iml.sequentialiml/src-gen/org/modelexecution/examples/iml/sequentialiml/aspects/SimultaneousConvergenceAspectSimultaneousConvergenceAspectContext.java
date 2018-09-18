package org.modelexecution.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.examples.iml.sequentialiml.aspects.SimultaneousConvergenceAspectSimultaneousConvergenceAspectProperties;
import org.modelexecution.examples.iml.sequentialiml.iml.SimultaneousConvergence;

@SuppressWarnings("all")
public class SimultaneousConvergenceAspectSimultaneousConvergenceAspectContext {
  public final static SimultaneousConvergenceAspectSimultaneousConvergenceAspectContext INSTANCE = new SimultaneousConvergenceAspectSimultaneousConvergenceAspectContext();
  
  public static SimultaneousConvergenceAspectSimultaneousConvergenceAspectProperties getSelf(final SimultaneousConvergence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.examples.iml.sequentialiml.aspects.SimultaneousConvergenceAspectSimultaneousConvergenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SimultaneousConvergence, SimultaneousConvergenceAspectSimultaneousConvergenceAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.examples.iml.sequentialiml.iml.SimultaneousConvergence, org.modelexecution.examples.iml.sequentialiml.aspects.SimultaneousConvergenceAspectSimultaneousConvergenceAspectProperties>();
  
  public Map<SimultaneousConvergence, SimultaneousConvergenceAspectSimultaneousConvergenceAspectProperties> getMap() {
    return map;
  }
}
