
package replPractice;

import java.util.Scanner;

import javax.xml.transform.Source;

public class replPractice88 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	  int countOfCats = 0;
	  int countOfDogs = 0;
	  String word = scan.next();
	//Write your code here 
	  for (int i = 0; i < word.length()-3; i++) {
		  if ( word.substring(i, i+3).equals("cat")) {
		      countOfCats++;
		    }
		  if ( word.substring(i, i+3).equals("dog")) {
			  countOfDogs++;
			}		  
	}
	  if ( word.contains("dog") && word.contains("cat") & countOfCats == countOfDogs ) {
			 System.out.println(true);
	  }else {
		  System.out.println(false);
	  }
}
}