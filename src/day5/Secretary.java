package day5;

public class Secretary extends DeptEmployee{
	
	private double overtimeHours;

	public Secretary (String name, int yearOfHire, int monthOfHire, int dayOfHire, double salary){
		
		super(name, yearOfHire, monthOfHire, dayOfHire, salary);
		
		
	}
	
	public void setOvertimeHours(int overtimeHours) {
		
		this.overtimeHours = overtimeHours;
	}
	
	public double computeSalary() {

		return super.computeSalary() + overtimeHours * 12;
		
	}
		
}
