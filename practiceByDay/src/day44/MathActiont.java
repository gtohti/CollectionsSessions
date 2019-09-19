package day44;

import java.util.Arrays;

public class MathActiont {

	public static void main(String[] args) {
		
		MathEquation m1 = new MathEquation(120, 10, '+');
		MathEquation m2 = new MathEquation(13, 12, '-');
		MathEquation m3 = new MathEquation(120, 10, '*');
		MathEquation m4 = new MathEquation(12, 10, '/');
		MathEquation m5 = new MathEquation(1250, 100, '%');
		//System.out.println(m2);
		
		//MathEquation[] arr =  new MathEquation[] {m1, m2, m3, m4};
		MathEquation[] arr =  {m1, m2, m3, m4, m5};
		for (MathEquation each: arr) {
			each.calculate();
//			System.out.println(each.getResult());
//			//System.out.println(each.toString());
			System.out.println(each);
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
 