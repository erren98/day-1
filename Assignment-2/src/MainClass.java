import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		createArray();
		System.out.println("Array Created ...");
		toList();
		System.out.println("Array converted to List");
	}

	public static void toList() {
		List<Account> account1= new ArrayList<Account>();
		
		
		for (Account iter : account1) {
			account1.add(iter);
		}
		System.out.println(account1.size());
		
	}
	public static void createArray() {
		Account[] accounts = new Account[5];
		for (int i = 0; i < accounts.length; i++) {
			Account account = new  Account("Abhi"+i,i*100);
			accounts[i] = account;
		}
		System.out.println(accounts.length);
	}
	
	
	
	
	
	

}
