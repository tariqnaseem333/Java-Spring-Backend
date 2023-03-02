package methodOverriding;

public class Faculty {
	
//	Instance Variables
	private String name;
	private float basicSalary;
	private float bonusPercentage;
	private float carAllowancePercentage;
	
//	Constructor
	public Faculty( String name, float basicSalary ) {
		this.name = name;
		this.basicSalary = basicSalary;
		this.bonusPercentage = 4.0F;
		this.carAllowancePercentage = 2.5F;
	}
	
//	Methods
	public double calculateSalary() {
		double totalSalary = this.basicSalary * ( 1 + this.bonusPercentage / 100.0 + this.carAllowancePercentage / 100.0 );
		return totalSalary;
	}
	
//	Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public float getBonusPercentage() {
		return bonusPercentage;
	}
	public void setBonusPercentage(float bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}
	public float getCarAllowancePercentage() {
		return carAllowancePercentage;
	}
	public void setCarAllowancePercentage(float carAllowancePercentage) {
		this.carAllowancePercentage = carAllowancePercentage;
	}
	
	

}
