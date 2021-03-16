
public class StackOverflowDemo {
	public static void main(String[] args) {
		callMe();
	}
	
	private static void callMe() {
		//Causes Stackoverflow Error
		//Cannot be recovered
		//callMe();
		System.out.println("called");
	}

}
