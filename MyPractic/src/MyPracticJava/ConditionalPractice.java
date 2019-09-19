package MyPracticJava;

import java.util.Scanner;

public class ConditionalPractice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, j;
		System.out.println("please enter two number here");
		i = input.nextInt();
		j = input.nextInt();

		if ((i > 5) & (j % 2 == 1) | (i + j >= 30)) {

			System.out.println("BINGO !!!");
		} else {
			System.out.println("Try again spartans");
		}
	}
}
