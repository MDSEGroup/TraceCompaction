/**
 */
package trace.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import trace.ParameterValue;
import trace.TraceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterValueTest extends TestCase {

	/**
	 * The fixture for this Parameter Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValue fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParameterValueTest.class);
	}

	/**
	 * Constructs a new Parameter Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Parameter Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ParameterValue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Parameter Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValue getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceFactory.eINSTANCE.createParameterValue());
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

} //ParameterValueTest
