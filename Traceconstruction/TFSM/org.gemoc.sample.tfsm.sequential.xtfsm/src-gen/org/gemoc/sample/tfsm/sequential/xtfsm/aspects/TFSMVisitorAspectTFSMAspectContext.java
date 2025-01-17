package org.gemoc.sample.tfsm.sequential.xtfsm.aspects;

import java.util.Map;
import org.gemoc.sample.tfsm.sequential.xtfsm.aspects.TFSMVisitorAspectTFSMAspectProperties;
import org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM;

@SuppressWarnings("all")
public class TFSMVisitorAspectTFSMAspectContext {
  public final static TFSMVisitorAspectTFSMAspectContext INSTANCE = new TFSMVisitorAspectTFSMAspectContext();
  
  public static TFSMVisitorAspectTFSMAspectProperties getSelf(final TFSM _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.tfsm.sequential.xtfsm.aspects.TFSMVisitorAspectTFSMAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TFSM, TFSMVisitorAspectTFSMAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM, org.gemoc.sample.tfsm.sequential.xtfsm.aspects.TFSMVisitorAspectTFSMAspectProperties>();
  
  public Map<TFSM, TFSMVisitorAspectTFSMAspectProperties> getMap() {
    return map;
  }
}
