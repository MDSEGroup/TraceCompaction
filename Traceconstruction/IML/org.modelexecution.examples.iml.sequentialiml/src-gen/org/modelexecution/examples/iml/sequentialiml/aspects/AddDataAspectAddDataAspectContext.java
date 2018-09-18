package org.modelexecution.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.examples.iml.sequentialiml.aspects.AddDataAspectAddDataAspectProperties;
import org.modelexecution.examples.iml.sequentialiml.iml.AddData;

@SuppressWarnings("all")
public class AddDataAspectAddDataAspectContext {
  public final static AddDataAspectAddDataAspectContext INSTANCE = new AddDataAspectAddDataAspectContext();
  
  public static AddDataAspectAddDataAspectProperties getSelf(final AddData _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.examples.iml.sequentialiml.aspects.AddDataAspectAddDataAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AddData, AddDataAspectAddDataAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.examples.iml.sequentialiml.iml.AddData, org.modelexecution.examples.iml.sequentialiml.aspects.AddDataAspectAddDataAspectProperties>();
  
  public Map<AddData, AddDataAspectAddDataAspectProperties> getMap() {
    return map;
  }
}
