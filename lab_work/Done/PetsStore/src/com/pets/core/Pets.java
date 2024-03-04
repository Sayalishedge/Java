package com.pets.core;

import java.util.Objects;

public class Pets {
	private int pet_id;
	private String pet_name;
	private Category category;
	private double uprice;
	
	

	public static int dogc=50;
	public static int catc=50;
	public static int fishc=50;
	public static int rabbitc=50;
	
	
	public Pets(int pet_id, String pet_name, Category category, double uprice) {
		this.pet_id = pet_id;
		this.pet_name = pet_name;
		this.category = category;
		this.uprice = uprice;
	}
	
	
	
	public int getPet_id() {
		return pet_id;
	}


	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}


	public String getPet_name() {
		return pet_name;
	}


	public void setPet_name(String pet_name) {
		this.pet_name = pet_name;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public double getUprice() {
		return uprice;
	}


	public void setUprice(double uprice) {
		this.uprice = uprice;
	}



	@Override
	public int hashCode() {
		return Objects.hash(pet_name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pets other = (Pets) obj;
		return Objects.equals(pet_name, other.pet_name);
	}



	@Override
	public String toString() {
		return "Pets [pet_id=" + pet_id + ", pet_name=" + pet_name + ", category=" + category + ", uprice=" + uprice
				+ "]";
	}
	

}
