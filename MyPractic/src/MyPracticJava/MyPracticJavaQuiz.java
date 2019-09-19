package MyPracticJava;

import java.util.*;

public class MyPracticJavaQuiz {
	public static void main(String[] args) {

ArrayList<String> superHeros = new ArrayList<>();
superHeros.add("Supernam");
superHeros.add("Batman");
superHeros.add("Wonder Woman");
superHeros.add("Sadir Palwan");
String inputFromUser = "";
String randomHero = "";
Random random = new Random();
do {
	randomHero = superHeros.get(random.nextInt(superHeros.size()-1));
	System.out.println("Guess superhero name: ");
	System.out.println(encryptName(randomHero));
	System.out.println("Enter the name: ");
}while(!randomHero.equals(inputFromUser));
}
	public static String encryptName(String name) {
		String encryptName = "";
		for (int i = 0; i < name.length(); i++) {
			encryptName += "*";
		}
	
	return encryptName.length() + " letters : " + encryptName;
}
}
