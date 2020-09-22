/**
 *
 * $Id$
 */
package qualitypatternmodel.operators.validation;

import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.parameters.TextLiteralParam;

/**
 * A sample validator interface for {@link qualitypatternmodel.operators.Match}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MatchValidator {
	boolean validate();

	boolean validateProperty(Property value);
	boolean validateRegularExpression(TextLiteralParam value);

	boolean validateOption(qualitypatternmodel.parameters.BooleanParam value);
}
