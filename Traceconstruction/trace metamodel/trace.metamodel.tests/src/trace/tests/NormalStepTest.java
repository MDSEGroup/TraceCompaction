/**
 */
package trace.tests;

import junit.textui.TestRunner;

import trace.NormalStep;
import trace.TraceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Normal Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NormalStepTest extends StepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NormalStepTest.class);
	}

	/**
	 * Constructs a new Normal Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Normal Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NormalStep getFixture() {
		return (NormalStep)fixture;
	}

	/**
	 * Returns the fixture for this Normal Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	@Override
//	protected NormalStep getFixture() {
//		return (NormalStep)fixture;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceFactory.eINSTANCE.createNormalStep());
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

} //NormalStepTest
