package ListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ColectinIntoArray {
	public static void main(String[] args) {
		
		Collection<Integer> ar1 = new ArrayList<>();
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		System.out.println(ar1.addAll(Arrays.asList(3, 5, 7)));
		System.out.println(ar1);
		//getting size
		System.out.println("getting size " + ar1.size());
		
		Integer[] colToArr = ar1.toArray(new Integer[6]);
		System.out.println(Arrays.toString(colToArr));
		
	}

}
