package replPractice;

import java.util.Arrays;

public class replPractice194 {
	 public static boolean isAnagram(String word1, String word2) {
		 char[] charWord1 = word1.toLowerCase().toCharArray();
		 char[] charWord2 = word2.toLowerCase().toCharArray();
		 
		 Arrays.sort(charWord1);
		 Arrays.sort(charWord2);
		 
		 word1 = Arrays.toString(charWord1);
		 word2 = Arrays.toString(charWord2);
		 
		 if (word1.equals(word2))
		return true; else return false;
		}
	 public static void main(String[] args) {
		System.out.println(isAnagram("men", "sen"));
	}
	  
	}