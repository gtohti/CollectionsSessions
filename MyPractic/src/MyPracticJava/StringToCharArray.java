package MyPracticJava;
import java.util.*;
public class StringToCharArray {
public static void main(String[] args) {
	
	String str = "Spartan";
	int size = str.length();
	char[] myChars = new char[size];
	
	for (int i = 0; i < myChars.length; i++) {
		myChars[i] = str.charAt(i);
	}
	
	
	myChars = str.toCharArray();
	
	System.out.println(Arrays.toString(myChars));
	
}
}
