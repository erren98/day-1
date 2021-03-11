
public class Order{
	
	Order(){
		System.out.println("Order Created !!...");
	}
	
	Order(int orderId, String itemName){
		this.orderId = orderId;
		this.itemName = itemName;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	private int orderId;
	private String itemName;
	private STATUS status = STATUS.PENDING;
	
	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	//Getting the address
	public void getAddress(Address a) {
		System.out.println(a.getCity());
	}
	
	
	
	
	
	
	


}
