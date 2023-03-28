package dateTimeAPI;

import java.time.LocalDateTime;

public class LocalDateTimeProblem {
	
	public static void main( String args[] ) {
//	    Exercise :- Segregate each element from dateOne 
//	    (for example: year,month,day...etc) using get() method and display
		
		LocalDateTime now = LocalDateTime.now();
		int year = now.getYear();
		int month = now.getMonth().getValue();
		int day = now.getDayOfMonth();
		
		System.out.println("Current Year: " + year);
		System.out.println("Current Month: " + month);
		System.out.println("Current day: " + day);
	}

}
