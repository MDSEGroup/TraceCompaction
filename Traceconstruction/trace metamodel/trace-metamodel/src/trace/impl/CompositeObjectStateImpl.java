/**
 */
package trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import trace.CompositeObjectState;
import trace.ObjectState;
import trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Object State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.CompositeObjectStateImpl#getObjectstates <em>Objectstates</em>}</li>
 *   <li>{@link trace.impl.CompositeObjectStateImpl#getObjectstatesOrder <em>Objectstates Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeObjectStateImpl extends ObjectStateImpl implements CompositeObjectState {
	/**
	 * The cached value of the '{@link #getObjectstates() <em>Objectstates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectstates()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectState> objectstates;

	/**
	 * The cached value of the '{@link #getObjectstatesOrder() <em>Objectstates Order</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectstatesOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> objectstatesOrder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeObjectStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.COMPOSITE_OBJECT_STATE;
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
	public EList<ObjectState> getObjectstates() {
		if (objectstates == null) {
			objectstates = new EObjectResolvingEList<ObjectState>(ObjectState.class, this, TracePackage.COMPOSITE_OBJECT_STATE__OBJECTSTATES){
				  @Override
		          protected boolean isUnique() {
		              return false;
		          }
		         };
				}
		return objectstates;
	}
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getObjectstatesOrder() {
		if (objectstatesOrder == null) {
			objectstatesOrder = new EDataTypeUniqueEList<Integer>(Integer.class, this, TracePackage.COMPOSITE_OBJECT_STATE__OBJECTSTATES_ORDER);
		}
		return objectstatesOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.COMPOSITE_OBJECT_STATE__OBJECTSTATES:
				return getObjectstates();
			case TracePackage.COMPOSITE_OBJECT_STATE__OBJECTSTATES_ORDER:
				return getObjectstatesOrder();
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
			case TracePackage.COMPOSITE_OBJECT_STATE__OBJECTSTATES:
				getObjectstates().clear();
				getObjectstates().addAll((Collection<? extends ObjectState>)newValue);
				return;
			case TracePackage.COMPOSITE_OBJECT_STATE__OBJECTSTATES_ORDER:
				getObjectstatesOrder().clear();
				getObjectstatesOrder().addAll((Collection<? extends Integer>)newValue);
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
			case TracePackage.COMPOSITE_OBJECT_STATE__OBJECTSTATES:
				getObjectstates().clear();
				return;
			case TracePackage.COMPOSITE_OBJECT_STATE__OBJECTSTATES_ORDER:
				getObjectstatesOrder().clear();
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
			case TracePackage.COMPOSITE_OBJECT_STATE__OBJECTSTATES:
				return objectstates != null && !objectstates.isEmpty();
			case TracePackage.COMPOSITE_OBJECT_STATE__OBJECTSTATES_ORDER:
				return objectstatesOrder != null && !objectstatesOrder.isEmpty();
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
		result.append(" (objectstatesOrder: ");
		result.append(objectstatesOrder);
		result.append(')');
		return result.toString();
	}

} //CompositeObjectStateImpl
