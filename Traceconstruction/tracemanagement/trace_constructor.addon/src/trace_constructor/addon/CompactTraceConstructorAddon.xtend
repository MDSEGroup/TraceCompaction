package trace_constructor.addon


import java.util.ArrayList
import java.util.Collection
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage

//import fr.inria.diverse.trace.commons.model.trace.Step
//import org.gemoc.commons.eclipse.emf.EMFResource
//import org.gemoc.xdsmlframework.api.core.IExecutionEngine
//import org.gemoc.xdsmlframework.api.engine_addon.DefaultEngineAddon
//import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.BatchModelChangeListener
//import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange
//import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NewObjectModelChange
//import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange
//import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange
//import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.RemovedObjectModelChange
//import fr.inria.diverse.trace.gemoc.api.ITraceListener

import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.commons.eclipse.emf.EMFResource
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.DefaultEngineAddon
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.BatchModelChangeListener
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NewObjectModelChange
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.RemovedObjectModelChange
//import fr.inria.diverse.trace.gemoc.api.ITraceListener
import trace_constructor.notaddon.GenericTraceConstructor
import trace_constructor.notaddon.ObjectFeature // for storing changes of objects in states

class CompactTraceConstructorAddon extends DefaultEngineAddon {

	var GenericTraceConstructor constructor
//	var BatchModelChangeListenerAddon changeAddon
	var BatchModelChangeListener listenerAddon

	override engineAboutToStart(IExecutionEngine engine) {
		constructor = new GenericTraceConstructor

		val List<EObject> model = engine.executionContext.resourceModel.allContents.toList
		constructor.initTrace(model)

	// val EObject o = model.get(0)
	// val String oName = o.eGet(o.eClass.EStructuralFeatures.findFirst[f|f.name == "name"]) as String
	}

	override aboutToExecuteStep(IExecutionEngine engine, Step<?> step) {

		val newObjects = new ArrayList<EObject>
		val removedObjects = new ArrayList<EObject>
		val NonCollectionFieldobjects = new ArrayList<ObjectFeature>
		val PotentialCollectionFieldobjects = new ArrayList<ObjectFeature>
		println("Enter step " + step.mseoccurrence.mse.name)

		val EOperation action = step.mseoccurrence.mse.action

		val String stepName = getFQN(action.EContainingClass)

		val caller = step.mseoccurrence.mse.caller

		preparechangelist(engine, newObjects, NonCollectionFieldobjects, PotentialCollectionFieldobjects,
			removedObjects)

		constructor.beforeStep(
			stepName,
			caller,
			step.mseoccurrence.parameters,
			newObjects,
			NonCollectionFieldobjects,
			PotentialCollectionFieldobjects,
			removedObjects
		)

	}

	override stepExecuted(IExecutionEngine engine, Step<?> step) {
		val newObjects = new ArrayList<EObject>
		val removedObjects = new ArrayList<EObject>
		val NonCollectionFieldobjects = new ArrayList<ObjectFeature>
		val PotentialCollectionFieldobjects = new ArrayList<ObjectFeature>
		println("Leaving step " + step.mseoccurrence.mse.name)

		// this is for testing finding changes in objects	
		preparechangelist(engine, newObjects, NonCollectionFieldobjects, PotentialCollectionFieldobjects,
			removedObjects)

		val List<EObject> model = engine.executionContext.resourceModel.allContents.toList

		constructor.afterStep(model, step.mseoccurrence.result, newObjects, NonCollectionFieldobjects,
			PotentialCollectionFieldobjects, removedObjects)
	}

	override engineAboutToStop(IExecutionEngine engine) {
		println("execution finished ")
		var int pos = engine.name.lastIndexOf("/")
		var String filename = engine.name.substring(pos + 1, engine.name.length)

		constructor.finishTrace(filename)

	}

	def String getfullQualifyname(EPackage epackage) {

		if (epackage.ESuperPackage == null)
			return epackage.name
		else
			getfullQualifyname(epackage.ESuperPackage) + "." + epackage.name

	}

	def String getFQN(EClass c) {
		return getfullQualifyname(c.EPackage) + "." + c.name
	}

	def preparechangelist(IExecutionEngine engine, Collection<EObject> newObjects,
		Collection<ObjectFeature> NonCollectionFieldobjects, Collection<ObjectFeature> PotentialCollectionFieldobjects,
		Collection<EObject> removedObjects) {

		// We construct a new listeneraddon if required
//			this.changeAddon = 
//			if (engine.hasAddon(BatchModelChangeListenerAddon)) {
//				engine.getAddon(BatchModelChangeListenerAddon)
//			} else {
//				new BatchModelChangeListener(engine)
//	   }
		this.listenerAddon = new BatchModelChangeListener(
			EMFResource.getRelatedResources(engine.executionContext.resourceModel))
		listenerAddon.registerObserver(this)
		var List<ModelChange> changelist = listenerAddon.getChanges(this)

		for (c : changelist) {
			switch (c) {
				NewObjectModelChange: {
					newObjects.add(c.changedObject)
				}
				NonCollectionFieldModelChange: {
					val ObjectFeature of = new ObjectFeature()

					of.object = c.changedObject
					of.feature = c.changedField
					NonCollectionFieldobjects.add(of)
				}
				PotentialCollectionFieldModelChange: {
					val ObjectFeature of = new ObjectFeature()
					of.object = c.changedObject
					of.feature = c.changedField
					PotentialCollectionFieldobjects.add(of)
				}
				RemovedObjectModelChange: {
					removedObjects.add(c.changedObject)
				}
			}
		}
	}
}
