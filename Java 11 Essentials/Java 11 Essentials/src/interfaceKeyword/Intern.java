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
		double percentage = (double)(this.marksSecured + this.projectMarks) / this.TOTAL_MAXIMUM_MARKS;
		System.out.println(percentage*100.0);
	}

}
