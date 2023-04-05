package abstractKeyword;

public class StudentTester {
	
	public static void main(String[] args) {
		
		GraduateStudent gs1 = new GraduateStudent( "Ajay" );
		gs1.setTestScore(0, 70);
		gs1.setTestScore(1, 69);
		gs1.setTestScore(2, 71);
		gs1.setTestScore(3, 55);
		gs1.generateResult();
		System.out.println("Name: " + gs1.getName());
		System.out.println("Result: " + gs1.getResult());
		
		UndergraduateStudent us1 = new UndergraduateStudent( "Mehul" );
		us1.setTestScore(0, 70);
		us1.setTestScore(1, 69);
		us1.setTestScore(2, 71);
		us1.setTestScore(3, 55);
		us1.generateResult();
		System.out.println("Name: " + us1.getName());
		System.out.println("Result: " + us1.getResult());
		

		
	}

}
