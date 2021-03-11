
public class FinalKeyword {
	public static void main(String[] args) {
		Parent child = new Child();
		// Refernce //type of Object

		// Overridng a method depends on the type of the object made
		child.m1();

	}
}

//Final Class can be marked on : variable,method, class
class Parent {
	final String name = "Abhishek";

	void m1() {
		System.out.println("parent");

	}
	
	void m2() {
		
	}
}

class Child extends Parent {
	void m1 () {//override
		System.out.println("child");
		
	}	
	@Override
	void m2() {
		
	}
}
