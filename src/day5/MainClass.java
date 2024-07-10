package day5;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Professor[] p = new Professor[3];
		
		Secretary[] s = new Secretary[2];
		
		p[0] = new Professor("John", 2021, 05, 01, 60000);
		p[0].setNumberOfPublications(10);
		p[1] = new Professor("Don", 2021, 05, 01, 50000);
		p[1].setNumberOfPublications(10);
		p[2] = new Professor("Lermen", 2017, 05, 01, 70000);
		p[2].setNumberOfPublications(10);
		
		s[0] = new Secretary("Kiman", 2020, 06, 01, 40000);
		s[0].setOvertimeHours(200);
		s[1] = new Secretary("Salah", 2021, 07, 15, 45000);
		s[1].setOvertimeHours(200);
		
		DeptEmployee[] department = new DeptEmployee[5];
		
		department[0] = p[0];
		department[1] = p[1];
		department[2] = p[2];
		department[3] = s[0];
		department[4] = s[1];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("You wishes to see the sum of all salaries in the department? (y/n) ");
		
		String answer = sc.next();
		
		
		if(answer.equalsIgnoreCase("y")){
			
			double sum =0;
			
			for(DeptEmployee d: department) {
				sum += d.computeSalary();
			}
			
			System.out.printf("Sum of Salaries of Employee of the Deapart is : %.2f" , sum);
			
			
		} else {
			//do nothing..the application ends here
		}
		
		System.out.println();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Would you like to search for the details of an employee? (y/n) ");
		
		String answer1 = sc1.next();
		
		if(answer1.equalsIgnoreCase("y")){
			
			Scanner sc2 = new Scanner(System.in);
			
			System.out.println("Please Enter the name of the Employee :");
			
			String answer2 = sc2.next();
			
	
			for(DeptEmployee d: department) {
				
				if(answer2.equals(d.getName())) {
					
				
					System.out.println("Details of an Employee : \n" + d.toString());
					
					
			} else {
			//do nothing..the application ends here
			}
		}
	}
 }
}
