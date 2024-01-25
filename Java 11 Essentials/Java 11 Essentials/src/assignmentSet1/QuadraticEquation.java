package assignmentSet1;

import java.util.Scanner;

public class QuadraticEquation {
	
	public static void main(String[] args) {

//		Taking Input of Coefficients of Quadratic Equation from the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the coefficient of x^2");
		int a = scanner.nextInt();
		System.out.println("Enter the coefficient of x^1");
		int b = scanner.nextInt();
		System.out.println("Enter the coefficient of x^0");
		int c = scanner.nextInt();
		scanner.close();

		double discriminant = Math.pow(b, 2) - 4*a*c;
		
		if( discriminant > 0 ) {
			double root1 = ( -b + Math.sqrt(discriminant) ) / (2*a);
			double root2 = ( -b - Math.sqrt(discriminant) ) / (2*a);
			System.out.println("The roots are: " + root1 + " " + root2);
		}
		else if( discriminant < 0 ) {
			System.out.println("The equation does not have real roots.");
		}
		else {
			double root = ( -b + Math.sqrt(discriminant) ) / 2*a;
			System.out.println("The roots is: " + root);
		}

	}
	
	
}
