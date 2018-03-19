
public class Employee {

	public String eFullName; //Employee Full Name
	public double eHSalary; //Employee Hourly Salary
	public int hourWeekly; //Max hours worked a week
	public int yearService; //Years working 
	public boolean workStatus; //Permanent [True] Temporary [False]
	public int warnings; //Number of warnings given
	
	public Employee(String fullName, double hSalary, int hWeekly, int years, boolean status, int warnings) {
		eFullName = fullName;
		eHSalary = hSalary; 
		hourWeekly = hWeekly; 
		yearService = years; 
		workStatus = status;
		this.warnings = warnings;
	}
	
	public String getFullName() {
		return eFullName;
	}
	
	public double getHourlySalary() {
		return eHSalary;
	}
	
	public int getHoursPerWeek() {
		return hourWeekly;
	}
	
	public int getYearsOfService() {
		return yearService;
	}
	
	public boolean getStatus() {
		return workStatus;
	}
	
	public int getWarnings() {
		return warnings;
	}
	
	public double getYearlySalary() {
		return eHSalary*hourWeekly*4.5*12;
	}
	
	public void setFullName(String fullName) {
		eFullName = fullName;
	}
	
	public void setHourlySalary(double hSalary) {
		eHSalary = hSalary;
	}
	
	public void setHoursPerWeek(int hours) {
		hourWeekly = hours;
	}
	
	public void setYearsOfService(int years) {
		yearService = years;
	}
	
	public void setStatus(boolean status) {
		workStatus = status;
	}
	
	public void setWarnings(int warnings) {
		this.warnings = warnings;
	}
	
	/**
	 * A method that returns the level of seniority of an employee. (Levels 0 to 3)
	 * 1. The level of seniority is determined by years of service:
	 * 		a) For a level 3 seniority the employee needs at least 10 years of service.
	 * 		b) For a level 2 seniority the employee needs at least 5 years of service.
	 * 		c) For a level 1 seniority the employee needs at least 1 years of service.
	 * 		d) For a level 0 the employee needs less than 1 year of service.
	 * @return 
	 */
	public int seniorityLevel() {
		
		//Add Code Here [You have to use If/Else to get graded]
		
		return 0;// Temporal Return
		
	}
}
