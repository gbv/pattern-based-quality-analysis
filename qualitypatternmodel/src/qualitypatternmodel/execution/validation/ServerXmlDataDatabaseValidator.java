/**
 *
 * $Id$
 */
package qualitypatternmodel.execution.validation;

import qualitypatternmodel.execution.BaseXClient;
import qualitypatternmodel.execution.impl.BaseXClientImpl;


/**
 * A sample validator interface for {@link qualitypatternmodel.execution.ServerXmlDataDatabase}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ServerXmlDataDatabaseValidator {
	boolean validate();

	boolean validateBaseXClient(BaseXClient value);

	boolean validateBaseXClient(BaseXClientImpl value);

}
