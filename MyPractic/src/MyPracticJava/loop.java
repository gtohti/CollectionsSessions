package MyPracticJava;

import java.security.AllPermission;

public class loop {
public static void main(String[] args) {
	String star = "*";
	int i = 0;
//	while (i < 5) {
//		System.out.println(star);
//		star = star + "*";
//		i++;
		String allStar = "";
		
		while (i <= 5) {
			allStar = allStar + star;
			i++;
			System.out.println(allStar);
		}
	}
	
	
}

