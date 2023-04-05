package interfaceKeyword;

public class StudentTester {

	public static void main(String[] args) {
		
		Student intern1 = new Intern(283, 77);
		System.out.print("The total aggregated Percentage Secured by Trainee: " );
		intern1.calcPercentage();
		
		Student trainee1 = new Trainee( 370 );
		System.out.print("The total aggregated Percentage Secured by Intern: " );
		trainee1.calcPercentage();

	}

}
