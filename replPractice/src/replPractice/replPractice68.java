package replPractice;

import java.util.Scanner;

public class replPractice68 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String word = scan.next();
    //WRITE YOUR CODE HERE
	int count = word.length();
  
    
    if (count > 5){
      System.out.println("Too long!");
    }else if (count < 5){
      System.out.println("Too short");
    }else if(count==5){
      while (count > 0){
        --count;
     
        System.out.print(word.charAt(count));
      }
    }
	
}
}