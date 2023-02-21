package arrays;

public class SumOfEvenNumbersInArray {

	public static int calculateSumOfEvenNumbers(int[] numbers){

		int n = numbers.length;
		int evenSum = 0;
		for( int i = 0; i < n; i++ ) {
			if( numbers[i] % 2 == 0 )
				evenSum = evenSum + numbers[i];
		}

		return evenSum;
	}


	public static void main(String[] args) {

		int[] numbers = {68,79,86,99,23,2,41,100};
		System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(numbers));

	}
}
