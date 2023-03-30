package inheritance;

public class PermanentEmployee extends Employee{
	
//	Instance Variables
	private double basicPay;
	private double hra;
	private int experience;
	
//	Constructor
	public PermanentEmployee( int empId, String name, double basicPay, double hra, int experience ) {
		super( empId, name );
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}
	
//	Methods
	public void calculateSalary() {
		double variableComponent = 0;
		if( this.experience < 3 ) {
			variableComponent = 0;
		}
		else if( this.experience >= 3 && this.experience < 5 ) {
			variableComponent = this.basicPay * 0.05;
		}
		else if( this.experience >= 5 && this.experience < 10 ) {
			variableComponent = this.basicPay * 0.07;
		}
		else if( this.experience >= 10 ) {
			variableComponent = this.basicPay * 0.12;
		}
		
		double salary = this.basicPay + this.hra + variableComponent;
		this.setSalary(salary);
		
	}
	
//	Getters and Setters
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
}
