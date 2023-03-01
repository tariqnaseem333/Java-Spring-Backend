package methodOverriding;

public class UserTester {
	
    public static void main(String[] args) {

        User user = new User(199, "Henry", "henry@email.com", 650.0);

		PremiumUser premiumUser = new PremiumUser(199, "Evin", "evin@email.com", 1000.0);

		processPayment(user, 555.0);

		processPayment(premiumUser, 456.5);

		processPayment(premiumUser, 660.0);

		processPayment(premiumUser, 990.0);

    }

    public static void processPayment(User user, double billAmount) {
        if (user.makePayment(billAmount)) {
			System.out.println("Congratulations " + user.getUserName() + ", payment of $" + billAmount + " was successful!");
		} else {
			System.out.println("Sorry " + user.getUserName() + ", you do not have enough balance to pay the bill!");
		}
		System.out.println("Your wallet balance is $" + user.getWalletBalance());

		if (user instanceof PremiumUser) {
			PremiumUser premiumUser = (PremiumUser) user;
			System.out.println("You have " + premiumUser.getRewardPoints() + " points!");
		}
		System.out.println();
    }

}
