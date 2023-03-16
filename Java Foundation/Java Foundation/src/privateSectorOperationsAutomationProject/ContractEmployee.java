package privateSectorOperationsAutomationProject;

public class ContractEmployee extends Employee {
	
//	Instance Variables
	private double wagePerHour;
	
//	Constructor
	public ContractEmployee( String employeeName, double wagePerHour ) {
		super( employeeName );
		this.wagePerHour = wagePerHour;
		this.setContractIdCounter(this.getContractIdCounter() + 1);
		this.setEmployeeId("C" + this.getContractIdCounter());
	}
	
//	Methods
	public void calculateSalary( float hoursWorked ) {
		double salary = this.wagePerHour*hoursWorked;
		if( hoursWorked >= 190 ) {
			this.setSalary(Math.round(salary));
		} else {
			salary = salary - this.wagePerHour/2*(hoursWorked-190);
			this.setSalary(Math.round(salary));
		}
	}
	@Override 
	public String toString() { 
	  	return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()+", Wage Per Hour: "+getWagePerHour(); 
	}

//	Getters and Setters
	public double getWagePerHour() {
		return wagePerHour;
	}
	public void setWagePerHour(double wagePerHour) {
		this.wagePerHour = wagePerHour;
	}
}
