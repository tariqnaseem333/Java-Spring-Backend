package executorFramework;

public class WithdrawThread implements Runnable {

//	Instance Variables
	Account account;
	double amount;

//	Constructor
	public WithdrawThread(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}
	
//	Runnable's method
	@Override
	public void run() {
		try {
			if (account.checkBalance() >= amount) {
				Thread.sleep(2000); // Introducing some delay
				account.withdraw(this.amount);
				System.out.println("Balance after withdrawal: " + account.checkBalance());
			} 
			else
				throw new Exception("Not enough balance");
		} 
		catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

