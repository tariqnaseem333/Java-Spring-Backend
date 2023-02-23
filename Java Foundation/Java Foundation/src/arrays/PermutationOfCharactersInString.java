package arrays;

public class PermutationOfCharactersInString {
	
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
		String[] finalArr = new String[ fact(str.length()) ];

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

					for( int k = 1; k < arr.length; k++  ) {
						if( k == arr.length-1 ) {
							swapCharElements( arr, k, 1 );
							String delimiter1 = "";
							String result1 = String.join(delimiter1, arr);
							finalArr[i] = result1;
							i++;
						} else {
							swapCharElements( arr, k, k+1 );
							String delimiter2 = "";
							String result2 = String.join(delimiter2, arr);
							finalArr[i] = result2;
							i++;
						}

					}
					for( int k = 1; k < arr.length-1; k++  ) {
						swapCharElements( arr, k, k+1 );
						String delimiter3 = "";
						String result3 = String.join(delimiter3, arr);
						finalArr[i] = result3;
						i++;
					}
			}

			return finalArr;
		}


		return finalArr;
	}

	public static void main(String args[]){
		String str = "abcd";
		String permutations[] = findPermutations(str);
		for(String permutation: permutations){
			if (permutation!=null)
				System.out.println(permutation);
		}
	}

}
