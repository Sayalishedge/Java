package core;

import java.time.LocalDate;

public class ProductItem {
	private String itemCode;
	private String description;
	private double price;
	private LocalDate shipmentDate;
	private int availableStock;
	
	
	public ProductItem(String itemCode, String description, double price, LocalDate shipmentDate, int availableStock) {
		super();
		this.itemCode = itemCode;
		this.description = description;
		this.price = price;
		this.shipmentDate = shipmentDate;
		this.availableStock = availableStock;
	}


	

	public void setShipmentDate(LocalDate shipmentDate) {
		this.shipmentDate = shipmentDate;
	}


	public ProductItem(String itemCode) {
		this.itemCode = itemCode;
		// TODO Auto-generated constructor stub
	}
	
	public ProductItem(int availableStock) {
		this.availableStock = availableStock;
		// TODO Auto-generated constructor stub
	}


	

	public int getAvailableStock() {
		return availableStock;
	}


	

	@Override
	public String toString() {
		return "ProductItem [itemCode=" + itemCode + ", description=" + description + ", price=" + price
				+ ", shipmentDate=" + shipmentDate + ", availableStock=" + availableStock + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public void setAvailableStock(int q) {
		q = availableStock;
		// TODO Auto-generated method stub
		
	}


	public LocalDate getShipmentDate() {
		// TODO Auto-generated method stub
		return shipmentDate;
	}
	
	
	
	
	

}
