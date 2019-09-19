package replPractice;
import java.util.*;
public class replPractice127 {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//	    String str = scan.nextLine();
	    
	    String str = "java cable bad red rid vivid remedy grace";
	    String[] words = str.split(" ");
	    int[] numbers = new int[words.length];
	    String evenlyShort = "";
	    
	    for (int i = 0; i < words.length; i++)
	    	numbers[i] = words[i].trim().length();
	    
	    Arrays.sort(numbers);
	    
	    for (int i = 0; i < words.length; i++) 
	    	if(words[i].length() == numbers[0])
	    		evenlyShort+= words[i] + ", ";
	    
	    String[] array = evenlyShort.split(", ");
	    Arrays.sort(array);
			
	    System.out.println(Arrays.toString(array));
		
	      }
	    }
	

