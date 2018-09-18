/**
 */
package trace.tests;

import junit.textui.TestRunner;

import trace.CompositeObjectState;
import trace.TraceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composite Object State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeObjectStateTest extends ObjectStateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositeObjectStateTest.class);
	}

	/**
	 * Constructs a new Composite Object State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeObjectStateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Composite Object State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompositeObjectState getFixture() {
		return (CompositeObjectState)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceFactory.eINSTANCE.createCompositeObjectState());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CompositeObjectStateTest
