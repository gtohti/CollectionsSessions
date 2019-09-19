package replPractice;

public class replPractice178 {
public static void main(String[] args) {
	
	String str = "Gheyret";
	for (int i = str.length()-1; i >= 0; i--) {
		String reversed = "";
		reversed += str.charAt(i);
		System.out.print(reversed);
	}
	
}
}
