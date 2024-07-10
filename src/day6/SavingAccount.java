package day6;

public class SavingAccount extends Account{

	public SavingAccount(Employee emp, double balance) {
		
		super(emp);
		super.setBalance(balance);
		super.setAccountType(AccountType.SAVING);
		
	}
	
	public double getBalance() {
		
		double amt = super.getBalance() - 0.1;
		super.setBalance(amt);
		return amt;
		
	}
	
	public AccountType getAcctType() {
		
		return AccountType.SAVING;
	}
	
}
