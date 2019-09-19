package replPractice;

import java.util.ArrayList;

public class replPractice171 {
	public static void main(String[] args) {
		System.out.println(replPractice171.at3("longword", "foo"));
	}

	 public static String at3(String target,String word)
	  {
	   
		
	   return target.substring(0, 3) + word + target.substring(3); 
	  }
	  
	}
