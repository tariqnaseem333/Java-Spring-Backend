package locks;

import java.util.concurrent.locks.ReentrantLock;

public class DepositThread implements Runnable {
	
//	Instance Variables
	ReentrantLock lock;
	Account account;
	double amount;
	
//	Constructor
	public DepositThread(ReentrantLock lock, Account account, double amount) {
		this.lock = lock;
		this.account = account;
		this.amount = amount;
	}
	
//	Runnable's Method
	@Override
	public void run() {
		try {
			lock.lock();
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
		finally {
			lock.unlock();
		}
	}
	
}
