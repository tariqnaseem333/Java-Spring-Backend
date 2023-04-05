package abstractKeyword;

public class GraduateStudent extends Student {
	
//	Constructor
	public GraduateStudent( String name ) {
		super( name );
	}
	
//	Method
	@Override
	public void generateResult() {
		int sum = 0;
		for( int i = 0; i < this.getTest().length; i++) {
			sum = sum + this.getTest()[i];
		}
		double average = ( (double)sum )/ this.getTest().length;
		
		if( average >= 70 && average <= 100) {
			this.setResult("Pass");
		} 
		else if( average >= 0 && average < 70 ) {
			this.setResult("Fail");
		} 
		else {
			this.setResult("Invalid Result");
		}
	}

}
