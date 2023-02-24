package strings;

public class CheckPalindromeOfString {
	
    public static boolean checkPalindrome(String str){
    	boolean isPalindrome = false;
    	int n = str.length();
    	
    	if( n == 0 || n == 1 ) {
    	    return true;
    	}
    	
    	int start = 0;
    	int end = n - 1;
    	while( start < end ) {
    		if( str.charAt(start) == str.charAt(end) ) {
    			isPalindrome = true;
    		} else {
    			isPalindrome = false;
    			return isPalindrome;
    		}
    		start++;
    		end--;
    	} 
    	
        return isPalindrome;
	}
	
	public static void main(String args[]){
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}

}
