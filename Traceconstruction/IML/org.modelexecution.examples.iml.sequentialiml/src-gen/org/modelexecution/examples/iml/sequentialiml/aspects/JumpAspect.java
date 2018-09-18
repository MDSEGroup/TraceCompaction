package org.modelexecution.examples.iml.sequentialiml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.examples.iml.sequentialiml.aspects.ConnectionPointAspect;
import org.modelexecution.examples.iml.sequentialiml.iml.Jump;

@Aspect(className = Jump.class)
@SuppressWarnings("all")
public class JumpAspect extends ConnectionPointAspect {
}
