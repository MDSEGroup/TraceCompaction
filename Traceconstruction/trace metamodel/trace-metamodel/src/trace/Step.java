/**
 */
package trace;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.Step#getState <em>State</em>}</li>
 *   <li>{@link trace.Step#getParent <em>Parent</em>}</li>
 *   <li>{@link trace.Step#getParameterlist <em>Parameterlist</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see trace.TracePackage#getStep_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link trace.Step#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link trace.NormalStep#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(NormalStep)
	 * @see trace.TracePackage#getStep_Parent()
	 * @see trace.NormalStep#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	NormalStep getParent();

	/**
	 * Sets the value of the '{@link trace.Step#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(NormalStep value);

	

	/**
	 * Returns the value of the '<em><b>Parameterlist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameterlist</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameterlist</em>' reference.
	 * @see #setParameterlist(ParameterList)
	 * @see trace.TracePackage#getStep_Parameterlist()
	 * @model
	 * @generated
	 */
	ParameterList getParameterlist();

	/**
	 * Sets the value of the '{@link trace.Step#getParameterlist <em>Parameterlist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameterlist</em>' reference.
	 * @see #getParameterlist()
	 * @generated
	 */
	void setParameterlist(ParameterList value);

} // Step
