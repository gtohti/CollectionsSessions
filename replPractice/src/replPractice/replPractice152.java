package replPractice;
import java.util.*;
public class replPractice152 {

	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    String[] words = new String[size];
		    for(int i=0; i < size; i++){
		      words[i] = scan.next();
		    }
		    printUniqueWords(words);
		  }
		  
		  public static void printUniqueWords(String[] words){
		    //WRITE YOUR CODE HERE
		    for (int i = 0; i < words.length; i++) {
		    	int z = 0;
		    	for (int j = 0; j < words.length; j++) {
					
				if (words[i].equals(words[j])) 
					z++;					
				}
		    	if(z==1)
		    		System.out.println(words[i]);
			}
		    
		  }
		}