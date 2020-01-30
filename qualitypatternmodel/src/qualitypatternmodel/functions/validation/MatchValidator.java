/**
 *
 * $Id$
 */
package qualitypatternmodel.functions.validation;

import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.inputfields.BoolOption;
import qualitypatternmodel.inputfields.Text;
import qualitypatternmodel.inputfields.TextLiteral;

/**
 * A sample validator interface for {@link qualitypatternmodel.functions.Match}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MatchValidator {
	boolean validate();

	boolean validateProperty(Property value);
	boolean validateRegularExpression(TextLiteral value);

	boolean validateRegularExpression(Text value);
	boolean validateOption(qualitypatternmodel.inputfields.Boolean value);

	boolean validateOption(BoolOption value);
}
