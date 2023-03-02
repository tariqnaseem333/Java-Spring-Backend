package methodOverriding;

public class Teacher extends Faculty {
	
//	Instance Variable
	private String qualification;
	
//	Constructor
	public Teacher( String name, float basicSalary ,String qualification ) {
		super( name, basicSalary );
		this.qualification = qualification;
	}
	
//	Method
	@Override
	public double calculateSalary() {
		double additionalPay = 0;
		if( this.qualification.equals("Doctoral") ) {
			additionalPay = 20000.0;
		}
		else if( this.qualification.equals("Masters") ) {
			additionalPay = 18000.0;
		}
		else if( this.qualification.equals("Bachelors") ) {
			additionalPay = 15500.0;
		}
		else if( this.qualification.equals("Associate") ) {
			additionalPay = 10000.0;
		}
		double totalSalary = super.calculateSalary() + additionalPay;
		return totalSalary;
	}

//	Getters and Setters
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	

}
