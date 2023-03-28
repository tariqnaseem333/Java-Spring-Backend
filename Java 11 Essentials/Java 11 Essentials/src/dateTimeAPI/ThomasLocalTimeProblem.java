package dateTimeAPI;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ThomasLocalTimeProblem {

	public static void main(String[] args) {
		/*

Exercise :- 
			Thomas has to board train departing at 8:00 PM, You have to check whether he will be able to board or not.
			It takes him 2.5 hrs to reach the station and further 15 mins to reach the platform.
			Before what time should he leave his house in order to board the train ?
			(Hint :- You can use isAfter() and isBefore() methods, take reference from LocalDate tryout)

		 */
		
		LocalTime trainTiming = LocalTime.of(8, 0);
		LocalTime thomasLeaveHouseTime = trainTiming.minusHours(2).minusMinutes(45);
		System.out.println("He should leave the house on or before: " + thomasLeaveHouseTime);
		
		if( ChronoUnit.HOURS.between(thomasLeaveHouseTime, trainTiming) >= 2 && 
			ChronoUnit.MINUTES.between(thomasLeaveHouseTime, trainTiming) >= 45) {
			System.out.println("He should be able to board the train");
		} else {
			System.out.println("He should not be able to board the train");
		}
		
		

	}

}
