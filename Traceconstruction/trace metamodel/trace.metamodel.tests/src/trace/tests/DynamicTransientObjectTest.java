/**
 */
package trace.tests;

import junit.textui.TestRunner;

import trace.DynamicTransientObject;
import trace.TraceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dynamic Transient Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicTransientObjectTest extends TransientObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DynamicTransientObjectTest.class);
	}

	/**
	 * Constructs a new Dynamic Transient Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicTransientObjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dynamic Transient Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DynamicTransientObject getFixture() {
		return (DynamicTransientObject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceFactory.eINSTANCE.createDynamicTransientObject());
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

} //DynamicTransientObjectTest
