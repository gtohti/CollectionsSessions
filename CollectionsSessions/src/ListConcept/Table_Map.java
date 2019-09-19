package ListConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table_Map {
/*	|first_name             |   last_name       |       SSN         |
    | "Ahmad"               |   "Mahmood"       |   757755757       |
    | "John"                |   "Smith"         |   635636636       |
    | "Sam"                 |   "Bob"           |   623452355       |
*/
	public static void main(String[] args) {
		
		Map<String, String> full_name = new HashMap<String, String>();
		full_name.put("ahmad", "Mahmood");
		full_name.put("John", "Kenedy");
		full_name.put("Jennefer", "Smith");
		
		List<Integer> phone = new ArrayList<Integer>();
		phone.add(23332222);
		phone.add(24442227);
		phone.add(22555222);
		
		Map<Map<String, String>, List<Integer>> mapOfAll = new HashMap<>();
		mapOfAll.put(full_name, phone);
		System.out.println(mapOfAll);
		
	}
	
	
}
