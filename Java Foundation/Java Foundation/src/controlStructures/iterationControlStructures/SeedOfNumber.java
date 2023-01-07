package controlStructures.iterationControlStructures;

import java.util.Scanner;

public class SeedOfNumber {

	public static void main(String[] args) {
		
//		E.g.: 123 is a seed of 738 as 123*1*2*3 = 738
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the seed Number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the real Number: ");
		int num2 = scanner.nextInt();
		
		int seed = num1;
		int rem = 0;
		int N = num1;
		while( N > 0 ) {
			rem = N%10;
			seed = seed*rem;
			N = N/10;
		}
		
		if( seed == num2 ) {
			System.out.println(num1 + " is a seed of " + num2);
		} else {
			System.out.println(num1 + " is not a seed of " + num2);
		}
		

	}

}
