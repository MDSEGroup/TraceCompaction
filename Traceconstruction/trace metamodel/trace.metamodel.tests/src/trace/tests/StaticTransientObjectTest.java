/**
 */
package trace.tests;

import junit.textui.TestRunner;

import trace.StaticTransientObject;
import trace.TraceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Static Transient Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaticTransientObjectTest extends TransientObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StaticTransientObjectTest.class);
	}

	/**
	 * Constructs a new Static Transient Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticTransientObjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Static Transient Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StaticTransientObject getFixture() {
		return (StaticTransientObject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceFactory.eINSTANCE.createStaticTransientObject());
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

} //StaticTransientObjectTest
