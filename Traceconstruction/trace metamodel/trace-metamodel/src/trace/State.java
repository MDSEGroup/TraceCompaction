/**
 */
package trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.State#getNewobjects <em>Newobjects</em>}</li>
 *   <li>{@link trace.State#getDeletedobjects <em>Deletedobjects</em>}</li>
 *   <li>{@link trace.State#getBasestate <em>Basestate</em>}</li>
 *   <li>{@link trace.State#getTransientObjectsStates <em>Transient Objects States</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Newobjects</b></em>' reference list.
	 * The list contents are of type {@link trace.TransientObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newobjects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newobjects</em>' reference list.
	 * @see trace.TracePackage#getState_Newobjects()
	 * @model
	 * @generated
	 */
	EList<TransientObject> getNewobjects();

	/**
	 * Returns the value of the '<em><b>Deletedobjects</b></em>' reference list.
	 * The list contents are of type {@link trace.TransientObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deletedobjects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletedobjects</em>' reference list.
	 * @see trace.TracePackage#getState_Deletedobjects()
	 * @model
	 * @generated
	 */
	EList<TransientObject> getDeletedobjects();

	/**
	 * Returns the value of the '<em><b>Basestate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basestate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basestate</em>' reference.
	 * @see #setBasestate(State)
	 * @see trace.TracePackage#getState_Basestate()
	 * @model
	 * @generated
	 */
	State getBasestate();

	/**
	 * Sets the value of the '{@link trace.State#getBasestate <em>Basestate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basestate</em>' reference.
	 * @see #getBasestate()
	 * @generated
	 */
	void setBasestate(State value);

	/**
	 * Returns the value of the '<em><b>Transient Objects States</b></em>' containment reference list.
	 * The list contents are of type {@link trace.TransientObjectState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Objects States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Objects States</em>' containment reference list.
	 * @see trace.TracePackage#getState_TransientObjectsStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransientObjectState> getTransientObjectsStates();
	
	 State copy( State other );

} // State
