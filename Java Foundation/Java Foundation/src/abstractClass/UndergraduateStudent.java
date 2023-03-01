package abstractClass;

public class UndergraduateStudent extends Student {
	
//	Constructor
	public UndergraduateStudent( String studentName ) {
		super( studentName );
	} 
	
//	Methods
	public void generateResult() {
		int sum = 0;
		for( int testScore : super.getTestScores() ) {
			sum = sum + testScore;
		}
		double average = ( (double)sum ) / super.getTestScores().length;
		if( average >= 60 ) {
			super.setTestResult("Pass");
		} else {
			super.setTestResult("Fail");
		}
	}
	

}
