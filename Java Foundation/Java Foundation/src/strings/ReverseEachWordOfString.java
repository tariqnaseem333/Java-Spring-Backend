package strings;

public class ReverseEachWordOfString {

	public static String reverseEachWord(String str){
		int n = str.length();

//		Reversing each word of String
		String reversedStringLine = "";
		String str1 = " ";
		int i = 0;
		while( i < n) {
			if( str.charAt(i) == ' ' ) {
				reversedStringLine = reversedStringLine + str1;
				str1 = " ";
			} 
			else if( i == n-1 ) {
				reversedStringLine = reversedStringLine + str.charAt(i) + str1;
			}
			else {
				str1 = str.charAt(i) + str1;
			}
			i++;
		}
		String reversedStringLineNew = reversedStringLine.trim();
		return reversedStringLineNew;
	}


	public static void main(String args[]){
		String str = "all cows eat grass";
		System.out.println(reverseEachWord(str));
	}

}
