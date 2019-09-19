package replPractice;

public abstract class replPractice224 {

	 String name;
	  int age;
	  
	  
	public replPractice224(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public abstract getAgeInHumanYears();
	  
	  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "replPractice224 [name=" + name + ", age=" + age + "]";
	}
	  
}
