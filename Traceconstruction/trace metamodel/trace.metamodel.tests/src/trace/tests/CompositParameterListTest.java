/**
 */
package trace.tests;

import junit.textui.TestRunner;

import trace.CompositParameterList;
import trace.TraceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composit Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositParameterListTest extends ParameterListTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositParameterListTest.class);
	}

	/**
	 * Constructs a new Composit Parameter List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositParameterListTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Composit Parameter List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompositParameterList getFixture() {
		return (CompositParameterList)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceFactory.eINSTANCE.createCompositParameterList());
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

} //CompositParameterListTest
