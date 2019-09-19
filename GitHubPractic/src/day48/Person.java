package day48;

public class Person {
String name;
int age;
float height;
char gender;

public void belong() {
	System.out.println("The student belong to local Campus");
}
public void eat() {
	System.out.println("Eating");
}

public void studentInfo(){
	System.out.println("GMU student");
}

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
public float getHeight() {
	return height;
}
public void setHeight(float height) {
	this.height = height;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}

	
}
