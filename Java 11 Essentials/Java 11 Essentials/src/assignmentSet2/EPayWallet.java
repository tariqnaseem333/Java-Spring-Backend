package assignmentSet2;

public class EPayWallet {

	public static void processPaymentByUser( User user, double billAmount ) {

		if( user.makePayment(billAmount) ) {
			System.out.println("Congratulations " + user.getUserName() + ", payment of " + billAmount + " was successful");
			System.out.println("Your wallet balance is " + user.getWalletBalance());
			if( user instanceof KYCUser kycUser ) {
				System.out.println("You have " + kycUser.getRewardPoints() + " reward points");
			}
			System.out.println("--------------------------------------------");
		} else {
			System.out.println("Sorry " + user.getUserName() + ", not enough balance to make payment");
			System.out.println("Your wallet balance is " + user.getWalletBalance());
			if( user instanceof KYCUser kycUser ) {
				System.out.println("You have " + kycUser.getRewardPoints() + " reward points");
			}
			System.out.println("--------------------------------------------");
		}

	}

}
