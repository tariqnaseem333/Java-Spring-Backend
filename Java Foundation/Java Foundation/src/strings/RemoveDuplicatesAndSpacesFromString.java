package strings;

public class RemoveDuplicatesAndSpacesFromString {
	
    public static String removeDuplicatesandSpaces(String str){
        int n = str.length();
        
        String newStr = "";
        for( int i = 0; i < n; i++ ) {
        	String currentCharacter = "" + str.charAt(i);
        	if( str.charAt(i) == ' ' || ( newStr.contains(currentCharacter) ) ) {
        		
        	} else {
        		newStr = newStr + str.charAt(i);
        	}
        }
        return newStr;
	}
	
	public static void main(String args[]){
	    String str = "object oriented programming";
	    System.out.println(removeDuplicatesandSpaces(str));
	}

}
