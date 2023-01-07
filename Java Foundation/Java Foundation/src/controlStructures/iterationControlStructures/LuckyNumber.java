package controlStructures.iterationControlStructures;

import java.util.Scanner;

public class LuckyNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		
		String str = String.valueOf(num);
		int length = str.length();
		
		int rem = 0;
		int luckyNum = 0;
		int N = num;
		while( N > 0 ) {
			if( length%2 == 0 ) {
		        rem = N % 10;
		        luckyNum = luckyNum + (int)Math.pow( rem, 2 );
		        N = N / 100;
		    } else {
		        N = N /10;
		        rem = N % 10;
		        luckyNum = luckyNum + (int)Math.pow( rem, 2 );
		        N = N / 10;
		    }
		}
		
		if( luckyNum%9 == 0 ) {
		    System.out.println("The number " + num + " is a lucky number");
		} else {
		    System.out.println("The number " + num + " is not a lucky number");
		}
	}

}
