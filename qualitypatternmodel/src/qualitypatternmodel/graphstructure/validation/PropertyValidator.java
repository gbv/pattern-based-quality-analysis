/**
 *
 * $Id$
 */
package qualitypatternmodel.graphstructure.validation;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.ReferenceOperator;
import qualitypatternmodel.parameters.PropertyOptionParam;
import qualitypatternmodel.parameters.TextParam;
import qualitypatternmodel.parameters.TextLiteralParam;

/**
 * A sample validator interface for {@link qualitypatternmodel.graphstructure.Property}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PropertyValidator {
	boolean validate();

	boolean validatePropertyOption(PropertyOptionParam value);
	boolean validateElement(Element value);
	boolean validateAttributeName(TextLiteralParam value);

	boolean validateOption(PropertyOptionParam value);

	boolean validateReferenceOperator2(ReferenceOperator value);

	boolean validateReferenceOperator(ReferenceOperator value);

	boolean validateMatch(EList<Match> value);

	boolean validateAttributeName(TextParam value);
}
