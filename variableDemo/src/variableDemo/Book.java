package variableDemo;


public class Book {
	int a = 0; // Instance variable

	void m() {
		int a = 10; // Local variable //Defined inside a method
		
		System.out.println(a);
		System.out.println(this.a);
		if (a == 10) {
			int b = 20; //block-level variable
						//Defined inside the conditional block

		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		Book book = new Book();
		book.
		book.m();
	}

}
