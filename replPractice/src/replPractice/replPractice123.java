package replPractice;
import java.util.*;
public class replPractice123 {
	 public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }    
	    //TODO. Write you code below this line. 
	      int[] inhabitantsEachCity = new int[inhabitants.length];		    
		  int days=0;
		  System.out.println("Day "+days+" " + Arrays.toString(inhabitants));
			do {
				for (int i = 0; i < inhabitantsEachCity.length; i++) 
					inhabitantsEachCity[i] = (inhabitants[i] /= 2);

					int populationDecrease = 0;
					for (int x : inhabitantsEachCity) 
					    populationDecrease += x;
					days++;
						System.out.println("Day " + days + " " + Arrays.toString(inhabitantsEachCity));
						if (populationDecrease == 0){
						  System.out.println("---- EXTINCT ----");
							break;
						}
					} while (true);
	  }
	}