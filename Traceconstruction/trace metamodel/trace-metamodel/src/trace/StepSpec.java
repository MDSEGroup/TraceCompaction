/**
 */
package trace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.StepSpec#getSteptype <em>Steptype</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getStepSpec()
 * @model abstract="true"
 * @generated
 */
public interface StepSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Steptype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steptype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steptype</em>' reference.
	 * @see #setSteptype(StepType)
	 * @see trace.TracePackage#getStepSpec_Steptype()
	 * @model required="true"
	 * @generated
	 */
	StepType getSteptype();

	/**
	 * Sets the value of the '{@link trace.StepSpec#getSteptype <em>Steptype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steptype</em>' reference.
	 * @see #getSteptype()
	 * @generated
	 */
	void setSteptype(StepType value);

} // StepSpec
