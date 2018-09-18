/**
 */
package trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.StepPattern#getRepeatingstep <em>Repeatingstep</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getStepPattern()
 * @model
 * @generated
 */
public interface StepPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Repeatingstep</b></em>' reference list.
	 * The list contents are of type {@link trace.RepeatingStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeatingstep</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeatingstep</em>' reference list.
	 * @see trace.TracePackage#getStepPattern_Repeatingstep()
	 * @model
	 * @generated
	 */
	EList<RepeatingStep> getRepeatingstep();

} // StepPattern
