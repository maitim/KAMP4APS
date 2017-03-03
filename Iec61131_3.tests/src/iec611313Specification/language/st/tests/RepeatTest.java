/**
 */
package iec611313Specification.language.st.tests;

import iec611313Specification.language.st.Repeat;
import iec611313Specification.language.st.StFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepeatTest extends SimpleIterationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RepeatTest.class);
	}

	/**
	 * Constructs a new Repeat test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Repeat test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Repeat getFixture() {
		return (Repeat)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StFactory.eINSTANCE.createRepeat());
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

} //RepeatTest
