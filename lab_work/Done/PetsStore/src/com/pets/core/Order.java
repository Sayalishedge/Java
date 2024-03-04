package com.pets.core;

import java.util.Objects;

public class Order {
	
	private int order_id;
	private int pet_id;
	private int quantity;
	private Status st;
	
	
	public Order(int order_id, int pet_id, int quantity, Status st) {
		this.order_id = order_id;
		this.pet_id = pet_id;
		this.quantity = quantity;
		this.st = st;
	}


	public int getOrder_id() {
		return order_id;
	}


	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}


	public int getPet_id() {
		return pet_id;
	}


	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Status getSt() {
		return st;
	}


	public void setSt(Status st) {
		this.st = st;
	}


	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", pet_id=" + pet_id + ", quantity=" + quantity + ", st=" + st + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(order_id, pet_id, quantity, st);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return order_id == other.order_id && pet_id == other.pet_id && quantity == other.quantity && st == other.st;
	}


}
