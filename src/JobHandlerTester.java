import static org.junit.Assert.*;

import org.junit.Test;

public class JobHandlerTester {
	
	Employee e1 = new Employee("John Doe", 4.25, 10, 1, false, 3);
	Employee e2 = new Employee("Barbara Bark", 18.00, 20, 3, true, 1);
	Employee e3 = new Employee("Harold Debeste", 40.25, 40, 8, true, 0);
	Employee e4 = new Employee("Jimmy Sortle", 12.25, 40, 6, true, 2);
	Employee e5 = new Employee("Samantha Hold", 65.35, 40, 3, false, 0);
	Employee e6 = new Employee("Carol Kim", 15.00, 20, 5, true, 5);
	
	Position p1 = new Position("CEO-2", 90, 120.00, true, true);
	Position p2 = new Position("HandyMan-1", 10, 12.00, false, false);
	Position p3 = new Position("ComputerEng-3", 40, 26.00, true, false);
	Position p4 = new Position("Secretary-2", 20, 18.00, true, true);
	Position p5 = new Position("LeadSoftEngineer-3", 60, 40.00, true, true);
	Position p6 = new Position("BranchSupervisor-6", 80, 60.00, true, false);
	Position p7 = new Position("EngineeringAide-2", 40, 40.00, true, true);
	
	
	@Test
	public void rankTest() {
		assertEquals("The method rank() for employee e1 should return 5", 5, JobHandler.rank(e1.getWarnings(), e1.getYearlySalary()));
		assertEquals("The method rank() for employee e2 should return 35", 35, JobHandler.rank(e2.getWarnings(), e2.getYearlySalary()));
		assertEquals("The method rank() for employee e3 should return 60", 60, JobHandler.rank(e3.getWarnings(), e3.getYearlySalary()));
		assertEquals("The method rank() for employee e4 should return 20", 30, JobHandler.rank(e4.getWarnings(), e4.getYearlySalary()));
		assertEquals("The method rank() for employee e5 should return 80", 80, JobHandler.rank(e5.getWarnings(), e5.getYearlySalary()));		
		assertEquals("The method rank() for employee e6 should return 10", 10, JobHandler.rank(e6.getWarnings(), e6.getYearlySalary()));
		
	}


	@Test
	public void promotionQualifyTest() {
		assertFalse("The method promotionQuality() for combinatio p1<>e1 should return false", JobHandler.promotionQualify(p1.isAvailable(), p1.getJobType(), p1.getRank(), JobHandler.rank(e1.getWarnings(), e1.getYearlySalary()), e1.seniorityLevel()));
		assertFalse("The method promotionQuality() for combinatio p2<>e6 should return false", JobHandler.promotionQualify(p2.isAvailable(), p2.getJobType(), p2.getRank(), JobHandler.rank(e6.getWarnings(), e6.getYearlySalary()), e6.seniorityLevel()));
		assertTrue("The method promotionQuality() for combinatio p3<>e2 should return true", JobHandler.promotionQualify(p3.isAvailable(), p3.getJobType(), p3.getRank(), JobHandler.rank(e2.getWarnings(), e2.getYearlySalary()), e2.seniorityLevel()));
		assertTrue("The method promotionQuality() for combinatio p4<>e6 should return true", JobHandler.promotionQualify(p4.isAvailable(), p4.getJobType(), p4.getRank(), JobHandler.rank(e6.getWarnings(), e6.getYearlySalary()), e6.seniorityLevel()));
		assertTrue("The method promotionQuality() for combinatio p5<>e3 should return true", JobHandler.promotionQualify(p5.isAvailable(), p5.getJobType(), p5.getRank(), JobHandler.rank(e3.getWarnings(), e3.getYearlySalary()), e3.seniorityLevel()));
		assertTrue("The method promotionQuality() for combinatio p6<>e1 should return true", JobHandler.promotionQualify(p6.isAvailable(), p6.getJobType(), p6.getRank(), JobHandler.rank(e1.getWarnings(), e1.getYearlySalary()), e1.seniorityLevel()));
		assertTrue("The method promotionQuality() for combinatio p7<>e2 should return true", JobHandler.promotionQualify(p7.isAvailable(), p7.getJobType(), p7.getRank(), JobHandler.rank(e2.getWarnings(), e2.getYearlySalary()), e2.seniorityLevel()));
		
	}
}
