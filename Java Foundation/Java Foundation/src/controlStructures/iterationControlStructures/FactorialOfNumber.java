package controlStructures.iterationControlStructures;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
//		Factorial is: 5! = 5*4*3*2*1     i.e.,5! = 120
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int fact = 1;
		
		for( int i = 1; i <= n; i++ ) {
		   fact = fact*i;
		}
		
		System.out.println(fact);

	}

}
