/**
 */
package trace.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import trace.LiteralFloat;
import trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Float</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.LiteralFloatImpl#getFloatvalue <em>Floatvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralFloatImpl extends LiteralValueImpl implements LiteralFloat {
	/**
	 * The cached value of the '{@link #getFloatvalue() <em>Floatvalue</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatvalue()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> floatvalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralFloatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.LITERAL_FLOAT;
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
	public EList<Float> getFloatvalue() {
		if (floatvalue == null) {
			floatvalue = new EDataTypeUniqueEList<Float>(Float.class, this, TracePackage.LITERAL_FLOAT__FLOATVALUE){
				  @Override
		          protected boolean isUnique() {
		              return false;
		          }
		         };
				}
		return floatvalue;
	}

	

	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.LITERAL_FLOAT__FLOATVALUE:
				return getFloatvalue();
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
			case TracePackage.LITERAL_FLOAT__FLOATVALUE:
				getFloatvalue().clear();
				getFloatvalue().addAll((Collection<? extends Float>)newValue);
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
			case TracePackage.LITERAL_FLOAT__FLOATVALUE:
				getFloatvalue().clear();
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
			case TracePackage.LITERAL_FLOAT__FLOATVALUE:
				return floatvalue != null && !floatvalue.isEmpty();
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
		result.append(" (floatvalue: ");
		result.append(floatvalue);
		result.append(')');
		return result.toString();
	}

} //LiteralFloatImpl
