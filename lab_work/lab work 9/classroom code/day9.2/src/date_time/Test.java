package date_time;

import java.time.*;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create LocalDate , LocalTime , LocalDateTime : instance : now
			LocalDate date = LocalDate.now();
			System.out.println(date);// yyyy-MM-dd
			LocalTime time = LocalTime.now();
			System.out.println(time);
			LocalDateTime dateTime = LocalDateTime.now();
			System.out.println(dateTime);
			System.out.println("Enter join date  : yr mon day");
			LocalDate joinDate=LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
			System.out.println("join date "+joinDate);
			//use parse method for parsing string --> local date
			System.out.println("Enter birth date : yyyy-MM-dd");
			LocalDate dob=LocalDate.parse(sc.next());
			System.out.println("Dob "+dob);
			System.out.println("end of try....");			
		}
		System.out.println("main over....");

	}

}
