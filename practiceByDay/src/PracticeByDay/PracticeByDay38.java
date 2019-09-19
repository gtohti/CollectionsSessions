package PracticeByDay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PracticeByDay38 {
public static void main(String[] args) {
	List<Integer> lst = Arrays.asList(2,4,6,7,8,11,25);
	lst.set(5, 9);
	lst.set(6,  10);
	System.out.println(lst);
	ArrayList<Integer> myCoolList = new ArrayList<>(lst);
	System.out.println(myCoolList);
	myCoolList.add(1, 3);
	myCoolList.add(3, 5);
	System.out.println(myCoolList);
	myCoolList.remove(8);
	System.out.println(myCoolList);
	
	//List<String> word = Arrays.asList("ana", "bala", "oghul", "qiz");
	ArrayList<String> word = new ArrayList<>(Arrays.asList("ana", "bala", "oghul", "qiz"));
	System.out.println(word);
	
}
	
	
}
