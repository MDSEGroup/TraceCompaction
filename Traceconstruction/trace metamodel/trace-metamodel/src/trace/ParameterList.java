/**
 */
package trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.ParameterList#getParametervalue <em>Parametervalue</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getParameterList()
 * @model abstract="true"
 * @generated
 */
public interface ParameterList extends EObject {
	/**
	 * Returns the value of the '<em><b>Parametervalue</b></em>' reference list.
	 * The list contents are of type {@link trace.ParameterValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametervalue</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametervalue</em>' reference list.
	 * @see trace.TracePackage#getParameterList_Parametervalue()
	 * @model
	 * @generated
	 */
	EList<ParameterValue> getParametervalue();

} // ParameterList
