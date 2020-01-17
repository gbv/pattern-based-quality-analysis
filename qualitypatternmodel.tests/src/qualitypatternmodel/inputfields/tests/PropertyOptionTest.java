/**
 */
package qualitypatternmodel.inputfields.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.inputfields.InputfieldsFactory;
import qualitypatternmodel.inputfields.PropertyOption;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyOptionTest extends InputTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertyOptionTest.class);
	}

	/**
	 * Constructs a new Property Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyOptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Property Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PropertyOption getFixture() {
		return (PropertyOption)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InputfieldsFactory.eINSTANCE.createPropertyOption());
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

} //PropertyOptionTest
