package org.modelexecution.examples.iml.sequentialiml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.examples.iml.sequentialiml.aspects.IdentifyableElementAspect;
import org.modelexecution.examples.iml.sequentialiml.iml.AddData;

@Aspect(className = AddData.class)
@SuppressWarnings("all")
public class AddDataAspect extends IdentifyableElementAspect {
}
