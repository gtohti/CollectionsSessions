package replPractice;

import java.util.Arrays;
import java.util.Scanner;

public class replPractice199 {
	public static int[] do_switch(int[] i) {
		int firstElemet = i[0];
		int lastElemet = i[i.length-1];
		i[0] = lastElemet;
		i[i.length-1] = firstElemet;
		
		return i;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		arr = do_switch(arr);
 
		
		System.out.println(Arrays.toString(arr));
	}

}
