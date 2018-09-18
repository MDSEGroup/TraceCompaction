/**
 */
package trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.Trace#getState <em>State</em>}</li>
 *   <li>{@link trace.Trace#getTransientobject <em>Transientobject</em>}</li>
 *   <li>{@link trace.Trace#getSteptype <em>Steptype</em>}</li>
 *   <li>{@link trace.Trace#getSteppattern <em>Steppattern</em>}</li>
 *   <li>{@link trace.Trace#getValue <em>Value</em>}</li>
 *   <li>{@link trace.Trace#getObjectstate <em>Objectstate</em>}</li>
 *   <li>{@link trace.Trace#getRepeatingstep <em>Repeatingstep</em>}</li>
 *   <li>{@link trace.Trace#getStep <em>Step</em>}</li>
 *   <li>{@link trace.Trace#getParameterValues <em>Parameter Values</em>}</li>
 *   <li>{@link trace.Trace#getParameterlist <em>Parameterlist</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link trace.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see trace.TracePackage#getTrace_State()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Transientobject</b></em>' containment reference list.
	 * The list contents are of type {@link trace.TransientObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transientobject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transientobject</em>' containment reference list.
	 * @see trace.TracePackage#getTrace_Transientobject()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransientObject> getTransientobject();

	/**
	 * Returns the value of the '<em><b>Steptype</b></em>' containment reference list.
	 * The list contents are of type {@link trace.StepType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steptype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steptype</em>' containment reference list.
	 * @see trace.TracePackage#getTrace_Steptype()
	 * @model containment="true"
	 * @generated
	 */
	EList<StepType> getSteptype();

	/**
	 * Returns the value of the '<em><b>Steppattern</b></em>' containment reference list.
	 * The list contents are of type {@link trace.StepPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steppattern</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steppattern</em>' containment reference list.
	 * @see trace.TracePackage#getTrace_Steppattern()
	 * @model containment="true"
	 * @generated
	 */
	EList<StepPattern> getSteppattern();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link trace.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see trace.TracePackage#getTrace_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValue();

	/**
	 * Returns the value of the '<em><b>Objectstate</b></em>' containment reference list.
	 * The list contents are of type {@link trace.ObjectState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectstate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectstate</em>' containment reference list.
	 * @see trace.TracePackage#getTrace_Objectstate()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectState> getObjectstate();

	/**
	 * Returns the value of the '<em><b>Repeatingstep</b></em>' containment reference list.
	 * The list contents are of type {@link trace.RepeatingStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeatingstep</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeatingstep</em>' containment reference list.
	 * @see trace.TracePackage#getTrace_Repeatingstep()
	 * @model containment="true"
	 * @generated
	 */
	EList<RepeatingStep> getRepeatingstep();

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link trace.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see trace.TracePackage#getTrace_Step()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getStep();



	/**
	 * Returns the value of the '<em><b>Parameter Values</b></em>' containment reference list.
	 * The list contents are of type {@link trace.ParameterValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Values</em>' containment reference list.
	 * @see trace.TracePackage#getTrace_ParameterValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterValue> getParameterValues();

	/**
	 * Returns the value of the '<em><b>Parameterlist</b></em>' containment reference list.
	 * The list contents are of type {@link trace.ParameterList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameterlist</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameterlist</em>' containment reference list.
	 * @see trace.TracePackage#getTrace_Parameterlist()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterList> getParameterlist();

} // Trace
