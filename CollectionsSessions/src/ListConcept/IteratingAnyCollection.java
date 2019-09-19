package ListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {
	public static void main(String[] args) {
		
		Collection<Integer> coll = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 66, 544, 31 ));
		System.out.println(coll);
		System.out.println(coll.isEmpty());
		Iterator<Integer> myIter = coll.iterator();
	// Has next, check if there is any element
		System.out.println("Has next, check if there is any element " + myIter.hasNext());
    //Next check the next element
		myIter.next();
		System.out.println("Next, check the next element " + myIter.next());
	 //remove element on the currant cursor 
		myIter.remove();
		System.out.println("remove element on the currant cursor " + myIter.next());
		System.out.println("******************");
	//	System.out.print(myIter.next() + " _ ");
	
		while(myIter.hasNext()) {
			Integer each = myIter.next();
			System.out.print(each + " _ ");
				if(each > 10) 
					myIter.remove();
				
			}
		System.out.println();
		System.out.println(coll);
		}
		
	}
	
