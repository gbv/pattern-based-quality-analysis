 package qualitypatternmodel.cypherclasstester;

import org.junit.jupiter.api.Test;

interface InterfaceNeoAbstractEdgeTest extends INeo4J, InterfaceNeoElementTest {
	@Test
	void setIsReturnElement();
	
	@Test
	void getReturnInnerEdgeNodes();
	
	@Test
	void createParameters();
	
}
