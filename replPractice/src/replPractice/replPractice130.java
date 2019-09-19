package replPractice;
import java.util.*;
public class replPractice130 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int sizeInner = scan.nextInt();
	int sizeOuter = scan.nextInt();
	int[] inner = new int[sizeInner];
	int[] outer = new int[sizeOuter];
	for(int i =0; i < sizeInner; i++) {
		inner[i] = scan.nextInt();
	    }
	for(int j =0; j < sizeOuter; j++) {
		outer[j] = scan.nextInt();
		}
	Arrays.sort(inner);
	Arrays.sort(outer);
			//WRITE YOUR CODE HERE
	String innerStr = Arrays.toString(inner).replace(", ", "");
	innerStr = innerStr.substring(1, innerStr.length()-1);
	String outerStr = Arrays.toString(outer).replace(", ", "");
	outerStr = outerStr.substring(1, outerStr.length()-1);
	
	boolean A = true;
	for (int i = 0; i < innerStr.length(); i++) 
		if(!outerStr.contains("" + innerStr.charAt(i))) 
				
			A = false;
		
			System.out.println(A);
		}
	

	}


