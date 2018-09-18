/**
 */
package trace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see trace.TraceFactory
 * @model kind="package"
 * @generated
 */
public interface TracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "trace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "trace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracePackage eINSTANCE = trace.impl.TracePackageImpl.init();

	/**
	 * The meta object id for the '{@link trace.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.ValueImpl
	 * @see trace.impl.TracePackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trace.impl.TransientObjectImpl <em>Transient Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.TransientObjectImpl
	 * @see trace.impl.TracePackageImpl#getTransientObject()
	 * @generated
	 */
	int TRANSIENT_OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Transient Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Transient Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.TraceImpl
	 * @see trace.impl.TracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STATE = 0;

	/**
	 * The feature id for the '<em><b>Transientobject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TRANSIENTOBJECT = 1;

	/**
	 * The feature id for the '<em><b>Steptype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STEPTYPE = 2;

	/**
	 * The feature id for the '<em><b>Steppattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STEPPATTERN = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__VALUE = 4;

	/**
	 * The feature id for the '<em><b>Objectstate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__OBJECTSTATE = 5;

	/**
	 * The feature id for the '<em><b>Repeatingstep</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__REPEATINGSTEP = 6;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STEP = 7;

	/**
	 * The feature id for the '<em><b>Parameter Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__PARAMETER_VALUES = 8;

	/**
	 * The feature id for the '<em><b>Parameterlist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__PARAMETERLIST = 9;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trace.impl.LiteralValueImpl <em>Literal Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.LiteralValueImpl
	 * @see trace.impl.TracePackageImpl#getLiteralValue()
	 * @generated
	 */
	int LITERAL_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Literal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.StepSpecImpl <em>Step Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.StepSpecImpl
	 * @see trace.impl.TracePackageImpl#getStepSpec()
	 * @generated
	 */
	int STEP_SPEC = 13;

	/**
	 * The meta object id for the '{@link trace.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.StepImpl
	 * @see trace.impl.TracePackageImpl#getStep()
	 * @generated
	 */
	int STEP = 8;

	/**
	 * The meta object id for the '{@link trace.impl.NormalStepImpl <em>Normal Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.NormalStepImpl
	 * @see trace.impl.TracePackageImpl#getNormalStep()
	 * @generated
	 */
	int NORMAL_STEP = 7;

	/**
	 * The meta object id for the '{@link trace.impl.ObjectStateImpl <em>Object State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.ObjectStateImpl
	 * @see trace.impl.TracePackageImpl#getObjectState()
	 * @generated
	 */
	int OBJECT_STATE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_STATE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Object State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Object State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trace.impl.RefValueImpl <em>Ref Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.RefValueImpl
	 * @see trace.impl.TracePackageImpl#getRefValue()
	 * @generated
	 */
	int REF_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Originalobject</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_VALUE__ORIGINALOBJECT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ref Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.StateImpl
	 * @see trace.impl.TracePackageImpl#getState()
	 * @generated
	 */
	int STATE = 6;

	/**
	 * The feature id for the '<em><b>Newobjects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NEWOBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Deletedobjects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DELETEDOBJECTS = 1;

	/**
	 * The feature id for the '<em><b>Basestate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BASESTATE = 2;

	/**
	 * The feature id for the '<em><b>Transient Objects States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSIENT_OBJECTS_STATES = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STATE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Parameterlist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PARAMETERLIST = 2;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP__STATE = STEP__STATE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP__PARENT = STEP__PARENT;

	/**
	 * The feature id for the '<em><b>Parameterlist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP__PARAMETERLIST = STEP__PARAMETERLIST;

	/**
	 * The feature id for the '<em><b>Steptype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP__STEPTYPE = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP__CHILDREN = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Normal Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Normal Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.StepTypeImpl <em>Step Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.StepTypeImpl
	 * @see trace.impl.TracePackageImpl#getStepType()
	 * @generated
	 */
	int STEP_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Step Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__STEP_NAME = 0;

	/**
	 * The number of structural features of the '<em>Step Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Step Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trace.impl.PatternOcurrenceImpl <em>Pattern Ocurrence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.PatternOcurrenceImpl
	 * @see trace.impl.TracePackageImpl#getPatternOcurrence()
	 * @generated
	 */
	int PATTERN_OCURRENCE = 10;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OCURRENCE__STATE = STEP__STATE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OCURRENCE__PARENT = STEP__PARENT;

	/**
	 * The feature id for the '<em><b>Parameterlist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OCURRENCE__PARAMETERLIST = STEP__PARAMETERLIST;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OCURRENCE__PATTERN = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OCURRENCE__REPET = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stepdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OCURRENCE__STEPDATA = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Ocurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OCURRENCE_FEATURE_COUNT = STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Ocurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OCURRENCE_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.StepPatternImpl <em>Step Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.StepPatternImpl
	 * @see trace.impl.TracePackageImpl#getStepPattern()
	 * @generated
	 */
	int STEP_PATTERN = 11;

	/**
	 * The feature id for the '<em><b>Repeatingstep</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PATTERN__REPEATINGSTEP = 0;

	/**
	 * The number of structural features of the '<em>Step Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Step Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trace.impl.PatternOccurrenceStepDataImpl <em>Pattern Occurrence Step Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.PatternOccurrenceStepDataImpl
	 * @see trace.impl.TracePackageImpl#getPatternOccurrenceStepData()
	 * @generated
	 */
	int PATTERN_OCCURRENCE_STEP_DATA = 12;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OCCURRENCE_STEP_DATA__STATES = 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OCCURRENCE_STEP_DATA__STEP = 1;

	/**
	 * The feature id for the '<em><b>Parameterlists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OCCURRENCE_STEP_DATA__PARAMETERLISTS = 2;

	/**
	 * The number of structural features of the '<em>Pattern Occurrence Step Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OCCURRENCE_STEP_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pattern Occurrence Step Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OCCURRENCE_STEP_DATA_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Steptype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_SPEC__STEPTYPE = 0;

	/**
	 * The number of structural features of the '<em>Step Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_SPEC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Step Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trace.impl.LiteralStringImpl <em>Literal String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.LiteralStringImpl
	 * @see trace.impl.TracePackageImpl#getLiteralString()
	 * @generated
	 */
	int LITERAL_STRING = 14;

	/**
	 * The feature id for the '<em><b>Stringvalue</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__STRINGVALUE = LITERAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_FEATURE_COUNT = LITERAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_OPERATION_COUNT = LITERAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.LiteralBooleanImpl
	 * @see trace.impl.TracePackageImpl#getLiteralBoolean()
	 * @generated
	 */
	int LITERAL_BOOLEAN = 15;

	/**
	 * The feature id for the '<em><b>Boolvalue</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__BOOLVALUE = LITERAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_FEATURE_COUNT = LITERAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_OPERATION_COUNT = LITERAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.LiteralIntegerImpl
	 * @see trace.impl.TracePackageImpl#getLiteralInteger()
	 * @generated
	 */
	int LITERAL_INTEGER = 16;

	/**
	 * The feature id for the '<em><b>Intvalue</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__INTVALUE = LITERAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_FEATURE_COUNT = LITERAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_OPERATION_COUNT = LITERAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.LiteralFloatImpl <em>Literal Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.LiteralFloatImpl
	 * @see trace.impl.TracePackageImpl#getLiteralFloat()
	 * @generated
	 */
	int LITERAL_FLOAT = 17;

	/**
	 * The feature id for the '<em><b>Floatvalue</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FLOAT__FLOATVALUE = LITERAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FLOAT_FEATURE_COUNT = LITERAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FLOAT_OPERATION_COUNT = LITERAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.RepeatingStepImpl <em>Repeating Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.RepeatingStepImpl
	 * @see trace.impl.TracePackageImpl#getRepeatingStep()
	 * @generated
	 */
	int REPEATING_STEP = 18;

	/**
	 * The feature id for the '<em><b>Steptype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATING_STEP__STEPTYPE = STEP_SPEC__STEPTYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATING_STEP__CHILDREN = STEP_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATING_STEP__PARENT = STEP_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repeating Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATING_STEP_FEATURE_COUNT = STEP_SPEC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Repeating Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATING_STEP_OPERATION_COUNT = STEP_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.ParameterValueImpl
	 * @see trace.impl.TracePackageImpl#getParameterValue()
	 * @generated
	 */
	int PARAMETER_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Direction Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__DIRECTION_KIND = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trace.impl.TransientObjectStateImpl <em>Transient Object State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.TransientObjectStateImpl
	 * @see trace.impl.TracePackageImpl#getTransientObjectState()
	 * @generated
	 */
	int TRANSIENT_OBJECT_STATE = 20;

	/**
	 * The feature id for the '<em><b>Transientobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_OBJECT_STATE__TRANSIENTOBJECT = 0;

	/**
	 * The feature id for the '<em><b>Objectstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_OBJECT_STATE__OBJECTSTATE = 1;

	/**
	 * The feature id for the '<em><b>Estructuralfeature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_OBJECT_STATE__ESTRUCTURALFEATURE = 2;

	/**
	 * The number of structural features of the '<em>Transient Object State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_OBJECT_STATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transient Object State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_OBJECT_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trace.impl.LeafObjectStateImpl <em>Leaf Object State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.LeafObjectStateImpl
	 * @see trace.impl.TracePackageImpl#getLeafObjectState()
	 * @generated
	 */
	int LEAF_OBJECT_STATE = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_OBJECT_STATE__VALUE = OBJECT_STATE__VALUE;

	/**
	 * The number of structural features of the '<em>Leaf Object State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_OBJECT_STATE_FEATURE_COUNT = OBJECT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Leaf Object State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_OBJECT_STATE_OPERATION_COUNT = OBJECT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.CompositeObjectStateImpl <em>Composite Object State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.CompositeObjectStateImpl
	 * @see trace.impl.TracePackageImpl#getCompositeObjectState()
	 * @generated
	 */
	int COMPOSITE_OBJECT_STATE = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OBJECT_STATE__VALUE = OBJECT_STATE__VALUE;

	/**
	 * The feature id for the '<em><b>Objectstates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OBJECT_STATE__OBJECTSTATES = OBJECT_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objectstates Order</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OBJECT_STATE__OBJECTSTATES_ORDER = OBJECT_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Object State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OBJECT_STATE_FEATURE_COUNT = OBJECT_STATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Object State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OBJECT_STATE_OPERATION_COUNT = OBJECT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.StaticTransientObjectImpl <em>Static Transient Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.StaticTransientObjectImpl
	 * @see trace.impl.TracePackageImpl#getStaticTransientObject()
	 * @generated
	 */
	int STATIC_TRANSIENT_OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TRANSIENT_OBJECT__ORIGINAL_OBJECT = TRANSIENT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Transient Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TRANSIENT_OBJECT_FEATURE_COUNT = TRANSIENT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Static Transient Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TRANSIENT_OBJECT_OPERATION_COUNT = TRANSIENT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.DynamicTransientObjectImpl <em>Dynamic Transient Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.DynamicTransientObjectImpl
	 * @see trace.impl.TracePackageImpl#getDynamicTransientObject()
	 * @generated
	 */
	int DYNAMIC_TRANSIENT_OBJECT = 24;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRANSIENT_OBJECT__TYPE = TRANSIENT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dynamic Transient Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRANSIENT_OBJECT_FEATURE_COUNT = TRANSIENT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dynamic Transient Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRANSIENT_OBJECT_OPERATION_COUNT = TRANSIENT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.ParameterListImpl <em>Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.ParameterListImpl
	 * @see trace.impl.TracePackageImpl#getParameterList()
	 * @generated
	 */
	int PARAMETER_LIST = 27;

	/**
	 * The feature id for the '<em><b>Parametervalue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__PARAMETERVALUE = 0;

	/**
	 * The number of structural features of the '<em>Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trace.impl.CompositParameterListImpl <em>Composit Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.CompositParameterListImpl
	 * @see trace.impl.TracePackageImpl#getCompositParameterList()
	 * @generated
	 */
	int COMPOSIT_PARAMETER_LIST = 25;

	/**
	 * The feature id for the '<em><b>Parametervalue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSIT_PARAMETER_LIST__PARAMETERVALUE = PARAMETER_LIST__PARAMETERVALUE;

	/**
	 * The feature id for the '<em><b>Parameterlist</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSIT_PARAMETER_LIST__PARAMETERLIST = PARAMETER_LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paramtervalues Order</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSIT_PARAMETER_LIST__PARAMTERVALUES_ORDER = PARAMETER_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composit Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSIT_PARAMETER_LIST_FEATURE_COUNT = PARAMETER_LIST_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composit Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSIT_PARAMETER_LIST_OPERATION_COUNT = PARAMETER_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.LeafParameterListImpl <em>Leaf Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.LeafParameterListImpl
	 * @see trace.impl.TracePackageImpl#getLeafParameterList()
	 * @generated
	 */
	int LEAF_PARAMETER_LIST = 26;

	/**
	 * The feature id for the '<em><b>Parametervalue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_PARAMETER_LIST__PARAMETERVALUE = PARAMETER_LIST__PARAMETERVALUE;

	/**
	 * The number of structural features of the '<em>Leaf Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_PARAMETER_LIST_FEATURE_COUNT = PARAMETER_LIST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Leaf Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_PARAMETER_LIST_OPERATION_COUNT = PARAMETER_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.ParamterKindEnum <em>Paramter Kind Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.ParamterKindEnum
	 * @see trace.impl.TracePackageImpl#getParamterKindEnum()
	 * @generated
	 */
	int PARAMTER_KIND_ENUM = 28;


	/**
	 * Returns the meta object for class '{@link trace.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see trace.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link trace.TransientObject <em>Transient Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transient Object</em>'.
	 * @see trace.TransientObject
	 * @generated
	 */
	EClass getTransientObject();

	/**
	 * Returns the meta object for class '{@link trace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see trace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.Trace#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see trace.Trace#getState()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_State();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.Trace#getTransientobject <em>Transientobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transientobject</em>'.
	 * @see trace.Trace#getTransientobject()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Transientobject();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.Trace#getSteptype <em>Steptype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steptype</em>'.
	 * @see trace.Trace#getSteptype()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Steptype();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.Trace#getSteppattern <em>Steppattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steppattern</em>'.
	 * @see trace.Trace#getSteppattern()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Steppattern();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.Trace#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see trace.Trace#getValue()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.Trace#getObjectstate <em>Objectstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objectstate</em>'.
	 * @see trace.Trace#getObjectstate()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Objectstate();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.Trace#getRepeatingstep <em>Repeatingstep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repeatingstep</em>'.
	 * @see trace.Trace#getRepeatingstep()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Repeatingstep();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.Trace#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see trace.Trace#getStep()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Step();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.Trace#getParameterValues <em>Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Values</em>'.
	 * @see trace.Trace#getParameterValues()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_ParameterValues();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.Trace#getParameterlist <em>Parameterlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameterlist</em>'.
	 * @see trace.Trace#getParameterlist()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Parameterlist();

	/**
	 * Returns the meta object for class '{@link trace.LiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Value</em>'.
	 * @see trace.LiteralValue
	 * @generated
	 */
	EClass getLiteralValue();

	/**
	 * Returns the meta object for class '{@link trace.ObjectState <em>Object State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object State</em>'.
	 * @see trace.ObjectState
	 * @generated
	 */
	EClass getObjectState();

	/**
	 * Returns the meta object for the reference list '{@link trace.ObjectState#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see trace.ObjectState#getValue()
	 * @see #getObjectState()
	 * @generated
	 */
	EReference getObjectState_Value();

	/**
	 * Returns the meta object for class '{@link trace.RefValue <em>Ref Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Value</em>'.
	 * @see trace.RefValue
	 * @generated
	 */
	EClass getRefValue();

	/**
	 * Returns the meta object for the reference list '{@link trace.RefValue#getOriginalobject <em>Originalobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Originalobject</em>'.
	 * @see trace.RefValue#getOriginalobject()
	 * @see #getRefValue()
	 * @generated
	 */
	EReference getRefValue_Originalobject();

	/**
	 * Returns the meta object for class '{@link trace.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see trace.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link trace.State#getNewobjects <em>Newobjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Newobjects</em>'.
	 * @see trace.State#getNewobjects()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Newobjects();

	/**
	 * Returns the meta object for the reference list '{@link trace.State#getDeletedobjects <em>Deletedobjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deletedobjects</em>'.
	 * @see trace.State#getDeletedobjects()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Deletedobjects();

	/**
	 * Returns the meta object for the reference '{@link trace.State#getBasestate <em>Basestate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Basestate</em>'.
	 * @see trace.State#getBasestate()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Basestate();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.State#getTransientObjectsStates <em>Transient Objects States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transient Objects States</em>'.
	 * @see trace.State#getTransientObjectsStates()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_TransientObjectsStates();

	/**
	 * Returns the meta object for class '{@link trace.NormalStep <em>Normal Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Step</em>'.
	 * @see trace.NormalStep
	 * @generated
	 */
	EClass getNormalStep();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.NormalStep#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see trace.NormalStep#getChildren()
	 * @see #getNormalStep()
	 * @generated
	 */
	EReference getNormalStep_Children();

	/**
	 * Returns the meta object for class '{@link trace.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see trace.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference '{@link trace.Step#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see trace.Step#getState()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_State();

	/**
	 * Returns the meta object for the container reference '{@link trace.Step#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see trace.Step#getParent()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Parent();

	/**
	 * Returns the meta object for the reference '{@link trace.Step#getParameterlist <em>Parameterlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameterlist</em>'.
	 * @see trace.Step#getParameterlist()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Parameterlist();

	/**
	 * Returns the meta object for class '{@link trace.StepType <em>Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Type</em>'.
	 * @see trace.StepType
	 * @generated
	 */
	EClass getStepType();

	/**
	 * Returns the meta object for the attribute '{@link trace.StepType#getStepName <em>Step Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Name</em>'.
	 * @see trace.StepType#getStepName()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_StepName();

	/**
	 * Returns the meta object for class '{@link trace.PatternOcurrence <em>Pattern Ocurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Ocurrence</em>'.
	 * @see trace.PatternOcurrence
	 * @generated
	 */
	EClass getPatternOcurrence();

	/**
	 * Returns the meta object for the reference '{@link trace.PatternOcurrence#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pattern</em>'.
	 * @see trace.PatternOcurrence#getPattern()
	 * @see #getPatternOcurrence()
	 * @generated
	 */
	EReference getPatternOcurrence_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link trace.PatternOcurrence#getRepet <em>Repet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repet</em>'.
	 * @see trace.PatternOcurrence#getRepet()
	 * @see #getPatternOcurrence()
	 * @generated
	 */
	EAttribute getPatternOcurrence_Repet();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.PatternOcurrence#getStepdata <em>Stepdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stepdata</em>'.
	 * @see trace.PatternOcurrence#getStepdata()
	 * @see #getPatternOcurrence()
	 * @generated
	 */
	EReference getPatternOcurrence_Stepdata();

	/**
	 * Returns the meta object for class '{@link trace.StepPattern <em>Step Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Pattern</em>'.
	 * @see trace.StepPattern
	 * @generated
	 */
	EClass getStepPattern();

	/**
	 * Returns the meta object for the reference list '{@link trace.StepPattern#getRepeatingstep <em>Repeatingstep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Repeatingstep</em>'.
	 * @see trace.StepPattern#getRepeatingstep()
	 * @see #getStepPattern()
	 * @generated
	 */
	EReference getStepPattern_Repeatingstep();

	/**
	 * Returns the meta object for class '{@link trace.PatternOccurrenceStepData <em>Pattern Occurrence Step Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Occurrence Step Data</em>'.
	 * @see trace.PatternOccurrenceStepData
	 * @generated
	 */
	EClass getPatternOccurrenceStepData();

	/**
	 * Returns the meta object for the reference list '{@link trace.PatternOccurrenceStepData#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see trace.PatternOccurrenceStepData#getStates()
	 * @see #getPatternOccurrenceStepData()
	 * @generated
	 */
	EReference getPatternOccurrenceStepData_States();

	/**
	 * Returns the meta object for the reference '{@link trace.PatternOccurrenceStepData#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step</em>'.
	 * @see trace.PatternOccurrenceStepData#getStep()
	 * @see #getPatternOccurrenceStepData()
	 * @generated
	 */
	EReference getPatternOccurrenceStepData_Step();

	/**
	 * Returns the meta object for the reference list '{@link trace.PatternOccurrenceStepData#getParameterlists <em>Parameterlists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameterlists</em>'.
	 * @see trace.PatternOccurrenceStepData#getParameterlists()
	 * @see #getPatternOccurrenceStepData()
	 * @generated
	 */
	EReference getPatternOccurrenceStepData_Parameterlists();

	/**
	 * Returns the meta object for class '{@link trace.StepSpec <em>Step Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Spec</em>'.
	 * @see trace.StepSpec
	 * @generated
	 */
	EClass getStepSpec();

	/**
	 * Returns the meta object for the reference '{@link trace.StepSpec#getSteptype <em>Steptype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Steptype</em>'.
	 * @see trace.StepSpec#getSteptype()
	 * @see #getStepSpec()
	 * @generated
	 */
	EReference getStepSpec_Steptype();

	/**
	 * Returns the meta object for class '{@link trace.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal String</em>'.
	 * @see trace.LiteralString
	 * @generated
	 */
	EClass getLiteralString();

	/**
	 * Returns the meta object for the attribute list '{@link trace.LiteralString#getStringvalue <em>Stringvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stringvalue</em>'.
	 * @see trace.LiteralString#getStringvalue()
	 * @see #getLiteralString()
	 * @generated
	 */
	EAttribute getLiteralString_Stringvalue();

	/**
	 * Returns the meta object for class '{@link trace.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Boolean</em>'.
	 * @see trace.LiteralBoolean
	 * @generated
	 */
	EClass getLiteralBoolean();

	/**
	 * Returns the meta object for the attribute list '{@link trace.LiteralBoolean#getBoolvalue <em>Boolvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Boolvalue</em>'.
	 * @see trace.LiteralBoolean#getBoolvalue()
	 * @see #getLiteralBoolean()
	 * @generated
	 */
	EAttribute getLiteralBoolean_Boolvalue();

	/**
	 * Returns the meta object for class '{@link trace.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Integer</em>'.
	 * @see trace.LiteralInteger
	 * @generated
	 */
	EClass getLiteralInteger();

	/**
	 * Returns the meta object for the attribute list '{@link trace.LiteralInteger#getIntvalue <em>Intvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Intvalue</em>'.
	 * @see trace.LiteralInteger#getIntvalue()
	 * @see #getLiteralInteger()
	 * @generated
	 */
	EAttribute getLiteralInteger_Intvalue();

	/**
	 * Returns the meta object for class '{@link trace.LiteralFloat <em>Literal Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Float</em>'.
	 * @see trace.LiteralFloat
	 * @generated
	 */
	EClass getLiteralFloat();

	/**
	 * Returns the meta object for the attribute list '{@link trace.LiteralFloat#getFloatvalue <em>Floatvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Floatvalue</em>'.
	 * @see trace.LiteralFloat#getFloatvalue()
	 * @see #getLiteralFloat()
	 * @generated
	 */
	EAttribute getLiteralFloat_Floatvalue();

	/**
	 * Returns the meta object for class '{@link trace.RepeatingStep <em>Repeating Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeating Step</em>'.
	 * @see trace.RepeatingStep
	 * @generated
	 */
	EClass getRepeatingStep();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.RepeatingStep#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see trace.RepeatingStep#getChildren()
	 * @see #getRepeatingStep()
	 * @generated
	 */
	EReference getRepeatingStep_Children();

	/**
	 * Returns the meta object for the container reference '{@link trace.RepeatingStep#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see trace.RepeatingStep#getParent()
	 * @see #getRepeatingStep()
	 * @generated
	 */
	EReference getRepeatingStep_Parent();

	/**
	 * Returns the meta object for class '{@link trace.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value</em>'.
	 * @see trace.ParameterValue
	 * @generated
	 */
	EClass getParameterValue();

	/**
	 * Returns the meta object for the attribute '{@link trace.ParameterValue#getDirectionKind <em>Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction Kind</em>'.
	 * @see trace.ParameterValue#getDirectionKind()
	 * @see #getParameterValue()
	 * @generated
	 */
	EAttribute getParameterValue_DirectionKind();

	/**
	 * Returns the meta object for the reference list '{@link trace.ParameterValue#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see trace.ParameterValue#getValues()
	 * @see #getParameterValue()
	 * @generated
	 */
	EReference getParameterValue_Values();

	/**
	 * Returns the meta object for class '{@link trace.TransientObjectState <em>Transient Object State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transient Object State</em>'.
	 * @see trace.TransientObjectState
	 * @generated
	 */
	EClass getTransientObjectState();

	/**
	 * Returns the meta object for the reference '{@link trace.TransientObjectState#getTransientobject <em>Transientobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transientobject</em>'.
	 * @see trace.TransientObjectState#getTransientobject()
	 * @see #getTransientObjectState()
	 * @generated
	 */
	EReference getTransientObjectState_Transientobject();

	/**
	 * Returns the meta object for the reference '{@link trace.TransientObjectState#getObjectstate <em>Objectstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objectstate</em>'.
	 * @see trace.TransientObjectState#getObjectstate()
	 * @see #getTransientObjectState()
	 * @generated
	 */
	EReference getTransientObjectState_Objectstate();

	/**
	 * Returns the meta object for the reference list '{@link trace.TransientObjectState#getEstructuralfeature <em>Estructuralfeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Estructuralfeature</em>'.
	 * @see trace.TransientObjectState#getEstructuralfeature()
	 * @see #getTransientObjectState()
	 * @generated
	 */
	EReference getTransientObjectState_Estructuralfeature();

	/**
	 * Returns the meta object for class '{@link trace.LeafObjectState <em>Leaf Object State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Object State</em>'.
	 * @see trace.LeafObjectState
	 * @generated
	 */
	EClass getLeafObjectState();

	/**
	 * Returns the meta object for class '{@link trace.CompositeObjectState <em>Composite Object State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Object State</em>'.
	 * @see trace.CompositeObjectState
	 * @generated
	 */
	EClass getCompositeObjectState();

	/**
	 * Returns the meta object for the reference list '{@link trace.CompositeObjectState#getObjectstates <em>Objectstates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Objectstates</em>'.
	 * @see trace.CompositeObjectState#getObjectstates()
	 * @see #getCompositeObjectState()
	 * @generated
	 */
	EReference getCompositeObjectState_Objectstates();

	/**
	 * Returns the meta object for the attribute list '{@link trace.CompositeObjectState#getObjectstatesOrder <em>Objectstates Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Objectstates Order</em>'.
	 * @see trace.CompositeObjectState#getObjectstatesOrder()
	 * @see #getCompositeObjectState()
	 * @generated
	 */
	EAttribute getCompositeObjectState_ObjectstatesOrder();

	/**
	 * Returns the meta object for class '{@link trace.StaticTransientObject <em>Static Transient Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Transient Object</em>'.
	 * @see trace.StaticTransientObject
	 * @generated
	 */
	EClass getStaticTransientObject();

	/**
	 * Returns the meta object for the reference '{@link trace.StaticTransientObject#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see trace.StaticTransientObject#getOriginalObject()
	 * @see #getStaticTransientObject()
	 * @generated
	 */
	EReference getStaticTransientObject_OriginalObject();

	/**
	 * Returns the meta object for class '{@link trace.DynamicTransientObject <em>Dynamic Transient Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Transient Object</em>'.
	 * @see trace.DynamicTransientObject
	 * @generated
	 */
	EClass getDynamicTransientObject();

	/**
	 * Returns the meta object for the reference '{@link trace.DynamicTransientObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see trace.DynamicTransientObject#getType()
	 * @see #getDynamicTransientObject()
	 * @generated
	 */
	EReference getDynamicTransientObject_Type();

	/**
	 * Returns the meta object for class '{@link trace.CompositParameterList <em>Composit Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composit Parameter List</em>'.
	 * @see trace.CompositParameterList
	 * @generated
	 */
	EClass getCompositParameterList();

	/**
	 * Returns the meta object for the reference list '{@link trace.CompositParameterList#getParameterlist <em>Parameterlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameterlist</em>'.
	 * @see trace.CompositParameterList#getParameterlist()
	 * @see #getCompositParameterList()
	 * @generated
	 */
	EReference getCompositParameterList_Parameterlist();

	/**
	 * Returns the meta object for the attribute list '{@link trace.CompositParameterList#getParamtervaluesOrder <em>Paramtervalues Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Paramtervalues Order</em>'.
	 * @see trace.CompositParameterList#getParamtervaluesOrder()
	 * @see #getCompositParameterList()
	 * @generated
	 */
	EAttribute getCompositParameterList_ParamtervaluesOrder();

	/**
	 * Returns the meta object for class '{@link trace.LeafParameterList <em>Leaf Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Parameter List</em>'.
	 * @see trace.LeafParameterList
	 * @generated
	 */
	EClass getLeafParameterList();

	/**
	 * Returns the meta object for class '{@link trace.ParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter List</em>'.
	 * @see trace.ParameterList
	 * @generated
	 */
	EClass getParameterList();

	/**
	 * Returns the meta object for the reference list '{@link trace.ParameterList#getParametervalue <em>Parametervalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parametervalue</em>'.
	 * @see trace.ParameterList#getParametervalue()
	 * @see #getParameterList()
	 * @generated
	 */
	EReference getParameterList_Parametervalue();

	/**
	 * Returns the meta object for enum '{@link trace.ParamterKindEnum <em>Paramter Kind Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Paramter Kind Enum</em>'.
	 * @see trace.ParamterKindEnum
	 * @generated
	 */
	EEnum getParamterKindEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceFactory getTraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link trace.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.ValueImpl
		 * @see trace.impl.TracePackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link trace.impl.TransientObjectImpl <em>Transient Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.TransientObjectImpl
		 * @see trace.impl.TracePackageImpl#getTransientObject()
		 * @generated
		 */
		EClass TRANSIENT_OBJECT = eINSTANCE.getTransientObject();

		/**
		 * The meta object literal for the '{@link trace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.TraceImpl
		 * @see trace.impl.TracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__STATE = eINSTANCE.getTrace_State();

		/**
		 * The meta object literal for the '<em><b>Transientobject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TRANSIENTOBJECT = eINSTANCE.getTrace_Transientobject();

		/**
		 * The meta object literal for the '<em><b>Steptype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__STEPTYPE = eINSTANCE.getTrace_Steptype();

		/**
		 * The meta object literal for the '<em><b>Steppattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__STEPPATTERN = eINSTANCE.getTrace_Steppattern();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__VALUE = eINSTANCE.getTrace_Value();

		/**
		 * The meta object literal for the '<em><b>Objectstate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__OBJECTSTATE = eINSTANCE.getTrace_Objectstate();

		/**
		 * The meta object literal for the '<em><b>Repeatingstep</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__REPEATINGSTEP = eINSTANCE.getTrace_Repeatingstep();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__STEP = eINSTANCE.getTrace_Step();

		/**
		 * The meta object literal for the '<em><b>Parameter Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__PARAMETER_VALUES = eINSTANCE.getTrace_ParameterValues();

		/**
		 * The meta object literal for the '<em><b>Parameterlist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__PARAMETERLIST = eINSTANCE.getTrace_Parameterlist();

		/**
		 * The meta object literal for the '{@link trace.impl.LiteralValueImpl <em>Literal Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.LiteralValueImpl
		 * @see trace.impl.TracePackageImpl#getLiteralValue()
		 * @generated
		 */
		EClass LITERAL_VALUE = eINSTANCE.getLiteralValue();

		/**
		 * The meta object literal for the '{@link trace.impl.ObjectStateImpl <em>Object State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.ObjectStateImpl
		 * @see trace.impl.TracePackageImpl#getObjectState()
		 * @generated
		 */
		EClass OBJECT_STATE = eINSTANCE.getObjectState();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_STATE__VALUE = eINSTANCE.getObjectState_Value();

		/**
		 * The meta object literal for the '{@link trace.impl.RefValueImpl <em>Ref Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.RefValueImpl
		 * @see trace.impl.TracePackageImpl#getRefValue()
		 * @generated
		 */
		EClass REF_VALUE = eINSTANCE.getRefValue();

		/**
		 * The meta object literal for the '<em><b>Originalobject</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_VALUE__ORIGINALOBJECT = eINSTANCE.getRefValue_Originalobject();

		/**
		 * The meta object literal for the '{@link trace.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.StateImpl
		 * @see trace.impl.TracePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Newobjects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__NEWOBJECTS = eINSTANCE.getState_Newobjects();

		/**
		 * The meta object literal for the '<em><b>Deletedobjects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DELETEDOBJECTS = eINSTANCE.getState_Deletedobjects();

		/**
		 * The meta object literal for the '<em><b>Basestate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BASESTATE = eINSTANCE.getState_Basestate();

		/**
		 * The meta object literal for the '<em><b>Transient Objects States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSIENT_OBJECTS_STATES = eINSTANCE.getState_TransientObjectsStates();

		/**
		 * The meta object literal for the '{@link trace.impl.NormalStepImpl <em>Normal Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.NormalStepImpl
		 * @see trace.impl.TracePackageImpl#getNormalStep()
		 * @generated
		 */
		EClass NORMAL_STEP = eINSTANCE.getNormalStep();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL_STEP__CHILDREN = eINSTANCE.getNormalStep_Children();

		/**
		 * The meta object literal for the '{@link trace.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.StepImpl
		 * @see trace.impl.TracePackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__STATE = eINSTANCE.getStep_State();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__PARENT = eINSTANCE.getStep_Parent();

		/**
		 * The meta object literal for the '<em><b>Parameterlist</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__PARAMETERLIST = eINSTANCE.getStep_Parameterlist();

		/**
		 * The meta object literal for the '{@link trace.impl.StepTypeImpl <em>Step Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.StepTypeImpl
		 * @see trace.impl.TracePackageImpl#getStepType()
		 * @generated
		 */
		EClass STEP_TYPE = eINSTANCE.getStepType();

		/**
		 * The meta object literal for the '<em><b>Step Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_TYPE__STEP_NAME = eINSTANCE.getStepType_StepName();

		/**
		 * The meta object literal for the '{@link trace.impl.PatternOcurrenceImpl <em>Pattern Ocurrence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.PatternOcurrenceImpl
		 * @see trace.impl.TracePackageImpl#getPatternOcurrence()
		 * @generated
		 */
		EClass PATTERN_OCURRENCE = eINSTANCE.getPatternOcurrence();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_OCURRENCE__PATTERN = eINSTANCE.getPatternOcurrence_Pattern();

		/**
		 * The meta object literal for the '<em><b>Repet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_OCURRENCE__REPET = eINSTANCE.getPatternOcurrence_Repet();

		/**
		 * The meta object literal for the '<em><b>Stepdata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_OCURRENCE__STEPDATA = eINSTANCE.getPatternOcurrence_Stepdata();

		/**
		 * The meta object literal for the '{@link trace.impl.StepPatternImpl <em>Step Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.StepPatternImpl
		 * @see trace.impl.TracePackageImpl#getStepPattern()
		 * @generated
		 */
		EClass STEP_PATTERN = eINSTANCE.getStepPattern();

		/**
		 * The meta object literal for the '<em><b>Repeatingstep</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_PATTERN__REPEATINGSTEP = eINSTANCE.getStepPattern_Repeatingstep();

		/**
		 * The meta object literal for the '{@link trace.impl.PatternOccurrenceStepDataImpl <em>Pattern Occurrence Step Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.PatternOccurrenceStepDataImpl
		 * @see trace.impl.TracePackageImpl#getPatternOccurrenceStepData()
		 * @generated
		 */
		EClass PATTERN_OCCURRENCE_STEP_DATA = eINSTANCE.getPatternOccurrenceStepData();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_OCCURRENCE_STEP_DATA__STATES = eINSTANCE.getPatternOccurrenceStepData_States();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_OCCURRENCE_STEP_DATA__STEP = eINSTANCE.getPatternOccurrenceStepData_Step();

		/**
		 * The meta object literal for the '<em><b>Parameterlists</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_OCCURRENCE_STEP_DATA__PARAMETERLISTS = eINSTANCE.getPatternOccurrenceStepData_Parameterlists();

		/**
		 * The meta object literal for the '{@link trace.impl.StepSpecImpl <em>Step Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.StepSpecImpl
		 * @see trace.impl.TracePackageImpl#getStepSpec()
		 * @generated
		 */
		EClass STEP_SPEC = eINSTANCE.getStepSpec();

		/**
		 * The meta object literal for the '<em><b>Steptype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_SPEC__STEPTYPE = eINSTANCE.getStepSpec_Steptype();

		/**
		 * The meta object literal for the '{@link trace.impl.LiteralStringImpl <em>Literal String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.LiteralStringImpl
		 * @see trace.impl.TracePackageImpl#getLiteralString()
		 * @generated
		 */
		EClass LITERAL_STRING = eINSTANCE.getLiteralString();

		/**
		 * The meta object literal for the '<em><b>Stringvalue</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_STRING__STRINGVALUE = eINSTANCE.getLiteralString_Stringvalue();

		/**
		 * The meta object literal for the '{@link trace.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.LiteralBooleanImpl
		 * @see trace.impl.TracePackageImpl#getLiteralBoolean()
		 * @generated
		 */
		EClass LITERAL_BOOLEAN = eINSTANCE.getLiteralBoolean();

		/**
		 * The meta object literal for the '<em><b>Boolvalue</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_BOOLEAN__BOOLVALUE = eINSTANCE.getLiteralBoolean_Boolvalue();

		/**
		 * The meta object literal for the '{@link trace.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.LiteralIntegerImpl
		 * @see trace.impl.TracePackageImpl#getLiteralInteger()
		 * @generated
		 */
		EClass LITERAL_INTEGER = eINSTANCE.getLiteralInteger();

		/**
		 * The meta object literal for the '<em><b>Intvalue</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_INTEGER__INTVALUE = eINSTANCE.getLiteralInteger_Intvalue();

		/**
		 * The meta object literal for the '{@link trace.impl.LiteralFloatImpl <em>Literal Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.LiteralFloatImpl
		 * @see trace.impl.TracePackageImpl#getLiteralFloat()
		 * @generated
		 */
		EClass LITERAL_FLOAT = eINSTANCE.getLiteralFloat();

		/**
		 * The meta object literal for the '<em><b>Floatvalue</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_FLOAT__FLOATVALUE = eINSTANCE.getLiteralFloat_Floatvalue();

		/**
		 * The meta object literal for the '{@link trace.impl.RepeatingStepImpl <em>Repeating Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.RepeatingStepImpl
		 * @see trace.impl.TracePackageImpl#getRepeatingStep()
		 * @generated
		 */
		EClass REPEATING_STEP = eINSTANCE.getRepeatingStep();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEATING_STEP__CHILDREN = eINSTANCE.getRepeatingStep_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEATING_STEP__PARENT = eINSTANCE.getRepeatingStep_Parent();

		/**
		 * The meta object literal for the '{@link trace.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.ParameterValueImpl
		 * @see trace.impl.TracePackageImpl#getParameterValue()
		 * @generated
		 */
		EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

		/**
		 * The meta object literal for the '<em><b>Direction Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE__DIRECTION_KIND = eINSTANCE.getParameterValue_DirectionKind();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE__VALUES = eINSTANCE.getParameterValue_Values();

		/**
		 * The meta object literal for the '{@link trace.impl.TransientObjectStateImpl <em>Transient Object State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.TransientObjectStateImpl
		 * @see trace.impl.TracePackageImpl#getTransientObjectState()
		 * @generated
		 */
		EClass TRANSIENT_OBJECT_STATE = eINSTANCE.getTransientObjectState();

		/**
		 * The meta object literal for the '<em><b>Transientobject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIENT_OBJECT_STATE__TRANSIENTOBJECT = eINSTANCE.getTransientObjectState_Transientobject();

		/**
		 * The meta object literal for the '<em><b>Objectstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIENT_OBJECT_STATE__OBJECTSTATE = eINSTANCE.getTransientObjectState_Objectstate();

		/**
		 * The meta object literal for the '<em><b>Estructuralfeature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIENT_OBJECT_STATE__ESTRUCTURALFEATURE = eINSTANCE.getTransientObjectState_Estructuralfeature();

		/**
		 * The meta object literal for the '{@link trace.impl.LeafObjectStateImpl <em>Leaf Object State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.LeafObjectStateImpl
		 * @see trace.impl.TracePackageImpl#getLeafObjectState()
		 * @generated
		 */
		EClass LEAF_OBJECT_STATE = eINSTANCE.getLeafObjectState();

		/**
		 * The meta object literal for the '{@link trace.impl.CompositeObjectStateImpl <em>Composite Object State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.CompositeObjectStateImpl
		 * @see trace.impl.TracePackageImpl#getCompositeObjectState()
		 * @generated
		 */
		EClass COMPOSITE_OBJECT_STATE = eINSTANCE.getCompositeObjectState();

		/**
		 * The meta object literal for the '<em><b>Objectstates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_OBJECT_STATE__OBJECTSTATES = eINSTANCE.getCompositeObjectState_Objectstates();

		/**
		 * The meta object literal for the '<em><b>Objectstates Order</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_OBJECT_STATE__OBJECTSTATES_ORDER = eINSTANCE.getCompositeObjectState_ObjectstatesOrder();

		/**
		 * The meta object literal for the '{@link trace.impl.StaticTransientObjectImpl <em>Static Transient Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.StaticTransientObjectImpl
		 * @see trace.impl.TracePackageImpl#getStaticTransientObject()
		 * @generated
		 */
		EClass STATIC_TRANSIENT_OBJECT = eINSTANCE.getStaticTransientObject();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_TRANSIENT_OBJECT__ORIGINAL_OBJECT = eINSTANCE.getStaticTransientObject_OriginalObject();

		/**
		 * The meta object literal for the '{@link trace.impl.DynamicTransientObjectImpl <em>Dynamic Transient Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.DynamicTransientObjectImpl
		 * @see trace.impl.TracePackageImpl#getDynamicTransientObject()
		 * @generated
		 */
		EClass DYNAMIC_TRANSIENT_OBJECT = eINSTANCE.getDynamicTransientObject();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_TRANSIENT_OBJECT__TYPE = eINSTANCE.getDynamicTransientObject_Type();

		/**
		 * The meta object literal for the '{@link trace.impl.CompositParameterListImpl <em>Composit Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.CompositParameterListImpl
		 * @see trace.impl.TracePackageImpl#getCompositParameterList()
		 * @generated
		 */
		EClass COMPOSIT_PARAMETER_LIST = eINSTANCE.getCompositParameterList();

		/**
		 * The meta object literal for the '<em><b>Parameterlist</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSIT_PARAMETER_LIST__PARAMETERLIST = eINSTANCE.getCompositParameterList_Parameterlist();

		/**
		 * The meta object literal for the '<em><b>Paramtervalues Order</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSIT_PARAMETER_LIST__PARAMTERVALUES_ORDER = eINSTANCE.getCompositParameterList_ParamtervaluesOrder();

		/**
		 * The meta object literal for the '{@link trace.impl.LeafParameterListImpl <em>Leaf Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.LeafParameterListImpl
		 * @see trace.impl.TracePackageImpl#getLeafParameterList()
		 * @generated
		 */
		EClass LEAF_PARAMETER_LIST = eINSTANCE.getLeafParameterList();

		/**
		 * The meta object literal for the '{@link trace.impl.ParameterListImpl <em>Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.ParameterListImpl
		 * @see trace.impl.TracePackageImpl#getParameterList()
		 * @generated
		 */
		EClass PARAMETER_LIST = eINSTANCE.getParameterList();

		/**
		 * The meta object literal for the '<em><b>Parametervalue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_LIST__PARAMETERVALUE = eINSTANCE.getParameterList_Parametervalue();

		/**
		 * The meta object literal for the '{@link trace.ParamterKindEnum <em>Paramter Kind Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.ParamterKindEnum
		 * @see trace.impl.TracePackageImpl#getParamterKindEnum()
		 * @generated
		 */
		EEnum PARAMTER_KIND_ENUM = eINSTANCE.getParamterKindEnum();

	}

} //TracePackage
