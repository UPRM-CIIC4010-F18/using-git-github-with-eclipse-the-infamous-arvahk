import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTester {
	Employee e1 = new Employee("John Doe", 4.25, 10, 1, false, 3);
	Employee e2 = new Employee("Barbara Bark", 18.00, 20, 3, true, 1);
	Employee e3 = new Employee("Harold Debeste", 40.25, 40, 8, true, 0);
	Employee e4 = new Employee("Jimmy Sortle", 12.25, 40, 6, true, 5);
	Employee e5 = new Employee("Samantha Hold", 27.35, 40, 3, false, 0);
	Employee e6 = new Employee("Carol Kim", 82.00, 40, 10, true, 0);
	
	@Test
	public void getTest() {
		assertEquals("The method getFullName() is not returning the correct information","John Doe", e1.getFullName());
		assertEquals("The method getHourlySalary() is not returning the correct information",4.25, e1.getHourlySalary(), 1E-10);
		assertEquals("The method getHoursPerWeek() is not returning the correct information",10, e1.getHoursPerWeek());
		assertEquals("The method getWarnings() is not returning the correct information",3, e1.getWarnings());
		assertEquals("The method getYearsOfService() is not returning the correct information",1, e1.getYearsOfService());
		assertFalse("The method getStatus() is not returning the correct information", e1.getStatus());
		assertEquals("The method getFullName() is not returning the correct information",2295.00, e1.getYearlySalary(), 1E-10);
		
		assertEquals("The method getFullName() is not returning the correct information","Barbara Bark", e2.getFullName());
		assertEquals("The method getHourlySalary() is not returning the correct information",18.00, e2.getHourlySalary(), 1E-10);
		assertEquals("The method getHoursPerWeek() is not returning the correct information",20, e2.getHoursPerWeek());
		assertEquals("The method getWarnings() is not returning the correct information",1, e2.getWarnings());
		assertEquals("The method getYearsOfService() is not returning the correct information",3, e2.getYearsOfService());
		assertTrue("The method getStatus() is not returning the correct information", e2.getStatus());
		assertEquals("The method getFullName() is not returning the correct information",19440.00, e2.getYearlySalary(), 1E-10);
	}
	
	@Test
	public void setTest() {
		assertEquals("The method getFullName() is not returning the correct information","Harold Debeste", e3.getFullName());
		assertEquals("The method getHourlySalary() is not returning the correct information",40.25, e3.getHourlySalary(), 1E-10);
		assertEquals("The method getHoursPerWeek() is not returning the correct information",40, e3.getHoursPerWeek());
		assertEquals("The method getWarnings() is not returning the correct information",0, e3.getWarnings());
		assertEquals("The method getYearsOfService() is not returning the correct information",8, e3.getYearsOfService());
		assertTrue("The method getStatus() is not returning the correct information", e3.getStatus());
		assertEquals("The method getFullName() is not returning the correct information",86940.00, e3.getYearlySalary(), 1E-10);
		e3.setFullName("Harold Bested");
		e3.setHourlySalary(35.35);
		e3.setHoursPerWeek(35);
		e3.setStatus(false);
		e3.setWarnings(4);
		e3.setYearsOfService(9);								
		assertEquals("The method getFullName() is not returning the correct information","Harold Bested", e3.getFullName());
		assertEquals("The method getHourlySalary() is not returning the correct information",35.35, e3.getHourlySalary(), 1E-10);
		assertEquals("The method getHoursPerWeek() is not returning the correct information",35, e3.getHoursPerWeek());
		assertEquals("The method getWarnings() is not returning the correct information",4, e3.getWarnings());
		assertEquals("The method getYearsOfService() is not returning the correct information",9, e3.getYearsOfService());
		assertFalse("The method getStatus() is not returning the correct information", e3.getStatus());
		assertEquals("The method getFullName() is not returning the correct information",66811.50, e3.getYearlySalary(), 1E-10);
	}

	@Test
	public void seniorityTest() {
		assertEquals("This Seniority case should return 0", 1, e1.seniorityLevel());
		assertEquals("This Seniority case should return 1", 1, e5.seniorityLevel());
		assertEquals("This Seniority case should return 2", 2, e4.seniorityLevel());
		assertEquals("This Seniority case should return 3", 3, e6.seniorityLevel());
	}
}
