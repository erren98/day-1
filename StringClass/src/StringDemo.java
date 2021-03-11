
public class StringDemo {
	
	public static void main(String[] args) {
		
		withoutStringPool();
		usingStringPool();
		//withStringBuilder(); // Using StringBuilder , every time it creates in heap area
								// And creats new object everytime
		
		//dataManipulation();
	}
	
	//Here 3 objects will be created
	private static void dataManipulation() {
		String s1 = "IBM";
		System.out.println(s1);
		s1 = s1.concat(", Bangalore");
		System.out.println(s1);
	}

	private static void withStringBuilder() {
		StringBuilder s1 = new StringBuilder("IBM");
		StringBuilder s2 = new StringBuilder("IBM");
		System.out.println(s1 == s2);
		
		
		
	}

	private static void withoutStringPool() {
		String s1 = new String("IBM");
		String s2 = new String("IBM");
		System.out.println(s1 == s2);
		
	}
	
	private static void usingStringPool() {
		String s1 = "IBM";
		String s2 = "IBM";
		System.out.println(s1 == s2);
		
	}
	

}



