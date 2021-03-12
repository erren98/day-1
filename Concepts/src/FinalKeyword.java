
public class FinalKeyword {
	public static void main(String[] args) {
		Parent child = new Parent();
		// Refernce     //type of Object

		// Overridng a method depends on the type of the object made
		child.m1();
		

	}
}

//Final Class can be marked on : variable,method, class
//Final Class cannot be inherited
class Parent {
	//Final variable has to be initialized
	final String name = "Abhishek";
	Parent(){
		Child child = new Child();
		child.m2();
	}
	
	
	// We cannot change the value of the final variable
//	void change() {
//		name = "ash";
//	}
	
	
	//Final method cannot be overriden by its subcalss

//	 final void m1() {
//		System.out.println("parent");
//
//	}
	 
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
		System.out.println("Hello");
		
	}
}
