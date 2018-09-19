import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import part1_Mockito.IEmployee;
import part1_Mockito.Employee;

public class EmployeeTest {
	//Creation of class and interface objects
	Employee classObj;
	IEmployee interfaceObj;
	//Initialise salary to 100k, tax to 30%, kiwi saver to 8%, and weeks in the year to 52
	int salary = 100000;
	double tax = 0.3;
	double kiwiSaver = 0.08;
	int weeksInACalendarYear = 52;
	
	@Before
	public void setUp() throws Exception {
		//Instantiation of the classObject using the constructor which takes the salary as the argument
		classObj = new Employee( salary );
		//creation of the mock object
		interfaceObj = Mockito.mock( IEmployee.class );
		
		//Mocking the interface's methods
		Mockito.when( interfaceObj.computeTax( classObj.getSalary() ) ).thenReturn( 30000.00 );
		Mockito.when( interfaceObj.weeklySalary( classObj ) ).thenReturn( 1923.08 );
		Mockito.when( interfaceObj.fortnightSalary( classObj ) ).thenReturn( 3846.15 );
		Mockito.when( interfaceObj.computeKiwiSaver( classObj ) ).thenReturn( 153.85 );
		
		classObj.setObj( interfaceObj );
	}

	@After
	public void tearDown() throws Exception {
		classObj = null;
		interfaceObj = null;
	}

	@Test
	public void testComputeTax() {
		assertEquals( classObj.getSalary() * tax, classObj.computeTax( salary ), 2 );
	}

	@Test
	public void testWeeklySalary() {
		assertEquals( classObj.getSalary() / weeksInACalendarYear, classObj.weeklySalary( classObj ), 2 );
	}

	@Test
	public void testFortnightSalary() {
		assertEquals( classObj.getSalary() / (weeksInACalendarYear/2), classObj.fortnightSalary( classObj ), 2 );
	}

	@Test
	public void testComputeKiwiSaver() {
		assertEquals( classObj.getSalary() / weeksInACalendarYear * kiwiSaver, classObj.computeKiwiSaver( classObj ), 2 );
	}

}
