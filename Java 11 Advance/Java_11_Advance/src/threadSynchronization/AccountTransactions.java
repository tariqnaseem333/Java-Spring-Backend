package threadSynchronization;

public class AccountTransactions {

	public static void main(String[] args) {
		
		Account myAccount = new Account(1000);
		
		WithdrawThread thread1= new WithdrawThread(1,myAccount, 1000);
		thread1.start();
		
		WithdrawThread thread2= new WithdrawThread(2,myAccount, 1000);
		thread2.start();
		

	}

}
