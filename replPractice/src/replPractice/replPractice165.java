package replPractice;

public class replPractice165 {
public static void main(String[] args) {
	
//}
//	public static String mergeStrings(String one, String two) {
	String one = "ABC", two = "DEF";
	String mergeString = "";
	   int length = Math.max(one.length(), two.length());
	   for(int i = 0; i < length; i++){
		   if(i < one.length())
	     mergeString = mergeString.concat("" + one.charAt(i));
		   if(i < two.length())
	     mergeString = mergeString.concat("" + two.charAt(i));
	   
	      }
	    
	   System.out.println(mergeString);
	  }
	}