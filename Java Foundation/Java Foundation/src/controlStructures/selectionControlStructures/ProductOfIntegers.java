package controlStructures.selectionControlStructures;

import java.util.Scanner;

public class ProductOfIntegers {

	public static void main(String[] args) {
		
//		Calculate the product of three positive integer values. 
//		However, if one of the integers is 7, consider only the values to the right of 7 for calculation.
//		If 7 is the last integer, then display -1.
//		Note: Only one of the three values can be 7.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the Second Number: ");
		int num2 = scanner.nextInt();
		System.out.println("Enter the Third Number: ");
		int num3 = scanner.nextInt();
		
		if( num1 == 7 ) {
			System.out.println(num2*num3);
		} else if( num2 == 7 ) {
			System.out.println(num3);
		} else if( num3 == 7 ) {
			System.out.println("-1");
		} else {
			System.out.println(num1*num2*num3);
		}

	}

}
