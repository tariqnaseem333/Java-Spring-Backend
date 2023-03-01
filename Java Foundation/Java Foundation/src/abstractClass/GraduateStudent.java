package abstractClass;

public class GraduateStudent extends Student {
	
//	Constructor
	public GraduateStudent( String studentName ) {
		super( studentName );
	} 
	
//	Methods
	public void generateResult() {
		int sum = 0;
		for( int testScore : super.getTestScores() ) {
			sum = sum + testScore;
		}
		double average = ( (double)sum ) / super.getTestScores().length;
		if( average >= 70 ) {
			super.setTestResult("Pass");
		} else {
			super.setTestResult("Fail");
		}
	}
	

}
