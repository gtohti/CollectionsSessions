package MyPracticJava;

import java.util.Scanner;

public class FollowTeacher {

	public static void main(String[] agrs) {
		int num1, num2, sum;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter two numbers below");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		
		//System.out.println("Enter two numbers :");
		
		sum=num1+num2;
		
		if(sum>100){
			System.out.println("You entered great number!!");
		}else {
			System.out.println("Looks like your sum is less then or equal 100");
		}
		
		
	}
}
