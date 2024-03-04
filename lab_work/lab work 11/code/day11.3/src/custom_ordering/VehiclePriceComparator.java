package custom_ordering;

import java.util.Comparator;

import com.showroom.core.Vehicle;

public class VehiclePriceComparator implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		System.out.println("in price compare");
		if(o1.getBasePrice() < o2.getBasePrice())
			return -1;
		if(o1.getBasePrice() == o2.getBasePrice())
			return 0;
		return 1;
	}

}
