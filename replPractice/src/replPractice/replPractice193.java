package replPractice;

public class replPractice193 {

public static boolean isPalindrome(String check) {
	String newCheck = check.replace(" ", "");
	boolean checkResult = false;
	String reverse = "";
	for (int i = newCheck.length()-1; i >= 0; i--) {
		reverse += newCheck.charAt(i);
		if(newCheck.equalsIgnoreCase(reverse))
		checkResult = true;
	}
	   return checkResult;
	  }
public static void main(String[] args) {
	System.out.println(isPalindrome("Nurses Run"));
}
	}