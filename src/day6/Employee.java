package day6;


import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;


public class Employee {

	
	private ArrayList<Account> accounts = new ArrayList<Account>();
	
	private String name;
	private GregorianCalendar hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		
		this.name = name;
		hireDate = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		
	}

	/*
	 * public void createNewChecking(double startAmount) {
	 * 
	 * savingsAcct = new CheckingAccount(this, startAmount);
	 * 
	 * }
	 */
	
	public String getName() {
		
		return name;
	}
	
	public GregorianCalendar getHireDay() {
		
		return hireDate;
	}

	public void createNewAccount(int f, double startAmount) {
		
		if(f == 0) {
			accounts.add(new CheckingAccount(this , startAmount));
		}else if(f == 1) {
			accounts.add(new SavingAccount(this, startAmount));
		}else if(f == 2) {
			accounts.add(new RetriementAccount(this, startAmount));
		}
		
	}

	/*
	 * public void createNewSavings(double startAmount) {
	 * 
	 * checkingAcct = new SavingAccount(this, startAmount);
	 * 
	 * }
	 * 
	 * public void createNewRetirement(double startAmount) {
	 * 
	 * retirementAcct = new RetriementAccount(this, startAmount);
	 * 
	 * }
	 */

	
	public void deposit(AccountType acctType, double amt){ 
		  
		  for(int x=0; x< accounts.size(); x++) {
			  
			  Account account = (Account) accounts.get(x);
			  
			  if(acctType == account.getAccountType()){
					
				  account.makeDeposit(amt);
					
			  }
		}
	}
	
	  
	public boolean withdraw( AccountType acctType, double amt){ 
		
		
		for(int x=0; x< accounts.size(); x++) {
			  
			  Account account = (Account) accounts.get(x);
			  
			  if(acctType == account.getAccountType()){
					
				  if(account.makeWithdrawal(amt)) {
					  return true;
				  }
					
			  }
			  
		}
		
		return false;
		
		/*
		 * if(acctType.equals(AccountType.CHECKING)){
		 * 
		 * if(checkingAcct.makeWithdrawal(amt)) return true;
		 * 
		 * }else if(acctType.equals(AccountType.SAVING)) {
		 * 
		 * if(savingsAcct.makeWithdrawal(amt)) return true;
		 * 
		 * 
		 * }else if (acctType.equals(AccountType.RETIREMENT)) {
		 * 
		 * if(retirementAcct.makeWithdrawal(amt)) return true;
		 * 
		 * }
		 * 
		 * return false;
		 */
	}
	 

	public String getFormattedAcctInfo() {
		
		StringBuffer s = new StringBuffer();
		
		
		for(int x=0; x< accounts.size(); x++) {
			  
			  Account account = (Account) accounts.get(x);
			  
			  if(account != null){
					
				  s.append(account.toString());
					
			  }
			  
		}
		
		/*
		 * if(savingsAcct != null){
		 * 
		 * s.append(savingsAcct.toString());
		 * 
		 * } if(checkingAcct != null) {
		 * 
		 * s.append(checkingAcct.toString());
		 * 
		 * 
		 * } if(retirementAcct != null) {
		 * 
		 * s.append(retirementAcct.toString());
		 * 
		 * }
		 */
		
		return s.toString();
		
	}
	
	public ArrayList<Account> getAccounTypeList(){
		
		return accounts;
	}

}

