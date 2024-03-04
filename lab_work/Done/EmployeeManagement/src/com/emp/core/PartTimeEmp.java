package com.emp.core;

import java.time.LocalDate;

public class PartTimeEmp extends Employee{
	
	private double perHourPay;

//	public PartTimeEmp(String name, LocalDate dateOfJoining, String phoneNumber, 
//			String aadhaarNumber,double perHourPay) 
//	{
//		super(name, dateOfJoining, phoneNumber, aadhaarNumber);
//		this.perHourPay = perHourPay;
//	}

	
	
	public double getPerHourPay() {
		return perHourPay;
	}

	public PartTimeEmp(int empId, String name, LocalDate dateOfJoining, String phoneNumber, String aadhaarNumber,
		double perHourPay) {
	super(empId, name, dateOfJoining, phoneNumber, aadhaarNumber);
	this.perHourPay = perHourPay;
}

	public void setPerHourPay(double perHourPay) {
		this.perHourPay = perHourPay;
	}



	@Override
	public String toString() {
		return "PartTimeEmp [EmpId=" + getEmpId() + ", Name=" + getName()
				+ ", DateOfJoining=" + getDateOfJoining() + ", PhoneNumber()=" + getPhoneNumber()
				+ ", AadhaarNumber=" + getAadhaarNumber() + "perHourPay=" + perHourPay + "]";
	}



	

}
