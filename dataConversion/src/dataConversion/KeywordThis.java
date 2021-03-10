package dataConversion;

public class KeywordThis {
	public static void main(String[] args) {
		Student s1 = new Student("Ram");
		System.out.println(s1.getName());
		System.out.println(s1.getGender());
	}
	
	

}

//Declarations of enum
enum GENDER{		//Used when the valid set of values is limited. value domain
	MALE, FEMALE
}

class Student{
	
	private String name;
	private GENDER  gender = GENDER.FEMALE; //Assigning Default values for the enum
	private int age;
	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public GENDER getGender() {
		return gender;
	}



	public void setGender(GENDER gender) {
		this.gender = gender;
	}



	public Student(String name) {
		this.name = name;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
