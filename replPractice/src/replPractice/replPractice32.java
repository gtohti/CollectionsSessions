package replPractice;

import java.util.Scanner;

public class replPractice32 {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	
	int itemPrice, quarters, dimes, nickel;
	System.out.println("Enter price in cents:");
	
	itemPrice=scan.nextInt();
	int change=100-itemPrice;
	
	quarters=change/25;
	change=change%25;
		
	dimes=change/10;
	change=change%10;
		
	nickel=change/5;
	change=change%5;
	
	
if (itemPrice<25 || itemPrice>100 || itemPrice % 5 != 0) {
	System.out.println("Invalid price!");
}else {
	System.out.println(("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickel + " nickels."));	
   }
 }
}


 

