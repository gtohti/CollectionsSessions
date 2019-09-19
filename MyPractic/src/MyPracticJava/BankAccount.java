package MyPracticJava;

public class BankAccount {
	double balance;
	String accountHolder;

	public void showAccountHolder() {
		System.out.println("Account holder name is " + accountHolder);
	}

	public void showBalance() {
		System.out.println("Account balance: " + balance);

	}

	// deposit
	public void deposit(double amount) {
		balance = balance + amount;
	}

	// withdraw
	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public void add100Dollars() {
		balance = balance + 100;
	}

	public void printInfo() {
		System.out.println("Customer: " + accountHolder + ", Balance: " + balance + "$");
	}

}
