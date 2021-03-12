
public class InnerClassesDemo {
	public static void main(String[] args) {
		// Create array of 10 account obj

		Account[] accounts = new Account[10];

	}
}

class Account {
	// private Address address;
	//creation of reference of the inner address class
	private Address[] addresses; // multiple address can be handled
	private int number;
	//Lazy initalization
	//Object creation is delayed
	public Account() {
		//creation of address array object of size 3
		this.addresses = new Address[3];
		
	}

	public Address[] getAddress() {
		return addresses;
	}

	public void setAddress(Address[] address) {
		this.addresses = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	// private Address class
	private class Address {
		private String streetName;
	}
}
