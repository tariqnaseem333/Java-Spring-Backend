package dateTimeAPI;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculatorFromGivenDate {

	public static void main(String[] args) {
		
//		Input: 02-11-1991
//      Output: You are 32 years, 2 months and 18 days old.Depending on Today's Date.
		
//		Taking Input of User's Date of Birth
		Scanner scanner = new Scanner( System.in );
		System.out.println("Enter your date of birth in the format- (e.g., 02-11-1991)");
		String dateOfBirth = scanner.nextLine();
		scanner.close();
		
//		Parsing input string as a LocalDate Object
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate birthDate = LocalDate.parse(dateOfBirth, dtf);
		
		LocalDate today = LocalDate.now();
		Period period = Period.between(birthDate, today);
		
		System.out.println("You are " + period.getYears() + " years, " + period.getMonths() + " months and " + period.getDays() + " days old.");
		
	}
	
}
