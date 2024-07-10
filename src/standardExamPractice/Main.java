package standardExamPractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	private static LinkedList<Integer> ll = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int in = sc.nextInt();
			if(in == -1) break;
			
			ll.add(in);
		}
		
		Iterator<Integer> it = ll.iterator();
		
		while(it.hasNext()) {
			
			int ans = it.next();
			if(ans > 100) {
				System.out.println(ans);
			}
		}

	}
	// Deque is a double ended queue. It can be operated from the both end instead of doing only in the front end like the conventional queue operation do.
	// To maintain this action it uses front and rear variable. 

}
