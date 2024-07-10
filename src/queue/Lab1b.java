package queue;

import java.util.LinkedList;
import java.util.Scanner;

public class Lab1b {
	
	private static LinkedList<Integer> st = new LinkedList<Integer>();
	private static LinkedList<Integer> qu = new LinkedList<Integer>();

	public static void main(String[] args) {
		
		SOP("-1 stop to insert into Queue !!");
		
		insertIntoQueue();
		//printQueue();
		insertIntoStackFromQueue();
		printStack();
		
	}

	private static void printQueue() {
		
		while(!qu.isEmpty()) {
			SOP(qu.remove());
		}
		
	}

	private static void insertIntoQueue() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int in = sc.nextInt();
			if(in == -1) break;
			
			qu.add(in);
		}
		
	}
	
	private static void printStack() {
		
		while(!st.isEmpty()) {
			SOP(st.pop());
		}
	}
	
	private static void insertIntoStackFromQueue() {
		
		
		while(!qu.isEmpty()) {
			
			st.push(qu.remove());
		}
		
	}
	
	public static void SOP(Integer integer) {
		
		System.out.println(integer);
	}
	
	public static void SOP(String s) {
		
		System.out.println(s);
	}

}
