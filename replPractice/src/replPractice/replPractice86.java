package replPractice;

import java.util.Scanner;

public class replPractice86 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	int n = scan.nextInt();
	//Write you code 

System.out.println( ( str.substring(n,str.length() ).contains(  str.substring(0, n))    ));
        }
	
    }

	


