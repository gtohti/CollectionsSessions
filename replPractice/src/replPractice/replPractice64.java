package replPractice;
import java.util.*;
public class replPractice64 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	String word = scan.nextLine();
    //WRITE YOUR CODE HERE
	int count = word.length();
	System.out.println(word.charAt(count-1) + word.substring(1,(count-1))+ word.charAt(0));
}
}
