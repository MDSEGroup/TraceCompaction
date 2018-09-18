/**
 */
package trace;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.LiteralBoolean#getBoolvalue <em>Boolvalue</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getLiteralBoolean()
 * @model
 * @generated
 */
public interface LiteralBoolean extends LiteralValue {
	/**
	 * Returns the value of the '<em><b>Boolvalue</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolvalue</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolvalue</em>' attribute list.
	 * @see trace.TracePackage#getLiteralBoolean_Boolvalue()
	 * @model id="true"
	 * @generated
	 */
	EList<Boolean> getBoolvalue();

} // LiteralBoolean
