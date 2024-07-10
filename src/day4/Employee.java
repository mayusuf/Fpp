package day4;

import java.util.GregorianCalendar;

class Employee {
	
	//instance fields
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private double salary;
	private GregorianCalendar hireDay;
		
	//constructor
	Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) 
	{
		name = aName;
		salary = aSalary;
		hireDay = new GregorianCalendar(aYear,aMonth-1,aDay);
		
	}

	// instance methods
	public String getName() {
		
		return name;
	}
	
	public double getSalary() {
		
		return salary;
	}
	
	//needs to be improved!!
	public GregorianCalendar getHireDay() {
		
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		
		double raise = salary * byPercent / 100;
		salary += raise;
		
	}
	
	
	public double getYearlyFederalTax() {
	 
	  double yearlyFedtax;
	  
	  if(salary > 80000) {
		  
		  yearlyFedtax = salary * 28/100;
		  
	  }else if(salary > 50000 && salary <= 80000 ) {
		  
		  yearlyFedtax = salary * 24/100;
		  
	  }else if(salary > 26000 && salary <= 50000 ) {
		  
		  yearlyFedtax = salary * 20/100;
		  
	  }else {
		  
		  yearlyFedtax = 0;
		  
	  }
	  
	  return yearlyFedtax;
	  
	}
	 

}