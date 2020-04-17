/**
 */
package qualitypatternmodel.adaptionxml.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionxml.AdaptionxmlFactory;
import qualitypatternmodel.adaptionxml.XMLReference;

import qualitypatternmodel.graphstructure.tests.RelationTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XML Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.XMLReference#isTranslatable() <em>Is Translatable</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class XMLReferenceTest extends RelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XMLReferenceTest.class);
	}

	/**
	 * Constructs a new XML Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XML Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XMLReference getFixture() {
		return (XMLReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionxmlFactory.eINSTANCE.createXMLReference());
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

	/**
	 * Tests the '{@link qualitypatternmodel.adaptionxml.XMLReference#isTranslatable() <em>Is Translatable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionxml.XMLReference#isTranslatable()
	 * @generated
	 */
	public void testIsTranslatable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //XMLReferenceTest
