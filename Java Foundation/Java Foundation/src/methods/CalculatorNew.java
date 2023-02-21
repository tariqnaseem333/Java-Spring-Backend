package methods;
public class CalculatorNew {
	
//	Instance Variables
	public int num;
	
//	Methods
	public int sumOfDigits() {
		int sum = 0;
		int N = this.num;
		while( N > 0 ) {
			int rem = N % 10;
			sum = sum + rem;
			N = N / 10;
		}
		return sum;
	}
}
