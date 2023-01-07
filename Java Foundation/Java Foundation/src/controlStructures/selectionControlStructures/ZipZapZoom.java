package controlStructures.selectionControlStructures;

import java.util.Scanner;

public class ZipZapZoom {
	
	public static void main(String[] args) {
		
//		If the number is a multiple of 3, display "Zip".
//		If the number is a multiple of 5, display "Zap".
//		If the number is a multiple of both 3 and 5, display "Zoom",
//		For all other cases, display "Invalid".
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scanner.nextInt();
		
		if( num%15 == 0 ) {
		    System.out.println("Zoom");
		} else {
		    if( num%3 == 0 ) {
		        System.out.println("Zip");
		    }
		    else if( num%5 == 0 ) {
		        System.out.println("Zap");
		    }
		    else {
		        System.out.println("Invalid");
		    }
		}
	}

}
