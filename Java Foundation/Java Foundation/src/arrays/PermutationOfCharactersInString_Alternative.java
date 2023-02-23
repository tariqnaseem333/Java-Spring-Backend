package arrays;

public class PermutationOfCharactersInString_Alternative {

	//	Solution for String length = 4 or more and no Repeated Characters
	//	in the string

	public static int fact( int n ) {
		int fact = 1;
		for( int i = 1; i <= n; i++ ) {
			fact = fact*i;
		}
		return fact;
	} 

	public static void swapCharElements( String[] arr, int start, int end ) {
		String temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	public static String[] findPermutations(String str){
		int n = str.length();

		int count = 0;
		if( str.charAt(0) == str.charAt(1) ) {
			count++;
		} 
		if( str.charAt(1) == str.charAt(2) ) {
			count++;
		}
		if( str.charAt(0) == str.charAt(3) ) {
			count++;
		}

		String[] finalArr = new String[ fact(n) / fact(count) ];

		int i = 0;
		while( i < finalArr.length ) { 

			String[] arr = str.split("");

			for( int j = 0; j < arr.length; j++ ) {
				arr = str.split("");
				swapCharElements( arr, 0, j );
				String delimiter = "";
				String result = String.join(delimiter, arr);
				finalArr[i] = result;
				i++;

				swapCharElements( arr, 1, 2 );
				String delimiter2 = "";
				String result2 = String.join(delimiter2, arr);
				finalArr[i] = result2;
				i++;

			}

		}

		return finalArr;

	}

	public static void main(String args[]){
		String str = "abc";
		String permutations[] = findPermutations(str);
		for(String permutation: permutations){
			if (permutation!=null)
				System.out.println(permutation);
		}
	}

}
