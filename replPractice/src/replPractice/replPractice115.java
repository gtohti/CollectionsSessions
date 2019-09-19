package replPractice;
import java.util.*;
public class replPractice115 {
public static void main(String[] args) {
	// Scanner input = new Scanner(System.in);
	//	String[] words = new String[5];
	String[] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};
//		for(int i = 0; i < 5;  i++) {
//       // words[i] = input.nextLine();		  
//		}	
	//write your code below
		int max = 0;
		String maxLength = "";
		for(String each : words) {
			if ( each.length() > max ) {
				max = each.length();
				maxLength = each;
			}
		
		}
		System.out.println(maxLength);

}
}
