package StringPractice;

public class StringPractice1 {
public static void main(String[] args) {
	
	String name="Gheyret";
	
	
	System.out.println(name.length());
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	System.out.println(name.charAt(2));
	System.out.println(name.charAt(6));
	System.out.println(name.charAt(name.length()-1));
    System.out.println(name.equalsIgnoreCase("GHEYRET"));
    System.out.println(name.contains("G"));	
    System.out.println(name.indexOf("heryet"));
   // String gheyret = name.equalsIgnoreCase() ,   
}
}
