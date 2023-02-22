package debugging;

public class SumOfNNumbers {
	
	public static int findSum( int n ) {
		int sum = 0;
		for( int i = 1; i < n; i++ ) {
//		After debugging using eclipse debugger, i<=n
//		for( int i = 1; i <= n; i++ ) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println(findSum(5));

	}

}
