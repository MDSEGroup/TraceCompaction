/**
 */
package trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import trace.CompositParameterList;
import trace.ParameterList;
import trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composit Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.CompositParameterListImpl#getParameterlist <em>Parameterlist</em>}</li>
 *   <li>{@link trace.impl.CompositParameterListImpl#getParamtervaluesOrder <em>Paramtervalues Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositParameterListImpl extends ParameterListImpl implements CompositParameterList {
	/**
	 * The cached value of the '{@link #getParameterlist() <em>Parameterlist</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterlist()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterList> parameterlist;
	/**
	 * The cached value of the '{@link #getParamtervaluesOrder() <em>Paramtervalues Order</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamtervaluesOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> paramtervaluesOrder;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositParameterListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.COMPOSIT_PARAMETER_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	*  @generated Not FIXME workaround BUG 89325
	 *  updated by Fazilat
	 *  for accepting duplicates in States
	 */
	@SuppressWarnings("supporting duplicats in object")
	@Override
	public EList<ParameterList> getParameterlist() {
		if (parameterlist == null) {
			parameterlist = new EObjectResolvingEList<ParameterList>(ParameterList.class, this, TracePackage.COMPOSIT_PARAMETER_LIST__PARAMETERLIST){
				  @Override
		          protected boolean isUnique() {
		              return false;
		          }
		         };
				}
		return parameterlist;
	}

	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getParamtervaluesOrder() {
		if (paramtervaluesOrder == null) {
			paramtervaluesOrder = new EDataTypeUniqueEList<Integer>(Integer.class, this, TracePackage.COMPOSIT_PARAMETER_LIST__PARAMTERVALUES_ORDER);
		}
		return paramtervaluesOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.COMPOSIT_PARAMETER_LIST__PARAMETERLIST:
				return getParameterlist();
			case TracePackage.COMPOSIT_PARAMETER_LIST__PARAMTERVALUES_ORDER:
				return getParamtervaluesOrder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TracePackage.COMPOSIT_PARAMETER_LIST__PARAMETERLIST:
				getParameterlist().clear();
				getParameterlist().addAll((Collection<? extends ParameterList>)newValue);
				return;
			case TracePackage.COMPOSIT_PARAMETER_LIST__PARAMTERVALUES_ORDER:
				getParamtervaluesOrder().clear();
				getParamtervaluesOrder().addAll((Collection<? extends Integer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TracePackage.COMPOSIT_PARAMETER_LIST__PARAMETERLIST:
				getParameterlist().clear();
				return;
			case TracePackage.COMPOSIT_PARAMETER_LIST__PARAMTERVALUES_ORDER:
				getParamtervaluesOrder().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TracePackage.COMPOSIT_PARAMETER_LIST__PARAMETERLIST:
				return parameterlist != null && !parameterlist.isEmpty();
			case TracePackage.COMPOSIT_PARAMETER_LIST__PARAMTERVALUES_ORDER:
				return paramtervaluesOrder != null && !paramtervaluesOrder.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (paramtervaluesOrder: ");
		result.append(paramtervaluesOrder);
		result.append(')');
		return result.toString();
	}

} //CompositParameterListImpl
