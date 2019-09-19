package replPractice;

import java.util.*;

public class replPractice153 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		isPalindrome(num);
	}

	public static void isPalindrome(int num) {
		// WRITE YOUR CODE HERE
		int revNum = 0;
		for (int i = num; i > 0; i /= 10) {
			revNum = revNum * 10 + i%10;
			}
		if (revNum==num) {
			System.out.println(true);
			}else {
			System.out.println(false);
		}

	}
}