package controlStructures.iterationControlStructures;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
//		1634 is an Armstrong number as 1^4 + 6^4 + 3^4+ 4^4=1634
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		
		String str = String.valueOf(num);
		int length = str.length();
		
		int rem = 0;
		int sum = 0;
		int N = num;
		while( N > 0 ) {
		    rem = N % 10;
		    sum = sum + (int)Math.pow( rem, length );
		    N = N /10;
		}
		
		if( num == sum ) {
		    System.out.println(num + " is an Armstrong Number");
		} else {
		    System.out.println(num + " is not a Armstrong Number");
		}
	}

}
