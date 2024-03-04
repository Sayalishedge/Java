package utils;

import java.util.HashMap;
import com.pets.core.*;
public class PetUtils {
	
	//here we are going to populate the pets
		//(int petid, String pet_name, Category category, double uprice)
	public static HashMap<Integer, Pets> populate_pet()
	{
		HashMap<Integer, Pets> map = new HashMap<Integer, Pets>();
		Pets p1 = new Pets(100, "Husky", Category.valueOf("dog".toUpperCase()), 10000);
		Pets p2 = new Pets(102, "White Cat", Category.valueOf("cat".toUpperCase()), 5000);
		Pets p3 = new Pets(103, "BugsBunny", Category.valueOf("rabbit".toUpperCase()), 3000);
		Pets p4 = new Pets(104, "Nemo", Category.valueOf("fish".toUpperCase()), 900);
		map.put(p1.getPet_id(), p1);
		map.put(p2.getPet_id(), p2);
		map.put(p3.getPet_id(), p3);
		map.put(p4.getPet_id(), p4);
		return map;
	}

}
