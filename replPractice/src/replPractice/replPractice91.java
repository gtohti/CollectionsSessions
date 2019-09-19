package replPractice;
import java.util.*;
public class replPractice91 {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    word = word.toLowerCase().replace(" ", "");
	    //WRITE YOUR CODE HERE
String revWord = "";
for (int i = word.length()-1; i >= 0; i--) {
	revWord += word.charAt(i);
}
	if ( word.equals(revWord)) {
		System.out.println("true");		
	}else {
		System.out.println("false");
	}
	
}

}


