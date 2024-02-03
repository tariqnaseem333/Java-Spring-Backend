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
		
		if( this.getExperience() < 3 ) {
			variableComponent = 0;
		} 
		else if( this.getExperience() >= 3 && this.getExperience() < 5 ) {
			variableComponent = 0.05 * this.getBasicPay();
		} 
		else if( this.getExperience() >= 5 && this.getExperience() < 10 ) {
			variableComponent = 0.07 * this.getBasicPay();
		} 
		else if( this.getExperience() >= 10 ) {
			variableComponent = 0.12 * this.getBasicPay();
		} 
		else {
			System.out.println("Invalid Experience!!");
		}
		
		double calculatedSalary = variableComponent + this.getBasicPay() + this.getHra();
		this.setSalary(Math.round(calculatedSalary*100) / 100.0);	
		
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
