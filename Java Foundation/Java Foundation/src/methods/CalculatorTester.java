package methods;

public class CalculatorTester {
	
	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		
//		Invoke the method findAverage of the Calculator class and display the average
		double res = calculator.findAverage(12, 8, 5);
		System.out.println(res);
	}

}
