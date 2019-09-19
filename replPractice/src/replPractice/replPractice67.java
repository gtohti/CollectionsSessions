package replPractice;
import java.util.*;
public class replPractice67 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String word1 = scan.next();
    String word2 = scan.next();
    //YOUR CODE HERE
    
    int i = 0;
    for ( i = 0; i < word1.length(); i++) {
    	char a = word1.charAt(i), b = word2.charAt(i);
    	 if (word1.length()==3 && word2.length()==3) {
    		 System.out.print(word1.substring(0, word1.length()) + word2.substring(0, word2.length()));
    			 
    		 }else {
    		System.out.print("Cannot merge");
    	}
    
//    if (word1.charAt(0)==word2.charAt(0) | word1.charAt(1)==word2.charAt(1) | word1.charAt(2)==word2.charAt(2)){
//    	System.out.println(word1 + word2);
//    	System.out.println(word1.substring(0,3));
//    	System.out.println(word2.substring(0,3));
//    }else {
//    	System.out.println("cannot merge");
//    }
    
    
}}

