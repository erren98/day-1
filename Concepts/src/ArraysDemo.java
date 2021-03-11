
public class ArraysDemo {
	public static void main(String[] args) {
//		int[] scores = new int[10];
//		// printing the values
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//		}
//		int[] numbers = { 1, 2, 4, 5 };
//		// printing values
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//		//boolean
//		boolean[] booleans = {true,false};
//		for (boolean b : booleans) {//for each
//			System.out.println(b);
//		}
//		
//		String[] names = new String[10]; //Creates only one Array object with capacity 10
//		for (String name : names) {	//No string object is created here
//			name = new String("Ram"); //goes to heap, 10 objects
//			name = "Ram"; //no new keyword used , so it will go to pool
//			
//			System.out.println(name);	
//			
//		}
		
		//create 10 Student objects
		//Creating arrays of custom Datatype
		Student[] students = new Student[10];
		for (int i = 0; i < students.length; i++) {
			Student student = new Student("Ram"+i);
			students[i] = student;
			if(i==5)
				break;

		}
		System.out.println("length" + students.length);
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].getName());
			
		}
	}
}

class Student{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}
	
}


