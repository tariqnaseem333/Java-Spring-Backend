package arrays;

public class FindNumbers {
	
	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];

		if( num1 > num2 ) {
			System.out.println("num2 should be greater than num1!!");
			return numbers;
		}
		
		int j = 0;
		for ( int i = num1; i <= num2; i++ ) {
			if( i/10 != 0 ) {
				int sum = 0;
				int N = i;
				while( N > 0 ) {
					int rem = N%10;
					sum = sum + rem;
					N = N / 10;
				}
				if( sum%3 == 0 && i%5 == 0 ) {
					numbers[j] = i;
					j++;
				}
			}
		}
		return numbers;
	}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 200;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}
		

	}

}
