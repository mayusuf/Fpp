package day3;

public class AverageOfArray {

	public static void main(String[] args) {
		
		int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		
		float avg = average(arr);
		
		System.out.printf("%.2f",avg);

	}
	
	public static float average(int[] arrayOfInts) {
		
		float sum = 0;
		
		for(int i= 0; i<arrayOfInts.length; i++) {
			
			sum += arrayOfInts[i];
			
		}
		
		return sum/arrayOfInts.length;
	}

}
