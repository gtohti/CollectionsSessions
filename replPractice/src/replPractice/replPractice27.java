package replPractice;

import java.util.Scanner;

public class replPractice27 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int house = s.nextInt();
		int player = s.nextInt();
		
		if (player > 21) {
			System.out.println("player busts");
		} else if (house <= 21 && house > player)
			;

		{
			System.out.println("player loss");
		}
		if (house == player) {
			System.out.println("draw");
		} else if (player <= 21 && player > house) {
			System.out.println("player wins");
		}

	}
}
