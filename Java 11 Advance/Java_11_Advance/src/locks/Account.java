package locks;

public class Account {
	
//	Instance Variables
	double balance;
	
//	Constructor
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
