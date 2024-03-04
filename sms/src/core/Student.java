package core;

import java.time.LocalDate;

public class Student {
	private String prn;
	private String firstname;
	private String lastname;
	private int marks;
	private Course enrolledCourse;
	private LocalDate date;
	private String address;
	
	//constructor
	public Student(String prn, String firstname, String lastname, int marks, 
			Course enrolledCourse, LocalDate date,String address) {
		super();
		this.prn = prn;
		this.firstname = firstname;
		this.lastname = lastname;
		this.marks = marks;
		this.enrolledCourse = enrolledCourse;
		this.date = date;
		this.address = address;
	}

	
	
	//generating toString
	@Override
	public String toString() {
		return "Student [prn=" + prn + ", firstname=" + firstname + ", lastname=" + lastname + ", marks=" + marks
				+ ", enrolledCourse=" + enrolledCourse + ", date=" + date + ", address=" + address + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	



	public int getMarks() {
		return marks;
	}






	public String getFirstname() {
		return null;
	}



	public void setMarks(int marks) {
		// TODO Auto-generated method stub
		this.marks = marks;
		
	}

	
	
	
	
	
	
	
	

}
