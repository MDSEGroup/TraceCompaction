package org.modelexecution.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.examples.iml.sequentialiml.aspects.EventAspectEventAspectProperties;
import org.modelexecution.examples.iml.sequentialiml.iml.Event;

@SuppressWarnings("all")
public class EventAspectEventAspectContext {
  public final static EventAspectEventAspectContext INSTANCE = new EventAspectEventAspectContext();
  
  public static EventAspectEventAspectProperties getSelf(final Event _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.examples.iml.sequentialiml.aspects.EventAspectEventAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Event, EventAspectEventAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.examples.iml.sequentialiml.iml.Event, org.modelexecution.examples.iml.sequentialiml.aspects.EventAspectEventAspectProperties>();
  
  public Map<Event, EventAspectEventAspectProperties> getMap() {
    return map;
  }
}
