package replPractice;

public class replPractice170 {
	 public static String limit(String text, int maxLength)
	  {
		 return text.substring(0, maxLength);
	  //  return text.substring(0, text.length()-maxLength);
	  }
	 
    public static void main(String[] args) {
		System.out.println(replPractice170.limit("abdc", 2));
	}
	}