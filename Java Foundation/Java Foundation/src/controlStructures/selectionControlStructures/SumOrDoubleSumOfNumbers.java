package controlStructures.selectionControlStructures;

import java.util.Scanner;

public class SumOrDoubleSumOfNumbers {

	public static void main(String[] args) {
		
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
