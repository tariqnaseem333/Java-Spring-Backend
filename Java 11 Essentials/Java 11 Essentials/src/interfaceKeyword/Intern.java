package interfaceKeyword;

public class Intern implements Student {
	
//	Instance Variables 
	private int marksSecured;
	private int projectMarks;
	
//	Constructor
	public Intern( int marksSecured, int projectMarks ) {
		this.marksSecured = marksSecured;
		this.projectMarks = projectMarks;
	}
	
//	Methods
	public void calcPercentage() {
		int sum = this.marksSecured + this.projectMarks;
		if( sum < 0 || sum > 400 ) {
			System.out.println("Please enter the correct marks");
		} else {
			double percentage = ( (double)sum / Student.TOTAL_MAXIMUM_MARKS ) * 100.0;
			System.out.println("The total aggregate percentage secured by the Intern is " + Math.round(percentage*100) / 100.0);
			System.out.println();
		}
	}

}
