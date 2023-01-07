package controlStructures.selectionControlStructures;

import java.util.Scanner;

public class DisplayNextDate {
	
	public static void main(String[] args) {
		
//		Generate and display the next date of a given date in the format day-month-year.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Day: ");
		int day = scanner.nextInt();
		System.out.println("Enter the Month: ");
		int month = scanner.nextInt();
		System.out.println("Enter the Year: ");
		int year = scanner.nextInt();
		
		if( day == 30 && (month == 4 || month == 6 || month == 9 || month == 11 ) ) {
		    day = 1;
		    month++;
		}
		else if( day == 31 && month != 12 ) {
		    day = 1;
		    month++;
		}
		else if( day == 31 && month == 12 ) {
		    day = 1;
		    month = 1;
		    year++;
		}
		else if( day == 28 && month == 2 && year%4 == 0 ) {
		    day = 29;
		} 
		else if( day == 28 && month == 2 && year%4 != 0 ) {
		    day = 1;
		    month++;
		}
		else if( day == 29 && month == 2 ) {
		    day = 1;
		    month++;
		}
		else {
		    day++;
		}
		
		System.out.println( day + "-" + month + "-20" + year );
	}

}
