package replPractice;

import java.util.Scanner;

public class replPractice51 {
	
public static void main(String[] args) {
	String split;
	int numberOfPeaple;
	double checkAmount = 0, tip = 0;
	String service;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("split:");
	split = scan.next();
	if(split.equalsIgnoreCase("yes")) {
	System.out.println("Number of people: ");
	numberOfPeaple = scan.nextInt();
	System.out.println("Check amount:");
	checkAmount = scan.nextDouble();
	System.out.println("Service Quality:");
	service = scan.next();
	switch (service) {
	case "Fair":
		tip = checkAmount * 0.10;
		break;
	case "Good":
		tip = checkAmount * 0.15;
		break;
	case "Great":
		tip = checkAmount * 0.20;
		break;
	case "Excellent":
		tip = checkAmount * 0.25;
		break;
		default: System.out.println("Total topay: " + checkAmount + tip);
	}
	double totalToPay = checkAmount + tip;
	String guestNumber = "&";
	int count = 0;
	System.out.print("Number of people entered: ");
	while(count < numberOfPeaple) {
		System.out.print(guestNumber);
		count++;
	}
	System.out.println();
	System.out.println("Total topay: " + totalToPay);
	System.out.println("Total tip: " + tip);
	System.out.println("Total per person: " + (totalToPay / numberOfPeaple));
	System.out.println("Tip per person: " + tip/numberOfPeaple);
	}
	
	}
	}
	





	
		

	
	
	
	





