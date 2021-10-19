/**
 *
 * $Id$
 */
package qualitypatternmodel.execution.validation;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.XmlSchemaDatabase;

/**
 * A sample validator interface for {@link qualitypatternmodel.execution.Databases}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DatabasesValidator {
	boolean validate();

	boolean validateXmlDatabases(EList<XmlDataDatabase> value);
	boolean validateXmlSchemata(EList<XmlSchemaDatabase> value);
}
