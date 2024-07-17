/**
 *
 * $Id$
 */
package qualitypatternmodel.adaptionxml.validation;

import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.graphstructure.ReturnType;

/**
 * A sample validator interface for {@link qualitypatternmodel.adaptionxml.XmlReference}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface XmlReferenceValidator {
	boolean validate();

	boolean validateType(ReturnType value);
	boolean validateTargetProperty(XmlProperty value);
	boolean validateSourceProperty(XmlProperty value);
}
