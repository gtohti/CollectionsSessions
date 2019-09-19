package replPractice;
import java.util.*;
public class replPractice110 {
public static void main(String[] args) {
	int num1, num2, num3, num4, num5;
	Scanner input = new Scanner(System.in);
	 int[] nums = {input.nextInt(),input.nextInt(),
			     //  input.nextInt(),input.nextInt(),
			       input.nextInt()};
	//TODO: Write your code below
	 
    int even = 0;
	for (int i = 0; i < nums.length; i++) {
		
		 if (nums[i]%2==0) {
			
			 even++;
		
	} 
	
	}
	System.out.print(even);
}
	
}
