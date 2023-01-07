package controlStructures.iterationControlStructures;

import java.util.Scanner;

public class ReverseTrianglePattern {
	
	public static void main(String[] args) {
		
//		Print the Pattern for n = 4 :-
//		****
//		***
//		**
//		*
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
	     
	     int i = 1;
	     while( i <= num ) {
	         int j = 1;
	         while( j <= (num-i+1) ) {
	             System.out.print("*");
	             j++;
	         }
	         i++;
	         System.out.println();
	     }
	     
	}

}
