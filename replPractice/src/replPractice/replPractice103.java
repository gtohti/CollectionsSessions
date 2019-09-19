package replPractice;

import java.util.Scanner;

public class replPractice103 {
	public static void main(String[] args) {
		  int count = 0;
		    Scanner scan = new Scanner(System.in);
		    String  str = scan.nextLine();
		    //White Your code here 
		    for (int i = 0; i < str.length()-3; i++) {
		    	String str4letter = str.substring(i, i+4);
		    	if(str4letter.startsWith("co") && str4letter.endsWith("e")) {
		    		count ++;
		    	}
				
			}
		
		System.out.println(count);
	}

}
