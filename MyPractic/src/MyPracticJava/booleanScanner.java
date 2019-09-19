package MyPracticJava;

import java.util.Scanner;

public class booleanScanner {

	public static void main(String[] agrs) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter number ");
		int x=input.nextInt();
	
		
		if(x!=10) {
			System.out.println("Not 10!");
		}else {
			System.out.println("Yes it is 10");
		}
	}
}
