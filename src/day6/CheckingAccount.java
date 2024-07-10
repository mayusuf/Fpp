package day6;

public class CheckingAccount extends Account{

	public CheckingAccount(Employee emp, double balance) {
		
		super(emp);
		super.setBalance(balance);
		super.setAccountType(AccountType.CHECKING);
		
	}
	
	public double getBalance() {
		
		double amt = super.getBalance() - 0.2;
		super.setBalance(amt);
		return amt;
		
	}
	
	public AccountType getAcctType() {
		
		return AccountType.CHECKING;
	}
	
}
