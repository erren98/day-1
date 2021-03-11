

public class OverloadingDemo {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.study();
		s1.study(10);
		s1.study(20, "Maths");
	}

}

//Compostion Relationship

//Conditions for method overloadiing 
	//same method name, different number and types of arguments, access could be anything


class Student1 {
	
	//Method overloading
	public static void study(int duration,String subject) {
		System.out.println("study.." + duration + " hours " + subject);
		
	}

	//method overloading 
	public static void study(int duration) {
		System.out.println("study.." + duration + " hour");

	}
	public static void study() {
		System.out.println("study...");
	}
	
}
