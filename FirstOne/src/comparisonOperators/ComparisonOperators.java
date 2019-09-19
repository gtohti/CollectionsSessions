package comparisonOperators;

public class ComparisonOperators {
	public static void main(String[] args) {
		
		double n1=55.942342342;
		double n2=23.343215345;
		byte n3=100;
				
		boolean what=n1>=n2;
		
		System.out.println(what);
		
		char letter1='a';
		char letter2='b';
		
		System.out.println(letter1!=letter2);
		
		boolean b1=letter1>letter2;
		boolean b2=letter1<letter2;
		boolean b3=b1!=b2;
		System.out.println(b3);
	}

}
