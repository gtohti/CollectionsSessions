package replPractice;

import java.util.Scanner;

public class replPractice66 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	 String word = scan.next();
	    //WRITE YOUR CODE HERE
		String helf = word.substring(0, word.length()/2);
		System.out.println(helf + helf);
		
}
}
