package org.modelexecution.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.examples.iml.sequentialiml.aspects.HeaderAspectHeaderAspectProperties;
import org.modelexecution.examples.iml.sequentialiml.iml.Header;

@SuppressWarnings("all")
public class HeaderAspectHeaderAspectContext {
  public final static HeaderAspectHeaderAspectContext INSTANCE = new HeaderAspectHeaderAspectContext();
  
  public static HeaderAspectHeaderAspectProperties getSelf(final Header _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.examples.iml.sequentialiml.aspects.HeaderAspectHeaderAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Header, HeaderAspectHeaderAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.examples.iml.sequentialiml.iml.Header, org.modelexecution.examples.iml.sequentialiml.aspects.HeaderAspectHeaderAspectProperties>();
  
  public Map<Header, HeaderAspectHeaderAspectProperties> getMap() {
    return map;
  }
}
