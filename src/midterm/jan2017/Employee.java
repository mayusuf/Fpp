package midterm.jan2017;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	String id;
	
	List<Object> accounts = new ArrayList<Object>();
	
	List<Object> empAccounts = new ArrayList<Object>();
	
	public Employee(String id, List<Object> accounts) {
		
		this.id = id;
		this.accounts = accounts;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public List<Object> getAccounts() {
		setAccounts();
		return empAccounts;
	}
	
	public void setAccounts() {
		
		
		for(int i=0; i<accounts.size(); i++) {
			
			empAccounts.add((Object)accounts.get(i));
		}
		
		
	}

}
