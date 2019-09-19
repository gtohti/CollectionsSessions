package MyPracticJava;
import java.util.Arrays;
public class taskSplit {
public static void main(String[] args) {
	String  groceries = "Crunchy Bites Meyer Foods: tomato, potato, garlic";
	
	String[] space = groceries.split(" ");
    System.out.println(Arrays.toString(space));
    
    String[] ch = groceries.split("o");
    System.out.println(Arrays.toString(ch));
    
    String[] letters = groceries.split("tomato");
    System.out.println(Arrays.toString(letters));
		String[] item = groceries.split(",");
		System.out.println((item.length));
		System.out.println(Arrays.deepToString(item));
}
}
