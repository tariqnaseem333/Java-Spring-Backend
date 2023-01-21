package methods;

public class Calculator {

	public double findAverage( double num1, double num2, double num3 ) {
		double res = (num1+num2+num3) / 3;
		return Math.round(res*100.0) / 100.0;
	}
}

