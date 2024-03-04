package custom_ordering;

import java.util.Comparator;

import com.showroom.core.Vehicle;

public class VehicleDatePriceDescComparator implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		System.out.println("in compare -date n price");
		// date based sorting
		int ret = o1.getManufactureDate().compareTo(o2.getManufactureDate());
		if (ret == 0)// => same date proceed to compare price (desc)
		{
			if (o1.getBasePrice() < o2.getBasePrice())
				return 1;
			if (o1.getBasePrice() == o2.getBasePrice())
				return 0;
			return -1;

		}
		return ret;
	}

}
