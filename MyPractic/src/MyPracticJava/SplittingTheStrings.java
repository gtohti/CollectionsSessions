package MyPracticJava;
import java.util.*;
public class SplittingTheStrings {
public static void main(String[] args) {
	String str = "Java is fun, java is challenging";
    String[] words = str.split(" ");
    int lastIndex = words.length-1;
    for (int i = 0; i < words.length/2; i++) {
		String temp = words[i];
		words[i] = words[lastIndex-i];
		words[lastIndex-i] = temp;
		
	}

System.out.println(Arrays.toString(words));
}
}
