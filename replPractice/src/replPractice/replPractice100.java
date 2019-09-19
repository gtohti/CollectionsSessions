package replPractice;

import java.util.Arrays;
import java.util.Scanner;

public class replPractice100 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int prize = 0;
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		// WRITE YOUR CODE HERE
		int[] arr = { a, b, c, d };

		int countOfPrize = 0;
		for (int i = 0; i < arr.length; i++) {
			
				arr[i] = arr[i]+1;
				
				countOfPrize++;
			}
		
		
		prize = (countOfPrize - 1) * 10;
		System.out.println(prize);
		System.out.println(Arrays.toString(arr));
	}

}
