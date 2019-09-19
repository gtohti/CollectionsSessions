package MyPracticJava;

public class StringClass {
public static void main(String[] args) {

String test= new String();
test = "Uyghur Children Cut off From Their Roots";
//String upCase = test.toUpperCase();
System.out.println(test.toUpperCase());
//String lowCase=test.toLowerCase();
System.out.println(test.toLowerCase());
//int count=test.length();
System.out.println(test.length());
//char char1=test.charAt(21);
System.out.println(test.charAt(21));
//char char2=test.charAt(0);
//int char2=test.charAt(0);
System.out.println(test.charAt(0));
//String str=test.substring(21);
System.out.println(test.substring(21));
boolean char3=test.contains("Cut");
System.out.println(char3);
System.out.println(test.indexOf("Cut")>-1);
System.out.println(test.toLowerCase().contains("Cut"));
int char4=test.indexOf(" ");
System.out.println(char4);
String char5=test.substring(7);
System.out.println(char5);
int char6=test.indexOf("ild");
System.out.println(char6);
System.out.println(test.indexOf(" ", 1));

 }
}
