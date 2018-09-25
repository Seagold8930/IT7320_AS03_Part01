import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import part1_labExample.ComputeImplementation;
import part1_labExample.ICompute;

public class ComputeImplementationTest {
	//Create objects of class and interface
	ICompute interfaceObj;
	ComputeImplementation implementationObj;
	
	int num1;
	int num2;
	
	//Create mock object
	//Mockito mockObj;
	
	@Before
	public void setUp() throws Exception {
		num1 = 10;
		num2 = 20;
		implementationObj = new ComputeImplementation();
		//Initialised the mock object
		interfaceObj = Mockito.mock( ICompute.class );
		
		
		Mockito.when( interfaceObj.multiply( num1, num2 ) ).thenReturn( 200 );
		implementationObj.setObj( interfaceObj );
	}

	@After
	public void tearDown() throws Exception {
		implementationObj = null;
		interfaceObj = null;
	}

//	@Test
//	public void testSquareVar() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testMultiply() {
		assertEquals( num1*num2, implementationObj.multiply( num1, num2 ) );
	}

}
