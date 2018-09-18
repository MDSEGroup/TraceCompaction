/**
 */
package trace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transient Object State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.TransientObjectState#getTransientobject <em>Transientobject</em>}</li>
 *   <li>{@link trace.TransientObjectState#getObjectstate <em>Objectstate</em>}</li>
 *   <li>{@link trace.TransientObjectState#getEstructuralfeature <em>Estructuralfeature</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getTransientObjectState()
 * @model
 * @generated
 */
public interface TransientObjectState extends EObject {
	/**
	 * Returns the value of the '<em><b>Transientobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transientobject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transientobject</em>' reference.
	 * @see #setTransientobject(TransientObject)
	 * @see trace.TracePackage#getTransientObjectState_Transientobject()
	 * @model required="true"
	 * @generated
	 */
	TransientObject getTransientobject();

	/**
	 * Sets the value of the '{@link trace.TransientObjectState#getTransientobject <em>Transientobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transientobject</em>' reference.
	 * @see #getTransientobject()
	 * @generated
	 */
	void setTransientobject(TransientObject value);

	/**
	 * Returns the value of the '<em><b>Objectstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectstate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectstate</em>' reference.
	 * @see #setObjectstate(ObjectState)
	 * @see trace.TracePackage#getTransientObjectState_Objectstate()
	 * @model required="true"
	 * @generated
	 */
	ObjectState getObjectstate();

	/**
	 * Sets the value of the '{@link trace.TransientObjectState#getObjectstate <em>Objectstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectstate</em>' reference.
	 * @see #getObjectstate()
	 * @generated
	 */
	void setObjectstate(ObjectState value);

	/**
	 * Returns the value of the '<em><b>Estructuralfeature</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructuralfeature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructuralfeature</em>' reference list.
	 * @see trace.TracePackage#getTransientObjectState_Estructuralfeature()
	 * @model
	 * @generated
	 */
	EList<EStructuralFeature> getEstructuralfeature();

} // TransientObjectState
