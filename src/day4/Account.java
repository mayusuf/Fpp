package day4;

public class Account {
	
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
	
	private final static double DEFAULT_BALANCE = 0.0;
	
	private double balance;

	private String acctType;
	private Employee employee;

	public Account(Employee emp, String acctType, double balance){
		
		employee = emp;
		this.acctType =acctType;
		this.balance = balance;
		
	}

	Account(Employee emp, String acctType){
		
		this(emp,acctType,DEFAULT_BALANCE);
		
	}
	
	public String toString() {
		
		return "type = "+acctType+", balance = "+balance;
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
		
		if(acctType.equals(CHECKING)){
			
			interest = balance * 0.02;
			
		}else if(acctType.equals(SAVINGS)) {
			
			interest = balance * 0.04;
			
		}else if(acctType.equals(RETIREMENT)) {
			
			interest = balance * 0.05;
			
		}
		
		return interest;
	}
}

