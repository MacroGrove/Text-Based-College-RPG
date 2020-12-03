package Map;

public abstract class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String position;

	public Person(String firstName, String lastName, int age, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.position = position;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
