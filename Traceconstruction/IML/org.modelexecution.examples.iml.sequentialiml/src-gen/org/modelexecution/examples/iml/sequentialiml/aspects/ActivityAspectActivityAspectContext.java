package org.modelexecution.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.examples.iml.sequentialiml.aspects.ActivityAspectActivityAspectProperties;
import org.modelexecution.examples.iml.sequentialiml.iml.Activity;

@SuppressWarnings("all")
public class ActivityAspectActivityAspectContext {
  public final static ActivityAspectActivityAspectContext INSTANCE = new ActivityAspectActivityAspectContext();
  
  public static ActivityAspectActivityAspectProperties getSelf(final Activity _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.examples.iml.sequentialiml.aspects.ActivityAspectActivityAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Activity, ActivityAspectActivityAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.examples.iml.sequentialiml.iml.Activity, org.modelexecution.examples.iml.sequentialiml.aspects.ActivityAspectActivityAspectProperties>();
  
  public Map<Activity, ActivityAspectActivityAspectProperties> getMap() {
    return map;
  }
}
