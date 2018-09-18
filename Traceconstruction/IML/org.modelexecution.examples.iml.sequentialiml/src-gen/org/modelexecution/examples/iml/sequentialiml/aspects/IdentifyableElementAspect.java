package org.modelexecution.examples.iml.sequentialiml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.examples.iml.sequentialiml.aspects.ElementAspect;
import org.modelexecution.examples.iml.sequentialiml.iml.IdentifyableElement;

@Aspect(className = IdentifyableElement.class)
@SuppressWarnings("all")
public abstract class IdentifyableElementAspect extends ElementAspect {
}
