package day4probtwo;

import java.util.ArrayList;

public class MyStringList {
	
	ArrayList <String> arr;
	
	public MyStringList(){
		
		arr = strArray();
	}
	
	private ArrayList<String> strArray() {
		
		return new ArrayList<String>();
	
	}
	
	public void add(String s) {
		
		/*
		 * if(checkDuplicate(s)) {
		 * 
		 * }
		 */
		
		arr.add(s);
	}
	
	public String get(int i) {
		
		return arr.get(i).toString();
	}
	
	public boolean find(String s) {
		
		int index = arr.indexOf(s);
		
		if(index == -1) {
			return false;
		}
		
		return true;
	}
	
	public boolean remove(String s) {
		
		int index = arr.indexOf(s);
		
		if(index != -1) {
			arr.remove(index);
			
			return true;
		}
		
		return false;
		
	}
	
	private boolean checkDuplicate(String s) {
		
		
		return false;
	}

}
