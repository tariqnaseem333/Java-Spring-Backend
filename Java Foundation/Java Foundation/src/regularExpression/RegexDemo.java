package regularExpression;

import java.util.regex.*;

public class RegexDemo {
	
	public static void main( String args[] ) {
		Pattern pattern = Pattern.compile(".xx.");
		Matcher matcher = pattern.matcher("AxxB");
		System.out.println("String matcher the given regex : " + matcher.matches());
//		Or,
//		System.out.println("String matcher the given regex : " + Pattern.matches(".xx.", "AxxB"));
		
	}

}
