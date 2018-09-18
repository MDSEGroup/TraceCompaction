/**
 */
package trace;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Float</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.LiteralFloat#getFloatvalue <em>Floatvalue</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getLiteralFloat()
 * @model
 * @generated
 */
public interface LiteralFloat extends LiteralValue {
	/**
	 * Returns the value of the '<em><b>Floatvalue</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floatvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floatvalue</em>' attribute list.
	 * @see trace.TracePackage#getLiteralFloat_Floatvalue()
	 * @model id="true"
	 * @generated
	 */
	EList<Float> getFloatvalue();

} // LiteralFloat
