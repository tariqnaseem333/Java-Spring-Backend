package operators;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Principal Amount: ");
		int principal = scanner.nextInt();
		System.out.println("Enter the Rate of Interest: ");
		int rate = scanner.nextInt();
		System.out.println("Enter the Time: ");
		int time = scanner.nextInt();
		
		double simpleInterest = ( principal*rate*time ) / 100.0;
		
		System.out.println("Simple Interest is: " + simpleInterest);

	}

}
