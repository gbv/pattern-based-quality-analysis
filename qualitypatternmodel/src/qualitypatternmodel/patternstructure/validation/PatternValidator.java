/**
 *
 * $Id$
 */
package qualitypatternmodel.patternstructure.validation;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.inputfields.VariableList;
import qualitypatternmodel.patternstructure.Condition;

/**
 * A sample validator interface for {@link qualitypatternmodel.patternstructure.Pattern}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PatternValidator {
	boolean validate();

	boolean validateReturnGraph(Graph value);
	boolean validateCondition(Condition value);
	boolean validateElementCounter(int value);

	boolean validateName(String value);

	boolean validateVariableList(VariableList value);

	boolean validateCheckMorphismOfNextGraph(boolean value);
}
