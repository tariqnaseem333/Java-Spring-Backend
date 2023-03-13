package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	
	public static void main( String args[] ) {
		
		try( Scanner sc = new Scanner(System.in) ) {
			while( true ) {
				System.out.println("Enter Regex Pattern: ");
				String regexPattern = sc.nextLine();
				Pattern pattern = Pattern.compile(regexPattern);
				Matcher matcher = pattern.matcher("Welcome to Infosys");
				boolean found = false;
				while( matcher.find() ) {
					System.out.println("Found the Text " + matcher.group() 
					+ " starting at index " + matcher.start() + " and ending at index "
					+ matcher.end() );
					found = true;
				}
				if( !found ) {
					System.out.println("Match not Found");
				}
			}
		}
	}

}
