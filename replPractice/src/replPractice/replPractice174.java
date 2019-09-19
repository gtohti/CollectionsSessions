package replPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class replPractice174 {
	public static String lameDb(String db, String op,String id,String data){ 
		 String[] result = db.split("#");
			ArrayList<String> resultArray = new ArrayList<>();
			resultArray.addAll(Arrays.asList(result));
			int num = Integer.parseInt(id);
		
			if(op.equals("add")||op.equals("delete")||op.equals("edit")) {
			if (op.equals("add"))
			resultArray.add(data);
			else if (op.equals("delete"))
			resultArray.remove(num-1);
			else if (op.equals("edit"))
			resultArray.set(num-1, id+data);
			}
			
			result = resultArray.toArray(new String[resultArray.size()]);
			String myDataString = "";
			for(String each: result) {
				myDataString += "#" + each;
			}
			if (op.equals("delete"))		
			return myDataString;
			else return myDataString.substring(1);
	  }//end lameDb
	  
public static void main(String[] args) {
	System.out.print(
		       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
		       );
		       
		      System.out.print(
		       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
		       );
		       
		      System.out.print(
		       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
		       );
		       
		        System.out.print(
		       lameDb("1tst#2bla#3foo","none","1","")+"\n"
		       );
}
}
