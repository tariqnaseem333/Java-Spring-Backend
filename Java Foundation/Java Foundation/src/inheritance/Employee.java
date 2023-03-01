package inheritance;

public class Employee {
	
//	Instance Variables
	private int employeeId;
	private String employeeName;
	private double Salary;
	
//	Constructor
	public Employee( int employeeId, String employeeName ) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
//	Methods
    public String toString(){
        return "Employee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary();
    }
	
//	Getters and Setters
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}  

}
