/**
 */
package xPPU.StructureRepository.tests;

import junit.textui.TestRunner;

import xPPU.StructureRepository.LogicalWiring;
import xPPU.StructureRepository.StructureRepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Logical Wiring</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalWiringTest extends StructureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LogicalWiringTest.class);
	}

	/**
	 * Constructs a new Logical Wiring test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalWiringTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Logical Wiring test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LogicalWiring getFixture() {
		return (LogicalWiring)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StructureRepositoryFactory.eINSTANCE.createLogicalWiring());
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

} //LogicalWiringTest
