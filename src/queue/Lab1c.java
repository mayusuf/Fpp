package queue;

import java.util.LinkedList;
import java.util.Scanner;

public class Lab1c {
	
	private static LinkedList<Integer> st1 = new LinkedList<Integer>();
	private static LinkedList<Integer> temp = new LinkedList<Integer>();
	private static LinkedList<Integer> st2 = new LinkedList<Integer>();

	public static void main(String[] args) {
		
		SOP("-1 stop to insert into Stack !!");
		
		insertIntoStack();
		printStack();
		insertIntoSecondStackFromFirstStack();
		printSecondStack();
		
	}

	private static void printSecondStack() {
		
		while(!st2.isEmpty()) {
			SOP(st2.pop());
		}
		
	}

	private static void insertIntoSecondStackFromFirstStack() {
		
		while(!temp.isEmpty()) {
			st2.push(temp.pop());
		}
		
	}
	
	private static void printStack() {
		
		while(!st1.isEmpty()) {
			SOP(st1.peek());
			temp.add(st1.pop());
		}
		
		SOP("..........");
	}
	
	private static void insertIntoStack() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int in = sc.nextInt();
			if(in == -1) break;
			
			st1.push(in);
		}
		
	}
	
	public static void SOP(Integer integer) {
		
		System.out.println(integer);
	}
	
	public static void SOP(String s) {
		
		System.out.println(s);
	}

}
