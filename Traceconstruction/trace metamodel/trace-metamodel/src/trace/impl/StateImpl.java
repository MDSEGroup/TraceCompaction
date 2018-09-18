/**
 */
package trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trace.State;
import trace.TraceFactory;
import trace.TracePackage;
import trace.TransientObject;
import trace.TransientObjectState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.StateImpl#getNewobjects <em>Newobjects</em>}</li>
 *   <li>{@link trace.impl.StateImpl#getDeletedobjects <em>Deletedobjects</em>}</li>
 *   <li>{@link trace.impl.StateImpl#getBasestate <em>Basestate</em>}</li>
 *   <li>{@link trace.impl.StateImpl#getTransientObjectsStates <em>Transient Objects States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getNewobjects() <em>Newobjects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewobjects()
	 * @generated
	 * @ordered
	 */
	protected EList<TransientObject> newobjects;

	/**
	 * The cached value of the '{@link #getDeletedobjects() <em>Deletedobjects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedobjects()
	 * @generated
	 * @ordered
	 */
	protected EList<TransientObject> deletedobjects;

	/**
	 * The cached value of the '{@link #getBasestate() <em>Basestate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasestate()
	 * @generated
	 * @ordered
	 */
	protected State basestate;

	/**
	 * The cached value of the '{@link #getTransientObjectsStates() <em>Transient Objects States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientObjectsStates()
	 * @generated
	 * @ordered
	 */
	protected EList<TransientObjectState> transientObjectsStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransientObject> getNewobjects() {
		if (newobjects == null) {
			newobjects = new EObjectResolvingEList<TransientObject>(TransientObject.class, this, TracePackage.STATE__NEWOBJECTS);
		}
		return newobjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransientObject> getDeletedobjects() {
		if (deletedobjects == null) {
			deletedobjects = new EObjectResolvingEList<TransientObject>(TransientObject.class, this, TracePackage.STATE__DELETEDOBJECTS);
		}
		return deletedobjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getBasestate() {
		if (basestate != null && basestate.eIsProxy()) {
			InternalEObject oldBasestate = (InternalEObject)basestate;
			basestate = (State)eResolveProxy(oldBasestate);
			if (basestate != oldBasestate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.STATE__BASESTATE, oldBasestate, basestate));
			}
		}
		return basestate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetBasestate() {
		return basestate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasestate(State newBasestate) {
		State oldBasestate = basestate;
		basestate = newBasestate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.STATE__BASESTATE, oldBasestate, basestate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransientObjectState> getTransientObjectsStates() {
		if (transientObjectsStates == null) {
			transientObjectsStates = new EObjectContainmentEList<TransientObjectState>(TransientObjectState.class, this, TracePackage.STATE__TRANSIENT_OBJECTS_STATES);
		}
		return transientObjectsStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracePackage.STATE__TRANSIENT_OBJECTS_STATES:
				return ((InternalEList<?>)getTransientObjectsStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.STATE__NEWOBJECTS:
				return getNewobjects();
			case TracePackage.STATE__DELETEDOBJECTS:
				return getDeletedobjects();
			case TracePackage.STATE__BASESTATE:
				if (resolve) return getBasestate();
				return basicGetBasestate();
			case TracePackage.STATE__TRANSIENT_OBJECTS_STATES:
				return getTransientObjectsStates();
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
			case TracePackage.STATE__NEWOBJECTS:
				getNewobjects().clear();
				getNewobjects().addAll((Collection<? extends TransientObject>)newValue);
				return;
			case TracePackage.STATE__DELETEDOBJECTS:
				getDeletedobjects().clear();
				getDeletedobjects().addAll((Collection<? extends TransientObject>)newValue);
				return;
			case TracePackage.STATE__BASESTATE:
				setBasestate((State)newValue);
				return;
			case TracePackage.STATE__TRANSIENT_OBJECTS_STATES:
				getTransientObjectsStates().clear();
				getTransientObjectsStates().addAll((Collection<? extends TransientObjectState>)newValue);
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
			case TracePackage.STATE__NEWOBJECTS:
				getNewobjects().clear();
				return;
			case TracePackage.STATE__DELETEDOBJECTS:
				getDeletedobjects().clear();
				return;
			case TracePackage.STATE__BASESTATE:
				setBasestate((State)null);
				return;
			case TracePackage.STATE__TRANSIENT_OBJECTS_STATES:
				getTransientObjectsStates().clear();
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
			case TracePackage.STATE__NEWOBJECTS:
				return newobjects != null && !newobjects.isEmpty();
			case TracePackage.STATE__DELETEDOBJECTS:
				return deletedobjects != null && !deletedobjects.isEmpty();
			case TracePackage.STATE__BASESTATE:
				return basestate != null;
			case TracePackage.STATE__TRANSIENT_OBJECTS_STATES:
				return transientObjectsStates != null && !transientObjectsStates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
    public  State copy( State other ) {
        State newstate = TraceFactory.eINSTANCE.createState();
        newstate.getTransientObjectsStates().addAll(other.getTransientObjectsStates());
       
        //... etc. 
        return newstate;
   }
} //StateImpl
