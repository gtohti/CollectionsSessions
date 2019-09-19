package MyPracticJava;

import java.util.Scanner;

public class AmazonShopper {
	
public static void main(String[] args) {
	

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Welcome Amazon shopper");
	System.out.println("What the price in your cart");
	
	double price = scan.nextDouble();
	System.out.println("Are you a prime member?");
	
	//String primemember=inpt.next();
	boolean primemember=scan.hasNextBoolean();
	
	if (primemember) {
		System.out.println("You got free shipping "+ price);
	}else if(price>35){
		System.out.println("You still got free shipping "+price);
		
	}else {
		System.out.println("you need to pay 5% shipping fee + " + price);
		System.out.println("You may also consider joining prime to" + "avoid shipping fee");
	}
	/*if (price > 100 ||  ){
		System.out.println("You will get free shipping");
	} else if (price > 90 ) {
		System.out.println("your got an A");
	} else if (price >= 80 && price < 90) {
		System.out.println("you got a B");
	} else if (price < 80 && price >= 70) {
		System.out.println("You got a C");
	} else if (price < 70) {
		System.out.println("Please study hard");*/
}
}
