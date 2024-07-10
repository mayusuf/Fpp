package day5;

public class Administrator extends DeptEmployee{
	
	private double workedHours;

	public Administrator (String name, int yearOfHire, int monthOfHire, int dayOfHire, double salary){
		
		super(name, yearOfHire, monthOfHire, dayOfHire, salary);
		
		
	}
	
	public void setWorkedHours(int workedHours) {
		
		this.workedHours = workedHours;
	}
	
	public double computeSalary() {

		return super.computeSalary() + workedHours * 20;
		
	}


}
