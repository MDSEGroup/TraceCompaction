package org.modelexecution.examples.iml.sequentialiml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.examples.iml.sequentialiml.aspects.IdentifyableElementAspect;
import org.modelexecution.examples.iml.sequentialiml.iml.Connection;

@Aspect(className = Connection.class)
@SuppressWarnings("all")
public class ConnectionAspect extends IdentifyableElementAspect {
}
