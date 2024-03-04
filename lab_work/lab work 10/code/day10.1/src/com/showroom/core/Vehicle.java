package com.showroom.core;

import java.time.LocalDate;

/*
 * Objective : Accept vehicle details : chasisNo(string) : 
 * Unique ID, color(enum) , basePrice(double) , 
 * manufactureDate(LocalDate),company,isAvailable

 */
public class Vehicle {
	private String chasisNo;
	private Color vehicleColor;
	private double basePrice;
	private LocalDate manufactureDate;
	private String company;
	private boolean available;
	public Vehicle(String chasisNo, Color vehicleColor, double basePrice, LocalDate manufactureDate, String company) {
		super();
		this.chasisNo = chasisNo;
		this.vehicleColor = vehicleColor;
		this.basePrice = basePrice;
		this.manufactureDate = manufactureDate;
		this.company = company;
		this.available=true;
	}
	//add overloaded ctor to wrap PK(UID)
	public Vehicle(String chasisNo)
	{
		this.chasisNo=chasisNo;
	}
	//toString
	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", vehicleColor=" + vehicleColor + ", basePrice=" + basePrice
				+ ", manufactureDate=" + manufactureDate + ", company=" + company + ", available=" + available + "]";
	}
	//override equals method to replace ref equality by chasis no equality
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in vehicle's equals");
		if(o instanceof Vehicle) {
			Vehicle v =(Vehicle)o;
			return this.chasisNo.equals(v.chasisNo);
		}
		return false;
	}
	
	
	
	
}
