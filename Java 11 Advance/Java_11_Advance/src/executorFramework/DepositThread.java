package executorFramework;

public class DepositThread implements Runnable {
	
//	Instance Variables
	Account account;
	double amount;
	
//	Constructor
	public DepositThread(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}
	
//	Runnable's Method
	@Override
	public void run() {
		try {
			Thread.sleep(2000); // Introducing some delay
			account.deposit(this.amount);
			System.out.println("Balance after deposit: " + account.checkBalance());
		}
		catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}

