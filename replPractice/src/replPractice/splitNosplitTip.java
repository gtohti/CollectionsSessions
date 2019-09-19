package replPractice;

import java.util.Scanner;

public class splitNosplitTip {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double totalTip, totalPay, personPay;
		boolean split;
		int numOfPeople;
	
		System.out.print("What is the total payment?");
		double totalBill = scan.nextDouble();
		System.out.println("How was the service");
		String service = scan.next();
		
		if (service.equalsIgnoreCase("Poor")) {
			totalTip = (totalBill * 0.05);
		}else if (service.equalsIgnoreCase("Fair")) {
			totalTip = (totalBill * 0.10);
		}else if (service.equalsIgnoreCase("Good")) {
			totalTip = (totalBill * 0.15);
		}else if (service.equalsIgnoreCase("Great")) {
			totalTip = (totalBill * 0.20);
		}else if (service.equalsIgnoreCase("Excellent")) {
			totalTip = (totalBill * 0.25);
		}else {
			totalTip=0;
		}
		totalPay=totalBill+totalTip;
		System.out.println("Wouold like to split the Bill?");
		split = scan.nextBoolean();
//		split=true;
//		split=false;
		
	if (split){
		System.out.println("How many people?");
		numOfPeople=scan.nextInt();
		System.out.println("After split, amount per person is: " + (totalBill+totalTip)/numOfPeople);
	} else {
		System.out.println("Your total amount is: " 
				+ ((totalBill+totalTip)));
	}
	
  }

}
