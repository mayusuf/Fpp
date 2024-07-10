package hashtable;

import java.util.HashMap;

public class Main {
	
	public static MyHashTable map = new MyHashTable();
	
	//public static HashMap<String, String> map = new HashMap<String, String>();
	
	public static void main(String[] args) {
		
		// insert into hashMap
		
		map.put("John Smith", "641-472-1111");
		map.put("Paul Woods", "641-472-2222");
		map.put("Baron Street", "641-472-33333");
		map.put("Lily Ban", "641-472-5555");
		map.put("Filip Star", "641-472-9999");
		map.put("Mure Piture", "641-472-1234");
		map.put("Biju Fresh", "641-472-3456");
		
		// 1
		for(Object e :map.getKeys()) {
			
			SOP(map.get(e).toString());
		}
		
		// 2
		
		SOP(Integer.toString(map.getNoOfElements()));
		
		// 3 returns the number of elements in the longest LinkedList chain.
		
		SOP(Integer.toString(map.getNoOfElementsOfLongestLinkedList()));
		
		// 4
		
		SOP(Integer.toString(map.countNoOfNullElements()));
		
		// 5 duplicate key test
		
		map.put("Mure Piture", "641-472-1239");

	}

	private static void SOP(String s) {
		
		System.out.println(s);
	}

}
