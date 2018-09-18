/**
 */
package trace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import trace.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceFactoryImpl extends EFactoryImpl implements TraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TraceFactory init() {
		try {
			TraceFactory theTraceFactory = (TraceFactory)EPackage.Registry.INSTANCE.getEFactory(TracePackage.eNS_URI);
			if (theTraceFactory != null) {
				return theTraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TracePackage.TRACE: return createTrace();
			case TracePackage.REF_VALUE: return createRefValue();
			case TracePackage.STATE: return createState();
			case TracePackage.NORMAL_STEP: return createNormalStep();
			case TracePackage.STEP_TYPE: return createStepType();
			case TracePackage.PATTERN_OCURRENCE: return createPatternOcurrence();
			case TracePackage.STEP_PATTERN: return createStepPattern();
			case TracePackage.PATTERN_OCCURRENCE_STEP_DATA: return createPatternOccurrenceStepData();
			case TracePackage.LITERAL_STRING: return createLiteralString();
			case TracePackage.LITERAL_BOOLEAN: return createLiteralBoolean();
			case TracePackage.LITERAL_INTEGER: return createLiteralInteger();
			case TracePackage.LITERAL_FLOAT: return createLiteralFloat();
			case TracePackage.REPEATING_STEP: return createRepeatingStep();
			case TracePackage.PARAMETER_VALUE: return createParameterValue();
			case TracePackage.TRANSIENT_OBJECT_STATE: return createTransientObjectState();
			case TracePackage.LEAF_OBJECT_STATE: return createLeafObjectState();
			case TracePackage.COMPOSITE_OBJECT_STATE: return createCompositeObjectState();
			case TracePackage.STATIC_TRANSIENT_OBJECT: return createStaticTransientObject();
			case TracePackage.DYNAMIC_TRANSIENT_OBJECT: return createDynamicTransientObject();
			case TracePackage.COMPOSIT_PARAMETER_LIST: return createCompositParameterList();
			case TracePackage.LEAF_PARAMETER_LIST: return createLeafParameterList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TracePackage.PARAMTER_KIND_ENUM:
				return createParamterKindEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TracePackage.PARAMTER_KIND_ENUM:
				return convertParamterKindEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefValue createRefValue() {
		RefValueImpl refValue = new RefValueImpl();
		return refValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalStep createNormalStep() {
		NormalStepImpl normalStep = new NormalStepImpl();
		return normalStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepType createStepType() {
		StepTypeImpl stepType = new StepTypeImpl();
		return stepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternOcurrence createPatternOcurrence() {
		PatternOcurrenceImpl patternOcurrence = new PatternOcurrenceImpl();
		return patternOcurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepPattern createStepPattern() {
		StepPatternImpl stepPattern = new StepPatternImpl();
		return stepPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternOccurrenceStepData createPatternOccurrenceStepData() {
		PatternOccurrenceStepDataImpl patternOccurrenceStepData = new PatternOccurrenceStepDataImpl();
		return patternOccurrenceStepData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralString createLiteralString() {
		LiteralStringImpl literalString = new LiteralStringImpl();
		return literalString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralBoolean createLiteralBoolean() {
		LiteralBooleanImpl literalBoolean = new LiteralBooleanImpl();
		return literalBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralInteger createLiteralInteger() {
		LiteralIntegerImpl literalInteger = new LiteralIntegerImpl();
		return literalInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralFloat createLiteralFloat() {
		LiteralFloatImpl literalFloat = new LiteralFloatImpl();
		return literalFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatingStep createRepeatingStep() {
		RepeatingStepImpl repeatingStep = new RepeatingStepImpl();
		return repeatingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue createParameterValue() {
		ParameterValueImpl parameterValue = new ParameterValueImpl();
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientObjectState createTransientObjectState() {
		TransientObjectStateImpl transientObjectState = new TransientObjectStateImpl();
		return transientObjectState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafObjectState createLeafObjectState() {
		LeafObjectStateImpl leafObjectState = new LeafObjectStateImpl();
		return leafObjectState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeObjectState createCompositeObjectState() {
		CompositeObjectStateImpl compositeObjectState = new CompositeObjectStateImpl();
		return compositeObjectState;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticTransientObject createStaticTransientObject() {
		StaticTransientObjectImpl staticTransientObject = new StaticTransientObjectImpl();
		return staticTransientObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicTransientObject createDynamicTransientObject() {
		DynamicTransientObjectImpl dynamicTransientObject = new DynamicTransientObjectImpl();
		return dynamicTransientObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositParameterList createCompositParameterList() {
		CompositParameterListImpl compositParameterList = new CompositParameterListImpl();
		return compositParameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafParameterList createLeafParameterList() {
		LeafParameterListImpl leafParameterList = new LeafParameterListImpl();
		return leafParameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamterKindEnum createParamterKindEnumFromString(EDataType eDataType, String initialValue) {
		ParamterKindEnum result = ParamterKindEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParamterKindEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracePackage getTracePackage() {
		return (TracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TracePackage getPackage() {
		return TracePackage.eINSTANCE;
	}

} //TraceFactoryImpl
