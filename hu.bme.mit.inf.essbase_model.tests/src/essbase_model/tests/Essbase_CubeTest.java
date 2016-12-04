/**
 */
package essbase_model.tests;

import essbase_model.Essbase_Cube;
import essbase_model.Essbase_modelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Essbase Cube</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Essbase_CubeTest extends TestCase {

	/**
	 * The fixture for this Essbase Cube test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Essbase_Cube fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Essbase_CubeTest.class);
	}

	/**
	 * Constructs a new Essbase Cube test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Essbase_CubeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Essbase Cube test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Essbase_Cube fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Essbase Cube test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Essbase_Cube getFixture() {
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
		setFixture(Essbase_modelFactory.eINSTANCE.createEssbase_Cube());
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

} //Essbase_CubeTest
