/**
 *
 * $Id$
 */
package qualitypatternmodel.parameters.validation;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.operators.Match;


/**
 * A sample validator interface for {@link qualitypatternmodel.parameters.TextLiteralParam}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TextLiteralParamValidator {
	boolean validate();

	boolean validateValue(String value);

	boolean validateMatches(EList<Match> value);

	boolean validateProperties(EList<XmlProperty> value);

	boolean validateMatch(Match value);

	boolean validateProperty(PrimitiveNode value);
}
