package day48;

public class StudentTester {
public static void main(String[] args) {
	
	Person p1 = new Person();
	p1.name = "Lili";
	p1.age = 25;
	p1.height = 5.5f;
	p1.gender = 'M';
	p1.belong();
	System.out.println(p1.height);
	
	Student s1 = new Student();
	
	s1.name = "Oghuzxan";
	s1.age = 15;
	s1.height = 5.10f;
	s1.gender = 'M';
	s1.studentId = 123;	
	s1.eat();
	s1.studentType = "Graduate Student";
	s1.studentInfo();
	
	
	
	
	System.out.println(s1.name);
	System.out.println(s1.studentType);
	
	
}
}
