/**
 */
package trace;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeating Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.RepeatingStep#getChildren <em>Children</em>}</li>
 *   <li>{@link trace.RepeatingStep#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getRepeatingStep()
 * @model
 * @generated
 */
public interface RepeatingStep extends StepSpec {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link trace.RepeatingStep}.
	 * It is bidirectional and its opposite is '{@link trace.RepeatingStep#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see trace.TracePackage#getRepeatingStep_Children()
	 * @see trace.RepeatingStep#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<RepeatingStep> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link trace.RepeatingStep#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(RepeatingStep)
	 * @see trace.TracePackage#getRepeatingStep_Parent()
	 * @see trace.RepeatingStep#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	RepeatingStep getParent();

	/**
	 * Sets the value of the '{@link trace.RepeatingStep#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(RepeatingStep value);

} // RepeatingStep
