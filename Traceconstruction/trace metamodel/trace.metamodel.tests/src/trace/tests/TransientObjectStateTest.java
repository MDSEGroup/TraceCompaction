/**
 */
package trace.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import trace.TraceFactory;
import trace.TransientObjectState;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transient Object State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransientObjectStateTest extends TestCase {

	/**
	 * The fixture for this Transient Object State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransientObjectState fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransientObjectStateTest.class);
	}

	/**
	 * Constructs a new Transient Object State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientObjectStateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Transient Object State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TransientObjectState fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Transient Object State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransientObjectState getFixture() {
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
		setFixture(TraceFactory.eINSTANCE.createTransientObjectState());
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

} //TransientObjectStateTest
