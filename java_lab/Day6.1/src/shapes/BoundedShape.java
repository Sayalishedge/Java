package shapes;

public abstract class BoundedShape {
	private int x;
	private int y;
	public BoundedShape(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	//override to string
	@Override
	public String toString() {
		return "x=" +x + "y=" +y;
		}
	
	
	//since BoundedShape class does not know about area computation, add abstract method
	public abstract double area();
	
	
}
