package methodOverriding;

public class OfficeStaff extends Faculty {
	
//	Instance Variable
	private String designation;
	
//	Constructor
	public OfficeStaff( String name, float basicSalary, String designation ) {
		super( name, basicSalary );
		this.designation = designation;
	}
	
//	Method
	@Override
	public double calculateSalary() {
		double additionalPay = 0;
		if( this.designation.equals("Accountant") ) {
			additionalPay = 10000.0;
		}
		else if( this.designation.equals("Clerk") ) {
			additionalPay = 7000.0;
		}
		else if( this.designation.equals("Peon") ) {
			additionalPay = 4500.0;
		}
		double totalSalary = super.calculateSalary() + additionalPay;
		return totalSalary;
	}

//	Getters and Setters
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
