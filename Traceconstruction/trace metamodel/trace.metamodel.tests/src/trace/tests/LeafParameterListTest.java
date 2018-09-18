/**
 */
package trace.tests;

import junit.textui.TestRunner;

import trace.LeafParameterList;
import trace.TraceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Leaf Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeafParameterListTest extends ParameterListTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LeafParameterListTest.class);
	}

	/**
	 * Constructs a new Leaf Parameter List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafParameterListTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Leaf Parameter List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LeafParameterList getFixture() {
		return (LeafParameterList)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceFactory.eINSTANCE.createLeafParameterList());
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

} //LeafParameterListTest
