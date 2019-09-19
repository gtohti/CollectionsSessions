package replPractice;

import java.util.Scanner;

public class replPractice31 {
public static void main(String[] args) {
	
	Scanner scan=new Scanner (System.in);
	
	int cola, coffee, overdose;
    cola = 34;
    coffee = 160;
   
     System.out.println("Enter number of milligrams in drink:");
    int mg = scan.nextInt();
    
    overdose = 10000/mg;
    System.out.println("It would take about " +overdose +" drinks for a lethal overdose.");
  }
}
