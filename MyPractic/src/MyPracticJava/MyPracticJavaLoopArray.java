package MyPracticJava;

public class MyPracticJavaLoopArray {
public static void main(String[] args) {
	
	String str = "aaabbcccbc" ; 
	String uniqueStr = "" ; 

	for (int i = 0; i < str.length(); i++) {
	String eachChar = str.substring(i, i+1);
	if (! uniqueStr.contains(eachChar)) {
		uniqueStr += eachChar;
	}
}
System.out.println(uniqueStr);
}
}
