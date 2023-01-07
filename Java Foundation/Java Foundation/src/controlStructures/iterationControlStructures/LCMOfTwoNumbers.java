package controlStructures.iterationControlStructures;

import java.util.Scanner;

public class LCMOfTwoNumbers {

	public static void main(String[] args) {
		
//		Determine the LCM of two numbers which is the
//		smallest positive number that is divisible by both num1 and num2.
//		Example: For (9,7) -- > 63 and (5,10) --> 10
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first Number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second Number: ");
		int num2 = scanner.nextInt();
		
		int least = 1;
		if( num1 < num2 ) {
		    least = num1;
		} else {
		    least = num2;
		}
		
		for( int i = least; i <= ( num1*num2 ); i++ ) {
		    if( i%num1 == 0 && i%num2 == 0 ) {
		        System.out.println(i);
		        return;
		    }
		}

	}

}
