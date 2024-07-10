package day3;

import java.util.Scanner;

public class SentenceUpLowCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a Sentence!!");
		
		String stnc = sc.nextLine();
		
		StringBuffer bufStnc = new StringBuffer(stnc);
		
		String ans = "";
		
		for(int i=0; i< bufStnc.length(); i++) {
			
			if(bufStnc.charAt(i) >= 'a' && bufStnc.charAt(i) <= 'z') {
				
				ans += Character.toUpperCase(bufStnc.charAt(i));
				
			}else {
				
				ans += Character.toLowerCase(bufStnc.charAt(i));
				
			}
		}
		
		System.out.println(ans);
	}

}
