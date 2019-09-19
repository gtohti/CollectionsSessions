package replPractice;
import java.util.*;
public class replPractice154 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    fib(num);
	  }
	  
	  public static void fib(int num){
	    //WRITE YOUR CODE HERE
		   	int[] fibonacci = new int[num+1];
		   	fibonacci[0] = 0;
			fibonacci[1] = 1;
			for (int j = 2; j <= num; j++)
				fibonacci[j]=fibonacci[j-1] + fibonacci[j-2];
			
//				fibonacci[0] = 0;
//				fibonacci[1] = 1;
//				int temp;
				//temp = fibonacci[j] + fibonacci[j+1];
				//fibonacci[num]=fibonacci[j];
				
				System.out.println(fibonacci[num]);
			}
			
		}
		   
	

		