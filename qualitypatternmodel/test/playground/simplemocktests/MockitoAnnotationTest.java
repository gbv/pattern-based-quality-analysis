package playground.simplemocktests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

//Tutorial:
//--> https://www.baeldung.com/mockito-series
//A possible way to fix it: 
//--> https://stackoverflow.com/questions/41956692/could-not-initialize-plugin-interface-org-mockito-plugins-mockmaker
@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotationTest {
//	@Test
//	public void whenNotUseMockAnnotation_thenCorrect() {
//	    List mockList = Mockito.mock(ArrayList.class);
//	    
//	    mockList.add("one");
//	    Mockito.verify(mockList).add("one");
//	    assertEquals(0, mockList.size());
//
//	    Mockito.when(mockList.size()).thenReturn(100);
//	    assertEquals(100, mockList.size());
//	}
	
	@Mock
	List<String> mockedList;

	@Test
	public void whenUseMockAnnotation_thenMockIsInjected() {
	    mockedList.add("one");
	    Mockito.verify(mockedList).add("one");
	    assertEquals(0, mockedList.size());

	    Mockito.when(mockedList.size()).thenReturn(100);
	    assertEquals(100, mockedList.size());
	}
}
