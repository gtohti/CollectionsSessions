package MyPracticJava;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Eter your name here:");
		String name = input.next();

		// boolean b= (name=="Lachyn");
		// we use method from String class called equals
		boolean b = name.equalsIgnoreCase("Gheyret");

		System.out.println(b);
if (name.equalsIgnoreCase("Gheyret")) {
	System.out.println("your entered correct name :)");
}else {
	System.out.println("You entered wrong name  :(");
}
	}
}
