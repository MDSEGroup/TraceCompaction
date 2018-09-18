/**
 */
package trace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see trace.TracePackage
 * @generated
 */
public interface TraceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceFactory eINSTANCE = trace.impl.TraceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Trace createTrace();

	/**
	 * Returns a new object of class '<em>Ref Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Value</em>'.
	 * @generated
	 */
	RefValue createRefValue();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Normal Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Step</em>'.
	 * @generated
	 */
	NormalStep createNormalStep();

	/**
	 * Returns a new object of class '<em>Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Type</em>'.
	 * @generated
	 */
	StepType createStepType();

	/**
	 * Returns a new object of class '<em>Pattern Ocurrence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Ocurrence</em>'.
	 * @generated
	 */
	PatternOcurrence createPatternOcurrence();

	/**
	 * Returns a new object of class '<em>Step Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Pattern</em>'.
	 * @generated
	 */
	StepPattern createStepPattern();

	/**
	 * Returns a new object of class '<em>Pattern Occurrence Step Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Occurrence Step Data</em>'.
	 * @generated
	 */
	PatternOccurrenceStepData createPatternOccurrenceStepData();

	/**
	 * Returns a new object of class '<em>Literal String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal String</em>'.
	 * @generated
	 */
	LiteralString createLiteralString();

	/**
	 * Returns a new object of class '<em>Literal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Boolean</em>'.
	 * @generated
	 */
	LiteralBoolean createLiteralBoolean();

	/**
	 * Returns a new object of class '<em>Literal Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Integer</em>'.
	 * @generated
	 */
	LiteralInteger createLiteralInteger();

	/**
	 * Returns a new object of class '<em>Literal Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Float</em>'.
	 * @generated
	 */
	LiteralFloat createLiteralFloat();

	/**
	 * Returns a new object of class '<em>Repeating Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeating Step</em>'.
	 * @generated
	 */
	RepeatingStep createRepeatingStep();

	/**
	 * Returns a new object of class '<em>Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Value</em>'.
	 * @generated
	 */
	ParameterValue createParameterValue();

	/**
	 * Returns a new object of class '<em>Transient Object State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transient Object State</em>'.
	 * @generated
	 */
	TransientObjectState createTransientObjectState();

	/**
	 * Returns a new object of class '<em>Leaf Object State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf Object State</em>'.
	 * @generated
	 */
	LeafObjectState createLeafObjectState();

	/**
	 * Returns a new object of class '<em>Composite Object State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Object State</em>'.
	 * @generated
	 */
	CompositeObjectState createCompositeObjectState();



	/**
	 * Returns a new object of class '<em>Static Transient Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Transient Object</em>'.
	 * @generated
	 */
	StaticTransientObject createStaticTransientObject();

	/**
	 * Returns a new object of class '<em>Dynamic Transient Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Transient Object</em>'.
	 * @generated
	 */
	DynamicTransientObject createDynamicTransientObject();

	/**
	 * Returns a new object of class '<em>Composit Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composit Parameter List</em>'.
	 * @generated
	 */
	CompositParameterList createCompositParameterList();

	/**
	 * Returns a new object of class '<em>Leaf Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf Parameter List</em>'.
	 * @generated
	 */
	LeafParameterList createLeafParameterList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TracePackage getTracePackage();

} //TraceFactory
