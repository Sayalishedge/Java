package utils;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;

import core.Course;
import core.Student;
import custom_exception.StudentHandlingException;

public class StudentUtilities {
	//checkForDuplicatePrn
	public static void checkForDuplicatePrn(String prn1,HashMap<String, Student>student1) throws StudentHandlingException{
		if(student1.containsKey(prn1))
			throw new StudentHandlingException("Duplicate PRN detetcted.");
		System.out.println("no dup....");
		
	}
	
	
	
	
	
	//parseAndValidateCourse  
	//string --> enum(Course)
	public static Course parseAndValidateCourse(String course) {
		return Course.valueOf(course.toUpperCase());
			
	}
	//parse DOB
	//string --> dob(localdate)
	public static LocalDate parseDob(String dob) {
		return LocalDate.parse(dob);
	}
	

	

		
	}

