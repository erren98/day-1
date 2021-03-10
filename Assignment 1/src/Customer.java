
public class Customer {
	private String custName;
	private String custAddress;
	private String custEmail;
	private int custPhone;
	
	Customer(String custName, String custAddress,String custEmail, int custPhone){
		this.custName = custName;
		this.custAddress = custAddress;
		this.custEmail = custEmail;
		this.custPhone = custPhone;
	}
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public int getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(int custPhone) {
		this.custPhone = custPhone;
	}
	
	
	
}
