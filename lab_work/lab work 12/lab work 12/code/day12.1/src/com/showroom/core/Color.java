package com.showroom.core;

public enum Color {
	WHITE(5000), SILVER(10000), BLACK(15000), GREY(7500),RED(25000);
	private int colorCost;

	private Color(int colorCost) {
		//super(name,ordinal) -->javac calls super cls's constr : java.lang.Enum
		this.colorCost = colorCost;
	}
	//can you override toString ? 
	@Override
	public String toString()
	{
		return name()+" @ "+colorCost;
	}
	//getter n setter for the color cost
	public int getColorCost() {
		return colorCost;
	}
	public void setColorCost(int colorCost) {
		this.colorCost = colorCost;
	}
	
	
}
