/**
 */
package trace;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.LiteralString#getStringvalue <em>Stringvalue</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getLiteralString()
 * @model
 * @generated
 */
public interface LiteralString extends LiteralValue {
	/**
	 * Returns the value of the '<em><b>Stringvalue</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stringvalue</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stringvalue</em>' attribute list.
	 * @see trace.TracePackage#getLiteralString_Stringvalue()
	 * @model id="true"
	 * @generated
	 */
	EList<String> getStringvalue();

} // LiteralString
