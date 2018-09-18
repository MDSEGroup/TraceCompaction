/**
 */
package trace.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import trace.TracePackage;
import trace.TransientObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transient Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TransientObjectImpl extends MinimalEObjectImpl.Container implements TransientObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransientObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.TRANSIENT_OBJECT;
	}

} //TransientObjectImpl
