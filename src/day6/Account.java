package day6;

public class Account {
	
	/*
	 * public final static String CHECKING = "checking"; public final static String
	 * SAVINGS = "savings"; public final static String RETIREMENT = "retirement";
	 */
	
	private final static double DEFAULT_BALANCE = 0.0;
	
	private double balance;

	private AccountType acctType;
	private Employee employee;

	public Account(Employee emp){
		
		employee = emp;
		// this.acctType =checking;
		//this.balance = balance;
		
	}

	/*
	 * Account(Employee emp, AccountType acctType){
	 * 
	 * this(emp,acctType,DEFAULT_BALANCE);
	 * 
	 * }
	 */
	
	public void setAccountType(AccountType acctType) {
		
		this.acctType = acctType;
	
	}
	
	public AccountType getAccountType() {
		
		return acctType;
		
	}
	
	public String toString() {
		
		//return "Account Type = "+acctType+ "\nPrevious bal = "+balance + "\nn";
		
		if(balance != getBalance()) {
			
		return "Account Type = "+acctType+ "\nPrevious bal = "+balance + "\nCurrent bal = "+ getBalance()+"\n";
		
		}else {
			
			return "Account Type = "+acctType+ "\nPrevious bal = "+balance + "\nn";
		}
	}
	
	public void setBalance(double amount) {
		
		this.balance = amount; 
	}
	
	public double getBalance() {
		
		return balance;
	}

	public void makeDeposit(double deposit) {
		
		balance += deposit;

	}

	public boolean makeWithdrawal(double amount) {
		
		if(amount <= balance) {
			balance -= amount;
			return true;
		}
		
		return false;
		
		
	}
	
	public double computeInterest() {
		
		double interest = 0;
		
		//System.out.println(balance);
		
		if(acctType.equals(AccountType.CHECKING)){
			
			interest = balance * 0.02;
			
		}else if(acctType.equals(AccountType.SAVING)) {
			
			interest = balance * 0.04;
			
		}else if(acctType.equals(AccountType.RETIREMENT)) {
			
			interest = balance * 0.05;
			
		}
		
		return interest;
	}
}

