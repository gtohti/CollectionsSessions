package replPractice;
import java.util.*;
public class replPractice133 {
public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	    float[] score = new float[7];
	    //WRITE YOUR CODE HERE
	    float total =0; 
		    for(int i =0; i< score.length; i++){
		      System.out.println("Enter score for judge "+(i+1)+ ":");
		      score[i] = input.nextFloat();
		    }
		    Arrays.sort(score); 
		    for(int j =1; j <score.length-1; j++){
		        total += score[j];	       	        
		      }	      
		      System.out.println("Enter difficulty:");
		        float difficulty = input.nextFloat();
		       total *= (difficulty * 0.6); 
	    
	    // FINAL OUTPUT
	    System.out.println("Total: "+total);
	  }
	}