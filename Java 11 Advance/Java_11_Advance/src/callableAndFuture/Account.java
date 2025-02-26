package callableAndFuture;

public class Account {
	
	double balance;
	
//	Instance Variables
	public Account(double balance) {
		this.balance = balance;
	}
	
//	Methods
	public double checkBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
}
