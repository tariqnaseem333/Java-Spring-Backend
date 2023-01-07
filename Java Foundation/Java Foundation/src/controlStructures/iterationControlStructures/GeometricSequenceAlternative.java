package controlStructures.iterationControlStructures;

import java.util.Scanner;

public class GeometricSequenceAlternative {

	public static void main(String[] args) {
		
//		Print the Geometric Sequence of the following series till the number N.
//		1, 2, 4, 8, 16, 32, 64, ......, 1024
//		Example: For N = 5, Series:  1, 2, 4, 8, 16
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scanner.nextInt();
		int factor = 2;
		int res = 1;
		
		for( int i = 0; i < num; i++ ) {
			res = 1;
			for( int j = 1; j <= i; j++ ) {
				res = res * factor;
			}
			if( i == num-1 ) {
				System.out.print(res);
			} else {
				System.out.print(res + ", ");
			}
			
		}

	}

}
