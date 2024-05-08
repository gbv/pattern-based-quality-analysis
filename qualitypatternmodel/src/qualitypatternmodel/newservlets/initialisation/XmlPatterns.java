package qualitypatternmodel.newservlets.initialisation;

import java.io.IOException;
import java.util.List;
import org.eclipse.emf.common.util.BasicEList;

import de.gwdg.metadataqa.api.configuration.ConfigurationReader;
import de.gwdg.metadataqa.api.schema.BaseSchema;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.constrainttranslation.ConstraintTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.ParameterPredefinition;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;
import qualitypatternmodel.textrepresentation.ValueMap;
import qualitypatternmodel.textrepresentation.impl.TextFragmentImpl;
import qualitypatternmodel.textrepresentation.impl.ValueMapImpl;
import qualitypatternmodel.utility.XmlPatternUtility;

public class XmlPatterns {
	
	static Boolean AXIS = true;
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		
		for (CompletePattern pattern: getAllXmlPattern()) {
			try {
				System.out.println("___" + pattern.getName() + "___");
				pattern.isValid(AbstractionLevel.ABSTRACT);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				XmlPatternUtility.fillParameterXml(pattern);
				pattern.getText().get(0).instantiate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				pattern.generateXQuery();
//				System.out.println(pattern.generateXQuery());
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				BaseSchema schema = ConstraintTranslation.translateToConstraintSchema(pattern);
				ConfigurationReader.toJson(schema);
//				System.out.println(ConfigurationReader.toJson(schema));
//				System.out.println(pattern);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			
		
//		CompletePattern completePattern = getXmlContains();
//		XmlPatternUtility.fillParameterXml(completePattern);
//		completePattern.getParameterList().getParameters().get(0).setValueFromString("false");
//		System.out.println(completePattern.getName());
//		System.out.println(completePattern.generateXQuery());
		
//	
//		int i=0;
//		for (Parameter p: completePattern.getParameterList().getParameters()){
//			System.out.println(p.getClass().getSimpleName().replace("Impl", "") + " p" + i + " = ((" + p.getClass().getSimpleName().replace("Impl", "") + ") params.get(" + i + "));");
//			i++;
//		}
		
//		for (Parameter p: getXmlMatch().getParameterList().getParameters())
//		for (Parameter p: getXmlInvalidLink().getParameterList().getParameters())
//			System.out.println(p.myToString());
//		int i = 0;
//		for (CompletePattern pattern: getAllXmlPattern()) {
//			System.out.println("Example " + i);
//			System.out.println(pattern.myToString());
//			System.out.println();
//		}
	}
	
	public static List<CompletePattern> getAllXmlPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		patterns.add(getXmlCard());
		patterns.add(getXmlMandAtt());
		patterns.add(getXmlMatch());
		patterns.add(getXmlContains());
		patterns.add(getXmlStringLength());
		patterns.add(getXmlCompSet());
		patterns.add(getXmlInvalidLink());
//		patterns.add(getXmlComp());
//		patterns.add(getXmlFunc());
		patterns.add(getXmlUnique());
//		patterns.add(getXmlAppdup3());
//		patterns.add(getXmlDupVal());
//		patterns.add(getXmlLocalUnique());
//		patterns.add(getXmlCompVal());
//		patterns.add(getXmlCardImpliesMandAtt());
//		patterns.add(getXmlCheckFormat());
//		patterns.add(getXmlCompDatabase());
//		patterns.add(getXmlCompValAny());
		
		return patterns;
	}
	
