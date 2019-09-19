package replPractice;

import java.util.Scanner;

public class replPractice90 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String html = scan.nextLine();
		// Write you code
		if (html.contains("<html>")) {
			
	 String myID = html.substring(html.indexOf("id=")+4, html.lastIndexOf("\""));
	 
	 System.out.println(myID);
		} else {
			System.out.println("Invalid input!");
		}
	}
}
