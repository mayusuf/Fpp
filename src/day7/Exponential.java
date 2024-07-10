package day7;

import java.util.Scanner;

public class Exponential {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a real number :");
		double x = sc.nextDouble();
		
		System.out.println("Input a natural number :");
		int n = sc.nextInt();
		
		Exponential obj = new Exponential();
		
		double res = obj.power(x,n);
		
		System.out.printf(" %.2f to the power %d is %.2f ", x, n, res);

	}

	private static double power(double x, int n) {
		
		if( n == 0) return 1;
		
		return x * power(x,n-1);
	
	}

}
