package replPractice;

import java.util.Scanner;

public class replPractice63 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 String word = scan.next();
	    //YOUR CODE HERE
	int count = word.length();
	if(count%2>=1 && count>5) {
		System.out.println(""+(word.charAt(count/2-1)+""+word.charAt(count/2)+""+word.charAt(count/2+1)));
	}else {
		System.out.println("invalid");
	}
}
}
