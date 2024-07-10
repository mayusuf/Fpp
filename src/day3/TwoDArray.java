package day3;

public class TwoDArray {

	public static void main(String[] args) {
		
		double[][] table = {
	            {10000.00, 10000.00, 10000.00, 10000.00, 10000.00, 10000.00},
	            {11000.00, 11100.00, 11200.00, 11300.00, 11400.00, 11500.00},
	            {12100.00, 12321.00, 12544.00, 12769.00, 12996.00, 13225.00}
	        };
		
		
		for(int i = 0; i < table.length; i++) {
			
			double rowSum = 0;
			
			for(int j = 0; j< table[0].length; j++) {
				
				rowSum += table[i][j];
			}
			
			System.out.printf("Row Average is %.2f", rowSum/table[0].length);
			System.out.println();
		}
		
		for(int i = 0; i < table[0].length; i++) {
			
			double colSum = 0;
			
			for(int j = 0; j< table.length; j++) {
				
				colSum += table[j][i];
			}
			
			System.out.printf("Column Average is %.2f", colSum/table.length);
			System.out.println();
		}
		
	}

}
