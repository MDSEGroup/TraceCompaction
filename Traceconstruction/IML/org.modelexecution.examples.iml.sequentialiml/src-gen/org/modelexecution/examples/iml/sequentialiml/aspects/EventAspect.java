package org.modelexecution.examples.iml.sequentialiml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.examples.iml.sequentialiml.aspects.ElementAspect;
import org.modelexecution.examples.iml.sequentialiml.iml.Event;

@Aspect(className = Event.class)
@SuppressWarnings("all")
public class EventAspect extends ElementAspect {
}
