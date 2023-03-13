package regularExpression;

import java.util.regex.Pattern;

public class RegexMetaCharacters {
	
	public static void main( String args[] ) {
		
		System.out.println("MetaCharacters d....");
		System.out.println(Pattern.matches("d", "abc"));
		System.out.println(Pattern.matches("d", "1"));
		System.out.println(Pattern.matches("d", "4443"));
		System.out.println(Pattern.matches("d", "323abc"));
		
		System.out.println("MetaCharacters D....");
		System.out.println(Pattern.matches("D", "abc"));
		System.out.println(Pattern.matches("D", "1"));
		System.out.println(Pattern.matches("D", "4443"));
		System.out.println(Pattern.matches("D", "323abc"));
		System.out.println(Pattern.matches("D", "m"));
		
		System.out.println("MetaCharacter D with Quantifiers: ");
		System.out.println(Pattern.matches("D*", "abc"));
	}

}
