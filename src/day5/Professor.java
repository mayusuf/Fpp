package day5;

public class Professor extends DeptEmployee{
	
	private int numberOfPublications;
	
	public Professor (String name, int yearOfHire, int monthOfHire, int dayOfHire, double salary){
		
		super(name, yearOfHire, monthOfHire, dayOfHire, salary);
		
		this.numberOfPublications = numberOfPublications;
		
	}
	
	
	public void setNumberOfPublications(int numberOfPublications) {
		
		this.numberOfPublications = numberOfPublications;
	}
	
	public double computeSalary() {

		return super.computeSalary();
		
	}

	
}
