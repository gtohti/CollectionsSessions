package replPractice;

public class replPractice166 {

	public static void main(String[] args) {
		// test your code
		System.out.println(uniqueChars("wooden-spoon"));
	}

	public static String uniqueChars(String str) {
		// TODO: write your below
		String words = "";
		for (int i = 0; i < str.length(); i++) {
			if(!words.contains("" + str.charAt(i))) {
				words += str.charAt(i);
						
							
			}
			
		}
		return words;	

	}
}