package executorFramework;

public class Account {

//	Instance Variables
	double balance;

//	Methods
	public Account(double balance) {
		this.balance = balance;
	}
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
