package callableAndFuture;

import java.util.concurrent.Callable;

public class WithdrawThread implements Callable<Boolean> {
	
	Account account;
	double amount;
	
	public WithdrawThread(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public Boolean call() throws Exception {
		try {
			if (account.checkBalance() >= amount) {
				Thread.sleep(2000); // Introducing some delay
				account.withdraw(this.amount);
				System.out.println("Balance after withdrawal: " + account.checkBalance());
				return true;
			} 
			else
				throw new Exception("Not enough balance");
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
