package tester;

import java.util.Scanner;
import static utils.ValidationRules.*;

public class TestCustomException {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter current speed of the vehicle");
			int speed=sc.nextInt();
			System.out.println("Enter license exp date");
			String date=sc.next();
			validateAllInputs(speed,date);
			
			System.out.println("end of try...");
		} // sc.close()
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over ....");

	}

}
