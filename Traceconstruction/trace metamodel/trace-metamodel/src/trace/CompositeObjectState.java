/**
 */
package trace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Object State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.CompositeObjectState#getObjectstates <em>Objectstates</em>}</li>
 *   <li>{@link trace.CompositeObjectState#getObjectstatesOrder <em>Objectstates Order</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getCompositeObjectState()
 * @model
 * @generated
 */
public interface CompositeObjectState extends ObjectState {
	/**
	 * Returns the value of the '<em><b>Objectstates</b></em>' reference list.
	 * The list contents are of type {@link trace.ObjectState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectstates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectstates</em>' reference list.
	 * @see trace.TracePackage#getCompositeObjectState_Objectstates()
	 * @model
	 * @generated
	 */
	EList<ObjectState> getObjectstates();

	/**
	 * Returns the value of the '<em><b>Objectstates Order</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectstates Order</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectstates Order</em>' attribute list.
	 * @see trace.TracePackage#getCompositeObjectState_ObjectstatesOrder()
	 * @model
	 * @generated
	 */
	EList<Integer> getObjectstatesOrder();

} // CompositeObjectState
