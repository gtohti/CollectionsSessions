package replPractice;
import java.util.*;
public class replPractice83 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// your code 
    // ------------------------------------------
	
	System.out.println("Please enter guest name:");
	String name = input.next();
	System.out.println("Do you want to enter new guest name:");
	String ans = input.next();
	while (ans.equalsIgnoreCase("yes")) {
		System.out.println("Please enter guest name:");
	String	guest = input.next();
	name = name +", " + guest;
		System.out.println("Do you want to enter new guest name:");
		ans = input.next();	
	
	}
	System.out.println("Guest's list: " + name);	

}
}
