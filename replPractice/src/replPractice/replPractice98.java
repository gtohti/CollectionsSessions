package replPractice;

import java.util.Scanner;

public class replPractice98 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	 String sentence = scan.nextLine();
	 //WRITE YOU CODE HERE 
	int javaCount = 0, pythonCount = 0;
	
	    for (int i = 0; i < sentence.length()-3; i++) {
			if ( sentence.substring(i, i+4).contains("java")) 
				javaCount++;
			}

	    for (int j = 0; j < sentence.length()-5; j++) {
			if (sentence.substring(j, j+6).contains("python")) 
				pythonCount++;			
			}
		
	    if (javaCount == pythonCount) {
	    	  System.out.println(true);
	    }else {
	    	System.out.println(false);
	    }
}
}