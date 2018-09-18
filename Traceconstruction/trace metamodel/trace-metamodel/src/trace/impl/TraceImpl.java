/**
 */
package trace.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import trace.ObjectState;
import trace.ParameterList;

import trace.ParameterValue;
import trace.RepeatingStep;
import trace.State;
import trace.Step;
import trace.StepPattern;
import trace.StepType;
import trace.Trace;
import trace.TracePackage;
import trace.TransientObject;
import trace.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.TraceImpl#getState <em>State</em>}</li>
 *   <li>{@link trace.impl.TraceImpl#getTransientobject <em>Transientobject</em>}</li>
 *   <li>{@link trace.impl.TraceImpl#getSteptype <em>Steptype</em>}</li>
 *   <li>{@link trace.impl.TraceImpl#getSteppattern <em>Steppattern</em>}</li>
 *   <li>{@link trace.impl.TraceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link trace.impl.TraceImpl#getObjectstate <em>Objectstate</em>}</li>
 *   <li>{@link trace.impl.TraceImpl#getRepeatingstep <em>Repeatingstep</em>}</li>
 *   <li>{@link trace.impl.TraceImpl#getStep <em>Step</em>}</li>
 *   <li>{@link trace.impl.TraceImpl#getParameterValues <em>Parameter Values</em>}</li>
 *   <li>{@link trace.impl.TraceImpl#getParameterlist <em>Parameterlist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> state;

	/**
	 * The cached value of the '{@link #getTransientobject() <em>Transientobject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientobject()
	 * @generated
	 * @ordered
	 */
	protected EList<TransientObject> transientobject;

	/**
	 * The cached value of the '{@link #getSteptype() <em>Steptype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteptype()
	 * @generated
	 * @ordered
	 */
	protected EList<StepType> steptype;

	/**
	 * The cached value of the '{@link #getSteppattern() <em>Steppattern</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteppattern()
	 * @generated
	 * @ordered
	 */
	protected EList<StepPattern> steppattern;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> value;

	/**
	 * The cached value of the '{@link #getObjectstate() <em>Objectstate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectstate()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectState> objectstate;

	/**
	 * The cached value of the '{@link #getRepeatingstep() <em>Repeatingstep</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatingstep()
	 * @generated
	 * @ordered
	 */
	protected EList<RepeatingStep> repeatingstep;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> step;





	/**
	 * The cached value of the '{@link #getParameterValues() <em>Parameter Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValue> parameterValues;

	/**
	 * The cached value of the '{@link #getParameterlist() <em>Parameterlist</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterlist()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterList> parameterlist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<State>(State.class, this, TracePackage.TRACE__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransientObject> getTransientobject() {
		if (transientobject == null) {
			transientobject = new EObjectContainmentEList<TransientObject>(TransientObject.class, this, TracePackage.TRACE__TRANSIENTOBJECT);
		}
		return transientobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepType> getSteptype() {
		if (steptype == null) {
			steptype = new EObjectContainmentEList<StepType>(StepType.class, this, TracePackage.TRACE__STEPTYPE);
		}
		return steptype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepPattern> getSteppattern() {
		if (steppattern == null) {
			steppattern = new EObjectContainmentEList<StepPattern>(StepPattern.class, this, TracePackage.TRACE__STEPPATTERN);
		}
		return steppattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<Value>(Value.class, this, TracePackage.TRACE__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectState> getObjectstate() {
		if (objectstate == null) {
			objectstate = new EObjectContainmentEList<ObjectState>(ObjectState.class, this, TracePackage.TRACE__OBJECTSTATE);
		}
		return objectstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepeatingStep> getRepeatingstep() {
		if (repeatingstep == null) {
			repeatingstep = new EObjectContainmentEList<RepeatingStep>(RepeatingStep.class, this, TracePackage.TRACE__REPEATINGSTEP);
		}
		return repeatingstep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<Step>(Step.class, this, TracePackage.TRACE__STEP);
		}
		return step;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterValue> getParameterValues() {
		if (parameterValues == null) {
			parameterValues = new EObjectContainmentEList<ParameterValue>(ParameterValue.class, this, TracePackage.TRACE__PARAMETER_VALUES);
		}
		return parameterValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterList> getParameterlist() {
		if (parameterlist == null) {
			parameterlist = new EObjectContainmentEList<ParameterList>(ParameterList.class, this, TracePackage.TRACE__PARAMETERLIST);
		}
		return parameterlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracePackage.TRACE__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case TracePackage.TRACE__TRANSIENTOBJECT:
				return ((InternalEList<?>)getTransientobject()).basicRemove(otherEnd, msgs);
			case TracePackage.TRACE__STEPTYPE:
				return ((InternalEList<?>)getSteptype()).basicRemove(otherEnd, msgs);
			case TracePackage.TRACE__STEPPATTERN:
				return ((InternalEList<?>)getSteppattern()).basicRemove(otherEnd, msgs);
			case TracePackage.TRACE__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
			case TracePackage.TRACE__OBJECTSTATE:
				return ((InternalEList<?>)getObjectstate()).basicRemove(otherEnd, msgs);
			case TracePackage.TRACE__REPEATINGSTEP:
				return ((InternalEList<?>)getRepeatingstep()).basicRemove(otherEnd, msgs);
			case TracePackage.TRACE__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
			case TracePackage.TRACE__PARAMETER_VALUES:
				return ((InternalEList<?>)getParameterValues()).basicRemove(otherEnd, msgs);
			case TracePackage.TRACE__PARAMETERLIST:
				return ((InternalEList<?>)getParameterlist()).basicRemove(otherEnd, msgs);
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
			case TracePackage.TRACE__STATE:
				return getState();
			case TracePackage.TRACE__TRANSIENTOBJECT:
				return getTransientobject();
			case TracePackage.TRACE__STEPTYPE:
				return getSteptype();
			case TracePackage.TRACE__STEPPATTERN:
				return getSteppattern();
			case TracePackage.TRACE__VALUE:
				return getValue();
			case TracePackage.TRACE__OBJECTSTATE:
				return getObjectstate();
			case TracePackage.TRACE__REPEATINGSTEP:
				return getRepeatingstep();
			case TracePackage.TRACE__STEP:
				return getStep();
			case TracePackage.TRACE__PARAMETER_VALUES:
				return getParameterValues();
			case TracePackage.TRACE__PARAMETERLIST:
				return getParameterlist();
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
			case TracePackage.TRACE__STATE:
				getState().clear();
				getState().addAll((Collection<? extends State>)newValue);
				return;
			case TracePackage.TRACE__TRANSIENTOBJECT:
				getTransientobject().clear();
				getTransientobject().addAll((Collection<? extends TransientObject>)newValue);
				return;
			case TracePackage.TRACE__STEPTYPE:
				getSteptype().clear();
				getSteptype().addAll((Collection<? extends StepType>)newValue);
				return;
			case TracePackage.TRACE__STEPPATTERN:
				getSteppattern().clear();
				getSteppattern().addAll((Collection<? extends StepPattern>)newValue);
				return;
			case TracePackage.TRACE__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends Value>)newValue);
				return;
			case TracePackage.TRACE__OBJECTSTATE:
				getObjectstate().clear();
				getObjectstate().addAll((Collection<? extends ObjectState>)newValue);
				return;
			case TracePackage.TRACE__REPEATINGSTEP:
				getRepeatingstep().clear();
				getRepeatingstep().addAll((Collection<? extends RepeatingStep>)newValue);
				return;
			case TracePackage.TRACE__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case TracePackage.TRACE__PARAMETER_VALUES:
				getParameterValues().clear();
				getParameterValues().addAll((Collection<? extends ParameterValue>)newValue);
				return;
			case TracePackage.TRACE__PARAMETERLIST:
				getParameterlist().clear();
				getParameterlist().addAll((Collection<? extends ParameterList>)newValue);
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
			case TracePackage.TRACE__STATE:
				getState().clear();
				return;
			case TracePackage.TRACE__TRANSIENTOBJECT:
				getTransientobject().clear();
				return;
			case TracePackage.TRACE__STEPTYPE:
				getSteptype().clear();
				return;
			case TracePackage.TRACE__STEPPATTERN:
				getSteppattern().clear();
				return;
			case TracePackage.TRACE__VALUE:
				getValue().clear();
				return;
			case TracePackage.TRACE__OBJECTSTATE:
				getObjectstate().clear();
				return;
			case TracePackage.TRACE__REPEATINGSTEP:
				getRepeatingstep().clear();
				return;
			case TracePackage.TRACE__STEP:
				getStep().clear();
				return;
			case TracePackage.TRACE__PARAMETER_VALUES:
				getParameterValues().clear();
				return;
			case TracePackage.TRACE__PARAMETERLIST:
				getParameterlist().clear();
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
			case TracePackage.TRACE__STATE:
				return state != null && !state.isEmpty();
			case TracePackage.TRACE__TRANSIENTOBJECT:
				return transientobject != null && !transientobject.isEmpty();
			case TracePackage.TRACE__STEPTYPE:
				return steptype != null && !steptype.isEmpty();
			case TracePackage.TRACE__STEPPATTERN:
				return steppattern != null && !steppattern.isEmpty();
			case TracePackage.TRACE__VALUE:
				return value != null && !value.isEmpty();
			case TracePackage.TRACE__OBJECTSTATE:
				return objectstate != null && !objectstate.isEmpty();
			case TracePackage.TRACE__REPEATINGSTEP:
				return repeatingstep != null && !repeatingstep.isEmpty();
			case TracePackage.TRACE__STEP:
				return step != null && !step.isEmpty();
			case TracePackage.TRACE__PARAMETER_VALUES:
				return parameterValues != null && !parameterValues.isEmpty();
			case TracePackage.TRACE__PARAMETERLIST:
				return parameterlist != null && !parameterlist.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl
