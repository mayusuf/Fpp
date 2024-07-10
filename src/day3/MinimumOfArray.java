package day3;

public class MinimumOfArray {

	public static void main(String[] args) {
		
		int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		
		int min = min(arr);
		
		System.out.println(min);

	}
	
	public static int min(int[] arrayOfInts) {
		
		int minValue = 0;
		
		for(int i= 0; i<arrayOfInts.length; i++) {
			
			if(arrayOfInts[i] < minValue) {
				minValue = arrayOfInts[i];
			}
		}
		
		return minValue;
	}

}
