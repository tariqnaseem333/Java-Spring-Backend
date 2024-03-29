package controlStructures.selectionControlStructures;

import java.util.Scanner;

public class PurchaseWith5DollarAnd1DollarNotes {
	
	public static void main(String[] args) {
		
//		You have fixed number of $5 notes and $1 notes.
//		Find out minimum number of $5 notes and $1 notes will be used to purchase.
//		If an exact change is not possible, then display -1.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1$ Notes you have: ");
		int $1Notes = scanner.nextInt();
		System.out.println("Enter the 5$ Notes you have: ");
		int $5Notes = scanner.nextInt();
		System.out.println("Enter the Purchase Amount: ");
		int purchaseAmount = scanner.nextInt();
		
		int i = 1; 
		while( 5*i <= purchaseAmount ) {
		    i++;
		}
		
		int x = i-1;
		while( x > $5Notes ) {
		    x--;
		}
		int y = purchaseAmount - 5*x;
		while( y > $1Notes ) {
		    y--;
		}
		
		if( (5*x+y) == purchaseAmount ) {
		    System.out.println("$1 Notes needed: " + y);
		    System.out.println("$5 Notes needed: " + x);
		} else {
		    System.out.println("-1");
		}

	}

}
