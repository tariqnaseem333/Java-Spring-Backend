package controlStructures;

public class LuckyNumber {

	public static void main(String[] args) {
		int num = 1523;
		
		String str = String.valueOf(num);
		int length = str.length();
		int N = 0;
		if( length%2 == 0 ) {
			N = num;
		} else {
			N = num / 10;
		}
		
		int rem = 0;
		int sum = 0;
		while( N > 0 ) {
			rem = N % 10;
			sum = sum + (int)Math.pow(rem, 2);
			N = N / 100;
		}
		
		if( sum%9 == 0 ) {
			System.out.println("The number " + num + " is a Lucky Number");
		} else {
			System.out.println("Oops! Not a Lucky number");
		}
		

	}

}
