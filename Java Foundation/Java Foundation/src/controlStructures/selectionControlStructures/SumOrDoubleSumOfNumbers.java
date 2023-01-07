package controlStructures.selectionControlStructures;

import java.util.Scanner;

public class SumOrDoubleSumOfNumbers {

	public static void main(String[] args) {
		
//		Implement a program to display the sum of two given numbers if the numbers are same.
//		If the numbers are not same, display the double of the sum.
//		Example: For (6,5) --> 22 and (5,5) --> 10
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the Second Number: ");
		int num2 = scanner.nextInt();
		
		if( num1 == num2 ) {
			int sum = num1 + num2;
			System.out.println(sum);
		} else {
			int sum = 2 * ( num1 + num2 );
			System.out.println(sum);
		}
		
		

	}

}
