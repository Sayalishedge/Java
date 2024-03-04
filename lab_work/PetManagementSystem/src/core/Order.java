package core;

public class Order {
	public static int orderId =1;
	public int petId;
	public int quantity;
	public Status status;
	
	public Order(int petId, int quantity, Status status) {
		super();
		this.orderId = orderId++;
		this.petId = petId;
		this.quantity = quantity;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + "petId=" + petId + ", quantity=" + quantity + ", status=" + status + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	

}
