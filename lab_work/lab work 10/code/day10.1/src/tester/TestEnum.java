package tester;

import com.showroom.core.Color;

public class TestEnum {

	public static void main(String[] args) {
		//display all available colors along with their additional cost
		System.out.println("All available Colors : ");
		for(Color c : Color.values())
			System.out.println(c);//c.toString()

	}

}
