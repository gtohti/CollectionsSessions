package replPractice;
import java.util.*;
public class replPractice136 {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i = 0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    //WRITE YOUR CODE HERE
		    int[] newNums = new int[size];
		    for (int i = 0; i < newNums.length-1; i++) 
				newNums[i] = nums[i+1];
				newNums[newNums.length-1] = nums[0];
				
				System.out.println(Arrays.toString(newNums));
			}
	  }
