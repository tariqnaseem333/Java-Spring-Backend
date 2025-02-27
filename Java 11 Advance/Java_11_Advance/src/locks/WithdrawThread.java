package locks;

import java.util.concurrent.locks.ReentrantLock;

public class WithdrawThread implements Runnable {
	
//	Instance Variables
	ReentrantLock lock;
	Account account;
	double amount;
	
//	Constructor
	public WithdrawThread(ReentrantLock lock, Account account, double amount) {
		this.lock = lock;
		this.account = account;
		this.amount = amount;
	}
	
//	Runnable's method
	@Override
	public void run() {
		try {
			if (account.checkBalance() >= amount) {
				lock.lock();
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
		finally {
			lock.unlock();
		}
	}
	
}

