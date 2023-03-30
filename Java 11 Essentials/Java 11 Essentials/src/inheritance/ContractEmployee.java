package inheritance;

public class ContractEmployee extends Employee{
	
//	Instance Variables
	private double wage;
	private int hours;
	
//	Constructor
	public ContractEmployee( int empId, String name, double wage, int hours ) {
		super( empId, name );
		this.wage = wage;
		this.hours = hours;
	}
	
//	Methods
	public void calculateSalary() {
		double salary = this.hours * this.wage;
		this.setSalary(salary);
	}
	
//	Getters and Setters
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}

}
