package com.productmanager.core;

import java.time.LocalDate;
import java.util.Objects;

public class ProductItem {
	
	
	private String itemCode;
	private String description;
	private double price;
	private LocalDate shipmentDate;
	private int availableStock;
	
	
	
	public ProductItem(String itemCode) {
		super();
		this.itemCode = itemCode;
	}



	public ProductItem(String itemCode, String description, double price, LocalDate shipmentDate, int availableStock) {
		this.itemCode = itemCode;
		this.description = description;
		this.price = price;
		this.shipmentDate = shipmentDate;
		this.availableStock = availableStock;
	}



	@Override
	public String toString() {
		return "ProductItem [itemCode=" + itemCode + ", description=" + description + ", price=" + price
				+ ", shipmentDate=" + shipmentDate + ", availableStock=" + availableStock + "]";
	}



	public String getItemCode() {
		return itemCode;
	}



	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public LocalDate getShipmentDate() {
		return shipmentDate;
	}



	public void setShipmentDate(LocalDate shipmentDate) {
		this.shipmentDate = shipmentDate;
	}



	public int getAvailableStock() {
		return availableStock;
	}



	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}



	@Override
	public int hashCode() {
		return Objects.hash(itemCode);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductItem other = (ProductItem) obj;
		return Objects.equals(itemCode, other.itemCode);
	}
	
	
	
	
	
	

}
