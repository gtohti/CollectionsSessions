package replPractice;
import java.util.*;
public class replPractice137 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		  int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
            };
int result = 0;
int diagonal1 = 0;
int diagonal2 = 0;
for (int i = 0; i < matrix.length; i++) {
	for (int j = 0; j < matrix.length; j++) {		
		if (i==j)
		diagonal1 += matrix[i][j];
		if(i == matrix.length-j-1)
		diagonal2 += matrix[i][j];
	}	
}
result = diagonal1 - diagonal2;
// FINAL PRINT
System.out.println(Math.abs(result));
}
}