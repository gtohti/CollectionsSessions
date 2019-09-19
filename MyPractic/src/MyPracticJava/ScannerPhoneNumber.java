package MyPracticJava;

import java.util.Scanner;

public class ScannerPhoneNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
System.out.println("pleaser enter your area code:");
		int areaCode = scan.nextInt();
		System.out.println("please enter your local phone number:");
		int phoneNumber = scan.nextInt();

		System.out.println("Your phone number starting with area code is:" + "(" + areaCode + ")-" + phoneNumber);

	}

}
