package day3;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a Number !!");
		
		int line = sc.nextInt();
		
		for(int i=1; i<=line; i++) {
			
			for(int j=1; j<=i; j++) {
				
				if (j== 1 || j == i || i == line) {
					
					System.out.print("*");
					
				}else {
					
					System.out.print(" ");
				}
				
			}
			
			System.out.print("\n");
		}

	}

}
