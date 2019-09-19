package replPractice;
import java.util.*;
public class replPractice112 {
	public static void main(String[] args) {
	    
//	    Scanner input = new Scanner(System.in);
//	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		String words[] = {"hello", "why", "by", "apple" , "note"};

	    //TODO: Write your code below
	    
	    for(int i = 0; i <= words.length-1; i++) {
		   System.out.println(words[i].substring(0,1) + words[i].substring(words[i].length()-1));
	  }
	  }
	}