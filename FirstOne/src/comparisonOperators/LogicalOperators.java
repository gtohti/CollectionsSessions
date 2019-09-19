package comparisonOperators;

public class LogicalOperators {
	public static void main(String[] agrs) {
//		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
//		System.out.println(true && true);
//		
//		System.out.println(true || false);
//		System.out.println(false || true);
//		System.out.println(false || false);
//		System.out.println(true || true);
//	    System.out.println(2<4 && 4>6);
//	    System.out.println(2<4 || 4>6);
//	    boolean b=12==12 && 11>12;
//	    boolean b1=b || true;
//	    System.out.println(b);
//	    System.out.println(b1);
	    
	    String drink="coffee";
	    boolean hot=true;
	    boolean free=true;
	    boolean takeIt=drink.equals("coffee") && hot && free;
	    System.out.println(takeIt);
		takeIt=drink.equals("coffee") | hot;
	}

}
