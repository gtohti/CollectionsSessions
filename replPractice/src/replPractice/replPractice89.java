package replPractice;
import java.util.Scanner;

import javax.xml.transform.Source;
public class replPractice89 {
public static void main(String[] args) {
	boolean exists = false;
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
   // Write your code 
  
    int javaIndex = word.indexOf("java");
    if ( javaIndex == 0 || javaIndex == 1) {
    	System.out.println(true);
    }else {
    	System.out.println(exists);
    }

}
}
