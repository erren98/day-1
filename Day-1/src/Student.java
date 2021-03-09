
public class Student extends Human {
	// Data Encapsulation

	void study() {
		System.out.println(getName() + " is studying");
	}

	// Default Constructor
	Student() {

	}

	// Custom Constructor
	Student(String name) {
		setName(name);
	}

}
