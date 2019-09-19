package replPractice;

import java.util.Scanner;

public class replPractice84 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		long fact = 1;
		for (int c = 1; c <= n; c++) {
            fact = fact*c;
			}
	
		System.out.println(fact);

		}}
		
	