	public static CompletePattern getXmlCard() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericCard();
		pattern.createXmlAdaption();
		pattern.setPatternId("Card_xml");
		pattern.setAbstractId("Card_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();
		ComparisonOptionParam comp = (ComparisonOptionParam) params.get(0);
		NumberParam numb = (NumberParam) params.get(1);
		XmlPathParam path1 = (XmlPathParam) params.get(2);
		XmlPathParam path2 = (XmlPathParam) params.get(3);
		if (AXIS) {
			path1.setValueFromString("//*");
			path2.setValueFromString("/*");
		}
		
		{
			// Search for <records> that do have <less than> <1> <field>.
			PatternText variant = TextrepresentationFactory.eINSTANCE.createPatternText();
			variant.setName("default");
			pattern.getText().add(variant);
			
			variant.addFragment(new TextFragmentImpl("Search for"));
			{
				ParameterFragment frag1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag1.setId("xmlpath_rootToReturn");
				frag1.setExampleValue("architect");
				frag1.getParameter().add(path1);
				variant.addFragment(frag1);
			}
			variant.addFragment(new TextFragmentImpl("that do have"));
			{
				ParameterFragment frag2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag2.setId("comparison_operator");
				frag2.getParameter().add(comp);
				frag2.setComparisonOperatorValueMap();
				frag2.setExampleValue(frag2.getValueMap().get(ComparisonOperator.GREATER.getName()));
				variant.addFragment(frag2);			
			}
			{
				ParameterFragment frag3 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag3.setId("number");
				frag3.getParameter().add(numb);
				frag3.setExampleValue("1");
				variant.addFragment(frag3);
			}
			{
				ParameterFragment frag4 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag4.setId("xmlpath_returnToCondition");
				frag4.getParameter().add(path2);
				frag4.setExampleValue("year of birth");
				variant.addFragment(frag4);
			}
			variant.addFragment(new TextFragmentImpl("."));
		}
		{
			// Is there a <xmlpath_rootToReturn> with more than one <xmlpath_returnToCondition> element?
			PatternText variant1 = TextrepresentationFactory.eINSTANCE.createPatternText();
			variant1.setName("question_simple");
			pattern.getText().add(variant1);
			
			variant1.addFragment(new TextFragmentImpl("Is there a"));
			{
				ParameterFragment frag1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag1.setId("xmlpath_rootToReturn");
				frag1.setExampleValue("architect");
				frag1.getParameter().add(path1);
				variant1.addFragment(frag1);
			}
			variant1.addFragment(new TextFragmentImpl("with more than one"));
			{
				ParameterFragment frag2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag2.setId("xmlpath_returnToCondition");
				frag2.getParameter().add(path2);
				frag2.setExampleValue("year of birth");
				variant1.addFragment(frag2);
			}
			variant1.addFragment(new TextFragmentImpl("element?"));
			
			ParameterPredefinition predef1 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
			predef1.getParameter().add(comp);
			predef1.setValue(ComparisonOperator.GREATER.getName());
			
			
			ParameterPredefinition predef2 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
			predef2.getParameter().add(numb);
			predef2.setValue("1.");
			
			variant1.getParameterPredefinitions().add(predef1);
			variant1.getParameterPredefinitions().add(predef2);
			
//			System.out.println(variant1.getFragments().size());
//			System.out.println(variant1.generateJSON());
		}
		{
			// Is there a <xmlpath_rootToReturn (xpath, “building”, "//*[name() = 'demo:building']”> that has <comparison_operator (select, ["equal", "not equal", "less than", "more than", "less or equal to", "more or equal to"], "more than")> <number (integer, "one", "1")> <xmlpath_returnToCondition (xpath, "current place", "?"> ?
			PatternText variant2 = TextrepresentationFactory.eINSTANCE.createPatternText();
			variant2.setName("question");
			pattern.getText().add(variant2);
			
			variant2.addFragment(new TextFragmentImpl("Is there a"));
			{
				ParameterFragment frag1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag1.setId("xmlpath_rootToReturn");
				frag1.getParameter().add(path1);
				frag1.setExampleValue("building");
				variant2.addFragment(frag1);
			}
			variant2.addFragment(new TextFragmentImpl("that has"));
			{
				ParameterFragment frag2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag2.setId("comparison_operator");
				frag2.getParameter().add(comp);
				frag2.setComparisonOperatorValueMap();
				frag2.setExampleValue(frag2.getValueMap().get(ComparisonOperator.GREATER.getName()));
				variant2.addFragment(frag2);			
			}
			{
				ParameterFragment frag3 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag3.setId("number");
				frag3.getParameter().add(numb);
				frag3.setExampleValue("1");
				variant2.addFragment(frag3);
			}
			{
				ParameterFragment frag4 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag4.setId("xmlpath_returnToCondition");
				frag4.getParameter().add(path2);
				frag4.setExampleValue("current place");
				variant2.addFragment(frag4);
			}
			variant2.addFragment(new TextFragmentImpl("?"));
//			System.out.println(variant2.getFragments().size());
//			System.out.println(variant2.generateJSON());
		}

		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlMatch() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericMatch();
		pattern.createXmlAdaption();
		pattern.setPatternId("Match_xml");
		pattern.setAbstractId("Match_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();

		BooleanParam p0 = ((BooleanParam) params.get(0));
		TextLiteralParam p1 = ((TextLiteralParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		if (AXIS) {
			p2.setValueFromString("//*");
			p3.setValueFromString("/*/text()");
		}

		{
			// Search for <records> where any <field> does <not> match <regex>.
			PatternText variant1 = TextrepresentationFactory.eINSTANCE.createPatternText();
			variant1.setName("default");
			pattern.getText().add(variant1);
			
			variant1.addFragment(new TextFragmentImpl("Search for"));
			{
				ParameterFragment frag1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag1.setId("xmlpath_rootToReturn");
				frag1.setExampleValue("architect");
				frag1.getParameter().add(p2);
				variant1.addFragment(frag1);
			}
			variant1.addFragment(new TextFragmentImpl("where any"));
			{
				ParameterFragment frag2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag2.setId("xmlpath_returnToCondition");
				frag2.getParameter().add(p3);
				frag2.setExampleValue("year of birth");
				variant1.addFragment(frag2);
			}
			{
				ParameterFragment frag3 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag3.setId("negation");
				frag3.getParameter().add(p0);
				ValueMap map = new ValueMapImpl();
				map.put("true", "does");
				map.put("false", "does not");
				frag3.setValueMap(map);
				frag3.setExampleValue(map.get("true"));
				variant1.addFragment(frag3);
			}
			variant1.addFragment(new TextFragmentImpl("match"));
			{
				ParameterFragment frag4 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag4.setId("RegEx");
				frag4.getParameter().add(p1);
				frag4.setExampleValue("[0-9][0-9.]*");
				variant1.addFragment(frag4);
			}
			variant1.addFragment(new TextFragmentImpl("."));
		}
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlContains() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericContains();
		pattern.createXmlAdaption();
		pattern.setPatternId("Contains_xml");
		pattern.setAbstractId("Contains_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();
		BooleanParam p0 = ((BooleanParam) params.get(0));
		TextLiteralParam p1 = ((TextLiteralParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		if (AXIS) {
			p2.setValueFromString("//*");
			p3.setValueFromString("/*/text()");
		}
		
		{
			PatternText variant1 = TextrepresentationFactory.eINSTANCE.createPatternText();
			variant1.setName("default");
			pattern.getText().add(variant1);
			
			variant1.addFragment(new TextFragmentImpl("Search for"));
			{
				ParameterFragment frag1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag1.setId("xmlpath_rootToReturn");
				frag1.setExampleValue("architect");
				frag1.getParameter().add(p2);
				variant1.addFragment(frag1);
			}
			variant1.addFragment(new TextFragmentImpl("where at least one value in"));
			{
				ParameterFragment frag2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag2.setId("xmlpath_returnToCondition");
				frag2.getParameter().add(p3);
				frag2.setExampleValue("year of birth");
				variant1.addFragment(frag2);
			}
			{
				ParameterFragment frag3 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag3.setId("negation");
				frag3.getParameter().add(p0);
				ValueMap map = new ValueMapImpl();
				map.put("true", "does");
				map.put("false", "does not");
				frag3.setValueMap(map);
				frag3.setExampleValue(map.get("true"));
				variant1.addFragment(frag3);
			}
			variant1.addFragment(new TextFragmentImpl("contain"));
			{
				ParameterFragment frag4 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag4.setId("substring");
				frag4.getParameter().add(p1);
				frag4.setExampleValue("a");
				variant1.addFragment(frag4);
			}
			variant1.addFragment(new TextFragmentImpl("."));
		}
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlInvalidLink() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericInvalidLink();
		pattern.createXmlAdaption();
		pattern.setPatternId("InvalidLink_xml");
		pattern.setAbstractId("InvalidLink_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();
		
		BooleanParam bool = ((BooleanParam) params.get(0)); // negate
		XmlPathParam path1 = ((XmlPathParam) params.get(1)); // path to record
		XmlPathParam path2 = ((XmlPathParam) params.get(2)); // path to link value
		if (AXIS) {
			path1.setValueFromString("//*");
			path2.setValueFromString("/*/text()");
		}
		
		{
			// Search for <records> where any value of <field> does <not?> contain a valid link.
			PatternText variant1 = TextrepresentationFactory.eINSTANCE.createPatternText();
			variant1.setName("default");
			pattern.getText().add(variant1);
			
			variant1.addFragment(new TextFragmentImpl("Search for"));
			{
				ParameterFragment frag1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag1.setId("xmlpath_rootToReturn");
				frag1.setExampleValue("record");
				frag1.getParameter().add(path1);
				variant1.addFragment(frag1);
			}
			variant1.addFragment(new TextFragmentImpl("where any value of"));
			{
				ParameterFragment frag2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag2.setId("xmlpath_returnToCondition");
				frag2.getParameter().add(path2);
				frag2.setExampleValue("sourcefield");
				variant1.addFragment(frag2);
			}
			{
				ParameterFragment frag3 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag3.setId("negation");
				frag3.getParameter().add(bool);
				ValueMap map = new ValueMapImpl();
				map.put("true", "does");
				map.put("false", "does not");
				frag3.setValueMap(map);
				frag3.setExampleValue(map.get("true"));
				variant1.addFragment(frag3);
			}
			variant1.addFragment(new TextFragmentImpl("contain a valid link."));
		}
		{
			// Is there a <xmlpath_rootToReturn> where the link in the <xmlpath_returnToCondition> element is <not> valid?
			PatternText variant1 = TextrepresentationFactory.eINSTANCE.createPatternText();
			variant1.setName("default_question");
			pattern.getText().add(variant1);
			
			variant1.addFragment(new TextFragmentImpl("Is there a"));
			{
				ParameterFragment frag1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag1.setId("xmlpath_rootToReturn");
				frag1.setExampleValue("record");
				frag1.getParameter().add(path1);
				variant1.addFragment(frag1);
			}
			variant1.addFragment(new TextFragmentImpl("where the link in the"));
			{
				ParameterFragment frag2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag2.setId("xmlpath_returnToCondition");
				frag2.getParameter().add(path2);
				frag2.setExampleValue("sourcefield");
				variant1.addFragment(frag2);
			}
			variant1.addFragment(new TextFragmentImpl("element is"));
			{
				ParameterFragment frag3 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag3.setId("negation");
				frag3.getParameter().add(bool);
				ValueMap map = new ValueMapImpl();
				map.put("true", "does");
				map.put("false", "does not");
				frag3.setValueMap(map);
				frag3.setExampleValue(map.get("true"));
				variant1.addFragment(frag3);
			}
			variant1.addFragment(new TextFragmentImpl("?"));
		}
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlMandAtt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericMandAtt();
		pattern.createXmlAdaption();
		pattern.setPatternId("MandAtt_xml");
		pattern.setAbstractId("MandAtt_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();
		XmlPathParam p0 = ((XmlPathParam) params.get(0));
		XmlPathParam p1 = ((XmlPathParam) params.get(1));
		if (AXIS) {
			p0.setValueFromString("//*");
			p1.setValueFromString("/*/text()");
		}
		
		{
			// Search for <records> that have no <field>.
			PatternText variant = TextrepresentationFactory.eINSTANCE.createPatternText();
			variant.setName("default");
			pattern.getText().add(variant);
			
			variant.addFragment(new TextFragmentImpl("Search for"));
			{
				ParameterFragment frag1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag1.setId("xmlpath_rootToReturn");
				frag1.setExampleValue("records");
				frag1.getParameter().add(p0);
				variant.addFragment(frag1);
			}
			variant.addFragment(new TextFragmentImpl("that have no"));
			{
				ParameterFragment frag2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag2.setId("xmlpath_returnToCondition");
				frag2.getParameter().add(p1);
				frag2.setExampleValue("sourcefield");
				variant.addFragment(frag2);
			}
			variant.addFragment(new TextFragmentImpl("."));
		}
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlStringLength() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericStringLength();
		pattern.createXmlAdaption();
		pattern.setPatternId("StringLength_xml");
		pattern.setAbstractId("StringLength_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();
		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
		NumberParam p1 = ((NumberParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		if (AXIS) {
			p2.setValueFromString("//*");
			p3.setValueFromString("/*/text()");
		}
		
		{
			// Search for <records> where the length of at least one value of <field> is <shorter than> <10>.
			PatternText variant = TextrepresentationFactory.eINSTANCE.createPatternText();
			variant.setName("default");
			pattern.getText().add(variant);

			variant.addFragment(new TextFragmentImpl("Search for"));
			{
				ParameterFragment frag1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag1.setId("xmlpath_rootToReturn");
				frag1.setExampleValue("records");
				frag1.getParameter().add(p2);
				variant.addFragment(frag1);
			}
			variant.addFragment(new TextFragmentImpl("where the length of at least one value of"));
			{
				ParameterFragment frag2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag2.setId("xmlpath_returnToCondition");
				frag2.getParameter().add(p3);
				frag2.setExampleValue("sourcefield");
				variant.addFragment(frag2);
			}
			variant.addFragment(new TextFragmentImpl("is"));
			{
				ParameterFragment frag3 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag3.setId("comparison_operator");
				frag3.getParameter().add(p0);
				frag3.setExampleValue(ComparisonOperator.GREATER.getName());
				frag3.setComparisonOperatorValueMap();
				frag3.setExampleValue(frag3.getValueMap().get(ComparisonOperator.GREATER.getName()));
				variant.addFragment(frag3);			
			}
			{
				ParameterFragment frag4 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag4.setId("number");
				frag4.getParameter().add(p1);
				frag4.setExampleValue("1");
				variant.addFragment(frag4);
			}
			variant.addFragment(new TextFragmentImpl("."));
		}
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlUnique() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericUnique();
		pattern.createXmlAdaption();
		pattern.setPatternId("Unique_xml");
		pattern.setAbstractId("Unique_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
		if (AXIS) {
			p2.setValueFromString("//*");
			p3.setValueFromString("/*/text()");
			p4.setValueFromString("/*/text()");
			p5.setValueFromString("//*");
		}
		
		{
			// Search for <records> where a value of <field> is not unique within the data set.
			PatternText variant = TextrepresentationFactory.eINSTANCE.createPatternText();
			variant.setName("default");
			pattern.getText().add(variant);

			variant.addFragment(new TextFragmentImpl("Search for"));
			{ // records
				ParameterFragment frag1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag1.setId("xmlpath_rootToReturn");
				frag1.setExampleValue("records");
				frag1.getParameter().add(p2);
				frag1.getParameter().add(p5);
				variant.addFragment(frag1);
			}
			variant.addFragment(new TextFragmentImpl("where a value of"));
			{ // field
				ParameterFragment frag2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag2.setId("xmlpath_returnToCondition");
				frag2.getParameter().add(p3);
				frag2.getParameter().add(p4);
				frag2.setExampleValue("sourcefield");
				variant.addFragment(frag2);
			}
			variant.addFragment(new TextFragmentImpl("is not unique within the data set."));
		}
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlCompSet() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericCompSet();
		pattern.createXmlAdaption();
		pattern.setPatternId("CompSet_xml");
		pattern.setAbstractId("CompSet_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();
		
		TextListParam p0 = ((TextListParam) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		if (AXIS) {
			p3.setValueFromString("//*");
			p4.setValueFromString("/*/text()");
		}
		
		{
			// Search for <records> where at least one value in <field2> is <not> in the list: <List<String>>.
			PatternText variant = TextrepresentationFactory.eINSTANCE.createPatternText();
			variant.setName("default");
			pattern.getText().add(variant);

			variant.addFragment(new TextFragmentImpl("Search for"));
			{
				ParameterFragment frag1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag1.setId("xmlpath_rootToReturn");
				frag1.setExampleValue("records");
				frag1.getParameter().add(p3);
				variant.addFragment(frag1);
			}
			variant.addFragment(new TextFragmentImpl("where at least one value in"));
			{
				ParameterFragment frag2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag2.setId("xmlpath_returnToCondition");
				frag2.getParameter().add(p4);
				frag2.setExampleValue("sourcefield");
				variant.addFragment(frag2);
			}
			{
				ParameterFragment frag3 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag3.setId("comparison_operator");
				frag3.getParameter().add(p1);
				ValueMap map = new ValueMapImpl();
				map.put(ComparisonOperator.EQUAL.getName(), "is");
				map.put(ComparisonOperator.NOTEQUAL.getName(), "is not");
				frag3.setValueMap(map);
				frag3.setExampleValue(map.get(ComparisonOperator.EQUAL.getName()));
				variant.addFragment(frag3);
			}
			variant.addFragment(new TextFragmentImpl("in the list:"));
			{
				ParameterFragment frag4 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				frag4.setId("valuelist");
				frag4.getParameter().add(p0);
//				frag4.setExampleValue("");
				variant.addFragment(frag4);
			}
			variant.addFragment(new TextFragmentImpl("."));
			
//			ParameterPredefinition predef1 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
//			predef1.getParameter().add(p2);
//			predef1.setValue(ReturnType.LIST.getName());
//			variant.getParameterPredefinitions().add(predef1);
		}
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
//	public static CompletePattern getXmlAppdup2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericAppdup2();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("Appdup2_xml");
//		pattern.setAbstractId("Appdup2_xml");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
//	
//	public static CompletePattern getXmlAppdup3() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericAppdup3();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("Appdup3_xml");
//		pattern.setAbstractId("Appdup3_xml");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
//	
//	public static CompletePattern getXmlDupVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericDupVal();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("DupVal_xml");
//		pattern.setAbstractId("DupVal_xml");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
//	
//	public static CompletePattern getXmlComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericComp();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("Comp_xml");
//		pattern.setAbstractId("Comp_xml");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
//	
//	public static CompletePattern getXmlFunc() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericFunc();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("Func_xml");
//		pattern.setAbstractId("Func_xml");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
//	
//	public static CompletePattern getXmlLocalUnique() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericLocalUnique();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("LocalUnique_xml");
//		pattern.setAbstractId("LocalUnique_xml");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
//	
//	public static CompletePattern getXmlCompVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCompVal();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CompVal_xml");
//		pattern.setAbstractId("CompVal_xml");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
//	
//	public static CompletePattern getXmlCardImpliesMandAtt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCardImpliesMandAtt();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CardImpliesMandAtt_xml");
//		pattern.setAbstractId("CardImpliesMandAtt_xml");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
//	
//	public static CompletePattern getXmlCheckFormat() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCheckFormat();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CheckFormat_xml");
//		pattern.setAbstractId("CheckFormat_xml");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
//	
//	public static CompletePattern getXmlCompDatabase() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCompDatabase();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CompDatabase_xml");
//		pattern.setAbstractId("CompDatabase_xml");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
//	
//	public static CompletePattern getXmlCompValAny() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCompValAny();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CompValAny_xml");
//		pattern.setAbstractId("CompValAny_xml");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
	
}
