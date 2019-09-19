package day51;

public class JavaAssenment extends Assesment{

	int level;
//	int questionCount;
//	int score;
//	String type;
//  static int timeLimit;
	
	
	public static void main(String[] args) {
		
	printTimelimit();
	//static way to access .timeLimit
	System.out.println(Assesment.timeLimit);
	//accessing inherited static field directly in static method
	System.out.println(timeLimit);
	timeLimit = 40;
	timeLimit = 50;
	//accessing inherited static field in static way using this class name
	System.out.println( JavaAssenment.timeLimit);
	
		printTimelimit();
		Assesment.printTimelimit();
		JavaAssenment.printTimelimit();
	}
//	//Static method can only access static members
//	public static void printTimelimit() {
//		
//		System.out.println("Time Limit " + timeLimit);
//		
//	}
//
//	@Override
//	public String toString() {
//		return "Assesment [questionCount=" 
//	            + questionCount + ", score=" + score 
//	            + ", type=" + type + "]";
//	}
}
