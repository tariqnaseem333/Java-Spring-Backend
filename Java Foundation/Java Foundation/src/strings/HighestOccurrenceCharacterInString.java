package strings;

public class HighestOccurrenceCharacterInString {
	
	public static int findHighestOccurrence(String str){
		int n = str.length();
		
//		Populating Array with count of each character
		int[] occurrenceArr = new int[n];
		for( int i = 0; i < n; i++ ) {
			occurrenceArr[i] = 1;
			for( int j = 0; j < n; j++ ) {
				if( i == j ) {
					continue;
				} else {
					if( str.charAt(i) == str.charAt(j) ) {
						occurrenceArr[i]++;
					}
				}
			}
		}
		
//		Finding Highest Count out of count of each character
		int highestCount = Integer.MIN_VALUE;
		for( int i = 0; i < n; i++ ) {
			if( occurrenceArr[i] > highestCount ) {
				highestCount = occurrenceArr[i];
			}
		}
			
        return highestCount;
	}
	
	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}

}
