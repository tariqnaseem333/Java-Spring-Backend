package interfaceKeyword;

public class Trainee implements Student {
	
//	Instance Variables
	private int marksSecured;
	
//  Constructor
	public Trainee( int marksSecured ) {
		this.marksSecured = marksSecured;
	}
	
//	Methods
	public void calcPercentage() {
		if( this.marksSecured < 0 || this.marksSecured > 400 ) {
			System.out.println("Please enter the correct marks");
			return;
		}
		double percentage = ( (double)this.marksSecured / Student.TOTAL_MAXIMUM_MARKS ) * 100.0;
		System.out.println("The total aggregate percentage secured by the Trainee is " + Math.round(percentage*100) / 100.0);
		System.out.println();
	}
	
}
