
public class VarargsDemo {
	public static void main(String[] args) {
		
		//Static method can be directly called by another static methods
		//Static method add
		int result = add("Ram",2,3,4,5,6);
			//Same can be done using arrays
		//int result = add("Ram",new int[] {2,3,4,5,6});
		
		System.out.println(result);
	}
	
	//Static method
	//Here numbers is the array object
	static int add(String name,int... numbers) { //varargs
		int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum+numbers[i];
			
		}
		//System.out.println(numbers[1]);
		System.out.println(name);
		return sum;
	}
	
//	static int add(int a , int b) {
//		return a+b;
//	}
}

class Book {
	private String genre;
	//Reference of the inner class
	private Author[] authors; // for has-a relationship
	// Lazy Initalization
	Book() {
		//Creating the object of the inner class in the constructor of lazy initialization
		authors = new Author[3];
	}

	class Author {
		String name;
		String email;

	}
}
