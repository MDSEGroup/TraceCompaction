/**
 */
package org.gemoc.sample.tfsm.sequential.xtfsm.tfsm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TfsmFactory
 * @model kind="package"
 * @generated
 */
public interface TfsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tfsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xtfsm/tfsm/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gemoc.sample.tfsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TfsmPackage eINSTANCE = org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.NamedElementImpl
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TFSMImpl <em>TFSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TFSMImpl
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getTFSM()
	 * @generated
	 */
	int TFSM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__OWNED_STATES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__INITIAL_STATE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Local Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__LOCAL_EVENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Local Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__LOCAL_CLOCK = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__OWNED_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__CURRENT_STATE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Step Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__STEP_NUMBER = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Last State Change Step Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__LAST_STATE_CHANGE_STEP_NUMBER = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>TFSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.StateImpl
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owning FSM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNING_FSM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TransitionImpl
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OWNED_GUARD = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generated Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GENERATED_EVENTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.GuardImpl
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TemporalGuardImpl <em>Temporal Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TemporalGuardImpl
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getTemporalGuard()
	 * @generated
	 */
	int TEMPORAL_GUARD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD__NAME = GUARD__NAME;

	/**
	 * The feature id for the '<em><b>On Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD__ON_CLOCK = GUARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>After Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD__AFTER_DURATION = GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temporal Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.EventGuardImpl <em>Event Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.EventGuardImpl
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getEventGuard()
	 * @generated
	 */
	int EVENT_GUARD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARD__NAME = GUARD__NAME;

	/**
	 * The feature id for the '<em><b>Triggering Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARD__TRIGGERING_EVENT = GUARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.FSMEventImpl <em>FSM Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.FSMEventImpl
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getFSMEvent()
	 * @generated
	 */
	int FSM_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_EVENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Solliciting Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_EVENT__SOLLICITING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_EVENT__IS_TRIGGERED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FSM Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.FSMClockImpl <em>FSM Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.FSMClockImpl
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getFSMClock()
	 * @generated
	 */
	int FSM_CLOCK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CLOCK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Number Of Ticks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CLOCK__NUMBER_OF_TICKS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FSM Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CLOCK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TimedSystemImpl <em>Timed System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TimedSystemImpl
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getTimedSystem()
	 * @generated
	 */
	int TIMED_SYSTEM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SYSTEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tfsms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SYSTEM__TFSMS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Global Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SYSTEM__GLOBAL_CLOCKS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Global Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SYSTEM__GLOBAL_EVENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timed System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SYSTEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.EvaluateGuardImpl <em>Evaluate Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.EvaluateGuardImpl
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getEvaluateGuard()
	 * @generated
	 */
	int EVALUATE_GUARD = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD__NAME = GUARD__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD__CONDITION = GUARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluate Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM <em>TFSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFSM</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM
	 * @generated
	 */
	EClass getTFSM();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM#getOwnedStates <em>Owned States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned States</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM#getOwnedStates()
	 * @see #getTFSM()
	 * @generated
	 */
	EReference getTFSM_OwnedStates();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM#getInitialState()
	 * @see #getTFSM()
	 * @generated
	 */
	EReference getTFSM_InitialState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM#getLocalEvents <em>Local Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Events</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM#getLocalEvents()
	 * @see #getTFSM()
	 * @generated
	 */
	EReference getTFSM_LocalEvents();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM#getLocalClock <em>Local Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Clock</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM#getLocalClock()
	 * @see #getTFSM()
	 * @generated
	 */
	EReference getTFSM_LocalClock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM#getOwnedTransitions <em>Owned Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Transitions</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM#getOwnedTransitions()
	 * @see #getTFSM()
	 * @generated
	 */
	EReference getTFSM_OwnedTransitions();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM#getCurrentState()
	 * @see #getTFSM()
	 * @generated
	 */
	EReference getTFSM_CurrentState();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM#getStepNumber <em>Step Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Number</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM#getStepNumber()
	 * @see #getTFSM()
	 * @generated
	 */
	EAttribute getTFSM_StepNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM#getLastStateChangeStepNumber <em>Last State Change Step Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last State Change Step Number</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TFSM#getLastStateChangeStepNumber()
	 * @see #getTFSM()
	 * @generated
	 */
	EAttribute getTFSM_LastStateChangeStepNumber();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the container reference '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning FSM</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.State#getOwningFSM()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OwningFSM();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.State#getOutgoingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.State#getIncomingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingTransitions();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Transition#getOwnedGuard <em>Owned Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Guard</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Transition#getOwnedGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_OwnedGuard();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Transition#getGeneratedEvents <em>Generated Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generated Events</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Transition#getGeneratedEvents()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_GeneratedEvents();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Action();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TemporalGuard <em>Temporal Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Guard</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TemporalGuard
	 * @generated
	 */
	EClass getTemporalGuard();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TemporalGuard#getOnClock <em>On Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Clock</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TemporalGuard#getOnClock()
	 * @see #getTemporalGuard()
	 * @generated
	 */
	EReference getTemporalGuard_OnClock();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TemporalGuard#getAfterDuration <em>After Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After Duration</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TemporalGuard#getAfterDuration()
	 * @see #getTemporalGuard()
	 * @generated
	 */
	EAttribute getTemporalGuard_AfterDuration();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.EventGuard <em>Event Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Guard</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.EventGuard
	 * @generated
	 */
	EClass getEventGuard();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.EventGuard#getTriggeringEvent <em>Triggering Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggering Event</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.EventGuard#getTriggeringEvent()
	 * @see #getEventGuard()
	 * @generated
	 */
	EReference getEventGuard_TriggeringEvent();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.FSMEvent <em>FSM Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM Event</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.FSMEvent
	 * @generated
	 */
	EClass getFSMEvent();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.FSMEvent#getSollicitingTransitions <em>Solliciting Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solliciting Transitions</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.FSMEvent#getSollicitingTransitions()
	 * @see #getFSMEvent()
	 * @generated
	 */
	EReference getFSMEvent_SollicitingTransitions();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.FSMEvent#isIsTriggered <em>Is Triggered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Triggered</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.FSMEvent#isIsTriggered()
	 * @see #getFSMEvent()
	 * @generated
	 */
	EAttribute getFSMEvent_IsTriggered();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.FSMClock <em>FSM Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM Clock</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.FSMClock
	 * @generated
	 */
	EClass getFSMClock();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.FSMClock#getNumberOfTicks <em>Number Of Ticks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Ticks</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.FSMClock#getNumberOfTicks()
	 * @see #getFSMClock()
	 * @generated
	 */
	EAttribute getFSMClock_NumberOfTicks();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TimedSystem <em>Timed System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed System</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TimedSystem
	 * @generated
	 */
	EClass getTimedSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TimedSystem#getTfsms <em>Tfsms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tfsms</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TimedSystem#getTfsms()
	 * @see #getTimedSystem()
	 * @generated
	 */
	EReference getTimedSystem_Tfsms();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TimedSystem#getGlobalClocks <em>Global Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Clocks</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TimedSystem#getGlobalClocks()
	 * @see #getTimedSystem()
	 * @generated
	 */
	EReference getTimedSystem_GlobalClocks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TimedSystem#getGlobalEvents <em>Global Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Events</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.TimedSystem#getGlobalEvents()
	 * @see #getTimedSystem()
	 * @generated
	 */
	EReference getTimedSystem_GlobalEvents();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.EvaluateGuard <em>Evaluate Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluate Guard</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.EvaluateGuard
	 * @generated
	 */
	EClass getEvaluateGuard();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.EvaluateGuard#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.EvaluateGuard#getCondition()
	 * @see #getEvaluateGuard()
	 * @generated
	 */
	EAttribute getEvaluateGuard_Condition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TfsmFactory getTfsmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TFSMImpl <em>TFSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TFSMImpl
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getTFSM()
		 * @generated
		 */
		EClass TFSM = eINSTANCE.getTFSM();

		/**
		 * The meta object literal for the '<em><b>Owned States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFSM__OWNED_STATES = eINSTANCE.getTFSM_OwnedStates();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFSM__INITIAL_STATE = eINSTANCE.getTFSM_InitialState();

		/**
		 * The meta object literal for the '<em><b>Local Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFSM__LOCAL_EVENTS = eINSTANCE.getTFSM_LocalEvents();

		/**
		 * The meta object literal for the '<em><b>Local Clock</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFSM__LOCAL_CLOCK = eINSTANCE.getTFSM_LocalClock();

		/**
		 * The meta object literal for the '<em><b>Owned Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFSM__OWNED_TRANSITIONS = eINSTANCE.getTFSM_OwnedTransitions();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFSM__CURRENT_STATE = eINSTANCE.getTFSM_CurrentState();

		/**
		 * The meta object literal for the '<em><b>Step Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFSM__STEP_NUMBER = eINSTANCE.getTFSM_StepNumber();

		/**
		 * The meta object literal for the '<em><b>Last State Change Step Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFSM__LAST_STATE_CHANGE_STEP_NUMBER = eINSTANCE.getTFSM_LastStateChangeStepNumber();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.StateImpl
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Owning FSM</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OWNING_FSM = eINSTANCE.getState_OwningFSM();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING_TRANSITIONS = eINSTANCE.getState_IncomingTransitions();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TransitionImpl
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Owned Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OWNED_GUARD = eINSTANCE.getTransition_OwnedGuard();

		/**
		 * The meta object literal for the '<em><b>Generated Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GENERATED_EVENTS = eINSTANCE.getTransition_GeneratedEvents();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ACTION = eINSTANCE.getTransition_Action();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.NamedElementImpl
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.GuardImpl
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TemporalGuardImpl <em>Temporal Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TemporalGuardImpl
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getTemporalGuard()
		 * @generated
		 */
		EClass TEMPORAL_GUARD = eINSTANCE.getTemporalGuard();

		/**
		 * The meta object literal for the '<em><b>On Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_GUARD__ON_CLOCK = eINSTANCE.getTemporalGuard_OnClock();

		/**
		 * The meta object literal for the '<em><b>After Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_GUARD__AFTER_DURATION = eINSTANCE.getTemporalGuard_AfterDuration();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.EventGuardImpl <em>Event Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.EventGuardImpl
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getEventGuard()
		 * @generated
		 */
		EClass EVENT_GUARD = eINSTANCE.getEventGuard();

		/**
		 * The meta object literal for the '<em><b>Triggering Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_GUARD__TRIGGERING_EVENT = eINSTANCE.getEventGuard_TriggeringEvent();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.FSMEventImpl <em>FSM Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.FSMEventImpl
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getFSMEvent()
		 * @generated
		 */
		EClass FSM_EVENT = eINSTANCE.getFSMEvent();

		/**
		 * The meta object literal for the '<em><b>Solliciting Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM_EVENT__SOLLICITING_TRANSITIONS = eINSTANCE.getFSMEvent_SollicitingTransitions();

		/**
		 * The meta object literal for the '<em><b>Is Triggered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSM_EVENT__IS_TRIGGERED = eINSTANCE.getFSMEvent_IsTriggered();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.FSMClockImpl <em>FSM Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.FSMClockImpl
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getFSMClock()
		 * @generated
		 */
		EClass FSM_CLOCK = eINSTANCE.getFSMClock();

		/**
		 * The meta object literal for the '<em><b>Number Of Ticks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSM_CLOCK__NUMBER_OF_TICKS = eINSTANCE.getFSMClock_NumberOfTicks();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TimedSystemImpl <em>Timed System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TimedSystemImpl
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getTimedSystem()
		 * @generated
		 */
		EClass TIMED_SYSTEM = eINSTANCE.getTimedSystem();

		/**
		 * The meta object literal for the '<em><b>Tfsms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_SYSTEM__TFSMS = eINSTANCE.getTimedSystem_Tfsms();

		/**
		 * The meta object literal for the '<em><b>Global Clocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_SYSTEM__GLOBAL_CLOCKS = eINSTANCE.getTimedSystem_GlobalClocks();

		/**
		 * The meta object literal for the '<em><b>Global Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_SYSTEM__GLOBAL_EVENTS = eINSTANCE.getTimedSystem_GlobalEvents();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.EvaluateGuardImpl <em>Evaluate Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.EvaluateGuardImpl
		 * @see org.gemoc.sample.tfsm.sequential.xtfsm.tfsm.impl.TfsmPackageImpl#getEvaluateGuard()
		 * @generated
		 */
		EClass EVALUATE_GUARD = eINSTANCE.getEvaluateGuard();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATE_GUARD__CONDITION = eINSTANCE.getEvaluateGuard_Condition();

	}

} //TfsmPackage
