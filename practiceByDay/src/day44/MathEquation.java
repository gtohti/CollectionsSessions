package day44;

public class MathEquation {
 private double oprand1;
 private double oprand2;
 private double result;
 private char operator;
 
 
public MathEquation() {
	//super();
	System.out.println("Print out Message from no Arg");	
}
public MathEquation(char operator) {
	//super();
	this.operator = operator;
}

public MathEquation(double oprand1, double oprand2, char operator) {
	//super();
	this.oprand1 = oprand1;
	this.oprand2 = oprand2;
	this.operator = operator;
}

public void calculate() {	
	switch (this.operator) {
	case '+':
		result = this.oprand1 + this.oprand2;		
		break;
	case '-':	
		result = oprand1 - oprand2;	
		break;
	case '*':	
		result = oprand1 * oprand2;
		break;
	case '/':
		result = oprand1 / oprand2;		
	case '%':
		result = oprand1 % oprand2;
		break;
		default:
			System.out.println("INVALID @@@!!!");
	}	
}

public double getOprand1() {
	return oprand1;
}
public void setOprand1(double oprand1) {
	this.oprand1 = oprand1;
}
public double getOprand2() {
	return oprand2;
}
public void setOprand2(double oprand2) {
	this.oprand2 = oprand2;
}
public char getOperator() {
	return operator;
}
public void setOperator(char operator) {
	this.operator = operator;
}
public double getResult() {
	return result;
}
public String toString() {
	return "MathEquation [oprand1=" 
            + oprand1 + ", oprand2=" 
			+ oprand2 + ", result=" 
            + result + "]";
}

}
	

