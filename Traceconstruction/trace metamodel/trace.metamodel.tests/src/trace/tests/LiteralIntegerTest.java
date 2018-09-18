/**
 */
package trace.tests;

import junit.textui.TestRunner;

import trace.LiteralInteger;
import trace.TraceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Literal Integer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiteralIntegerTest extends LiteralValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LiteralIntegerTest.class);
	}

	/**
	 * Constructs a new Literal Integer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralIntegerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Literal Integer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LiteralInteger getFixture() {
		return (LiteralInteger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceFactory.eINSTANCE.createLiteralInteger());
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

} //LiteralIntegerTest
