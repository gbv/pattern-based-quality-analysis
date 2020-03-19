/**
 *
 * $Id$
 */
package qualitypatternmodel.parameters.validation;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.functions.ComparisonOperator;

/**
 * A sample validator interface for {@link qualitypatternmodel.parameters.ComparisonOptionParam}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ComparisonOptionParamValidator {
	boolean validate();

	boolean validateOptions(EList<ComparisonOperator> value);
	boolean validateValue(ComparisonOperator value);

	boolean validateComparison(Comparison value);

	boolean validateSelection(ComparisonOperator value);
}