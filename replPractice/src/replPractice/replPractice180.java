package replPractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class replPractice180 {
public static void main(String[] args) {
	String r1[] = {"men", "sen", "u"};
	String r2[] = {"biz", "siler", "ular"};
	System.out.println(combined());
	
}
public static String combineRs(String[] r1, String[] r2)  {
	
	 ArrayList<String> r1r2 = new ArrayList<>();
	    //String combined = "";
		   for(int i= 0; i < r1.length; i++){
		     r1r2.add( r1[i]);
		   }
		    for(int i = 0; i < r2.length; i++ ){
		     r1r2.add( r2[i]);
		    }
		    String combined = "";
		    for(int i = 0; i < r1r2.size(); i++){
		      combined += r1r2.get(i);
		    }
		    return combined;
		   }
		  

		  }
		  