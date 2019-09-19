package replPractice;

import java.util.Arrays;

public class replPractice113 {
	public static void main(String[] args) {
	    
//	    Scanner input = new Scanner(System.in);
//	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   String words[] = {"hello", "why", "by", "apple" , "note"};

	    //TODO: Write your code below
for (int i = 0; i < words.length; i++) {
	words[i] = words[i].substring(0,1) + words[i].substring(words[i].length()-1);
}
System.out.println(Arrays.toString(words));
	   }

	}
		
	
