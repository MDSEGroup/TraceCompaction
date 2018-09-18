package org.modelexecution.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.examples.iml.sequentialiml.aspects.SelectionConvergenceAspectSelectionConvergenceAspectProperties;
import org.modelexecution.examples.iml.sequentialiml.iml.SelectionConvergence;

@SuppressWarnings("all")
public class SelectionConvergenceAspectSelectionConvergenceAspectContext {
  public final static SelectionConvergenceAspectSelectionConvergenceAspectContext INSTANCE = new SelectionConvergenceAspectSelectionConvergenceAspectContext();
  
  public static SelectionConvergenceAspectSelectionConvergenceAspectProperties getSelf(final SelectionConvergence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.examples.iml.sequentialiml.aspects.SelectionConvergenceAspectSelectionConvergenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SelectionConvergence, SelectionConvergenceAspectSelectionConvergenceAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.examples.iml.sequentialiml.iml.SelectionConvergence, org.modelexecution.examples.iml.sequentialiml.aspects.SelectionConvergenceAspectSelectionConvergenceAspectProperties>();
  
  public Map<SelectionConvergence, SelectionConvergenceAspectSelectionConvergenceAspectProperties> getMap() {
    return map;
  }
}
