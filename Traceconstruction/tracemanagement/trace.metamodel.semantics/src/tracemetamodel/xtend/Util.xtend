package tracemetamodel.xtend

import java.util.Collection
import java.util.HashSet
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.util.EcoreUtil
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEClass
import trace.DynamicTransientObject
import trace.StaticTransientObject
import trace.TransientObject

class Util {
	def static void createfeaturelist(TransientObject p, EList<EStructuralFeature> featurelist) {
		if (p instanceof StaticTransientObject) {
			for (EStructuralFeature f : (p as StaticTransientObject).originalObject.eClass.EStructuralFeatures) {
				if (isDynamic(f))
					featurelist.add(f)
			}

		} else {
			for (EStructuralFeature f : (p as DynamicTransientObject).type.EStructuralFeatures) {
				// for DynamicObjects, all features are dynamic
				featurelist.add(f)
			}

		}

	}

	def static boolean isDynamic(EClass c) {

		// case xMOF
		if (c instanceof BehavioredEClass) {

			// eg. Place
			if (extendsStaticClass(c)) {
				return c.EAllStructuralFeatures.exists[f|isDynamic(f)]
			} // eg. Tokens
			else {
				return true
			}
		} // case kermeta
		else {
			return !c.EAnnotations.empty
		}

	}

// ///////////////////////////////////////////////////////////////////////////////////////////////////
	// **************************************************************************************************
	// finding dynamic objects for fuml models
	// **************************************************************************************************
	// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def static boolean extendsStaticClass(BehavioredEClass c) {
		c.EAllSuperTypes.exists[s|(!(s instanceof BehavioredEClass) && c.name.equals(s.name + "Configuration"))]
	}

	def static boolean isDynamic(EStructuralFeature f) {
		// kermeta case
		!f.EAnnotations.empty || // xmof case
		f.EContainingClass instanceof BehavioredEClass
	}

	def static boolean isDynamic(EObject o) {
		return isDynamic(o.eClass())
	}

	public static def findDangling(EObject eobject) {
		val dangling1 = new HashSet<EObject>
		for (eo : eobject.eAllContents.toSet) {
			for (r : eo.eClass.EAllReferences) {
				val refed = eo.eGet(r)
				if (refed instanceof EObject) {
					val root = EcoreUtil.getRootContainer(refed)
					if (root != eobject && root.eResource == null) {
						dangling1.add(refed)
					}
				} else if (refed instanceof Collection<?>) {
					for (o2 : refed) {
						val root = EcoreUtil.getRootContainer(o2 as EObject)
						if (root != eobject && root.eResource == null) {
							dangling1.add(o2 as EObject)
						}
					}
				}
			}

		}
		return dangling1
	}

}
