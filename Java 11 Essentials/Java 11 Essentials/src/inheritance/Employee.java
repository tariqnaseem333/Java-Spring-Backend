package inheritance;

public class Employee{
	
//	Instance Variables
	private int empId;
	private String name;
	private double salary;
	
//	Constructor
	public Employee( int empId, String name ) {
		this.empId = empId;
		this.name = name;
	}
	
//	Getters and Setters
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
