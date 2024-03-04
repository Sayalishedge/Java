package tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;



import static utils.StudentUtilities.*;

import core.Course;
import core.Student;
import custom_exception.StudentHandlingException;


public class TestSMS {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			HashMap<String, Student> students = new HashMap<>();
			
			boolean flag=false;
			while(!flag) {
				System.out.println("Options");
				System.out.println("1. Enter Student Details \n2. View specific student details\n"
						+ "3.View all details\n4.Cancel Admission\n5.Update Marks\n"
						+ "0. Exit");
				
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					//(String prn, String firstname, String lastname, int marks, Course enrolledCourse, LocalDate date
					System.out.println("Enter prn no:");
					String prn= sc.next();
					//check duplicates
					checkForDuplicatePrn(prn,students);
					System.out.println("Enter Details\n First Name, Last Name, Marks, Enrolled Course, Date, Address");
					Student s = new Student(prn,sc.next(),sc.next(),sc.nextInt(),parseAndValidateCourse(sc.next()),
							parseDob(sc.next()),sc.next());
					students.put(prn,s);
					System.out.println("Student Admitted!");
					break;
					
				case 2:
					System.out.println("Enter prn no:");
					s = students.get(sc.next());
					if (s == null)
						throw new StudentHandlingException("Invalid PRN , Can't display details!");
					System.out.println(s);
					
					break;
					
				case 3:
					System.out.println("Student Details ");
					for (Student s1 : students.values())
						System.out.println(s1);
					
					break;
					
				case 4:
					System.out.println("Enter prn of student");
					s = students.remove(sc.next());
					if(s==null)
						throw new StudentHandlingException("Invalid student prn Cancelation Failed");
					System.out.println("Cancelled Admission for "+ s.getFirstname());
					break;
					
					
				case 5:
					System.out.println("Enter prn of student");
					s = students.get(sc.next());
					if(s==null)
						throw new StudentHandlingException("Invalid prn cannot update the marks");
					System.out.println("Enter updated marks");
					s.setMarks(sc.nextInt());
					System.out.println("Marks updated successfully!");
					
					break;
	
				case 0:
					flag = true;
					
					
				}
			
			}
			
			
			
		}catch (Exception e) {
			System.out.println(e);}
		

	}

}
