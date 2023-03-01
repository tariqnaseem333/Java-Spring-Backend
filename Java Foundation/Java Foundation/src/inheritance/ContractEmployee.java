package inheritance;

public class ContractEmployee extends Employee {
	
//	Instance Variables
	private double wage;
	private float hoursWorked;
	
//	Constructor
	public ContractEmployee( int employeeId, String employeeName, double wage, float hoursWorked ) {
		super( employeeId, employeeName );
		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}
	
//	Methods
	public void calculateSalary() {
//		salary = hoursWorked * wage
		double totalSalary = this.hoursWorked * this.wage;
		this.setSalary( Math.round(totalSalary*100.0) / 100.0 );
	}
	
    public String toString(){
        return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
    }
	
//	Getters and Setters
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public float getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

}
