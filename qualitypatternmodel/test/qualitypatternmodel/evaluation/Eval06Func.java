package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.functions.FunctionsFactory;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.impl.ComparisonImpl;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.graphstructure.impl.PropertyImpl;
import qualitypatternmodel.graphstructure.impl.SingleElementImpl;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class Eval06Func {
	public static void main(String[] args) {
		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getFuncAbstract());
		Test00.test(patterns);
		
	}
	
	private static Pattern getFuncAbstract() {
		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionsFactory = FunctionsFactory.eINSTANCE;
		
		Pattern pattern = Test03Quantor.getPatternExists();
		SingleElement returnElementInReturnGraph = pattern.getGraph().getReturnElements().get(0);		
		
		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		Graph graph1 = ((QuantifiedCondition) pattern.getCondition()).getGraph();
		SingleElement returnElementInGraph1 = graph1.getReturnElements().get(0);				
		SingleElement fieldAReturn = returnElementInGraph1.getNextSingle().get(0);	
		SingleElement fieldBReturn = graphFactory.createSingleElement();
		returnElementInGraph1.getNextSingle().add(fieldBReturn);
		SingleElement otherRecord = graphFactory.createSingleElement();
		graph1.getRootElement().getNextSingle().add(otherRecord);
		SingleElement fieldAOtherRecord = graphFactory.createSingleElement();
		otherRecord.getNextSingle().add(fieldAOtherRecord);
		SingleElement fieldBOtherRecord = graphFactory.createSingleElement();
		otherRecord.getNextSingle().add(fieldBOtherRecord);
		
		fieldAReturn.addPrimitiveComparison(); 	
		fieldBReturn.addPrimitiveComparison(); 
		otherRecord.addPrimitiveComparison(); 
		fieldAOtherRecord.addPrimitiveComparison(); 
		fieldBOtherRecord.addPrimitiveComparison(); 
		
		Comparison comparisonA = functionsFactory.createComparison();
		graph1.getOperatorList().add(comparisonA);
		Property propertyAReturn = graphFactory.createProperty();
		propertyAReturn.setElement(fieldAReturn);
		comparisonA.setArgument1(propertyAReturn);
		Property propertyAOtherRecord = graphFactory.createProperty();
		propertyAOtherRecord.setElement(fieldAOtherRecord);
		comparisonA.setArgument2(propertyAOtherRecord);		
		
		Comparison comparisonB = functionsFactory.createComparison(); 
		graph1.getOperatorList().add(comparisonB);
		Property propertyBReturn = graphFactory.createProperty();
		propertyBReturn.setElement(fieldBReturn);
		comparisonB.setArgument1(propertyBReturn);
		Property propertyBOtherRecord = graphFactory.createProperty();
		propertyBOtherRecord.setElement(fieldBOtherRecord);
		comparisonB.setArgument2(propertyBOtherRecord);		
		
		return pattern;
	}

}