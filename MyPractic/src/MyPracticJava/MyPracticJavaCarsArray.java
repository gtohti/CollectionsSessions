package MyPracticJava;
import java.util.*;
public class MyPracticJavaCarsArray {
public static void main(String[] args) {
	
	String [][] cars = {{"honda", "Lexus", "Mazda", "BMW"}, 
			            {"Toyota", "Chevy", "Ford"},
	                    {"Dodge", "Tesla"}} ;
	
	for (int i = 0; i < cars.length; i++) {
		for (int j = 0; j < cars[i].length; j++) {
			System.out.println(cars[i][j] + " ");
		}
	}
	System.out.println(Arrays.deepToString(cars));
}
}
