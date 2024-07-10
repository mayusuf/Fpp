package day5;

import java.util.GregorianCalendar;

public class DeptEmployee {
	
	private String name;
	private GregorianCalendar hireDate;
	
	private double salary;
	
	public DeptEmployee(String name, int yearOfHire, int monthOfHire, int dayOfHire, double salary) {
		
		this.name = name;
		this.salary = salary;
		hireDate = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		
	}

	public String getName() {
		
		return name;
	}
	
	public GregorianCalendar getHireDay() {
		
		return hireDate;
	}
	
	public double computeSalary() {
		
		return salary;
	}
	
	@Override
	public String toString() {
		return "DeptEmployee [name=" + name + ", hireDate=" + hireDate.getTime() + ", salary=" + computeSalary() + "]";
	}
	
	
	

}
