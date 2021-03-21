
public class Bank {
	public static void main(String[] args) {
		IAccount[] account = new IAccount[3];
		//account[0] = new SavingsAccount();
		account[1] = new FDAccount();
		//account[2] = new RecurringFDAccount();
		account[1].deposit("Ram");
		
		
		for (IAccount iAccount : account) {
			//iAccount.deposit();
			
		}
		
			
			
		
	}
	

}
