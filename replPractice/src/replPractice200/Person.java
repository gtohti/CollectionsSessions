package replPractice200;

public class Person {
	 private String firstName, lastName;
	 private int age;
	 
	 
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
	@Override
	public String toString() {
		 return firstName + " | " + lastName + " | " + age + " |";
	}
	public Person() {
		super();
		Person person = new Person();
		person.getFirstName("John");
	}
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	 
	 
	 
}
