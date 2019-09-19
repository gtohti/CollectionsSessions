package replPractice;
import java.util.*;
public class replPractice135 {
	public static void main(String[] args) {
		
	String[][] chessBoard = new String[8][8];
	//WRITE YOUR CODE HERE
	for (int row = 0; row < 8; row++) {
         int j = 0;		    
		 for (char columns = 'a'; columns <= 'h'; columns++) {

		 chessBoard[row][j] = row + 1 + "" + columns;
			  
			               j++;
			           }
			       }
	 //DO NOT CHANGE
	  
	  System.out.println(Arrays.deepToString(chessBoard));
	  }
	}