/**
 */
package trace.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import trace.StepSpec;
import trace.StepType;
import trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.StepSpecImpl#getSteptype <em>Steptype</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StepSpecImpl extends MinimalEObjectImpl.Container implements StepSpec {
	/**
	 * The cached value of the '{@link #getSteptype() <em>Steptype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteptype()
	 * @generated
	 * @ordered
	 */
	protected StepType steptype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.STEP_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepType getSteptype() {
		if (steptype != null && steptype.eIsProxy()) {
			InternalEObject oldSteptype = (InternalEObject)steptype;
			steptype = (StepType)eResolveProxy(oldSteptype);
			if (steptype != oldSteptype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.STEP_SPEC__STEPTYPE, oldSteptype, steptype));
			}
		}
		return steptype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepType basicGetSteptype() {
		return steptype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteptype(StepType newSteptype) {
		StepType oldSteptype = steptype;
		steptype = newSteptype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.STEP_SPEC__STEPTYPE, oldSteptype, steptype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.STEP_SPEC__STEPTYPE:
				if (resolve) return getSteptype();
				return basicGetSteptype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TracePackage.STEP_SPEC__STEPTYPE:
				setSteptype((StepType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TracePackage.STEP_SPEC__STEPTYPE:
				setSteptype((StepType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TracePackage.STEP_SPEC__STEPTYPE:
				return steptype != null;
		}
		return super.eIsSet(featureID);
	}

} //StepSpecImpl
