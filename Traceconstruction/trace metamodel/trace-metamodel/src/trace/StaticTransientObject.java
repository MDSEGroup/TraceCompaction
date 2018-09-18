/**
 */
package trace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Transient Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.StaticTransientObject#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getStaticTransientObject()
 * @model
 * @generated
 */
public interface StaticTransientObject extends TransientObject {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(EObject)
	 * @see trace.TracePackage#getStaticTransientObject_OriginalObject()
	 * @model
	 * @generated
	 */
	EObject getOriginalObject();

	/**
	 * Sets the value of the '{@link trace.StaticTransientObject#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(EObject value);

} // StaticTransientObject
