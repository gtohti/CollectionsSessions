package replPractice;

public class replPractice185 {
public static void main(String[] args) {
	String s = "aa2aa3";
	String extractNum = "";
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i) > '0' && s.charAt(i) < '9') {
		extractNum = extractNum + s.charAt(i);
		
	}
		
	}
	
}
	System.out.println(extractNum);
}
}
