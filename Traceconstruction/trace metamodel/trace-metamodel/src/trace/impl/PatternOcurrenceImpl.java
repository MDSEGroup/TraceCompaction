/**
 */
package trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trace.PatternOccurrenceStepData;
import trace.PatternOcurrence;
import trace.StepPattern;
import trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Ocurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.PatternOcurrenceImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link trace.impl.PatternOcurrenceImpl#getRepet <em>Repet</em>}</li>
 *   <li>{@link trace.impl.PatternOcurrenceImpl#getStepdata <em>Stepdata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternOcurrenceImpl extends StepImpl implements PatternOcurrence {
	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected StepPattern pattern;

	/**
	 * The default value of the '{@link #getRepet() <em>Repet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepet()
	 * @generated
	 * @ordered
	 */
	protected static final int REPET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRepet() <em>Repet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepet()
	 * @generated
	 * @ordered
	 */
	protected int repet = REPET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStepdata() <em>Stepdata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepdata()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternOccurrenceStepData> stepdata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternOcurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.PATTERN_OCURRENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepPattern getPattern() {
		if (pattern != null && pattern.eIsProxy()) {
			InternalEObject oldPattern = (InternalEObject)pattern;
			pattern = (StepPattern)eResolveProxy(oldPattern);
			if (pattern != oldPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.PATTERN_OCURRENCE__PATTERN, oldPattern, pattern));
			}
		}
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepPattern basicGetPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(StepPattern newPattern) {
		StepPattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.PATTERN_OCURRENCE__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRepet() {
		return repet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepet(int newRepet) {
		int oldRepet = repet;
		repet = newRepet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.PATTERN_OCURRENCE__REPET, oldRepet, repet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatternOccurrenceStepData> getStepdata() {
		if (stepdata == null) {
			stepdata = new EObjectContainmentEList<PatternOccurrenceStepData>(PatternOccurrenceStepData.class, this, TracePackage.PATTERN_OCURRENCE__STEPDATA);
		}
		return stepdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracePackage.PATTERN_OCURRENCE__STEPDATA:
				return ((InternalEList<?>)getStepdata()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.PATTERN_OCURRENCE__PATTERN:
				if (resolve) return getPattern();
				return basicGetPattern();
			case TracePackage.PATTERN_OCURRENCE__REPET:
				return getRepet();
			case TracePackage.PATTERN_OCURRENCE__STEPDATA:
				return getStepdata();
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
			case TracePackage.PATTERN_OCURRENCE__PATTERN:
				setPattern((StepPattern)newValue);
				return;
			case TracePackage.PATTERN_OCURRENCE__REPET:
				setRepet((Integer)newValue);
				return;
			case TracePackage.PATTERN_OCURRENCE__STEPDATA:
				getStepdata().clear();
				getStepdata().addAll((Collection<? extends PatternOccurrenceStepData>)newValue);
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
			case TracePackage.PATTERN_OCURRENCE__PATTERN:
				setPattern((StepPattern)null);
				return;
			case TracePackage.PATTERN_OCURRENCE__REPET:
				setRepet(REPET_EDEFAULT);
				return;
			case TracePackage.PATTERN_OCURRENCE__STEPDATA:
				getStepdata().clear();
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
			case TracePackage.PATTERN_OCURRENCE__PATTERN:
				return pattern != null;
			case TracePackage.PATTERN_OCURRENCE__REPET:
				return repet != REPET_EDEFAULT;
			case TracePackage.PATTERN_OCURRENCE__STEPDATA:
				return stepdata != null && !stepdata.isEmpty();
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
		result.append(" (repet: ");
		result.append(repet);
		result.append(')');
		return result.toString();
	}

} //PatternOcurrenceImpl
