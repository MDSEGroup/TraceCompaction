/**
 */
package trace.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import trace.LiteralBoolean;
import trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.LiteralBooleanImpl#getBoolvalue <em>Boolvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralBooleanImpl extends LiteralValueImpl implements LiteralBoolean {
	/**
	 * The cached value of the '{@link #getBoolvalue() <em>Boolvalue</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolvalue()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> boolvalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.LITERAL_BOOLEAN;
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
	public EList<Boolean> getBoolvalue() {
		if (boolvalue == null) {
			boolvalue = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, TracePackage.LITERAL_BOOLEAN__BOOLVALUE){
		  @Override
          protected boolean isUnique() {
              return false;
          }
         };
		}
		return boolvalue;
	}

	
	

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.LITERAL_BOOLEAN__BOOLVALUE:
				return getBoolvalue();
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
			case TracePackage.LITERAL_BOOLEAN__BOOLVALUE:
				getBoolvalue().clear();
				getBoolvalue().addAll((Collection<? extends Boolean>)newValue);
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
			case TracePackage.LITERAL_BOOLEAN__BOOLVALUE:
				getBoolvalue().clear();
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
			case TracePackage.LITERAL_BOOLEAN__BOOLVALUE:
				return boolvalue != null && !boolvalue.isEmpty();
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
		result.append(" (boolvalue: ");
		result.append(boolvalue);
		result.append(')');
		return result.toString();
	}

} //LiteralBooleanImpl
