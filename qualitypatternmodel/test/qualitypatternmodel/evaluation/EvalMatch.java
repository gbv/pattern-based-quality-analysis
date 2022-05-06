package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class EvalMatch {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMatchLidoNameActorSetAbbreviation());
		completePatterns.add(getMatchMidas5064());
		completePatterns.add(getMatchMidas5360());
		completePatterns.add(getMatchMidas3270());
		completePatterns.add(getMatchMidas3270Imprecise());
		completePatterns.add(getMatchMidas3100Abbreviation());
		completePatterns.add(getMatchMidas5060());
		completePatterns.add(getMatchMidasOb30Child());
		completePatterns.add(getMatchLidoMeasurementValue());
		completePatterns.add(getMatchLidoMeasurementUnit());
		completePatterns.add(getMatchLidoEarliestDate());
		completePatterns.add(getMatchLidoNamePlaceSet());
		completePatterns.add(getMatchLidoAppellationValue());
		completePatterns.add(getMatchLidoNameActorSetAbbreviation());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);
	}

	public static CompletePattern getMatchAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();

		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelationFinal();
		XmlElement returnElementInReturnGraph = (XmlElement) completePattern.getGraph().getNodes().get(0);
		returnElementInReturnGraph.addPrimitiveComparison();

		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		XmlElement element2 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(1);

		element2.addPrimitiveComparison();
		element2.addPrimitiveMatch();

		return completePattern;
	}

	public static CompletePattern getMatchAbstractThreeElements() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelation();
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);
		returnElementInReturnGraph.addPrimitiveComparison();

		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();

		Node element2 = quantifiedCondition.getGraph().getNodes().get(1);
		element2.addPrimitiveComparison();

		Node element3 = graphFactory.createNode();
		element3.setGraph(quantifiedCondition.getGraph());
//		element3.addPrimitiveComparison(); 		
		element3.addPrimitiveMatch();

		Relation relation = graphFactory.createRelation();
		relation.setGraph(quantifiedCondition.getGraph());
		relation.setSource(element2);
		relation.setTarget(element3);

		completePattern.createXMLAdaption();
		quantifiedCondition.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		relation.adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();

		return completePattern;
	}
	
	public static CompletePattern getMatchAbstractThreeElementsTwoConditions() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		CompletePattern completePattern = getMatchAbstractThreeElements();
		

		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();

		Node element3 = quantifiedCondition.getGraph().getNodes().get(2);
		element3.addPrimitiveComparison();	

		return completePattern;
	}

