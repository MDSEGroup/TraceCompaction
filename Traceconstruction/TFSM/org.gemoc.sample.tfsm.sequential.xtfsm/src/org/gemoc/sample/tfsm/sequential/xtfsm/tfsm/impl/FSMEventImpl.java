/**
 */
package org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.FSMEvent;
import org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TfsmPackage;
import org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.FSMEventImpl#getSollicitingTransitions <em>Solliciting Transitions</em>}</li>
 *   <li>{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.FSMEventImpl#isIsTriggered <em>Is Triggered</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSMEventImpl extends NamedElementImpl implements FSMEvent {
	/**
	 * The cached value of the '{@link #getSollicitingTransitions() <em>Solliciting Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSollicitingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> sollicitingTransitions;

	/**
	 * The default value of the '{@link #isIsTriggered() <em>Is Triggered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTriggered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TRIGGERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTriggered() <em>Is Triggered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTriggered()
	 * @generated
	 * @ordered
	 */
	protected boolean isTriggered = IS_TRIGGERED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TfsmPackage.Literals.FSM_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getSollicitingTransitions() {
		if (sollicitingTransitions == null) {
			sollicitingTransitions = new EObjectResolvingEList<Transition>(Transition.class, this, TfsmPackage.FSM_EVENT__SOLLICITING_TRANSITIONS);
		}
		return sollicitingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTriggered() {
		return isTriggered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTriggered(boolean newIsTriggered) {
		boolean oldIsTriggered = isTriggered;
		isTriggered = newIsTriggered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TfsmPackage.FSM_EVENT__IS_TRIGGERED, oldIsTriggered, isTriggered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void trigger() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unTrigger() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TfsmPackage.FSM_EVENT__SOLLICITING_TRANSITIONS:
				return getSollicitingTransitions();
			case TfsmPackage.FSM_EVENT__IS_TRIGGERED:
				return isIsTriggered();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TfsmPackage.FSM_EVENT__SOLLICITING_TRANSITIONS:
				getSollicitingTransitions().clear();
				getSollicitingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case TfsmPackage.FSM_EVENT__IS_TRIGGERED:
				setIsTriggered((Boolean)newValue);
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
			case TfsmPackage.FSM_EVENT__SOLLICITING_TRANSITIONS:
				getSollicitingTransitions().clear();
				return;
			case TfsmPackage.FSM_EVENT__IS_TRIGGERED:
				setIsTriggered(IS_TRIGGERED_EDEFAULT);
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
			case TfsmPackage.FSM_EVENT__SOLLICITING_TRANSITIONS:
				return sollicitingTransitions != null && !sollicitingTransitions.isEmpty();
			case TfsmPackage.FSM_EVENT__IS_TRIGGERED:
				return isTriggered != IS_TRIGGERED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isTriggered: ");
		result.append(isTriggered);
		result.append(')');
		return result.toString();
	}

} //FSMEventImpl
