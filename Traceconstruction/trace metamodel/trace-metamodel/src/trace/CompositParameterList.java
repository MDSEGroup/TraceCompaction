/**
 */
package trace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composit Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.CompositParameterList#getParameterlist <em>Parameterlist</em>}</li>
 *   <li>{@link trace.CompositParameterList#getParamtervaluesOrder <em>Paramtervalues Order</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getCompositParameterList()
 * @model
 * @generated
 */
public interface CompositParameterList extends ParameterList {
	/**
	 * Returns the value of the '<em><b>Parameterlist</b></em>' reference list.
	 * The list contents are of type {@link trace.ParameterList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameterlist</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameterlist</em>' reference list.
	 * @see trace.TracePackage#getCompositParameterList_Parameterlist()
	 * @model
	 * @generated
	 */
	EList<ParameterList> getParameterlist();

	/**
	 * Returns the value of the '<em><b>Paramtervalues Order</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paramtervalues Order</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paramtervalues Order</em>' attribute list.
	 * @see trace.TracePackage#getCompositParameterList_ParamtervaluesOrder()
	 * @model
	 * @generated
	 */
	EList<Integer> getParamtervaluesOrder();

} // CompositParameterList
