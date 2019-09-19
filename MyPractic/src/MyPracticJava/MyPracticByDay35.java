package MyPracticJava;
import java.util.*;
public class MyPracticByDay35 {
public static void main(String[] args) {
	String name = "java";
	System.out.println(name.indexOf("a"));
	System.out.println(name.indexOf("a",2));
	System.out.println(name.replace('a', 'B'));
	System.out.println(name.replace("va", "ja"));
	System.out.println( addNums(5,4)  );
    System.out.println( addNums(5,6,7) ) ;
    System.out.println( addNums(5,6,7,8));
    printChars("Gheyret", " Tohti");
    System.out.println(printChars(name, name));
}
public static int addNums(int x, int y) {
	return x*y;
}
public static int addNums(int x, int y, int z) {
	return x+y+z;
}
public static int addNums(int x, int y, int z, int w) {
	return x+y+z+w;
}
public static String printChars(String x, String y) {
	return x+y;
}
}
