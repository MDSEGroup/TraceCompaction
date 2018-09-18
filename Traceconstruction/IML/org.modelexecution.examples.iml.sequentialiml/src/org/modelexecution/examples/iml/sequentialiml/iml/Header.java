/**
 */
package org.modelexecution.examples.iml.sequentialiml.iml;

import java.lang.Iterable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelexecution.examples.iml.sequentialiml.iml.Header#getName <em>Name</em>}</li>
 *   <li>{@link org.modelexecution.examples.iml.sequentialiml.iml.Header#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.modelexecution.examples.iml.sequentialiml.iml.ImlPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends IdentifyableElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.modelexecution.examples.iml.sequentialiml.iml.ImlPackage#getHeader_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelexecution.examples.iml.sequentialiml.iml.Header#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.examples.iml.sequentialiml.iml.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.modelexecution.examples.iml.sequentialiml.iml.ImlPackage#getHeader_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 * @generated
	 */
	void initializeModel(EList<String> args);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.modelexecution.examples.iml.sequentialiml.iml.Iterable"
	 * @generated
	 */
	Iterable getCurrentStates();

} // Header
