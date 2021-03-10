package dataConversion;



public class Human {

	private String name;
	private byte age;
	private GENDER gender = GENDER.FEMALE;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null | name.trim().equals("")) {
			throw new IllegalArgumentException("name is mandatory");
		}
		this.name = name;

	}

	public GENDER getGender() {
		return gender;
	}

	public void setGender(GENDER gender) {
		this.gender = gender;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}
}
