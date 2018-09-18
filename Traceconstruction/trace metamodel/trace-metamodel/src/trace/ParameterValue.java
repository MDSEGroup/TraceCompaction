/**
 */
package trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.ParameterValue#getDirectionKind <em>Direction Kind</em>}</li>
 *   <li>{@link trace.ParameterValue#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getParameterValue()
 * @model
 * @generated
 */
public interface ParameterValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link trace.ParamterKindEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Kind</em>' attribute.
	 * @see trace.ParamterKindEnum
	 * @see #setDirectionKind(ParamterKindEnum)
	 * @see trace.TracePackage#getParameterValue_DirectionKind()
	 * @model
	 * @generated
	 */
	ParamterKindEnum getDirectionKind();

	/**
	 * Sets the value of the '{@link trace.ParameterValue#getDirectionKind <em>Direction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Kind</em>' attribute.
	 * @see trace.ParamterKindEnum
	 * @see #getDirectionKind()
	 * @generated
	 */
	void setDirectionKind(ParamterKindEnum value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link trace.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see trace.TracePackage#getParameterValue_Values()
	 * @model
	 * @generated
	 */
	EList<Value> getValues();

} // ParameterValue
