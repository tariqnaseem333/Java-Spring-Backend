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
		double percentage = (double)(this.marksSecured) / this.TOTAL_MAXIMUM_MARKS;
		System.out.println(percentage*100.0);
	}
	
}
