package replPractice;

import java.util.Scanner;
public class replPractice65 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	 String word1 = scan.next();
	 String word2 = scan.next();
	    //WRITE YOUR CODE HERE
	  if (word1.charAt(word1.length()-1) == word2.charAt(0)) {
		
	 System.out.println((word1.substring(0, word1.length()-1)) + (word2));
	       	
	    }else {
	    	System.out.println(word1+word2);
	    }
}  
	    
}

