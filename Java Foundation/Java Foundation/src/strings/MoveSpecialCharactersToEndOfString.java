package strings;

public class MoveSpecialCharactersToEndOfString {
	
    public static String moveSpecialCharacters(String str){
		int n = str.length();
		String newStr1 = "";
		String newStr2 = "";
		int end = n-1;
		for( int i = 0; i < n; i++ ) {
			if( (str.charAt(i) >= 65 && str.charAt(i) <= 90) ||
				(str.charAt(i) >= 97 && str.charAt(i) <= 122) ) {
				newStr1 = newStr1 + str.charAt(i) ;
			}
			else {
				newStr2 = newStr2 + str.charAt(i);
			}
		}
		
		String newStr = newStr1 + newStr2;
        return newStr;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}

}
