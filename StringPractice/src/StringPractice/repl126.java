package StringPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class repl126 {
	public static void main(String[] args) {
//		 Scanner scan = new Scanner(System.in);
//		    String[] str = {scan.next(), scan.next(), scan.next(), 
//		                    scan.next(), scan.next(), scan.next()};
		String str1 = "java cable red vivid remedy grace";
	    String[] str = str1.split(" ");
	  
	    int[] nums = new int[str.length];
	    for(int i = 0; i < str.length; i++)
	    nums[i] = str[i].length();
	    
	    Arrays.sort(nums);
	    for (int i = 0; i < str.length; i++) 
			if(str[i].length()==nums[0])
		
	 		
	 			System.out.println(str[i]);
			}
		}

	
