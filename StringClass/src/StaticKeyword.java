import java.util.logging.Logger;

public class StaticKeyword {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setCount(2);
		System.out.println(s1.getCount());
		System.out.println(s2.getCount());
		Student.study();// static method 
		
	}
	
}

class Student{
	
	//Creating the Logger class
	static Logger logger = Logger.getLogger(Student.class.toString());
	
	
	private  static int count;

	public  static int getCount() {
		logger.warning("warning !!");
		logger.severe("fine");
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public static void study() {
		System.out.println("study...");
	}

	
}
