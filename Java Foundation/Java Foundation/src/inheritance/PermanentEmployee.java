package inheritance;

public class PermanentEmployee extends Employee {
	
//	Instance Variables
	private double basicPay;
	private double hra;
	private float experience;
	
//	Constructor
	public PermanentEmployee( int employeeId, String employeeName, double basicPay, double hra, float experience ) {
		super( employeeId, employeeName );
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}
	
//	Methods
	public void calculateMonthlySalary() {
//		salary = basic pay + hra + variable component
		double variableComponent = 0;
//		Setting Variable Component based on Experience 
		if( this.experience >= 10 ) {
			variableComponent = 0.12 * this.basicPay;
		} else if( this.experience >= 5 && this.experience < 10 ) {
			variableComponent = 0.07 * this.basicPay;
		} else if( this.experience >= 3 && this.experience < 5 ) {
			variableComponent = 0.05 * this.basicPay;
		} else {
			variableComponent = 0;
		}
		
		double totalSalary = this.basicPay + this.hra + variableComponent;
		this.setSalary( Math.round(totalSalary*100.0) / 100.0 );
		
	}
	
    public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
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
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}

}
