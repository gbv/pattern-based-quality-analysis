/**
 *
 * $Id$
 */
package qualitypatternmodel.graphstructure.validation;

import qualitypatternmodel.graphstructure.Axis;

import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.patternstructure.RelationMapping;

/**
 * A sample validator interface for {@link qualitypatternmodel.graphstructure.Relation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RelationValidator {
	boolean validate();

	boolean validateMappingFrom(RelationMapping value);
	boolean validateMappingTo(RelationMapping value);
	boolean validateAxis(Axis value);
	boolean validateRelationTo(Element value);

	boolean validateGraphDepth(int value);
}
