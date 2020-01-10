/**
 *
 * $Id$
 */
package qualitypatternmodel.inputfields.validation;

import qualitypatternmodel.patternstructure.VariableList;

/**
 * A sample validator interface for {@link qualitypatternmodel.inputfields.Input}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InputValidator {
	boolean validate();

	boolean validateVariableList(VariableList value);
	boolean validateDescription(String value);
	boolean validateIsPredefined(boolean value);
}
