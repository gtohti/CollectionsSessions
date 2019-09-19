package replPractice;

import java.util.Scanner;

public class replPractice85 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String word = scan.next();
    String separator = scan.next();
    int count = scan.nextInt();
  //Write your code here 
        
    for(int x=1; count>x; x++){
      System.out.print(word+separator);
}
   System.out.print(word);   
}
}