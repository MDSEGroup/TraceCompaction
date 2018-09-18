/**
 */
package trace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Ocurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.PatternOcurrence#getPattern <em>Pattern</em>}</li>
 *   <li>{@link trace.PatternOcurrence#getRepet <em>Repet</em>}</li>
 *   <li>{@link trace.PatternOcurrence#getStepdata <em>Stepdata</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getPatternOcurrence()
 * @model
 * @generated
 */
public interface PatternOcurrence extends Step {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' reference.
	 * @see #setPattern(StepPattern)
	 * @see trace.TracePackage#getPatternOcurrence_Pattern()
	 * @model required="true"
	 * @generated
	 */
	StepPattern getPattern();

	/**
	 * Sets the value of the '{@link trace.PatternOcurrence#getPattern <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(StepPattern value);

	/**
	 * Returns the value of the '<em><b>Repet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repet</em>' attribute.
	 * @see #setRepet(int)
	 * @see trace.TracePackage#getPatternOcurrence_Repet()
	 * @model
	 * @generated
	 */
	int getRepet();

	/**
	 * Sets the value of the '{@link trace.PatternOcurrence#getRepet <em>Repet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repet</em>' attribute.
	 * @see #getRepet()
	 * @generated
	 */
	void setRepet(int value);

	/**
	 * Returns the value of the '<em><b>Stepdata</b></em>' containment reference list.
	 * The list contents are of type {@link trace.PatternOccurrenceStepData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stepdata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stepdata</em>' containment reference list.
	 * @see trace.TracePackage#getPatternOcurrence_Stepdata()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatternOccurrenceStepData> getStepdata();

} // PatternOcurrence
