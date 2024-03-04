package com.emp.core;

import java.time.LocalDate;

public class FullTimeEmp extends Employee{
	
	private double monthlySalary;

//	public FullTimeEmp(String name, LocalDate dateOfJoining, String phoneNumber, String aadhaarNumber,
//			double monthlySalary) 
//	{
//		super(name, dateOfJoining, phoneNumber, aadhaarNumber);
//		this.monthlySalary = monthlySalary;
//	}
	
	
/*
	public FullTimeEmp(int empId, String name, LocalDate dateOfJoining, String phoneNumber, String aadhaarNumber,
		double monthlySalary) {
	super(name, dateOfJoining, phoneNumber, aadhaarNumber);
	this.monthlySalary = monthlySalary;
}
	*/

	public FullTimeEmp(int empId, String name, LocalDate dateOfJoining, String phoneNumber, String aadhaarNumber,
			double monthlySalary) {
		super(empId, name, dateOfJoining, phoneNumber, aadhaarNumber);
		this.monthlySalary = monthlySalary;
	}


	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	public String toString() {
		return "FullTimeEmp [ EmpId=" + getEmpId() + ", Name=" + getName()
				+ ", DateOfJoining=" + getDateOfJoining() + ", PhoneNumber=" + getPhoneNumber()
				+ ", AadhaarNumber=" + getAadhaarNumber() + "monthlySalary=" + monthlySalary + "]";
	}



	
	
	
}
