/**
 */
package trace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.RefValue#getOriginalobject <em>Originalobject</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getRefValue()
 * @model
 * @generated
 */
public interface RefValue extends Value {
	/**
	 * Returns the value of the '<em><b>Originalobject</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Originalobject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originalobject</em>' reference list.
	 * @see trace.TracePackage#getRefValue_Originalobject()
	 * @model
	 * @generated
	 */
	EList<EObject> getOriginalobject();

} // RefValue
