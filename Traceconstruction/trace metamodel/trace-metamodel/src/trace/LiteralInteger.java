/**
 */
package trace;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.LiteralInteger#getIntvalue <em>Intvalue</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getLiteralInteger()
 * @model
 * @generated
 */
public interface LiteralInteger extends LiteralValue {
	/**
	 * Returns the value of the '<em><b>Intvalue</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intvalue</em>' attribute list.
	 * @see trace.TracePackage#getLiteralInteger_Intvalue()
	 * @model default="0" id="true"
	 * @generated
	 */
	EList<Integer> getIntvalue();

} // LiteralInteger
