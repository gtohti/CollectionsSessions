package replPractice;

import java.util.Scanner;

public class replPractice43 {
public static void main(String[] args) {
	//DO NOT CHANGE
    int propertyPrice = 0; 
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		String houseType;
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");
    //WRITE YOUR CODE HERE
		System.out.println("Enter your property type:");
		houseType = scan.next();
		
		
//		if (houseType.equalsIgnoreCase("SingleHouse")) {
//			propertyPrice=95000;
//			//System.out.println("Starting price for Single Family Home " + propertyPrice);
//			System.out.println("How many bedrooms do you have?");
//			numberOfBedrooms=scan.nextInt();
//			propertyPrice = numberOfBedrooms*30000 + propertyPrice;
//			System.out.println("Do you have a backyard?");
//			backyard = scan.nextBoolean();
//			if (backyard==true) {
//			propertyPrice =propertyPrice + 5000;
//			}else {
//			System.out.println("Do you have garage?");
//			}
//			garage = scan.nextBoolean();
//			if (garage==true) {
//				System.out.println("How many spots?");
//			}
//			garageSpots = scan.nextInt();
//				if (garageSpots<10) {
//				propertyPrice = propertyPrice + garageSpots*20000;
//				}else {System.out.println("Pardon,  it's not a public parking!");
//				    	}
//			System.out.println("How close is metro station?");
//			metroAccessibility = scan.nextFloat();
//			if (metroAccessibility<=1) {
//				propertyPrice = propertyPrice + 10000;
//			}else if (metroAccessibility>1 & metroAccessibility<3) {
//				propertyPrice = propertyPrice + 5000;
//			}
//			System.out.println("How close is highway?");
//			highwayAccessibility = scan.nextFloat();
//			if (highwayAccessibility<=1) {
//				propertyPrice = propertyPrice + 15000;
//			}else if (propertyPrice>1 & propertyPrice<5) {
//				propertyPrice = propertyPrice + 8000;
//			}else if (propertyPrice>5 & propertyPrice<20) {
//				propertyPrice = propertyPrice + 4000;
//			}
//				
//			System.out.println("What's the rating of nearest school?");
//			schoolScore = scan.nextFloat();
//			if (schoolScore<=10 & schoolScore>8) {
//				propertyPrice = propertyPrice + 45000;
//			}else if(propertyPrice<8 & propertyPrice>4) {
//				propertyPrice = propertyPrice + 20000;
//			}else if (propertyPrice<4) {
//				propertyPrice = propertyPrice + 5000;
//			}
//			System.out.println("Does any of your family members smoking?");
//			smoking = scan.nextBoolean();
//			if (smoking==true) {
//				propertyPrice = propertyPrice - 5000;	
//				System.out.println("Market report has been generated.");
//				System.out.println("Your estimate market price is " + propertyPrice);
//			}else {
//			System.out.println("Market report has been generated.");
//			System.out.println("Your estimate market price is" + propertyPrice);
//			}
//			}
		//else
			if (houseType.equalsIgnoreCase("condo")) {
			propertyPrice=50000;
			//System.out.println("Starting price for Single Family Home " + propertyPrice);
			System.out.println("How many bedrooms do you have?");
			numberOfBedrooms=scan.nextInt();
			propertyPrice = numberOfBedrooms*30000 + propertyPrice;
			System.out.println("Do you have a backyard?");
			backyard = scan.nextBoolean();
			if (backyard==true) {
				System.out.println("Backyard is not available for condo!");
			}
			System.out.println("Do you have garage?");
			
			garage = scan.nextBoolean();
			if (garage==true) {
			System.out.println("How many spots?");
			garageSpots = scan.nextInt();
			if (garageSpots<10) {
			propertyPrice = propertyPrice + garageSpots*20000;
			}else if(garageSpots>10){
				System.out.println("Pardon,  it's not a public parking!");
			}else {
			System.out.println("How close is metro station?");}
			metroAccessibility = scan.nextFloat();
			if (metroAccessibility<=1) {
				propertyPrice = propertyPrice + 10000;
			}else if (metroAccessibility>1 & metroAccessibility<3) {
				propertyPrice = propertyPrice + 5000;
			}
			System.out.println("How close is highway?");
			highwayAccessibility = scan.nextFloat();
			if (highwayAccessibility<=1) {
				propertyPrice = propertyPrice + 15000;
			}else if (propertyPrice>1 && propertyPrice<5) {
				propertyPrice = propertyPrice + 8000;
			}else if (propertyPrice>5 & propertyPrice<20) {
				propertyPrice = propertyPrice + 4000;
			}
				
			System.out.println("What's the rating of nearest school?");
			schoolScore = scan.nextFloat();
			if (schoolScore<=10 & schoolScore>8) {
				propertyPrice = propertyPrice + 45000;
			}else if(propertyPrice<=8 & propertyPrice>4) {
				propertyPrice = propertyPrice + 20000;
			}else if (propertyPrice<=4) {
				propertyPrice = propertyPrice + 5000;
			}
			System.out.println("Does any of your family members smoking?");
			smoking = scan.nextBoolean();
			if (smoking==true) {
				propertyPrice = propertyPrice - 5000;	
				System.out.println("Market report has been generated.");
				System.out.println("Your estimate market price is " + propertyPrice);
			}else {
			System.out.println("Market report has been generated.");
			System.out.println("Your estimate market price is " + propertyPrice);
			}
		}
			
//		else if (houseType.equalsIgnoreCase("Townhouse")) {
//			propertyPrice=75000;
//			//System.out.println("Starting price for Single Family Home " + propertyPrice);
//			System.out.println("How many bedrooms do you have?");
//			numberOfBedrooms=scan.nextInt();
//			propertyPrice = numberOfBedrooms*30000 + propertyPrice;
//			System.out.println("Do you have a backyard?");
//			backyard = scan.nextBoolean();
//			if (backyard==true) {
//			propertyPrice =propertyPrice + 5000;
//			}else {
//			System.out.println("Do you have garage?");
//			}
//			garage = scan.nextBoolean();
//			if (garage==true) {
//				System.out.println("How many spots?");
//			}
//			garageSpots = scan.nextInt();
//				if (garageSpots<10) {
//				propertyPrice = propertyPrice + garageSpots*20000;
//				}else {System.out.println("Pardon,  it's not a public parking!");
//				    	}
//			System.out.println("How close is metro station?");
//			metroAccessibility = scan.nextFloat();
//			if (metroAccessibility<=1) {
//				propertyPrice = propertyPrice + 10000;
//			}else if (metroAccessibility>1 & metroAccessibility<3) {
//				propertyPrice = propertyPrice + 5000;
//			}
//			System.out.println("How close is highway?");
//			highwayAccessibility = scan.nextFloat();
//			if (highwayAccessibility<=1) {
//				propertyPrice = propertyPrice + 15000;
//			}else if (propertyPrice>1 & propertyPrice<5) {
//				propertyPrice = propertyPrice + 8000;
//			}else if (propertyPrice>5 & propertyPrice<20) {
//				propertyPrice = propertyPrice + 4000;
//			}
//				
//			System.out.println("What's the rating of nearest school?");
//			schoolScore = scan.nextFloat();
//			if (schoolScore<=10 & schoolScore>8) {
//				propertyPrice = propertyPrice + 45000;
//			}else if(propertyPrice<8 & propertyPrice>4) {
//				propertyPrice = propertyPrice + 20000;
//			}else if (propertyPrice<4) {
//				propertyPrice = propertyPrice + 5000;
//			}
//			System.out.println("Does any of your family members smoking?");
//			smoking = scan.nextBoolean();
//			if (smoking==true) {
//				propertyPrice = propertyPrice - 5000;
//				System.out.println("Market report has been generated.");
//				System.out.println("Your estimate market price is " + propertyPrice);
//			}else {
//			System.out.println("Market report has been generated.");
//			System.out.println("Your estimate market price is" + propertyPrice);
//			}
//			}

}
}

