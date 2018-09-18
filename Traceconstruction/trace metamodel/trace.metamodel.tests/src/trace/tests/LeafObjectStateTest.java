/**
 */
package trace.tests;

import junit.textui.TestRunner;

import trace.LeafObjectState;
import trace.TraceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Leaf Object State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeafObjectStateTest extends ObjectStateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LeafObjectStateTest.class);
	}

	/**
	 * Constructs a new Leaf Object State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafObjectStateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Leaf Object State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LeafObjectState getFixture() {
		return (LeafObjectState)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceFactory.eINSTANCE.createLeafObjectState());
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

} //LeafObjectStateTest
