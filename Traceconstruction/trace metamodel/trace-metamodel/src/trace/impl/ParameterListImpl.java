/**
 */
package trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import trace.ParameterList;
import trace.ParameterValue;
import trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.ParameterListImpl#getParametervalue <em>Parametervalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ParameterListImpl extends MinimalEObjectImpl.Container implements ParameterList {
	/**
	 * The cached value of the '{@link #getParametervalue() <em>Parametervalue</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametervalue()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValue> parametervalue;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.PARAMETER_LIST;
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
	public EList<ParameterValue> getParametervalue() {
		if (parametervalue == null) {
			parametervalue = new EObjectResolvingEList<ParameterValue>(ParameterValue.class, this, TracePackage.PARAMETER_LIST__PARAMETERVALUE){
				  @Override
		          protected boolean isUnique() {
		              return false;
		          }
		         };
				}
		return parametervalue;
	}

	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.PARAMETER_LIST__PARAMETERVALUE:
				return getParametervalue();
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
			case TracePackage.PARAMETER_LIST__PARAMETERVALUE:
				getParametervalue().clear();
				getParametervalue().addAll((Collection<? extends ParameterValue>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated @not
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TracePackage.PARAMETER_LIST__PARAMETERVALUE:
				getParametervalue().clear();
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
			case TracePackage.PARAMETER_LIST__PARAMETERVALUE:
				return parametervalue != null && !parametervalue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParameterListImpl
