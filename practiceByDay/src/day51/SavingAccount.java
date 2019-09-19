package day51;

public class SavingAccount extends BankAccount{
double returnRate;
//String accountName;
//long accountNumber; 
//double balance;

public SavingAccount(String accountName, long accountNumber, double balance, double returnRate) {
	super(accountName, accountNumber, balance);
	this.returnRate = returnRate;
}


   @Override
    public String toString() {
	return "SavingAccount [returnRate=" 
            + returnRate + ", accountName=" 
			+ accountName + ", accountNumber="
			+ accountNumber + ", balance=" 
			+ balance + "]";
}


  @Override
	public void deposit(int money) {
		// TODO Auto-generated method stub
		super.deposit(money+100);
	}
	
@Override
	public void withdraw(int money) {
		// TODO Auto-generated method stub
		super.withdraw(money - 10);
	}
   public static void main(String[] args) {
	
	   SavingAccount s1 = new SavingAccount("gt", 123, 11000, 2.3);
	   System.out.println(s1.toString());
	   s1.deposit(1);
	   s1.deposit(1);
	   System.out.println("The balance now is: " + s1.balance);
	   s1.withdraw(10000);
	   System.out.println("The balance now is: " + s1.balance);
}
}
