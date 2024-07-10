package day4;

public class Main {

	public static void main(String[] args) {
		
		
		Employee employee = new Employee("Abu Yusuf", 80001, 2024, 1, 16);
		
		System.out.println(employee.getHireDay().getTime());
		
		System.out.println("Yearly Fed Tax is : " + employee.getYearlyFederalTax());
		
		// creates an account object 
		Account a1 = new Account(employee, "checking", 300);
		// creates another account object 
		Account a2 = new Account (employee, "savings", 300);
		// creates another account object 
		Account a3 = new Account (employee, "retirement", 300);
		
		
		System.out.println("Data of Account 1 : " + a1.toString());
		System.out.println("Data of Account 2 : " + a2.toString());
		System.out.println("Data of Account 3 : " + a3.toString());
		 
		
		  System.out.println("Total Interest is : " + a1.computeInterest());
		  
		  a1.makeDeposit(14000);
		  
		  System.out.println("Total Interest After deposit is : " +
		  a1.computeInterest());
		  
		  
		  
		  System.out.println("Total Interest is : " + a2.computeInterest());
		  
		  
		  if(a2.makeWithdrawal(200) == true) {
		  
		  System.out.println("Total Interest after withdraw  is : " +
		  a2.computeInterest()); }
		 

	}

}
