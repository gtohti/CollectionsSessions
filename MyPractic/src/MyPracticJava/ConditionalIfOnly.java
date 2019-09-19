package MyPracticJava;

import java.util.Scanner;

public class ConditionalIfOnly {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Welcome to Okta to Slack");
		
		int lengthOfName=scan.nextInt();
		
		if (lengthOfName>22) {
			
			System.out.println("Slack can not take more than 22 char");
		
		}else{
			
		System.out.println("Successfully added user");
	}
	}
}
