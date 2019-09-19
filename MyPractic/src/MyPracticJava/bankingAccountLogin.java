package MyPracticJava;

import java.util.Scanner;

public class bankingAccountLogin {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		long myAccount = 12345L;
		System.out.println("Welcmome to CyberTek bank!");
		System.out.println("Enter your account number");
		long account = scan.nextLong();
		
		long myPassword= 9543487;
		System.out.println("Enter your password");
		long password = scan.nextLong();	
		
		if( myAccount == account) {
			System.out.println("Correct account number!");
		}else{
			System.out.println("Try again");
		}
		
		if( myPassword == password) {
			System.out.println("Welcome!");
		}else {
			System.out.println("Try again");
		
	}

	}
}



