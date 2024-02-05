package interfaceKeyword;

public class StudentTester {

	public static void main(String[] args) {
		
		Student intern = new Intern(283, 77);
		intern.calcPercentage();
		
		Student trainee = new Trainee( 370 );
		trainee.calcPercentage();

	}

}
