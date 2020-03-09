/**
 *
 * $Id$
 */
package qualitypatternmodel.inputfields.validation;

import qualitypatternmodel.functions.Match;
import qualitypatternmodel.graphstructure.Property;


/**
 * A sample validator interface for {@link qualitypatternmodel.inputfields.TextLiteral}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TextLiteralValidator {
	boolean validate();

	boolean validateValue(String value);

	boolean validateMatch(Match value);

	boolean validateProperty(Property value);
}
