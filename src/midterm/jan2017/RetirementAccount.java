package midterm.jan2017;

import java.time.LocalDate;

public class RetirementAccount extends Account{
	
	double balance; 
	LocalDate creationDate;
	
	public RetirementAccount(double balance, LocalDate creationDate) {
		this.balance = balance;
		this.creationDate = creationDate;
	}
	
	
	public double getBalance() {
		
		double newbalance = balance - earlyWithdrawalFee();
		return newbalance < 0 ? 0: newbalance;
	}
	
	private double earlyWithdrawalFee() {
		
		return 50;
	}
}
