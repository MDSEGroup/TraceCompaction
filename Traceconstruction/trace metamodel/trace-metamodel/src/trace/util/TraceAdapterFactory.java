/**
 */
package trace.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import trace.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see trace.TracePackage
 * @generated
 */
public class TraceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TracePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TracePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceSwitch<Adapter> modelSwitch =
		new TraceSwitch<Adapter>() {
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseTransientObject(TransientObject object) {
				return createTransientObjectAdapter();
			}
			@Override
			public Adapter caseTrace(Trace object) {
				return createTraceAdapter();
			}
			@Override
			public Adapter caseLiteralValue(LiteralValue object) {
				return createLiteralValueAdapter();
			}
			@Override
			public Adapter caseObjectState(ObjectState object) {
				return createObjectStateAdapter();
			}
			@Override
			public Adapter caseRefValue(RefValue object) {
				return createRefValueAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseNormalStep(NormalStep object) {
				return createNormalStepAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseStepType(StepType object) {
				return createStepTypeAdapter();
			}
			@Override
			public Adapter casePatternOcurrence(PatternOcurrence object) {
				return createPatternOcurrenceAdapter();
			}
			@Override
			public Adapter caseStepPattern(StepPattern object) {
				return createStepPatternAdapter();
			}
			@Override
			public Adapter casePatternOccurrenceStepData(PatternOccurrenceStepData object) {
				return createPatternOccurrenceStepDataAdapter();
			}
			@Override
			public Adapter caseStepSpec(StepSpec object) {
				return createStepSpecAdapter();
			}
			@Override
			public Adapter caseLiteralString(LiteralString object) {
				return createLiteralStringAdapter();
			}
			@Override
			public Adapter caseLiteralBoolean(LiteralBoolean object) {
				return createLiteralBooleanAdapter();
			}
			@Override
			public Adapter caseLiteralInteger(LiteralInteger object) {
				return createLiteralIntegerAdapter();
			}
			@Override
			public Adapter caseLiteralFloat(LiteralFloat object) {
				return createLiteralFloatAdapter();
			}
			@Override
			public Adapter caseRepeatingStep(RepeatingStep object) {
				return createRepeatingStepAdapter();
			}
			@Override
			public Adapter caseParameterValue(ParameterValue object) {
				return createParameterValueAdapter();
			}
			@Override
			public Adapter caseTransientObjectState(TransientObjectState object) {
				return createTransientObjectStateAdapter();
			}
			@Override
			public Adapter caseLeafObjectState(LeafObjectState object) {
				return createLeafObjectStateAdapter();
			}
			@Override
			public Adapter caseCompositeObjectState(CompositeObjectState object) {
				return createCompositeObjectStateAdapter();
			}
			@Override
			public Adapter caseStaticTransientObject(StaticTransientObject object) {
				return createStaticTransientObjectAdapter();
			}
			@Override
			public Adapter caseDynamicTransientObject(DynamicTransientObject object) {
				return createDynamicTransientObjectAdapter();
			}
			@Override
			public Adapter caseCompositParameterList(CompositParameterList object) {
				return createCompositParameterListAdapter();
			}
			@Override
			public Adapter caseLeafParameterList(LeafParameterList object) {
				return createLeafParameterListAdapter();
			}
			@Override
			public Adapter caseParameterList(ParameterList object) {
				return createParameterListAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link trace.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.TransientObject <em>Transient Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.TransientObject
	 * @generated
	 */
	public Adapter createTransientObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.Trace
	 * @generated
	 */
	public Adapter createTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.LiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.LiteralValue
	 * @generated
	 */
	public Adapter createLiteralValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.ObjectState <em>Object State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.ObjectState
	 * @generated
	 */
	public Adapter createObjectStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.RefValue <em>Ref Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.RefValue
	 * @generated
	 */
	public Adapter createRefValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.NormalStep <em>Normal Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.NormalStep
	 * @generated
	 */
	public Adapter createNormalStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.StepType <em>Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.StepType
	 * @generated
	 */
	public Adapter createStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.PatternOcurrence <em>Pattern Ocurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.PatternOcurrence
	 * @generated
	 */
	public Adapter createPatternOcurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.StepPattern <em>Step Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.StepPattern
	 * @generated
	 */
	public Adapter createStepPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.PatternOccurrenceStepData <em>Pattern Occurrence Step Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.PatternOccurrenceStepData
	 * @generated
	 */
	public Adapter createPatternOccurrenceStepDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.StepSpec <em>Step Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.StepSpec
	 * @generated
	 */
	public Adapter createStepSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.LiteralString
	 * @generated
	 */
	public Adapter createLiteralStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.LiteralBoolean
	 * @generated
	 */
	public Adapter createLiteralBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.LiteralInteger
	 * @generated
	 */
	public Adapter createLiteralIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.LiteralFloat <em>Literal Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.LiteralFloat
	 * @generated
	 */
	public Adapter createLiteralFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.RepeatingStep <em>Repeating Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.RepeatingStep
	 * @generated
	 */
	public Adapter createRepeatingStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.ParameterValue
	 * @generated
	 */
	public Adapter createParameterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.TransientObjectState <em>Transient Object State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.TransientObjectState
	 * @generated
	 */
	public Adapter createTransientObjectStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.LeafObjectState <em>Leaf Object State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.LeafObjectState
	 * @generated
	 */
	public Adapter createLeafObjectStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.CompositeObjectState <em>Composite Object State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.CompositeObjectState
	 * @generated
	 */
	public Adapter createCompositeObjectStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.StaticTransientObject <em>Static Transient Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.StaticTransientObject
	 * @generated
	 */
	public Adapter createStaticTransientObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.DynamicTransientObject <em>Dynamic Transient Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.DynamicTransientObject
	 * @generated
	 */
	public Adapter createDynamicTransientObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.CompositParameterList <em>Composit Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.CompositParameterList
	 * @generated
	 */
	public Adapter createCompositParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.LeafParameterList <em>Leaf Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.LeafParameterList
	 * @generated
	 */
	public Adapter createLeafParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trace.ParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trace.ParameterList
	 * @generated
	 */
	public Adapter createParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TraceAdapterFactory
