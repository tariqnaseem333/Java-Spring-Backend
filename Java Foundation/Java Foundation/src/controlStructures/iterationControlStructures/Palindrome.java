package controlStructures.iterationControlStructures;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
//		Palindrome is a sequence that reads the same backwards as forwards.
//		Example: 1331 = 1331
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		
		String str = String.valueOf(num);
		int l = str.length() - 1;
		
		int rem = 0;
		int reverseNum = 0; 
		int tens = (int)Math.pow(10, l);
		int N = num;
		while( N > 0 ) {
			rem = N%10;
			reverseNum = reverseNum + rem*tens;
			tens = tens/10;
			N = N/10;
		}
		
		if( num == reverseNum ) {
			System.out.println(num + " is Palindrome");
		} else {
			System.out.println(num + " is not Palindrome");
		}
		

	}

}
