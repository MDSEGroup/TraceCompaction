/**
 */
package trace.tests;

import junit.textui.TestRunner;

import trace.LiteralBoolean;
import trace.TraceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Literal Boolean</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiteralBooleanTest extends LiteralValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LiteralBooleanTest.class);
	}

	/**
	 * Constructs a new Literal Boolean test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralBooleanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Literal Boolean test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LiteralBoolean getFixture() {
		return (LiteralBoolean)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceFactory.eINSTANCE.createLiteralBoolean());
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

} //LiteralBooleanTest
