package replPractice;

import java.util.Scanner;

public class replPractice70 {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 String word = scan.next();
	    //Write your code here
	    
	    
		char c = word.charAt(0);
		char c1 = word.charAt(word.length()-1);
		
		if ((c=='x' || c== 'X') && (c1=='x' || c1=='X')) {
			
			System.out.println(word.substring(1, (word.length()-1)));
			
		} else {System.out.println(word);
	
}
}
}