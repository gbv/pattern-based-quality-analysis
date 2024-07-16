/**
 *
 * $Id$
 */
package qualitypatternmodel.parameters.validation;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.textrepresentation.ParameterReference;

/**
 * A sample validator interface for {@link qualitypatternmodel.parameters.Parameter}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ParameterValidator {
	boolean validate();

	boolean validateParameterList(ParameterList value);

	boolean validateVariableList(ParameterList value);
	boolean validateDescription(String value);
	boolean validatePredefined(boolean value);

	boolean validateParameterReferences(EList<ParameterReference> value);

	boolean validateParameterFragments(EList<ParameterReference> value);

	boolean validateIsPredefined(boolean value);
}
