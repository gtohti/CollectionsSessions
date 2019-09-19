package replPractice;
import java.util.*;
public class replPractice126 {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String[] str = {scan.next(), scan.next(), scan.next(), 
		                    scan.next(), scan.next(), scan.next()};
		// Write your code here 
		    int min = 0;
		 //   String shortString = "";
		    for (int i = 0; i < str.length; i++) {
		    	if (min > str[i].length()) {
		    		min = str[i].length();
		    		
				
		    		System.out.println(str[i]);	    
		    
//		    String shortStr = "";
//		    for (String each: str) {
//		    	if (each.length() < shortStr.length()) {
//		    		shortStr = each;
		 
//		    int min = 0;
//			String shortStr = "";
//			for (int i = 0; i < str.length; i++) {
//				if (str[i].length() < min) {
//					min = str[i].length();
//					shortStr = str[i];;
		    		
		    	}
				
			}
	
//System.out.println(shortStr);
}
}