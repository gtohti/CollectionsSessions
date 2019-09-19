package MyPracticJava;
import java.util.*;
public class ReverseAnArray {
public static void main(String[] args) {
	
	int[] numbers =  { 11,2,39,18,7,4,15,17,20};
	System.out.println(Arrays.toString(numbers));
	int lastIndex = numbers.length-1;
	for (int i = 0; i < numbers.length/2; i++) {
		int temp = numbers[i];
		numbers[i] = numbers[lastIndex-i];
		numbers[lastIndex-i] = temp;
		
	}
	System.out.println(Arrays.toString(numbers));
}
}
