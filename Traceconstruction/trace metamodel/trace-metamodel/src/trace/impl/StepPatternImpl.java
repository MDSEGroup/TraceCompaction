/**
 */
package trace.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import trace.RepeatingStep;
import trace.StepPattern;
import trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.StepPatternImpl#getRepeatingstep <em>Repeatingstep</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepPatternImpl extends MinimalEObjectImpl.Container implements StepPattern {
	/**
	 * The cached value of the '{@link #getRepeatingstep() <em>Repeatingstep</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatingstep()
	 * @generated
	 * @ordered
	 */
	protected EList<RepeatingStep> repeatingstep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.STEP_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *  @generated Not FIXME workaround BUG 89325
	 *  updated by Fazilat
	 *  for accepting duplicates in States
	 */
	@SuppressWarnings("serial")
	@Override
	public EList<RepeatingStep> getRepeatingstep() {
		if (repeatingstep == null) {
			repeatingstep = new EObjectResolvingEList<RepeatingStep>(RepeatingStep.class, this, TracePackage.STEP_PATTERN__REPEATINGSTEP){
	             @Override
	             protected boolean isUnique() {
	                 return false;
	             }
	      };
		}
		return repeatingstep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.STEP_PATTERN__REPEATINGSTEP:
				return getRepeatingstep();
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
			case TracePackage.STEP_PATTERN__REPEATINGSTEP:
				getRepeatingstep().clear();
				getRepeatingstep().addAll((Collection<? extends RepeatingStep>)newValue);
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
			case TracePackage.STEP_PATTERN__REPEATINGSTEP:
				getRepeatingstep().clear();
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
			case TracePackage.STEP_PATTERN__REPEATINGSTEP:
				return repeatingstep != null && !repeatingstep.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StepPatternImpl
