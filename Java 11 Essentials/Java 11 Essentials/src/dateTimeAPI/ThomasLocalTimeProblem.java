package dateTimeAPI;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ThomasLocalTimeProblem {

	public static void main(String[] args) {
		/*

Exercise :- 
			Thomas has to board train departing at 8:00 PM, You have to check whether he will be able to board or not.
			It takes him 2.5 hrs to reach the station and further 15 mins to reach the platform.
			Before what time should he leave his house in order to board the train ?
			(Hint :- You can use isAfter() and isBefore() methods, take reference from LocalDate tryout)

		 */
		
//		Taking Input of Thomas House Leaving Time
		Scanner scanner = new Scanner( System.in );
		System.out.println("Enter the time at which thomas left for station in the format- (e.g., 01:30 PM)");
		String time = scanner.nextLine();
		scanner.close();
		
//		Parsing input string as a LocalTime Object
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
		LocalTime thomasLeftHouseTime = LocalTime.parse(time, dtf);
		
		LocalTime trainTiming = LocalTime.of(20, 0);
		if( (thomasLeftHouseTime.plusHours(2).plusMinutes(45)).isBefore(trainTiming) ) {
			System.out.println("Yes, Thomas will be able to board the Train");
		}
		else {
			Duration duration = Duration.between(trainTiming, (thomasLeftHouseTime.plusHours(2).plusMinutes(45)));
			System.out.println("No, Train already left. Thomas should have left house: " + 
					duration.toHours() + " hours and " + (duration.toMinutes()+1) + " minutes earlier");
		}

	}

}
