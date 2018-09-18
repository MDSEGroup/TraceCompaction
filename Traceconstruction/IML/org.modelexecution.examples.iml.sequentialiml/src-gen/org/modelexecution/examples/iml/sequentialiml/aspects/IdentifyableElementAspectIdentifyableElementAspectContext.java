package org.modelexecution.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.examples.iml.sequentialiml.aspects.IdentifyableElementAspectIdentifyableElementAspectProperties;
import org.modelexecution.examples.iml.sequentialiml.iml.IdentifyableElement;

@SuppressWarnings("all")
public class IdentifyableElementAspectIdentifyableElementAspectContext {
  public final static IdentifyableElementAspectIdentifyableElementAspectContext INSTANCE = new IdentifyableElementAspectIdentifyableElementAspectContext();
  
  public static IdentifyableElementAspectIdentifyableElementAspectProperties getSelf(final IdentifyableElement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.examples.iml.sequentialiml.aspects.IdentifyableElementAspectIdentifyableElementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IdentifyableElement, IdentifyableElementAspectIdentifyableElementAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.examples.iml.sequentialiml.iml.IdentifyableElement, org.modelexecution.examples.iml.sequentialiml.aspects.IdentifyableElementAspectIdentifyableElementAspectProperties>();
  
  public Map<IdentifyableElement, IdentifyableElementAspectIdentifyableElementAspectProperties> getMap() {
    return map;
  }
}
