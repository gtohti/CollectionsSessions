package replPractice;

import java.awt.image.ConvolveOp;

public class replPractice167 {
	public static void main(String[] args) {
	    System.out.println(coverString("java methods", "me") ) ; //java [me]thods
	  }
	  
	  public static String coverString(String main, String coverME) {
		  
		 String str = "["+coverME+"]";
		 if(main.contains(coverME)) {
			 main = main.replaceAll(coverME, str);
		 }
	    
		  return main;
	  }
	  
	}