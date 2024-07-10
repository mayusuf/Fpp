package day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	Employee[] emps = null;
	
	public static void main(String[] args) {
		
		new Main();
		
	}
	
	Main(){
		
		emps = new Employee[3];
		
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		
		emps[0].createNewAccount(0, 10500);
	    emps[1].createNewAccount(1, 34000);
		emps[2].createNewAccount(2, 12600);
		 
		
		System.out.println("A. See a report of all accounts.");
		System.out.println("B. Make a deposit.");
		System.out.println("C. Make a withdrawal.");
		System.out.println("Make a selection (A/B/C):");
		
		Scanner sc = new Scanner(System.in);
		String answer = sc.next();
		
		if(answer.equalsIgnoreCase("A")){
			
			String info = getFormattedAccountInfo();
			System.out.print(info);
			
		} else if(answer.equalsIgnoreCase("B")){
			
			
			
			List<String> info = getFormattedAccountInfoOfB();
			
			for(int i=0; i<info.size();i++) {
				
				System.out.println(i+". "+info.get(i));
			}
			
			System.out.println("Select an employee: (type a number) ");
			int empSelect = sc.nextInt();
			
			System.out.println("0. checking\n"
					+ "1. savings\n"
					+ "2. retirement");
			
			int accTypeReply = sc.nextInt();
			
			if(accTypeReply == 0) {
				
				
				
			}else if(accTypeReply == 1) {
				
				System.out.println("Deposit amount: ");
				int deposit = sc.nextInt();
				
				
				  SavingAccount save = new SavingAccount(emps[empSelect],deposit);
				  save.makeDeposit(deposit);
				  
				 
				
				System.out.println("$" + deposit+ " has been deposited in the savings account of " + info.get(empSelect));
				
				
				//String infoAfterUpate = getFormattedAccountInfo();
				//System.out.print(infoAfterUpate);
				
			}else if(accTypeReply == 2) {
				
			}
			
		} else if(answer.equalsIgnoreCase("C")){
			
			
			
		}
	
	}
	
	
	 List<String> getFormattedAccountInfoOfB() {
		 
		 List<String> s = new ArrayList<String>();
		 
		 for(Employee e: emps) {
			 
			 s.add(e.getName());
		 }
		 
		 return s;
	 }
	 
	 String getFormattedAccountInfo() {
		 
		 String s = "";
		 
		 for(Employee e: emps) {
			 
			 s += "ACCOUNT INFO FOR " + e.getName() + ": \n\n" + e.getFormattedAcctInfo() + "\n\n";
		 }
		 
		 return s;
	 }
	
}
