package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Lab2 {
	
	private static LinkedList<Character> qu = new LinkedList<Character>();
	private static LinkedList<Character> qu2 = new LinkedList<Character>();
	
	private static String left;
	private static String right;

	public static void main(String[] args) {
		
		
		char deli = ':';
		
		SOP("Meaning of Symbols are Followings:");
		
		SOP("N   No colon on the line.");
		SOP("L   The left part (before the colon) is longer than the right.");
		SOP("R   The right part (after the colon) is longer than the left.");
		SOP("D   The left and right parts have the same length but are different.");
		SOP("S   The left and right parts are exactly the same.");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		if(isColonExist(str, deli) == -1) {
			
			SOP("N");
			System.exit(0);
		}
		
		String[] parts = strSeparateByDelimiter(str, deli);
		
		left = parts[0];
		right = parts[1];
		
		insertLeftIntoQueue();
		insertRightIntoQueue();
		
		int leftLen  = lengthOfLeftString();
		
		if(leftLen > right.length()) {
			
			SOP("L");
			System.exit(0);
			
		}else if(leftLen < right.length()) {
			
			SOP("R");
			System.exit(0);
			
		}else {
			
			if(checkLeftRightCharacter()) {
				
				SOP("S");
				
			}else {
				
				SOP("D");
			}
			
			System.exit(0);
		}
		
	}

	private static boolean checkLeftRightCharacter() {
		
		while(!qu.isEmpty()) {
			
			if(qu.remove() != qu2.remove()) {
				return false;
			}
		}
		
		return true;
		
//		Iterator<Character> it1 = qu.iterator();
//		Iterator<Character> it2 = qu2.iterator();
//		
//		while(it1.hasNext()) {
//			
//			Character ch1 = it1.next();
//			Character ch2 = it2.next();
//			
//			if(ch1 != ch2) {
//				return false;
//			}
//		}
//		
//		return true;
		
	}

	private static int lengthOfLeftString() {
		
		int len = 0;
		Iterator<Character> iter = qu.iterator();
		
		while(iter.hasNext()) {
			len++;
			iter.next();
		}
		
		return len;
	}
	
	private static void insertRightIntoQueue() {
		
		for(int i=0; i <right.length(); i++) {
			qu2.add(right.charAt(i));
		}
	}
	
	private static void insertLeftIntoQueue() {
		
		for(int i=0; i <left.length(); i++) {
			qu.add(left.charAt(i));
		}
		
	}

	private static String[] strSeparateByDelimiter(String str, char ch) {
		
		return str.split(Character.toString(ch));

	}

	private static int isColonExist(String str, char ch) {
		
		return str.indexOf(ch);
	}
	
	private static void SOP(String string) {
		
		System.out.println(string);
		
	}

}