//	public static CompletePattern getMatchMidas() {
//		
//		ParametersPackage.eINSTANCE.eClass();
//		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
//		
//		CompletePattern completePattern = getMatchAbstract();
//		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
//		returnElementInReturnGraph.getRelationFromPrevious().getOption().setValue(RelationKind.DESCENDANT);
//		BooleanOperator comparisonReturnElementInReturnGraph = returnElementInReturnGraph.getPredicates().get(0);
//		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
//		concreteInputValue.setValue("kue");
//		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).replace(concreteInputValue);
//		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
//		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyKind.ATTRIBUTE);
//		
//		Element returnElementInGraph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph().getReturnElements().get(0);				
//		Element element2 = returnElementInGraph1.getNextElements().get(0);
//		BooleanOperator comparisonElement2 = element2.getPredicates().get(0);
//		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
//		concreteInputValue2.setValue("3162");
//		((UnknownParameterValue) comparisonElement2.getArguments().get(1)).replace(concreteInputValue2);
//		element2.getProperties().get(0).getAttributeName().setValue("Type");
//		element2.getProperties().get(0).getOption().setValue(PropertyKind.ATTRIBUTE);
//		
//		BooleanOperator matchElement2 = element2.getPredicates().get(1);
//		TextLiteralParam regularExpression = (TextLiteralParam) matchElement2.getArguments().get(1);
//		regularExpression.setValue(".*\\?.*");
//		element2.getProperties().get(1).getAttributeName().setValue("Value");
//		element2.getProperties().get(1).getOption().setValue(PropertyKind.ATTRIBUTE);
//		
//		return completePattern;		
//	}

	public static CompletePattern getMatchThreeElementsConcrete(String returnElementType,
			AxisKind returnElementAxis, String attribute1Name, PropertyKind attribute1Kind, 
			String element2Type, AxisKind element2Axis, String attribute2Name, PropertyKind attribute2Kind, 
			AxisKind element3Axis, 
			String attributeMatchName, PropertyKind attributeMatchKind, String regex) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		CompletePattern completePattern = getMatchAbstractThreeElements();
		XmlElement returnElementInReturnGraph = (XmlElement) completePattern.getGraph().getNodes().get(0);
		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().setAxis(returnElementAxis, "");
		BooleanOperator comparisonReturnElementInReturnGraph = returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementType);
		((UntypedParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1))
				.replace(concreteInputValue);
		if (attribute1Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue(attribute1Name);
		}
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(attribute1Kind);

		QuantifiedCondition qc = (QuantifiedCondition) completePattern.getCondition();
		XmlElement element2 = (XmlElement) qc.getGraph().getNodes().get(1);
		((XmlElementNavigation) qc.getGraph().getRelations().get(0)).getPathParam().setAxis(element2Axis, "");
		BooleanOperator comparisonElement2 = element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue(element2Type);
		((UntypedParameterValue) comparisonElement2.getArguments().get(1)).replace(concreteInputValue2);
		if (attribute2Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue(attribute2Name);
		}
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(attribute2Kind);

		XmlElement element3 = (XmlElement) qc.getGraph().getNodes().get(2);
		((XmlElementNavigation) qc.getGraph().getRelations().get(1)).getPathParam().setAxis(element3Axis, "");
		
		BooleanOperator matchElement2 = element3.getPredicates().get(0);
		TextLiteralParam regularExpression = (TextLiteralParam) matchElement2.getArguments().get(1);
		regularExpression.setValue(regex);
		if (attributeMatchKind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element3.getProperties().get(0)).getAttributeName().setValue(attributeMatchName);
		}
		((XmlProperty) element3.getProperties().get(0)).getOption().setValue(attributeMatchKind);

		return completePattern;
	}
	
	public static CompletePattern getMatchThreeElementsTwoConditionsConcrete(String returnElementType,
			AxisKind returnElementAxis, String attribute1Name, PropertyKind attribute1Kind, 
			String element2Type, AxisKind element2Axis, String attribute2Name, PropertyKind attribute2Kind, 
			String element3Type, AxisKind element3Axis, String attribute3Name, PropertyKind attribute3Kind, 			
			String attributeMatchName, PropertyKind attributeMatchKind, String regex) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		CompletePattern completePattern = getMatchAbstractThreeElementsTwoConditions();
		XmlElement returnElementInReturnGraph = (XmlElement) completePattern.getGraph().getNodes().get(0);
		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().setAxis(returnElementAxis, "");
		BooleanOperator comparisonReturnElementInReturnGraph = returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementType);
		((UntypedParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1))
				.replace(concreteInputValue);
		if (attribute1Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue(attribute1Name);
		}
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(attribute1Kind);

		QuantifiedCondition qc = (QuantifiedCondition) completePattern.getCondition();
		XmlElement element2 = (XmlElement) qc.getGraph().getNodes().get(1);
		((XmlElementNavigation) qc.getGraph().getRelations().get(0)).getPathParam().setAxis(element2Axis, "");
		BooleanOperator comparisonElement2 = element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue(element2Type);
		((UntypedParameterValue) comparisonElement2.getArguments().get(1)).replace(concreteInputValue2);
		if (attribute2Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue(attribute2Name);
		}
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(attribute2Kind);

		XmlElement element3 = (XmlElement) qc.getGraph().getNodes().get(2);
		((XmlElementNavigation) qc.getGraph().getRelations().get(1)).getPathParam().setAxis(element3Axis, "");
		
		BooleanOperator comparisonElement3 = element3.getPredicates().get(1);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue(element3Type);
		((UntypedParameterValue) comparisonElement3.getArguments().get(1)).replace(concreteInputValue3);
		if (attribute3Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element3.getProperties().get(1)).getAttributeName().setValue(attribute3Name);
		}
		((XmlProperty) element3.getProperties().get(1)).getOption().setValue(attribute2Kind);

		BooleanOperator matchElement2 = element3.getPredicates().get(0);
		TextLiteralParam regularExpression = (TextLiteralParam) matchElement2.getArguments().get(1);
		regularExpression.setValue(regex);
		if (attributeMatchKind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element3.getProperties().get(0)).getAttributeName().setValue(attributeMatchName);
		}
		((XmlProperty) element3.getProperties().get(0)).getOption().setValue(attributeMatchKind);

		return completePattern;
	}

	public static CompletePattern getMatchConcrete(String returnElementType, AxisKind returnElementAxis,
			String attribute1Name, PropertyKind attribute1Kind, String element2Type, AxisKind element2Axis,
			String attribute2Name, PropertyKind attribute2Kind, String attribute3Name, PropertyKind attribute3Kind,
			String regex) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		CompletePattern completePattern = getMatchAbstract();
		XmlElement returnElementInReturnGraph = (XmlElement) completePattern.getGraph().getNodes().get(0);
		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().setAxis(returnElementAxis, "");
		BooleanOperator comparisonReturnElementInReturnGraph = returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementType);
		((UntypedParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1))
				.replace(concreteInputValue);
		if (attribute1Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName()
					.setValue(attribute1Name);
		}
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(attribute1Kind);

		QuantifiedCondition qc = (QuantifiedCondition) completePattern.getCondition();
		XmlElement element2 = (XmlElement) qc.getGraph().getNodes().get(1);
		((XmlElementNavigation) qc.getGraph().getRelations().get(0)).getPathParam().setAxis(element2Axis, "");
		BooleanOperator comparisonElement2 = element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue(element2Type);
		((UntypedParameterValue) comparisonElement2.getArguments().get(1)).replace(concreteInputValue2);
		if (attribute2Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue(attribute2Name);
		}
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(attribute2Kind);

		BooleanOperator matchElement2 = element2.getPredicates().get(1);
		TextLiteralParam regularExpression = (TextLiteralParam) matchElement2.getArguments().get(1);
		regularExpression.setValue(regex);
		if (attribute3Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) element2.getProperties().get(1)).getAttributeName().setValue(attribute3Name);
		}
		((XmlProperty) element2.getProperties().get(1)).getOption().setValue(attribute3Kind);

		return completePattern;
	}

	public static CompletePattern getMatchMidas5064() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("obj", AxisKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE, "5064",
				AxisKind.TWOCHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE,
				".*[a-zA-Z ]{10}.*");
	}

	public static CompletePattern getMatchMidas5360() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("obj", AxisKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE, "5360",
				AxisKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE,
				"^[0-9]+(,[0-9]+)?( x [0-9]+(,[0-9]+)?)? (m|mm)( \\([a-zA-Z������ ]+\\))?$");
	}

	public static CompletePattern getMatchMidas3270() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("kue", AxisKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE, "3270",
				AxisKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, "\\?$");
	}

	public static CompletePattern getMatchMidas3270Imprecise() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("kue", AxisKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE, "3270",
				AxisKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, "[0-9]/[0-9]");
	}

	public static CompletePattern getMatchMidas3100Abbreviation() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("kue", AxisKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE, "3100",
				AxisKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, "\\.");
	}

	public static CompletePattern getMatchMidas5060() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("obj", AxisKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE, "5060",
				AxisKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, "^[0-9/]+$");
	}

	public static CompletePattern getMatchMidasOb30Child() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchThreeElementsConcrete("obj", AxisKind.THREECHILD, "Type", PropertyKind.ATTRIBUTE,
				"ob30", AxisKind.CHILD, "Type", PropertyKind.ATTRIBUTE, AxisKind.CHILD, "Type",
				PropertyKind.ATTRIBUTE, "^[12456789]");
	}

	public static CompletePattern getMatchLidoMeasurementValue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("lido:lido", AxisKind.TWOCHILD, null, PropertyKind.TAG, "lido:measurementValue",
				AxisKind.SEVENCHILD, null, PropertyKind.TAG, null, PropertyKind.DATA, "[a-zA-Z������]");
	}

	public static CompletePattern getMatchLidoMeasurementUnit() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("lido:lido", AxisKind.TWOCHILD, null, PropertyKind.TAG, "lido:measurementUnit",
				AxisKind.SEVENCHILD, null, PropertyKind.TAG, null, PropertyKind.DATA, "[0-9]");
	}

	public static CompletePattern getMatchLidoEarliestDate() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("lido:lido", AxisKind.TWOCHILD, null, PropertyKind.TAG, "lido:earliestDate",
				AxisKind.SEVENCHILD, null, PropertyKind.TAG, null, PropertyKind.DATA, "^[0-9]{4}$");
	}

	public static CompletePattern getMatchLidoNamePlaceSet() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("lido:lido", AxisKind.TWOCHILD, null, PropertyKind.TAG, "lido:namePlaceSet",
				AxisKind.SEVENCHILD, null, PropertyKind.TAG, null, PropertyKind.DATA, ",");
	}

	public static CompletePattern getMatchLidoAppellationValue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("lido:lido", AxisKind.TWOCHILD, null, PropertyKind.TAG, "lido:appellationValue",
				AxisKind.DESCENDANT, null, PropertyKind.TAG, null, PropertyKind.DATA, "\\?$");
	}
	
	public static CompletePattern getMatchLidoNameActorSetAbbreviation() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchThreeElementsTwoConditionsConcrete("lido:lido", AxisKind.TWOCHILD, null, PropertyKind.TAG, 
				"lido:nameActorSet", AxisKind.EIGHTCHILD, null, PropertyKind.TAG, 
				"lido:appellationValue", AxisKind.CHILD, null, PropertyKind.TAG, 
				null, PropertyKind.DATA, "\\.");
	}

}
