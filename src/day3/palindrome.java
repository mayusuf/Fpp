package day3;

import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a Word!!");
		
		String orgWord = sc.nextLine();
		
		String word = orgWord.toLowerCase();
		
		String ans = "";
		
		for(int i = word.length()-1; i >=0; i-- ) {
			
			ans += word.charAt(i);
			
		}
		
		if(word.equals(ans)) {
			
			System.out.printf("The Given Word, %s , is Palindrome !!", orgWord);
		
		}else {
			
			System.out.printf("The Given Word, %s , is not Palindrome !!", orgWord);
			
		}
		
		

	}

}
