package com.emp.core;

import java.time.LocalDate;

public class Employee {
	
	
	private int empId;
	private String name;
    private LocalDate dateOfJoining;
    private String phoneNumber;
    private String aadhaarNumber;
    
    
//    
//	public Employee(String name, LocalDate dateOfJoining, String phoneNumber, String aadhaarNumber) {
//		super();
//		this.nextEmpId=nextEmpId;
//		this.empId=empId;
//		this.name = name;
//		this.dateOfJoining = dateOfJoining;
//		this.phoneNumber = phoneNumber;
//		this.aadhaarNumber = aadhaarNumber;
//	}

  


	public int getEmpId() {
		return empId;
	}

	public Employee(int empId, String name, LocalDate dateOfJoining, String phoneNumber, String aadhaarNumber) {
	this.empId = empId;
	this.name = name;
	this.dateOfJoining = dateOfJoining;
	this.phoneNumber = phoneNumber;
	this.aadhaarNumber = aadhaarNumber;
}

	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}



	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getAadhaarNumber() {
		return aadhaarNumber;
	}



	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}



	@Override
	public String toString() {
		return "Employee [ empId=" + empId + ", name=" + name + ", dateOfJoining="
				+ dateOfJoining + ", phoneNumber=" + phoneNumber + ", aadhaarNumber=" + aadhaarNumber + "]";
	}
	
    
   
    
    
	
}
