package MyPracticJava;

import java.util.Scanner;

public class userNamePassowrd {
public static void main(String[] args) {
	String username="user";
	String password="abc123";
	
	Scanner scan =new Scanner(System.in);
	System.out.println("please enter your user name :");
	//String 
	username=scan.next();
	System.out.println("please inseart your pasword :");
	//String 
	password=scan.next();
	
	boolean userExists=username.equals("user");
	boolean passwordCorrect=password.contentEquals("abc123");
	if(userExists && passwordCorrect) {
		System.out.println("You are logged in :)");
		
	}else {
		System.out.println("wrong user name or pass");
	}
	
}
}
