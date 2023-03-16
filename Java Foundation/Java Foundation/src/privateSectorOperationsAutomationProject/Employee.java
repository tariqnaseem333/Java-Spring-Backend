package privateSectorOperationsAutomationProject;

public abstract class Employee {
	
//	Instance Variables
	private String employeeId;
	private String employeeName;
	private double salary;
	
//	Static Variables
	private static int contractIdCounter;
	private static int permanentIdCounter;
	static {
		contractIdCounter = 10000;
		permanentIdCounter = 10000;
	}
	
//	Constructor
	public Employee( String employeeName ) {
		this.employeeName = employeeName;
	}

//	Methods
	public abstract void calculateSalary( float salaryFactor );
	
	@Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName();
	}

//	Getters and Setters
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		String regex = "(([A-Z][a-z]){2,}\\s([A-Z][a-z]){2,}){1,}";
		if( employeeName.matches(regex) ) {
			this.employeeName = employeeName;
		}
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>0) {
			this.salary = salary;
		} else {
			this.salary = 0;
		}
	}
	public int getContractIdCounter() {
		return contractIdCounter;
	}
	public void setContractIdCounter(int contractIdCounter) {
		this.contractIdCounter = contractIdCounter;
	}
	public int getPermanentIdCounter() {
		return permanentIdCounter;
	}
	public void setPermanentIdCounter(int permanentIdCounter) {
		this.permanentIdCounter = permanentIdCounter;
	}
}
