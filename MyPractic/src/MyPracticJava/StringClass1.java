package MyPracticJava;

public class StringClass1 {
public static void main(String[] args) {
String sentance="uyghur children cut off from their roots";
int space1=sentance.indexOf(" ");
int space2=sentance.indexOf(" ", space1+1);
String word=sentance.substring(space1+1, space2);
System.out.println(word);
	
	
	
}
}
