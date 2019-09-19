package day51;

public class Assesment {
int questionCount;
int score;
String type;

static int timeLimit = 45;
//Static method can only access static members
public static void printTimelimit() {
	
	System.out.println("Time Limit " + timeLimit);
	
}

@Override
public String toString() {
	return "Assesment [questionCount=" 
            + questionCount + ", score=" + score 
            + ", type=" + type + "]";
}



}
