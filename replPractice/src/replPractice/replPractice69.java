package replPractice;

//import java.util.Scanner;
import java.util.*;
public class replPractice69 {
public static void main(String[] args) {
	
	//DO NOT CHANGE
	 double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
    //WRITE YOUR CODE HERE
		int age = 0;
		int experience = 0;
		int zip = 0;
		String accidents = "";
		System.out.println("Enter your name");
		name=scan.next();
		System.out.println("Do you have a US driver license?");
		String driverLicense=scan.next();
		if (driverLicense.equalsIgnoreCase("yes")) {
			System.out.println("Enter your zip code");
		}else {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		//System.out.println("Please enter your zip code");
		zip=scan.nextInt();
		if (zip==20910 || zip==20740) {
			premium=premium+60;
		}else if(zip==22102 || zip==22103) {
			premium=premium+30;
		}else {
			premium=premium+50;
		}
		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		 vehicleOwnership=scan.next();
		if(vehicleOwnership.equalsIgnoreCase("owned")) {
			premium=premium+10;
		}else {
			premium=premium+20;
		}
		
		System.out.println("How is this vehicle primarily used?");
		 vehicleUsage=scan.next();
		if (vehicleUsage.equalsIgnoreCase("business")) {
			premium=premium+50;
		}else if (vehicleUsage.equalsIgnoreCase("pleasure")) {
			premium=premium+10;
		}else if (vehicleUsage.equalsIgnoreCase("commute")) {
			premium=premium+20;
		}else {
			System.out.println("Incalid data!");
			System.exit(0);
		}
		System.out.println("Days Driven To Work And/Or School");
		 daysDrivenToWorkOrSchool=scan.nextInt();
		if (daysDrivenToWorkOrSchool<=7 && daysDrivenToWorkOrSchool>0) {
			premium=premium+5*daysDrivenToWorkOrSchool;
		}else {
			System.out.println("Incalid data!");
		}
		System.out.println("Miles Driven To Work And/Or School");
		 milesToWorkOrSchool=scan.nextInt();
		if (milesToWorkOrSchool>0) {
			premium=premium+1*milesToWorkOrSchool;
		}
		System.out.println("How old are you?");
		age = scan.nextInt();
		if (age < 16) {
			System.out.println("Invalid data!");
			System.exit(0);
		}else if (age>=16 && age<18 ) {
			premium=premium*20;
		}else if (age>=18 && age<=21) {
			premium=premium*6;
		}else if (age>21 && age<25) {
			premium=premium*2;
		}
		System.out.println("What is your driving experience?");
		experience = scan.nextInt();
		if (experience>0 && age-experience>=16) {
			premium=premium + 5*experience;
		}else {
			System.out.println("Invalid data!");
		}
		System.out.println("Have you had any accidents in the last 5 years?");
		accidents = scan.next();
		if (accidents.equalsIgnoreCase("yes")) {
			System.out.println("How many?");
			accidentsAmount = scan.nextInt();
			premium=premium+premium*0.2*accidentsAmount;
		}else {
			System.out.println("Have you had continuous insurance for the past 12 months?");
			continuousInsurance = scan.next();
		}
		if (continuousInsurance.equalsIgnoreCase("no")) {
			premium=2*premium;
		}else {
			System.out.println("What is the highest level of education you have completed?");
			education = scan.next();
		}
		if (education.equalsIgnoreCase("phd") || education.equalsIgnoreCase("Bachelors") || education.equalsIgnoreCase("Masters")){
			premium=premium-premium*0.05;
		} else if (education.equalsIgnoreCase("Doctors")) {
			premium=premium-premium*0.1;
		}else {
			premium=premium+premium*0.05;
		}
	
		System.out.println(name + ", here's your quote!");
		System.out.println("Start Your Policy Today For: " + premium);
		referenceNumber = name.substring(0,2) + age + name.substring((name.length()-2), name.length()) + zip;
        System.out.println("Reference number: " + referenceNumber);
	
}
}
