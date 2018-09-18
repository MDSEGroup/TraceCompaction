/**
 */
package trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Occurrence Step Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.PatternOccurrenceStepData#getStates <em>States</em>}</li>
 *   <li>{@link trace.PatternOccurrenceStepData#getStep <em>Step</em>}</li>
 *   <li>{@link trace.PatternOccurrenceStepData#getParameterlists <em>Parameterlists</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getPatternOccurrenceStepData()
 * @model
 * @generated
 */
public interface PatternOccurrenceStepData extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link trace.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see trace.TracePackage#getPatternOccurrenceStepData_States()
	 * @model
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' reference.
	 * @see #setStep(RepeatingStep)
	 * @see trace.TracePackage#getPatternOccurrenceStepData_Step()
	 * @model
	 * @generated
	 */
	RepeatingStep getStep();

	/**
	 * Sets the value of the '{@link trace.PatternOccurrenceStepData#getStep <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(RepeatingStep value);

	
	

	/**
	 * Returns the value of the '<em><b>Parameterlists</b></em>' reference list.
	 * The list contents are of type {@link trace.ParameterList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameterlists</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameterlists</em>' reference list.
	 * @see trace.TracePackage#getPatternOccurrenceStepData_Parameterlists()
	 * @model
	 * @generated
	 */
	EList<ParameterList> getParameterlists();

} // PatternOccurrenceStepData
