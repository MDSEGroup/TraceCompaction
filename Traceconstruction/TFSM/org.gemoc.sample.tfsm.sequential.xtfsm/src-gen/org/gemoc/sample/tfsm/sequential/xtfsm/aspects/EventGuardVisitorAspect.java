package org.gemoc.sample.tfsm.sequential.xtfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.sample.tfsm.sequential.xtfsm.aspects.EventGuardVisitorAspectEventGuardAspectProperties;
import org.gemoc.sample.tfsm.sequential.xtfsm.aspects.FSMEventAspect;
import org.gemoc.sample.tfsm.sequential.xtfsm.aspects.GuardVisitorAspect;
import org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.EventGuard;
import org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.FSMEvent;

@Aspect(className = EventGuard.class)
@SuppressWarnings("all")
public class EventGuardVisitorAspect extends GuardVisitorAspect {
  public static void visit(final EventGuard _self) {
    final org.gemoc.sample.tfsm.sequential.xtfsm.aspects.EventGuardVisitorAspectEventGuardAspectProperties _self_ = org.gemoc.sample.tfsm.sequential.xtfsm.aspects.EventGuardVisitorAspectEventGuardAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.EventGuard){
    					org.gemoc.sample.tfsm.sequential.xtfsm.aspects.EventGuardVisitorAspect._privk3_visit(_self_, (org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.EventGuard)_self);
    } else  if (_self instanceof org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Guard){
    					org.gemoc.sample.tfsm.sequential.xtfsm.aspects.GuardVisitorAspect.visit((org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Guard)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_visit(final EventGuardVisitorAspectEventGuardAspectProperties _self_, final EventGuard _self) {
    FSMEvent _triggeringEvent = _self.getTriggeringEvent();
    boolean _isTriggered = FSMEventAspect.isTriggered(_triggeringEvent);
    if (_isTriggered) {
      GuardVisitorAspect.fireTransition(_self);
    }
  }
}
