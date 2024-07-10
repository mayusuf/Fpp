package midterm1;

import java.util.ArrayList;
import java.util.List;

public class MilesCounter {
	
	private static List<Vehicle> res = new ArrayList<Vehicle>();
	
	private static int totalMiles = 0;
	
	public static List<Vehicle> convertArray(Object[] vehicleArray) {
		
		for(Object obj : vehicleArray ) {
			
			res.add((Vehicle)obj);
		}
		
		return res;
	}
	
	
	public static int computeTotalMiles(List<Vehicle> vehicleList) {
		
		for(int i=0; i<vehicleList.size(); i++) {
			totalMiles += vehicleList.get(i).computeMiles();
		}
		
		return totalMiles;
	}
}
