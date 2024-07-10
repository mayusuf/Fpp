package midterm.jan2017;

public class SavingsAccount extends Account{
	
	double balance;
	double interestRate;
	
	public SavingsAccount(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	
	public double getBalance() {
		double newbalance = balance + interestRate * balance;
		return newbalance;
	}
	
}
