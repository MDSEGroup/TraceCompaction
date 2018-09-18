/**
 */
package trace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.StepType#getStepName <em>Step Name</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getStepType()
 * @model
 * @generated
 */
public interface StepType extends EObject {
	/**
	 * Returns the value of the '<em><b>Step Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Name</em>' attribute.
	 * @see #setStepName(String)
	 * @see trace.TracePackage#getStepType_StepName()
	 * @model
	 * @generated
	 */
	String getStepName();

	/**
	 * Sets the value of the '{@link trace.StepType#getStepName <em>Step Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Name</em>' attribute.
	 * @see #getStepName()
	 * @generated
	 */
	void setStepName(String value);

} // StepType
