/**
 */
package trace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * this class represent bigstep in trace data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.NormalStep#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getNormalStep()
 * @model
 * @generated
 */
public interface NormalStep extends Step, StepSpec {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link trace.Step}.
	 * It is bidirectional and its opposite is '{@link trace.Step#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see trace.TracePackage#getNormalStep_Children()
	 * @see trace.Step#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Step> getChildren();

} // NormalStep
