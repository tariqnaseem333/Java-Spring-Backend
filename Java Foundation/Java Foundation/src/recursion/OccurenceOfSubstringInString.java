package recursion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurenceOfSubstringInString {
	
    public static int countSubstring(String inputString, String substring, int count) {
    	if( inputString.contains(substring) ) {
    		count++;
    		String str = inputString.replaceFirst(substring, "");
    		return countSubstring(str, substring, count);
    	} else {
    		return count;
    	}

    }
   
    public static void main(String args[]) {
        int count = countSubstring("I felt happy because I saw the others were Happy and because "
        		+ "I knew I should feel happy, but I was not really happy","happy", 0);
        System.out.println(count);
    }

}
