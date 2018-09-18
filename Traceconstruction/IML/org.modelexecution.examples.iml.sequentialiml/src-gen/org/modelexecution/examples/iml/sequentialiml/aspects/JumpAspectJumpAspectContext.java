package org.modelexecution.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.examples.iml.sequentialiml.aspects.JumpAspectJumpAspectProperties;
import org.modelexecution.examples.iml.sequentialiml.iml.Jump;

@SuppressWarnings("all")
public class JumpAspectJumpAspectContext {
  public final static JumpAspectJumpAspectContext INSTANCE = new JumpAspectJumpAspectContext();
  
  public static JumpAspectJumpAspectProperties getSelf(final Jump _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.examples.iml.sequentialiml.aspects.JumpAspectJumpAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Jump, JumpAspectJumpAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.examples.iml.sequentialiml.iml.Jump, org.modelexecution.examples.iml.sequentialiml.aspects.JumpAspectJumpAspectProperties>();
  
  public Map<Jump, JumpAspectJumpAspectProperties> getMap() {
    return map;
  }
}
