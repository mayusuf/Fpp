package patternMatching;

public class Main {

	public static void main(String[] args) {
		
		String str = "Best C cat Cat C++";
		
		replaceWord(str);
		
		String email = "yusuf@gmail.com";
	
		emailFromatChecking(email);

	}

	private static void replaceWord(String s) {
		
        String res = s.replaceAll("\\b(C|C\\+\\+)\\b", "Java");
		SOP(res);
		
	}

	private static void emailFromatChecking(String email) {
		
		//if(email.matches("([a-zA-Z0-9_-]+)@([a-zA-Z]+)\\.([a-z]+{2,})")) {
		
		if(email.matches("^([a-zA-Z0-9_!#$%&'*+/=?^`{|}~-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?^`{|}~-]+)*)\\@([a-zA-Z0-9](?:\\.[a-zA-Z0-9])*\\.[a-zA-Z]{2,})$")) {
			
			SOP("It's work");
			
		}else {
			
			SOP("Not Working");
		}
		
	}
	
	private static void SOP(String s) {
		
		System.out.println(s);
	}
}
