package qualitypatternmodel.cypherclasstester;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;

import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.exceptions.InvalidityException;

public abstract class NeoAbstractPathPartTest implements InterfaceNeoPathPartTest {
	protected NeoPathPart neoPathPart;
	
	public void setUp(NeoPathPart neoPathPart) {
		this.neoPathPart = neoPathPart;
	}
	
	public void tearDown() {
		neoPathPart = null;
	}

	protected void getNeoAbstractPathParamException(Method m2) {
		try {
			Method m = m2;
			try {
				m.invoke(neoPathPart);
			} catch (Exception e) {
				if (e.getCause().getClass() == InvalidityException.class) {
					assertTrue(true);
				} else {
					assertTrue(false);
				}
			}
			try {
				neoPathPart.setNeoPathParam(FACTORY.createNeoPathParam());
				neoPathPart.setNeoPathParam(FACTORY.createNeoPathParam());
				m.invoke(neoPathPart);
			} catch (Exception e) {
				if (e.getCause().getClass() == InvalidityException.class) {
					assertTrue(true);
				} else {
					assertTrue(false);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
}
