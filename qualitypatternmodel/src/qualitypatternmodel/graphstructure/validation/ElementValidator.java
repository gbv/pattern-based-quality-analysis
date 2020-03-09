/**
 *
 * $Id$
 */
package qualitypatternmodel.graphstructure.validation;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.functions.BooleanOperator;

import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;

/**
 * A sample validator interface for {@link qualitypatternmodel.graphstructure.Element}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ElementValidator {
	boolean validate();

	boolean validatePredicates(EList<BooleanOperator> value);
	boolean validateRelationFromPrevious(Relation value);
	boolean validateTranslated(boolean value);

	boolean validateRoot(boolean value);

	boolean validateIsTranslated(boolean value);
	boolean validateIsRoot(boolean value);
	boolean validateProperties(EList<Property> value);

	boolean validatePredicatesAreBeingTranslated(boolean value);

	boolean validateName(String value);

	boolean validateGetAllElements(EList<Element> value);

	boolean validateGetAllRelations(EList<Relation> value);
}
