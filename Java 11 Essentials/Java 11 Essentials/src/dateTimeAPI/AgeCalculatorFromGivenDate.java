package dateTimeAPI;

import java.time.LocalDate;

public class AgeCalculatorFromGivenDate {

	public static void main(String[] args) {
		
//		An age calculator that determines the age from current date, up to the day precision.
		
		LocalDate today = LocalDate.now();
		LocalDate dateOfBirth = LocalDate.of(1991, 11, 2);
		
		System.out.println("You are " + today.minusYears(dateOfBirth.getYear()).getYear()
				+ " years, " + today.minusMonths(dateOfBirth.getMonthValue()).getMonthValue()
				+ " months and " + today.minusDays(dateOfBirth.getDayOfMonth()).getDayOfMonth()
				+ " days old");

	}

}
