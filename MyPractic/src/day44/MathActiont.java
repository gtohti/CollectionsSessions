package day44;

import java.util.*;

public class MathActiont {
public static void main(String[] args) {
	MathEquasion math1 = new MathEquasion(120d, 25d, '+');
	MathEquasion math2 = new MathEquasion(12, 5, '-');
	MathEquasion math3 = new MathEquasion(12, 20, '*');
	MathEquasion math4 = new MathEquasion(120, 20, '/');
	
	List<MathEquasion> math = new ArrayList<>();
	math.add(math1);
	math.add(math2);
	math.add(math3);
	math.add(math4);
//	MathEquasion[] math = {math1, math2, math3, math4};
	
	for (MathEquasion each:  math) {
		each.caculate();
		System.out.println(each);
	}
}
}
