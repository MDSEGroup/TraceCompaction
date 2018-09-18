/**
 */
package trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import trace.ParameterValue;
import trace.ParamterKindEnum;
import trace.TracePackage;
import trace.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.ParameterValueImpl#getDirectionKind <em>Direction Kind</em>}</li>
 *   <li>{@link trace.impl.ParameterValueImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterValueImpl extends MinimalEObjectImpl.Container implements ParameterValue {
	/**
	 * The default value of the '{@link #getDirectionKind() <em>Direction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionKind()
	 * @generated
	 * @ordered
	 */
	protected static final ParamterKindEnum DIRECTION_KIND_EDEFAULT = ParamterKindEnum.IN;

	/**
	 * The cached value of the '{@link #getDirectionKind() <em>Direction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionKind()
	 * @generated
	 * @ordered
	 */
	protected ParamterKindEnum directionKind = DIRECTION_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.PARAMETER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamterKindEnum getDirectionKind() {
		return directionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionKind(ParamterKindEnum newDirectionKind) {
		ParamterKindEnum oldDirectionKind = directionKind;
		directionKind = newDirectionKind == null ? DIRECTION_KIND_EDEFAULT : newDirectionKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.PARAMETER_VALUE__DIRECTION_KIND, oldDirectionKind, directionKind));
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
	public EList<Value> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<Value>(Value.class, this, TracePackage.PARAMETER_VALUE__VALUES){
				  @Override
		          protected boolean isUnique() {
		              return false;
		          }
		         };
				}
		return values;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.PARAMETER_VALUE__DIRECTION_KIND:
				return getDirectionKind();
			case TracePackage.PARAMETER_VALUE__VALUES:
				return getValues();
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
			case TracePackage.PARAMETER_VALUE__DIRECTION_KIND:
				setDirectionKind((ParamterKindEnum)newValue);
				return;
			case TracePackage.PARAMETER_VALUE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Value>)newValue);
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
			case TracePackage.PARAMETER_VALUE__DIRECTION_KIND:
				setDirectionKind(DIRECTION_KIND_EDEFAULT);
				return;
			case TracePackage.PARAMETER_VALUE__VALUES:
				getValues().clear();
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
			case TracePackage.PARAMETER_VALUE__DIRECTION_KIND:
				return directionKind != DIRECTION_KIND_EDEFAULT;
			case TracePackage.PARAMETER_VALUE__VALUES:
				return values != null && !values.isEmpty();
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
		result.append(" (DirectionKind: ");
		result.append(directionKind);
		result.append(')');
		return result.toString();
	}

} //ParameterValueImpl
