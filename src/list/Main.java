package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main{
	

	public static List<Character> A = new LinkedList<Character>();
	public static List<Character> B = new LinkedList<Character>();
	
	public static String  strName;
	public static String txtString;
	public static String strNameW;
	
    public static String strTarget;
    public static String txtStringConcat;
    
    public static String strTargetI;
    public static String txtStringInsert;
    public static String txtStringIndex;
	
	public static void main(String[] args) {
		
		SOP("ENTER COMMAND PLEASE!!");
		SOP("R FOR READING !!");
		SOP("W FOR WRITING !!");
		SOP("C FOR CONCANATE !!");
		SOP("L FOR LENGTH !!");
		SOP("I FOR INSERT !!");
		SOP("E FOR CHECKING EQUILITY OF A AND B LINKED LIST !!");
		SOP("CL FOR CLEAR !!");
		SOP("Q FOR END THE PROGRAM !!");
		
		Scanner sc = new Scanner(System.in);
		String cmd = sc.nextLine();
		
		
		boolean loop = true;
		
		while(loop) {
			
			switch(cmd) {
			
				case "R":
					
					System.out.println("Enter String Name !!");
					strName = sc.nextLine();
					
					System.out.println("Enter Text !!");
					txtString = sc.nextLine();
					
					readString();
					
					break;
					
				case "W":
					
					System.out.println("Enter String Name !!");
					strNameW = sc.nextLine();
					
					
					writeString();
					
					break;
					
				case "C":
					
					System.out.println("Enter Target !!");
					strTarget = sc.nextLine();
					
					System.out.println("Enter String Name !!");
					txtStringConcat = sc.nextLine();
					
					concatenation();
					
					break;
					
				case "I":
					
					System.out.println("Enter Target !!");
					strTargetI = sc.nextLine();
					
					System.out.println("Enter Insert Position !!");
					txtStringIndex = sc.nextLine();
					
					System.out.println("Enter String Name !!");
					txtStringInsert = sc.nextLine();
					
					insert();
					
					break;
				
				case "L":
					
					SOP("Length of the Linked List !!");
					lenOfLinkedList();
					
					break;
					
					
				case "E":
					
					SOP("Checking Two Linked List A and B is equals !!");
					
					if(equalOfLinkedList() == true) {
						
						SOP("Linked List A and B is equals !!");
						
					}else {
						
						SOP("Linked List A and B is not equals !!");
					}
					
					break;
					
				case "CL":
					
					SOP("Clearing the Linked List !!");
					clearLinkedList();
					
					break;
					
				case "Q":
					loop = false;
					break;
				
				default:
					
					break;
			}
			
			if(loop != false) {
				
				SOP("Enter Command !!");
				cmd = sc.nextLine();
				
			}else {
				
				break;
			}
		}
		
		
		SOP("Exit from the Command Interface !!");
		
		
	}

	private static void insert() {
		
		int idx = Integer.parseInt(txtStringIndex);
		
		if(strTargetI.equals("A")) {
			
			if( idx> A.size()) {
				
				SOP("Index out of range !!");
				
			}else {
				
				if(txtStringInsert.equals("B")) {
					
					A.addAll(idx, B);
				}
			}
		}else if(strTargetI.equals("B")) {
			
			if(idx > B.size()) {
				
				SOP("Index out of range !!");
				
			}else {
				
				if(txtStringInsert.equals("A")) {
					
					A.addAll(idx, A);
				}
			}
		}
		
		
	}

	private static boolean equalOfLinkedList() {
		
		if(A.size() != B.size()) return false;
		
		Iterator<Character> iterator1 = A.iterator();
		Iterator<Character> iterator2 = B.iterator();
		
		while(iterator1.hasNext()) {
			
			Character ch1 = iterator1.next();
			Character ch2 = iterator2.next();
			
			if(ch1 != ch2) {
				return false;
			}
		}
		
		return true;
	}

	private static void lenOfLinkedList() {
		
		Iterator<Character> iterator1 = A.iterator();
		
		int i = 0;
		while(iterator1.hasNext()) {
			i++;
			iterator1.next();
		}
		
		SOP("Size of A " + i);
		SOP("\n");
		
		Iterator<Character> iterator2 = B.iterator();
		
		i = 0;
		
		while(iterator2.hasNext()) {
			i++;
			iterator2.next();
		}
		
		SOP("Size of B " + i);
		SOP("\n");
		
	}

	private static void clearLinkedList() {
		
		A.clear();
		B.clear();
	}
	
	// READING LINKED LIST
	public static void readString(){
		
		if(strName.equals("A")) {
			
			for(int i =0; i<txtString.length(); i++) {
				
				A.add(txtString.charAt(i));
			}	
			
		} else if(strName.equals("B")) {
			
			for(int i =0; i<txtString.length(); i++) {
				
				B.add(txtString.charAt(i));
			}

		}
	}
 
 	//2. WRITE STRING LINKED LIST
	
	private static void writeString() {
		
		
		if(strNameW.equals("A")) {
			
			
			Iterator<Character> iterator = A.iterator();

		    // Read elements using a while loop with iterator
		    while (iterator.hasNext()) {
		      
		    	Character ch = iterator.next();
		    	System.out.print(ch);
		    }
		    
		    SOP("\n");
					
		} else if(strNameW.equals("B")) {
					
			Iterator<Character> iterator = B.iterator();
			
			while(iterator.hasNext()) {
				
				Character ch = iterator.next();
				System.out.print(ch);
				
			}
			SOP("\n");
		}
		
	}
	
	// Concatenation
	private static void concatenation() {
		
		Iterator<Character> iterator;
		
		if(txtStringConcat.equals("A")) {
			
			iterator = A.iterator();
			
		}else {
			
			iterator = B.iterator();
		}
		
		if(strTarget.equals("A")) {
			
			// Read elements using a while loop with iterator
		    while (iterator.hasNext()) {
		      
		    	Character ch = iterator.next();
		    	A.add(ch);
		    	
		    }
		    
					
		} else if(strTarget.equals("B")) {
					
			//Iterator<Character> iterator = txtStringConcat.iterator();
			
			while(iterator.hasNext()) {
				
				Character ch = iterator.next();
				B.add(ch);
				
			}
			
		}

	}
	
	private static void SOP(String str) {
		
		System.out.println(str);
	}

}
