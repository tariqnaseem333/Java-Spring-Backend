package controlStructures.selectionControlStructures;

import java.util.Scanner;

public class MetroBankLoan {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
//		Input Account Number along with Validation
		int accNumber;
		while(true) {
			System.out.println("Enter your Account Number: ");
			accNumber = scanner.nextInt();
			String str  = String.valueOf(accNumber);
			if( str.length() != 4 || accNumber/1000 != 1 ) {
				System.out.println("The Account Number is Invalid. Enter a Valid Account Number");
			} else {
				break;
			}
		}
		
//		Input Account Balance along with Validation
		int accBalance;
		while(true) {
			System.out.println("Enter your Account Balance: ");
			accBalance = scanner.nextInt();
			if( accBalance < 1000 ) {
				System.out.println("The Account Balance is Insufficient. Please have atleast 1000$ in Account");
			} else {
				break;
			}
		}
		
//		Taking Input for Salary, Type of Loan, Expected Loan Amount and Expected EMI
		System.out.println("Enter your Salary: ");
		int salary = scanner.nextInt();
		System.out.println("Enter the Type of Loan you want to avail: ");
		String loanType = scanner.next();
		System.out.println("Enter your Expected Loan Amount: ");
		int expectedLoanAmount = scanner.nextInt();
		System.out.println("Enter your Expected EMI for Loan: ");
		int expectedEMI = scanner.nextInt();
		
//		Initializing Eligible Loan Amount and Eligible EMI to be 0
		int eligibleLoanAmount = 0;
		int eligibleEMI = 0;
		
//		Deciding Eligible Loan Amount and Eligible EMI based on salary and loan type
		if( loanType.equals("Car") && salary > 25000 ) {
				eligibleLoanAmount = 500000;
				eligibleEMI = 36;
		}
		else if( loanType.equals("House") && salary > 50000 ) {
				eligibleLoanAmount = 6000000;
				eligibleEMI = 60;
		}
		else if( loanType.equals("Business") && salary > 75000 ) {
				eligibleLoanAmount = 7500000;
				eligibleEMI = 84;
		}
		else {
			System.out.println("The loan type is Invalid. Enter a valid loan type.");
		}

//	    Bank will provide loan or Not
		if( expectedLoanAmount <= eligibleLoanAmount && expectedEMI <= eligibleEMI ) {
			System.out.println("Account Number: " + accNumber);
			System.out.println("Expected Loan Amount: " + expectedLoanAmount);
			System.out.println("Eligible Loan Amount: " + eligibleLoanAmount);
			System.out.println("Expected EMI: " + expectedEMI);
			System.out.println("Eligible EMI: " + eligibleEMI);
		} else {
			System.out.println("The loan Amount and EMI you requested cannot be provided by the bank. Thanks for your Interest");
		}

	}



}
