package day43_static_constructors02;

public class Calculations {	
   public static void main(String[] args) {
	   
	  // Calculations.operation = "added";
	System.out.println(Calculator.plus(2.5, 1.5));
	System.out.println(Calculator.minus(2.5, 1.5));
	Calculator Mul = new Calculator();
	Mul.multiply(2.5, 1.5);
	System.out.println(Mul.multiply(2.5, 1.5));
	Calculator HeydarsCalculator = new Calculator();
	HeydarsCalculator.operation = "Math Calculation";
	System.out.println(HeydarsCalculator.operation);
}
}
