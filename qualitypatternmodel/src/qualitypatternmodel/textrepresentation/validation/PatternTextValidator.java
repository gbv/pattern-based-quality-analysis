/**
 *
 * $Id$
 */
package qualitypatternmodel.textrepresentation.validation;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.patternstructure.CompletePattern;

import qualitypatternmodel.textrepresentation.Fragment;
import qualitypatternmodel.textrepresentation.ParameterPredefinition;

/**
 * A sample validator interface for {@link qualitypatternmodel.textrepresentation.PatternText}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PatternTextValidator {
	boolean validate();

	boolean validatePattern(CompletePattern value);
	boolean validateTextfragment(EList<Fragment> value);
	boolean validateName(String value);
	boolean validateParameterPredefinitions(EList<ParameterPredefinition> value);
}
