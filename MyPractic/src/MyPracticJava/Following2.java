package MyPracticJava;

import java.util.*;

public class Following2 {
public static void main(String[] args) {
	//String str = "spartan";
	
	//char[] myChars = new char[size];
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter name ");
	String name = scan.next();
	int size = name.length();
	System.out.println(" Enter char to count ");
	String charToCount = scan.next();
	char[] nameChars = name.toCharArray();
	System.out.println(Arrays.toString(nameChars));
	int counter = 0;
	
	for (int i = 0; i < nameChars.length; i++) {
		
		if (nameChars[i] == 'a') {
			counter++;
		}
	}
	
		System.out.println("The count is " + counter);
		
	}
	
}

