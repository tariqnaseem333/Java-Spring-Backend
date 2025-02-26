package callableAndFuture;

import java.util.concurrent.Callable;

public class DepositThread implements Callable<Boolean> {
	
	Account account;
	double amount;
	
	public DepositThread(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public Boolean call() throws Exception {
		try {
			Thread.sleep(2000); // Introducing some delay
			account.deposit(this.amount);
			System.out.println("Balance after deposit: " + account.checkBalance());
			return true;
		}
		catch (InterruptedException e) {
			System.out.println(e.getMessage());
			return false;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
}
