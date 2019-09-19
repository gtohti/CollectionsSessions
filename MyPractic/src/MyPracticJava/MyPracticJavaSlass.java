package MyPracticJava;

import java.util.Scanner;

public class MyPracticJavaSlass {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Math Library");
		System.out.println("Enter 2 integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a+b >= 100) {
			System.out.println("You entered great numbers!");
		}
		else {
			System.out.println("Looks like your sum is less than 100");
		}
		
		
	}


	
	}

