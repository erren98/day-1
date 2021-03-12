
public class Institute {
	
	public static void main(String[] args) {
		//Here the reference is of student class(abstract)
		//But the object is of the Collegestudent class
		
		StudentAbstract student1 = new CollegeStudent();
		
		//Here only the concrete or non-abstract method of Student class can be used
		student1.admit();
		//student1.study();
		
		//Here the reference is of student class(abstract)
		//But the object is of the HighSchoolStudent class
		StudentAbstract student2 = new HighSchoolStudent();
		//Here only the concrete or non-abstract method of Student class can be used
		student2.admit();
		//student2.study();
		
	}
	

}
