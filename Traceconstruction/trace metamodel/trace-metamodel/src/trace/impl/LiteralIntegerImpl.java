/**
 */
package trace.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import trace.LiteralInteger;
import trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.LiteralIntegerImpl#getIntvalue <em>Intvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralIntegerImpl extends LiteralValueImpl implements LiteralInteger {
	/**
	 * The cached value of the '{@link #getIntvalue() <em>Intvalue</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntvalue()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> intvalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralIntegerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.LITERAL_INTEGER;
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
	public EList<Integer> getIntvalue() {
		if (intvalue == null) {
			intvalue = new EDataTypeUniqueEList<Integer>(Integer.class, this, TracePackage.LITERAL_INTEGER__INTVALUE){
				  @Override
		          protected boolean isUnique() {
		              return false;
		          }
		         };
				}
		return intvalue;
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.LITERAL_INTEGER__INTVALUE:
				return getIntvalue();
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
			case TracePackage.LITERAL_INTEGER__INTVALUE:
				getIntvalue().clear();
				getIntvalue().addAll((Collection<? extends Integer>)newValue);
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
			case TracePackage.LITERAL_INTEGER__INTVALUE:
				getIntvalue().clear();
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
			case TracePackage.LITERAL_INTEGER__INTVALUE:
				return intvalue != null && !intvalue.isEmpty();
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
		result.append(" (intvalue: ");
		result.append(intvalue);
		result.append(')');
		return result.toString();
	}

} //LiteralIntegerImpl
