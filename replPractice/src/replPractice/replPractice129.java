package replPractice;
import java.util.*;
public class replPractice129 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			int size = scan.nextInt();
			int[] num = new int[size];
			for(int i =0; i < size; i++) {
				num[i] = scan.nextInt();
			}
			//WRITE YOUR CODE HERE
		//	int[] arr = new int[size];
			if(size <= 2 ) {
				System.out.println(Arrays.toString(num));
			}else {
				int[] arr = new int[2];
				arr[0]=num[0];
				arr[1]=num[1];
				System.out.println(Arrays.toString(arr));
			}
	}
}

