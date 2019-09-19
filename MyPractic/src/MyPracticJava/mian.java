package MyPracticJava;

public class mian {
	public static void main(String[] args) {
		isError("error is correct");
	}
	public static boolean isError(String line) {
		boolean isError = false;
		  
		   if( line.startsWith("error")) {
		     
					isError = true;
					
				}
				return isError;
		
	}

		

}
