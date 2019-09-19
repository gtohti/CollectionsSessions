package MyPracticJava;

public class StringArray {
public static void main(String[] args) {
	String  movies []= {"Life", "Without", "love is", "Meaningless"};
	int index  = 0;
	int max = movies[0].length();
	for (int i = 1; i < movies.length; i++) {
		if ( movies[i].length() > max) {
			max = movies[i].length();
			index++;
		}
	}
	System.out.println(max);
}
}
