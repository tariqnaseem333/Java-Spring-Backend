package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCharacterClass {
	
	public static void main( String args[] ) {
		
		System.out.println("String matcher the given regex : " + Pattern.matches("[xyz]", "wbcd"));
		System.out.println("String matcher the given regex : " + Pattern.matches("[xyz]", "x"));
		System.out.println("String matcher the given regex : " + Pattern.matches("[xyz]", "xxyyyyz"));
		
	}

}
