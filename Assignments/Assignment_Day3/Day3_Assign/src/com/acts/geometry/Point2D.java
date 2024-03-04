package com.acts.geometry;
class Point2D{

	private int xco ;
	private int yco ;


public Point2D(int xco , int yco){
	this.xco = xco ;
	this.yco = yco ;
}

public String showDetails(){
	return "X-cordinate : "+this.xco+" "+"Y-cordinate : "+this.yco ;
}

public boolean equals(Point2D t) {
	if (this.xco == t.xco && this.yco == t.yco)
		return true ;
	else 
		return false ;
}
}