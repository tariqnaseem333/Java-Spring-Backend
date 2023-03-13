package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuantifiers {
	
	public static void main( String args[] ) {
		
		System.out.println("Regex ? Quantifiers");
		System.out.println(Pattern.matches("[ayz]?", "a"));
		System.out.println(Pattern.matches("[ayz]?", "aaa"));
		System.out.println(Pattern.matches("[ayz]?", "ayyyyzz"));
		System.out.println(Pattern.matches("[ayz]?", "amnta"));
		System.out.println(Pattern.matches("[ayz]?", "ayz"));
		
		System.out.println("Regex + Quantifiers: ");
		System.out.println(Pattern.matches("[ayz]+", "a"));
		System.out.println(Pattern.matches("[ayz]+", "aaa"));
		System.out.println(Pattern.matches("[ayz]+", "ayyyyzz"));
		System.out.println(Pattern.matches("[ayz]+", "aamnta"));
		
		System.out.println("Regex * Quantifiers: ");
		System.out.println(Pattern.matches("[ayz]*", "ayyyza"));
	}

}
