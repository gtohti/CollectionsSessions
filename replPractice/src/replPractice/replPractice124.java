package replPractice;

import java.util.Arrays;
import java.util.Scanner;

public class replPractice124 {
	 private static int dePopulation;

	public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }		    
		    //TODO. Write you code below this line.
		 //   int[] inhabitantsCities = new int[inhabitants.length];		    
			  int days=0;
			//  System.out.println("Day "+days+" " + Arrays.toString(inhabitants));
				do {
					for (int i = 0; i < inhabitants.length; i++) 
						inhabitants[i] = (inhabitants[i] /= 2);

						int dePopulation = 0;
						for (int eachCity : inhabitants) 
						    dePopulation += eachCity;
						days++;
							System.out.println("Day " + days + " " + Arrays.toString(inhabitants));
							if (dePopulation == 0){
							  System.out.println("---- EXTINCT ----");
							break;
							}
						} while (true);
		  }
		}