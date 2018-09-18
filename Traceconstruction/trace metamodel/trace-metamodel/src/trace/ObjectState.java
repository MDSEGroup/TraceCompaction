/**
 */
package trace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.ObjectState#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getObjectState()
 * @model abstract="true"
 * @generated
 */
public interface ObjectState extends EObject {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link trace.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see trace.TracePackage#getObjectState_Value()
	 * @model
	 * @generated
	 */
	EList<Value> getValue();
} // ObjectState
