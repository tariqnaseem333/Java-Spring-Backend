package methods;
public class CalculatorNewTester {
	
	public static void main(String args[]) {
		CalculatorNew calculator = new CalculatorNew();
		calculator.num = 6457;
		int sum = calculator.sumOfDigits();
		System.out.println(sum);
	}
}
