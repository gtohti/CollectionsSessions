package MyPracticJava;

import java.util.Scanner;

public class MultiBranchintro {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("What is your score ?");
		int score = input.nextInt();
		if (score > 100 || score < 0) {
			System.out.println("Invalid Number");
		} else if (score > 90) {
			System.out.println("your got an A");
		} else if (score >= 80 && score < 90) {
			System.out.println("you got a B");
		} else if (score < 80 && score >= 70) {
			System.out.println("You got a C");
		} else if (score < 70) {
			System.out.println("Please study hard");
		}

	}
}
