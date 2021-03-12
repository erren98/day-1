
import java.util.List;

public class Account {
	
	
	private String name;
	private int balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		
		return "{Name: " + this.name + ", Balance: " + this.balance+"}";
	}
	
	
	

}
