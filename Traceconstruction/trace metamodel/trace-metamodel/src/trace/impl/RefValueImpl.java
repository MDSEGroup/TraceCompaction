/**
 */
package trace.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import trace.RefValue;
import trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.RefValueImpl#getOriginalobject <em>Originalobject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefValueImpl extends ValueImpl implements RefValue {
	/**
	 * The cached value of the '{@link #getOriginalobject() <em>Originalobject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalobject()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> originalobject;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.REF_VALUE;
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
	public EList<EObject> getOriginalobject() {
		if (originalobject == null) {
			originalobject = new EObjectResolvingEList<EObject>(EObject.class, this, TracePackage.REF_VALUE__ORIGINALOBJECT)
//			{
//				  @Override
//		          protected boolean isUnique() {
//		              return false;
//		          }
//		         }
			;
				}
		return originalobject;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.REF_VALUE__ORIGINALOBJECT:
				return getOriginalobject();
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
			case TracePackage.REF_VALUE__ORIGINALOBJECT:
				getOriginalobject().clear();
				getOriginalobject().addAll((Collection<? extends EObject>)newValue);
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
			case TracePackage.REF_VALUE__ORIGINALOBJECT:
				getOriginalobject().clear();
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
			case TracePackage.REF_VALUE__ORIGINALOBJECT:
				return originalobject != null && !originalobject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RefValueImpl
