package MyPracticJava;
import java.lang.reflect.Array;
import java.util.*;
public class CharArrayToString {
public static void main(String[] args) {
	
	String name = "Gheyret Tohti";
	char[] nameChars = name.toCharArray();
	System.out.println(Arrays.toString(nameChars));
    String nameString = "";
    for (int i = 0; i < nameChars.length; i++) {
		char c = nameChars[i];
		nameString = nameString + c;
		
	}
    System.out.println(nameString);
	}

	  }
	 
	
	



