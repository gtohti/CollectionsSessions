package replPractice;
import java.util.*;
public class replPractice92 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();
		  //WRITE YOU CODE 
//		ArrayList<String> list = new ArrayList<>();
//		list.add("First name: James");
//		list.add("Last name: May");
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
		int index1=json.indexOf("firstName");
		
	   json=json.replace("{\"id\": 1934, \"firstName\": \"", "").replace("\", \"lastName\"", "").replace("\", \"role\": \"student-team-member\"}", "");       

	    System.out.println("First name: " + json.substring(0, json.indexOf(':')));
	    System.out.println("Last name: " + json.substring(json.indexOf('"')+1));
	
}
}