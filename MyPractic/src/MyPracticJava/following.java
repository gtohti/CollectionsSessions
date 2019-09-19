package MyPracticJava;

import java.util.Arrays;

public class following {
public static void main(String[] args) {
	String names[] = new String[5];
	names[0] = "abc";
	names[1] = "ef";
	names[2] = "gh";
	System.out.println(Arrays.toString(names));
	String[] names2 = new String[] {"aaa", "bbb", "", "ccc"};
	int x = 0;
	while (x < names2.length) {
		
		System.out.println(names2[x]);
		x++;
	}
}
}
