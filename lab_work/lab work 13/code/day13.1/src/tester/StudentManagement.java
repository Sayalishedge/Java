package tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.acts.core.Course;
import com.acts.core.Student;

import custom_exceptions.StudentHandlingException;

import static utils.StudentUtils.*;

public class StudentManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create empty HashMap , to store student details
			HashMap<String, Student> students = new HashMap<>();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Options 1. Student Admission \n" + "2.Get Student Details\n"
							+ "3. Display all students' details" + "4. Change Course\n " + "5. Cancel Admission \n"
							+ "Display student details by Course"
							+ "0.Exit");
					System.out.println("Choose");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter student PRN");
						String prn = sc.next();
						checkForDup(prn, students);
						// => no dups!
						System.out.println("Enter details : firstName,  lastName,  marks,  enrolledCourse,  dob");
						Student s = new Student(prn, sc.next(), sc.next(), sc.nextInt(),
								parseAndValidateCourse(sc.next()), parseDob(sc.next()));
						students.put(prn, s);
						System.out.println("student admitted!");
						break;
					case 2:
						System.out.println("Enter Student's PRN");
						s = students.get(sc.next());
						if (s == null)
							throw new StudentHandlingException("Invalid PRN , Student details not found !!!!!");
						System.out.println(s);
						break;
					case 3:
						System.out.println("All students : ");
						for (Student s1 : students.values())
							System.out.println(s1);
						break;
					case 4:
						System.out.println("Enter Student's PRN , to change the course");
						s = students.get(sc.next());
						if (s == null)
							throw new StudentHandlingException("Invalid PRN , Can't change the course!!!!");
						// => student found , prompt for new course
						System.out.println("Hello " + s.getFirstName());
						System.out.println("Enter name of the new course");
						s.setEnrolledCourse(parseAndValidateCourse(sc.next()));
						System.out.println("Course updated ....");
						break;
					case 5:
						System.out.println("Enter Student's PRN , to cancel admission");
						s = students.remove(sc.next());
						if (s == null)
							throw new StudentHandlingException("Invalid PRN , Can't cancel admission!!!!");
						System.out.println("Cancelled admission for " + s.getFirstName() + " " + s.getLastName());
						break;
					case 6 :
						System.out.println("Enter course name");
						Course selectedCourse=parseAndValidateCourse(sc.next());
						//since Course is NOT a key of HashMap , it involves value based searching
						//soln : convert Map --> Collection
						System.out.println("All students from Course "+selectedCourse);
						for(Student s1 : students.values())
							if(s1.getEnrolledCourse().equals(selectedCourse))
								System.out.println(s1);
						break;
						
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					// to read off pending i/ps from the scanner
					sc.nextLine();
				}
			}
		}

	}

}
