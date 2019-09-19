package day43_static_constructors02;
import java.util.*;
public class CampusTesters {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter your name");
String city = input.next();

//	Campus.city = "Fairfax";
//	Campus.aboutCampus();
//	Campus.city = "McLean";
//	Campus.aboutCampus();
//	Campus.city = "Arlington";
//	Campus.aboutCampus();
	
	Campus camp = new Campus();	
	//Campus.city = "Alexandria";
	camp.aboutCampus(city);
	
	
}
}

