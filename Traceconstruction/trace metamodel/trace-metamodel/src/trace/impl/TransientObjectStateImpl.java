/**
 */
package trace.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import trace.ObjectState;
import trace.TracePackage;
import trace.TransientObject;
import trace.TransientObjectState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transient Object State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.TransientObjectStateImpl#getTransientobject <em>Transientobject</em>}</li>
 *   <li>{@link trace.impl.TransientObjectStateImpl#getObjectstate <em>Objectstate</em>}</li>
 *   <li>{@link trace.impl.TransientObjectStateImpl#getEstructuralfeature <em>Estructuralfeature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransientObjectStateImpl extends MinimalEObjectImpl.Container implements TransientObjectState {
	/**
	 * The cached value of the '{@link #getTransientobject() <em>Transientobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientobject()
	 * @generated
	 * @ordered
	 */
	protected TransientObject transientobject;

	/**
	 * The cached value of the '{@link #getObjectstate() <em>Objectstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectstate()
	 * @generated
	 * @ordered
	 */
	protected ObjectState objectstate;

	/**
	 * The cached value of the '{@link #getEstructuralfeature() <em>Estructuralfeature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstructuralfeature()
	 * @generated
	 * @ordered
	 */
	protected EList<EStructuralFeature> estructuralfeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransientObjectStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.TRANSIENT_OBJECT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientObject getTransientobject() {
		if (transientobject != null && transientobject.eIsProxy()) {
			InternalEObject oldTransientobject = (InternalEObject)transientobject;
			transientobject = (TransientObject)eResolveProxy(oldTransientobject);
			if (transientobject != oldTransientobject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.TRANSIENT_OBJECT_STATE__TRANSIENTOBJECT, oldTransientobject, transientobject));
			}
		}
		return transientobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientObject basicGetTransientobject() {
		return transientobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransientobject(TransientObject newTransientobject) {
		TransientObject oldTransientobject = transientobject;
		transientobject = newTransientobject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRANSIENT_OBJECT_STATE__TRANSIENTOBJECT, oldTransientobject, transientobject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectState getObjectstate() {
		if (objectstate != null && objectstate.eIsProxy()) {
			InternalEObject oldObjectstate = (InternalEObject)objectstate;
			objectstate = (ObjectState)eResolveProxy(oldObjectstate);
			if (objectstate != oldObjectstate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.TRANSIENT_OBJECT_STATE__OBJECTSTATE, oldObjectstate, objectstate));
			}
		}
		return objectstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectState basicGetObjectstate() {
		return objectstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectstate(ObjectState newObjectstate) {
		ObjectState oldObjectstate = objectstate;
		objectstate = newObjectstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRANSIENT_OBJECT_STATE__OBJECTSTATE, oldObjectstate, objectstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStructuralFeature> getEstructuralfeature() {
		if (estructuralfeature == null) {
			estructuralfeature = new EObjectResolvingEList<EStructuralFeature>(EStructuralFeature.class, this, TracePackage.TRANSIENT_OBJECT_STATE__ESTRUCTURALFEATURE);
		}
		return estructuralfeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.TRANSIENT_OBJECT_STATE__TRANSIENTOBJECT:
				if (resolve) return getTransientobject();
				return basicGetTransientobject();
			case TracePackage.TRANSIENT_OBJECT_STATE__OBJECTSTATE:
				if (resolve) return getObjectstate();
				return basicGetObjectstate();
			case TracePackage.TRANSIENT_OBJECT_STATE__ESTRUCTURALFEATURE:
				return getEstructuralfeature();
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
			case TracePackage.TRANSIENT_OBJECT_STATE__TRANSIENTOBJECT:
				setTransientobject((TransientObject)newValue);
				return;
			case TracePackage.TRANSIENT_OBJECT_STATE__OBJECTSTATE:
				setObjectstate((ObjectState)newValue);
				return;
			case TracePackage.TRANSIENT_OBJECT_STATE__ESTRUCTURALFEATURE:
				getEstructuralfeature().clear();
				getEstructuralfeature().addAll((Collection<? extends EStructuralFeature>)newValue);
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
			case TracePackage.TRANSIENT_OBJECT_STATE__TRANSIENTOBJECT:
				setTransientobject((TransientObject)null);
				return;
			case TracePackage.TRANSIENT_OBJECT_STATE__OBJECTSTATE:
				setObjectstate((ObjectState)null);
				return;
			case TracePackage.TRANSIENT_OBJECT_STATE__ESTRUCTURALFEATURE:
				getEstructuralfeature().clear();
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
			case TracePackage.TRANSIENT_OBJECT_STATE__TRANSIENTOBJECT:
				return transientobject != null;
			case TracePackage.TRANSIENT_OBJECT_STATE__OBJECTSTATE:
				return objectstate != null;
			case TracePackage.TRANSIENT_OBJECT_STATE__ESTRUCTURALFEATURE:
				return estructuralfeature != null && !estructuralfeature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransientObjectStateImpl
