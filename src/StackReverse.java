import java.util.LinkedList;
import java.util.Scanner;

public class StackReverse {
	
	public static LinkedList<Integer> st = new LinkedList<Integer>();
	public static LinkedList<Integer> st2 = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		
		// 1. Prompt the user for some positive integers, until  -1  is entered. 
		
		stackreverse();
		
	}
	
	
	private static void stackreverse() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int in = sc.nextInt();
			
			if(in == -1) break;
			
			st.push(in);
			st2.push(in);
		}
		
		while(!st.isEmpty()) {
			
			SOP(Integer.toString(st.pop()));
		}
		
		SOP("\n");
		
		while(!st2.isEmpty()) {
			
			if(st2.peek() == st2.peekLast()) {
				
				SOP("and");
			}
			
			SOP(Integer.toString(st2.pop()));
		}
		
	}
	
	
	public static void SOP(String s) {
		
		System.out.println(s);
	}


}
