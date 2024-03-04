package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PetUtils {
	static ArrayList<Pet> populatePetList(){
		ArrayList<Pet> list = new ArrayList<>();
		list.add(new Pet(101,"BullDog",Category.DOG,1000,50));
		list.add(new Pet(102,"SiameseCat",Category.CAT,600,60));
		list.add(new Pet(103,"HollandLop",Category.RABBIT,800,75));
		list.add(new Pet(104,"GoldFish",Category.FISH,200,200));
		
		return list;
	}
	
	static HashMap<Integer,Pet> populateMap(List<Pet> petList){
		HashMap<Integer,Pet> map = new HashMap<>();
		for(Pet p:petList)
			map.put(p.getPetId(), p);
		return map;
	}
}
