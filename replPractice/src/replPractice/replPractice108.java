package replPractice;

import java.util.Scanner;

public class replPractice108 {
public static void main(String[] args) {
	int i = 1;
	int j = 1;
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
 
 //Write you code here 
 for (i=1; i<=n; i++) {
	for (j=0; j<i; j++) {
		 System.out.print("*");
	 }
	System.out.println("");
 }
 
}
}

