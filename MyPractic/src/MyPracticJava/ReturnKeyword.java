package MyPracticJava;

import java.util.Scanner;

public class ReturnKeyword {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number: ");
	int num = scan.nextInt();
	numTester(22);
	}
public static void numTester(int number) {
	if (number < 21) {
		System.out.println("Not eligible for Alcohol");
		return;
	}
	
//	System.out.println("Complex Statement");
//	System.out.println("Complex Statement");
//	System.out.println("Complex Statement");
//	System.out.println("Complex Statement");
//	System.out.println("Complex Statement");
//	System.out.println("Complex Statement");
//	System.out.println("Complex Statement");
//	
}
}
