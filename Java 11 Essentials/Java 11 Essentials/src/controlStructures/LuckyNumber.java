package controlStructures;

public class LuckyNumber {

	public static void main(String[] args) {
		
//		Example : 1623 = 6^2+3^2 = 45 is a multiple of 9 and hence it is a Lucky number
//		Input: 16235
//		Output: The number 1623 is a Lucky number
//		Input: 1523
//		Output: Oops! Not a Lucky number   
		
		int num = 16235;
		
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
			sum += (int)Math.pow(rem, 2);
			N = N / 100;
		}
		
		if( sum % 9 == 0 ) {
			System.out.println("The number " + num + " is a Lucky Number");
		} else {
			System.out.println("Oops! Not a Lucky number");
		}
		

	}

}
