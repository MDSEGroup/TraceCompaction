/**
 */
package trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;


import trace.ParameterList;


import trace.PatternOccurrenceStepData;
import trace.RepeatingStep;
import trace.State;
import trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Occurrence Step Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.PatternOccurrenceStepDataImpl#getStates <em>States</em>}</li>
 *   <li>{@link trace.impl.PatternOccurrenceStepDataImpl#getStep <em>Step</em>}</li>
 *   <li>{@link trace.impl.PatternOccurrenceStepDataImpl#getParameterlists <em>Parameterlists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternOccurrenceStepDataImpl extends MinimalEObjectImpl.Container implements PatternOccurrenceStepData {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected RepeatingStep step;


	/**
	 * The cached value of the '{@link #getParameterlists() <em>Parameterlists</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterlists()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterList> parameterlists;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternOccurrenceStepDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.PATTERN_OCCURRENCE_STEP_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *  @generated Not FIXME workaround BUG 89325
	 *  updated by Fazilat
	 *  for accepting duplicates in States
	 */
	@SuppressWarnings("supportung duplicates in object")
	@Override
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectResolvingEList<State>(State.class, this, TracePackage.PATTERN_OCCURRENCE_STEP_DATA__STATES){
	             @Override
	             protected boolean isUnique() {
	                 return false;
	             }
	      };
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatingStep getStep() {
		if (step != null && step.eIsProxy()) {
			InternalEObject oldStep = (InternalEObject)step;
			step = (RepeatingStep)eResolveProxy(oldStep);
			if (step != oldStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.PATTERN_OCCURRENCE_STEP_DATA__STEP, oldStep, step));
			}
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatingStep basicGetStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(RepeatingStep newStep) {
		RepeatingStep oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.PATTERN_OCCURRENCE_STEP_DATA__STEP, oldStep, step));
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	*  @generated Not FIXME workaround BUG 89325
	 *  updated by Fazilat
	 *  for accepting duplicates in States
	 */
	@SuppressWarnings("supporting duplicates in object")
	@Override
	public EList<ParameterList> getParameterlists() {
		if (parameterlists == null) {
			parameterlists = new EObjectResolvingEList<ParameterList>(ParameterList.class, this, TracePackage.PATTERN_OCCURRENCE_STEP_DATA__PARAMETERLISTS){
	             @Override
	             protected boolean isUnique() {
	                 return false;
	             }
	      };
		}
		return parameterlists;
	}

	
	

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.PATTERN_OCCURRENCE_STEP_DATA__STATES:
				return getStates();
			case TracePackage.PATTERN_OCCURRENCE_STEP_DATA__STEP:
				if (resolve) return getStep();
				return basicGetStep();
			case TracePackage.PATTERN_OCCURRENCE_STEP_DATA__PARAMETERLISTS:
				return getParameterlists();
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
			case TracePackage.PATTERN_OCCURRENCE_STEP_DATA__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case TracePackage.PATTERN_OCCURRENCE_STEP_DATA__STEP:
				setStep((RepeatingStep)newValue);
				return;
			case TracePackage.PATTERN_OCCURRENCE_STEP_DATA__PARAMETERLISTS:
				getParameterlists().clear();
				getParameterlists().addAll((Collection<? extends ParameterList>)newValue);
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
			case TracePackage.PATTERN_OCCURRENCE_STEP_DATA__STATES:
				getStates().clear();
				return;
			case TracePackage.PATTERN_OCCURRENCE_STEP_DATA__STEP:
				setStep((RepeatingStep)null);
				return;
			case TracePackage.PATTERN_OCCURRENCE_STEP_DATA__PARAMETERLISTS:
				getParameterlists().clear();
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
			case TracePackage.PATTERN_OCCURRENCE_STEP_DATA__STATES:
				return states != null && !states.isEmpty();
			case TracePackage.PATTERN_OCCURRENCE_STEP_DATA__STEP:
				return step != null;
			case TracePackage.PATTERN_OCCURRENCE_STEP_DATA__PARAMETERLISTS:
				return parameterlists != null && !parameterlists.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PatternOccurrenceStepDataImpl
