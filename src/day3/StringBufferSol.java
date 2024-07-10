package day3;

import java.util.Scanner;

public class StringBufferSol {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a String!!");
		
		String orgWord = sc.nextLine();
		
		StringBuffer wordBuffer = new StringBuffer("");
		
		wordBuffer.append(orgWord);
		wordBuffer.append("bye");
		
		System.out.println("StringBuffer content: " + wordBuffer);
		
		String ans = "";
		
		for(int i = 0; i < wordBuffer.length(); i++) {
			
			if(wordBuffer.charAt(i) >= 'a' && wordBuffer.charAt(i) <= 'z') {
				
				ans += Character.toUpperCase(wordBuffer.charAt(i));
				
			}else {
				ans += Character.toLowerCase(wordBuffer.charAt(i));
				
			}
			
		}
		
		System.out.println(ans);

	}

}
