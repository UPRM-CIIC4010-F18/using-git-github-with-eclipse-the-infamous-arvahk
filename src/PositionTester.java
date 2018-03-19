import static org.junit.Assert.*;

import org.junit.Test;

public class PositionTester {
	Position p1 = new Position("CEO-2", 100, 120.00, true, true);
	Position p2 = new Position("HandyMan-1", 10, 12.00, false, false);
	Position p3 = new Position("ComputerEng-3", 40, 26.00, false, true);
	Position p4 = new Position("Secretary-2", 20, 18.00, true, true);
	Position p5 = new Position("LeadSoftEngineer-3", 60, 40.00, false, true);
	Position p6 = new Position("BranchSupervisor-6", 80, 60.00, true, true);

	@Test
	public void getTest() {
		assertEquals("The method getPositionCode() is not returning the correct information","CEO-2", p1.getPositionCode());
		assertEquals("The method getRank() is not returning the correct information",100, p1.getRank());
		assertEquals("The method getSalary() is not returning the correct information",120.00, p1.getSalary(), 1E-10);
		assertTrue("The method getJobType() is not returning the correct information",p1.getJobType());
		assertTrue("The method isAvailable() is not returning the correct information",p1.isAvailable());
		assertEquals("The method getYearlySalary() is not returning the correct information",259200.00, p1.getYearlySalary(), 1E-10);
		
		
		assertEquals("The method getPositionCode() is not returning the correct information","HandyMan-1", p2.getPositionCode());
		assertEquals("The method getRank() is not returning the correct information",10, p2.getRank());
		assertEquals("The method getSalary() is not returning the correct information",12.00, p2.getSalary(), 1E-10);
		assertFalse("The method getJobType() is not returning the correct information",p2.getJobType());
		assertFalse("The method isAvailable() is not returning the correct information",p2.isAvailable());
		assertEquals("The method getYearlySalary() is not returning the correct information", 12960.00, p2.getYearlySalary(), 1E-10);
		
	}
	
	@Test
	public void setTest() {
		assertEquals("The method getPositionCode() is not returning the correct information","ComputerEng-3", p3.getPositionCode());
		assertEquals("The method getRank() is not returning the correct information",40, p3.getRank());
		assertEquals("The method getSalary() is not returning the correct information",26.00, p3.getSalary(), 1E-10);
		assertTrue("The method getJobType() is not returning the correct information",p3.getJobType());
		assertFalse("The method isAvailable() is not returning the correct information",p3.isAvailable());
		assertEquals("The method getYearlySalary() is not returning the correct information",56160.00, p3.getYearlySalary(), 1E-10);
		
		p3.setPositionCode("SoftwareEng-2");
		p3.setAvailability(true);
		p3.setJobType(false);
		p3.setSalary(52.00);
		p3.setRank(50);
		
		assertEquals("The method getPositionCode() is not returning the correct information","SoftwareEng-2", p3.getPositionCode());
		assertEquals("The method getRank() is not returning the correct information",50, p3.getRank());
		assertEquals("The method getSalary() is not returning the correct information",52.00, p3.getSalary(), 1E-10);
		assertFalse("The method getJobType() is not returning the correct information",p3.getJobType());
		assertTrue("The method isAvailable() is not returning the correct information",p3.isAvailable());
		assertEquals("The method getYearlySalary() is not returning the correct information",56160.00, p3.getYearlySalary(), 1E-10);
		
	}

	

}
