package patternMatching;

import java.util.Scanner;

public class MainRegularExp {

	public static void main(String[] args) {
		
		// 2. Write a regular expression for a license plate number whose format 
		// is two letters followed by four digits followed by three letters.
		
		String str = "az2543ERR";
		
		if(checkNumberPlate(str)) {
			
			SOP("Number Plate format is ok!!");
			
		}else {
			
			SOP("Number Plate format is not ok!!");
			
		}
		
		// 3. Replace every occurrence of  8  with  ‘eight’
		
		String str1 = "He selected 8 nice flowers. Then he walked 8 miles to city to sea off his girlfriend. She was waiting for him at 88 No. Gate.";
		
		SOP(replace8occurence(str1));
		
		String str2 = "Best C cat Cat C++";
		
		replaceWord(str2);
		
		String email = "yusuf@gmail.com";
	
		emailFromatChecking(email);

	}
	
	private static void replaceWord(String s) {
		
        String res = s.replaceAll("\\b(C|C\\+\\+)\\b", "Java");
		SOP(res);
		
	}

	private static void emailFromatChecking(String email) {
		
		if(email.matches("[a-zA-Z0-9_-]+@[a-z]+.[a-z]+{2,4}")) {
			
			SOP("It's work");
		}else {
			
			SOP("Not Working");
		}
		
	}

	private static String replace8occurence(String str) {
		
		String res = str.replaceAll("\\b8\\b", "eight");
		return res;
	}

	private static boolean checkNumberPlate(String s) {
		
		return s.matches("[a-zA-Z]+{2}[0-9]+{4}[a-zA-Z]{3}");
	
	}

	public static void SOP(String s) {
		
		System.out.println(s);
	}
}
