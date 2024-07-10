package stack;
import java.util.LinkedList;
import java.util.Scanner;

public class CatchCompilerError {
	
	public static LinkedList<Character> expSt = new LinkedList<Character>();
	
	public static void main(String[] args) {
		
		
		String exp = "(a + b({x+y)] + 10)";
		catchCompilerError(exp);

	}
	
	private static void catchCompilerError(String exp) {
		
		boolean f = true;
		
		for(int i=0; i<exp.length(); i++) {
			
			
			if(exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '[') {
				
				//SOP("push" + exp.charAt(i));
				expSt.push(exp.charAt(i));	
				
			}
			
			if(!expSt.isEmpty()) {
				
//				if(exp.charAt(i) == ')' && expSt.peek() == '(') {
//					
//					expSt.pop();
//					
//				}else if(exp.charAt(i) == '}' && expSt.peek() == '{' ) {
//					
//					expSt.pop();
//					
//				}else if(exp.charAt(i) == ']' && expSt.peek() == '[' ) {
//					
//					expSt.pop();
//				}
			
//				if(expSt.isEmpty()) {
//				
//					SOP("No Compile Error !!");
//				}
				
//				while(!expSt.isEmpty()) {
//					
//					SOP("Compiler Error !! + Missing Oposote of this delimiter " + expSt.pop());
//				}
				
				if(exp.charAt(i) == ')' && expSt.peek() != '(' ) {
					
					SOP("Delimiter ( is missing !!");
					f = false;
					expSt.pop();
					
				}else if(exp.charAt(i) == ')' && expSt.peek() == '(') {
					
					expSt.pop();
					
				}else if(exp.charAt(i) == '}' && expSt.peek() != '{' ) {
					
					SOP("Delimiter { is missing !!");
					//SOP("" + expSt.peek());
					f = false;
					expSt.pop();
					
				}else if(exp.charAt(i) == '}' && expSt.peek() == '{' ) {
					
					expSt.pop();
					
				}else if(exp.charAt(i) == ']' && expSt.peek() != '[' ) {
					
					SOP("Delimiter [ is missing !!");
					//SOP("" + expSt.peek());
					f = false;
					expSt.pop();
					
				}else if(exp.charAt(i) == ']' && expSt.peek() == '[' ) {
					
					expSt.pop();
				}
				
				
				
			}
		}
		
		if(f) {
			SOP("No Compile Error !!");
		}

	}

	public static void SOP(String s) {
		
		System.out.println(s);
	}


}
