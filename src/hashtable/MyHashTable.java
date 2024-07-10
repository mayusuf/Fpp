package hashtable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class MyHashTable {
	
	private static final int INITIAL_SIZE;
	
	static {
		INITIAL_SIZE = 19;
	}
	
	private int tableSize;
	private LinkedList[] table;
	private ArrayList<Object> keys;
	
	public MyHashTable(){
		
		this(INITIAL_SIZE);
		
	}
	
	public MyHashTable(int tableSize){
		
		this.tableSize = tableSize;
		this.table = new LinkedList[this.tableSize];
		this.keys = new ArrayList<Object>();
	}
	
	public void put(Object key, Object value) {
		
		// disallow null key
		if(key == null) return;
		
		// assume key is not null
		int hashCode = key.hashCode();
		
		//System.out.println(hashCode);
		
		// compress key size into table size
		int hash = hashM(Math.abs(hashCode));
		//System.out.println(hash);
		
		// put the key and value into an entry object. 
		
		Entry e = new Entry(key, value);
		
		// Now place it in the table
		if(this.table[hash]== null) {
			
			this.table[hash] = new LinkedList();
		}
		
		// check duplicate and if not then add the object to linked list
		
		if(checkDuplicateKey(key)) {
			
			table[hash].add(e); 
			
		}else {
			System.out.println("Duplicate Key : Same Key is already exist !!");
		}
		 
	}
	
	private boolean checkDuplicateKey(Object key) {
		
		Iterator it = table[hashM(Math.abs(key.hashCode()))].iterator();
		
		Entry e = null;
		
		while(it.hasNext()) {
			
			e = (Entry) it.next();
			
			if(e.key.equals(key)) {
				
				return false;
			}
		}
		
		return true;
		
	}

	public Object get(Object key) {
		
		if(key == null) return null;
		
		int hashCode = Math.abs(key.hashCode());
		
		int hash = hashM(hashCode);
		
		//now look for the desired Entry
		Entry e = null;
		
		Iterator it = table[hash].iterator();
		
		while(it.hasNext()) {
			
			e = (Entry) it.next();
			
			if(e.key.equals(key)) {
				return e.value;
			}
		}
		
		return null;
	}

	private int hashM(int hashCode) {
		
		return (hashCode % tableSize);
	}

	public ArrayList<Object> getKeys() {
		
		for(int i =0; i<tableSize; i++) {
			
			if(table[i] != null) {
				
				//System.out.println(table[i]);
				
				Entry e = null;
				
				Iterator it = table[i].iterator();
				
				while(it.hasNext()) {
					
					e = (Entry) it.next();
					
					keys.add(e.key);
				}
				
			}
		}
		
		return keys;
	}
	
	public int getNoOfElements() {
		
		int count = 0;
		
		for(int i =0; i<tableSize; i++) {
			
			if(table[i] != null) {
				
				Iterator it = table[i].iterator();
				
				while(it.hasNext()) {
					it.next();
					count++;
				}
				
			}
		}
		
		return count;
	
	}
	
	public int getNoOfElementsOfLongestLinkedList() {
		
		int max = 0;
		
		for(int i =0; i<tableSize; i++) {
			
			if(table[i] != null) {
				
				int count = 0;
				
				Iterator it = table[i].iterator();
				
				while(it.hasNext()) {
					
					it.next();
					count++;
				}
				
				max = count > max ? count : max;
			}
		}
		
		return max;
	
	}
	
	public int countNoOfNullElements() {
		
		int count =0;
		
		for(int i=0; i<tableSize; i++) {
			
			if(table[i] == null) count ++;
		}
		
		return count;
	}
	
	private class Entry{
		
		private Object key;
		private Object value;
		
		Entry(Object key, Object value){
			
			this.key = key;
			this.value = value;
		}
		
//		public String toString(){
//			
//			return key.toString()+"->"+value.toString();
//		}
		
	}
}
