package day6;

public class RetriementAccount extends Account{

	public RetriementAccount(Employee emp, double balance) {
		
		super(emp);
		super.setBalance(balance);
		super.setAccountType(AccountType.RETIREMENT);
		
	}
	
	public boolean makeWithdrawal(double amount) {
		
		if(amount <= super.getBalance()) {
			
			super.setBalance(super.getBalance() - amount -1);
			
			return true;
		}
		
		return false;
	}
	
	public AccountType getAcctType() {
		
		return AccountType.RETIREMENT;
	}
}
