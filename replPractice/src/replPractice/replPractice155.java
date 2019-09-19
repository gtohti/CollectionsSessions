package replPractice;

import java.util.Arrays;
import java.util.Scanner;

public class replPractice155 {

	  public int count_appearance(String[] arr, String t) {
		  int count = 0;
		  for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(t)) {
				count++;
			}
		}
	   return count;
	  } //end  count_appearance
	  
public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 int size = scan.nextInt();
 String[] array = new String[size];
 for (int i = 0; i < size; i++) {
	 array[i] = scan.next();	
}
 String t = "foo";
 replPractice155 obj = new replPractice155();
 
System.out.println(obj.count_appearance(array, t));
}


	// TODO Auto-generated method stub
	
}}}
