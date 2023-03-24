package assignmentSet1;

import java.util.Scanner;

public class QuadraticEquation {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the coefficient of x^2");
		int a = s.nextInt();
		System.out.println("Enter the coefficient of x^1");
		int b = s.nextInt();
		System.out.println("Enter the coefficient of x^0");
		int c = s.nextInt();
		
		double discremenent = b*b - 4*a*c;
		if( discremenent > 0 ) {
			double r1 = ( -b + Math.sqrt(discremenent) ) / (2*a);
			double r2 = ( -b - Math.sqrt(discremenent) ) / (2*a);
			System.out.println("The roots are: " + r1 + " " + r2);
		}
		else if( discremenent < 0 ) {
			System.out.println("The equation does not have real roots.");
		}
		else {
			double r = ( -b + Math.sqrt(discremenent) ) / 2*a;
			System.out.println("The roots is: " + r);
		}
		
		
	}
	
	
}
