/**
 */
package org.modelexecution.examples.iml.sequentialiml.iml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifyable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelexecution.examples.iml.sequentialiml.iml.IdentifyableElement#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.modelexecution.examples.iml.sequentialiml.iml.ImlPackage#getIdentifyableElement()
 * @model abstract="true"
 * @generated
 */
public interface IdentifyableElement extends Element {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.modelexecution.examples.iml.sequentialiml.iml.ImlPackage#getIdentifyableElement_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.modelexecution.examples.iml.sequentialiml.iml.IdentifyableElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // IdentifyableElement
