package day4probtwo;


import java.util.Date;
import java.util.GregorianCalendar;


public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	
	private String name;
	private GregorianCalendar hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		
		this.name = name;
		hireDate = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
	}

	public void createNewChecking(double startAmount) {
		
		savingsAcct = new Account(this, AccountType.CHECKING, startAmount);
		
	}
	
	public String getName() {
		
		return name;
	}
	
	public GregorianCalendar getHireDay() {
		
		return hireDate;
	}

	public void createNewSavings(double startAmount) {
		
		checkingAcct = new Account(this, AccountType.SAVING, startAmount);
		
	}
	
	public void createNewRetirement(double startAmount) {
		
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
		
	}

	
	public void deposit(AccountType acctType, double amt){ 
		  
		  
		  if(acctType.equals(AccountType.CHECKING)){
				
			  checkingAcct.makeDeposit(amt);
				
			}else if(acctType.equals(AccountType.SAVING)) {
				
			  savingsAcct.makeDeposit(amt);
				
			}else if (acctType.equals(AccountType.RETIREMENT)) {
				
				retirementAcct.makeDeposit(amt);
				
		}
	}
	
	  
	public boolean withdraw( AccountType acctType, double amt){ 
		  
		if(acctType.equals(AccountType.CHECKING)){
			
			  if(checkingAcct.makeWithdrawal(amt)) return true;
				
			}else if(acctType.equals(AccountType.SAVING)) {
				
			  if(savingsAcct.makeWithdrawal(amt)) return true;
			  
				
			}else if (acctType.equals(AccountType.RETIREMENT)) {
				
			  if(retirementAcct.makeWithdrawal(amt)) return true;
				
		}
		
		  return false;
	}
	 

	public String getFormattedAcctInfo() {
		
		StringBuffer s = new StringBuffer();
		
		if(savingsAcct != null){
			
			s.append(savingsAcct.toString());
				
		}
		if(checkingAcct != null) {
				
			s.append(checkingAcct.toString());
			
				
		}
		if(retirementAcct != null) {
				
			s.append(retirementAcct.toString());
				
		}
		
		return s.toString();
		
	}

}

