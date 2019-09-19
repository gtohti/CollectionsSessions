package MyPracticJava;

public class MyPracticJavaReversString {
public static void main(String[] args) {
	
	String str= "Gheyret Tohti";
	//int count = str.length();
	String reversed = "";
	for (int i = str.length()-1; i >= 0 ; i--) {
		reversed += str.charAt(i);
		
	}
	System.out.print(reversed);
	
//****We also can do as below: ***
//	int count = str.length();
//	while (count > 0) {
//	--count;
//	System.out.print(str.charAt(count));
	
//****We also can do as below: ***
//	
//	for (int i = str.length()-1; i >= 0; i--) {
//		System.out.print(str.substring(i, i+1));
//	}
}
}
