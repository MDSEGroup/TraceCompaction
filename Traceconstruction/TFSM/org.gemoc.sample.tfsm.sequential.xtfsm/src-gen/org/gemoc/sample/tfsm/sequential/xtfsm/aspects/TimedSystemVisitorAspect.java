package org.gemoc.sample.tfsm.sequential.xtfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.gemoc.sample.tfsm.sequential.xtfsm.aspects.FSMClockVisitorAspect;
import org.gemoc.sample.tfsm.sequential.xtfsm.aspects.TFSMVisitorAspect;
import org.gemoc.sample.tfsm.sequential.xtfsm.aspects.TimedSystemVisitorAspectTimedSystemAspectProperties;
import org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.FSMClock;
import org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM;
import org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TimedSystem;

@Aspect(className = TimedSystem.class)
@SuppressWarnings("all")
public class TimedSystemVisitorAspect {
  public static void visit(final TimedSystem _self) {
    final org.gemoc.sample.tfsm.sequential.xtfsm.aspects.TimedSystemVisitorAspectTimedSystemAspectProperties _self_ = org.gemoc.sample.tfsm.sequential.xtfsm.aspects.TimedSystemVisitorAspectTimedSystemAspectContext.getSelf(_self);
    _privk3_visit(_self_, _self);;
  }
  
  protected static void _privk3_visit(final TimedSystemVisitorAspectTimedSystemAspectProperties _self_, final TimedSystem _self) {
    EList<FSMClock> _globalClocks = _self.getGlobalClocks();
    final Consumer<FSMClock> _function = (FSMClock e) -> {
      FSMClockVisitorAspect.visit(e);
    };
    _globalClocks.forEach(_function);
    EList<TFSM> _tfsms = _self.getTfsms();
    final Consumer<TFSM> _function_1 = (TFSM t) -> {
      TFSMVisitorAspect.visit(t);
    };
    _tfsms.forEach(_function_1);
  }
}
