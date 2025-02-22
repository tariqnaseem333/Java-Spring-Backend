package threadSynchronization;

public class WithdrawThread extends Thread {

	int threadNumber;
	Account account;
	double amount;

	WithdrawThread(int  threadNumber, Account account, double amount) {
		this.threadNumber = threadNumber;
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		synchronized (account) {
			try {
				if (account.getBalance() >= amount) {
					if(threadNumber==1) {   //Network Issues For WitdrawThread : 1
						Thread.sleep(100);
					}
					account.withdraw(this.amount);
					System.out.println("Balance after withdrawal: " + account.getBalance()+ " by "+this);
				}
				else
					throw new Exception("Not enough balance"+ " by "+this);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public String toString() {
		return "WithdrawThread: " + threadNumber;
	}


}
