package replPractice;

public class replPractice160 {

	public static double waterTax(double units)
	  {
	    double bill = 0.0;
	    
	    //your code here
	    if (units <= 50) bill = units*0.6;
	    else if(units <= 100) bill = units*0.9;
	    else if(units <= 150) bill  = units*0.9 + 50;
	    else bill = units*0.9 + 100;  
	    
//	    if(units<=50)  bill= units * 0.60;
//
//	    else if (units >50&& units<=100) bill=units* 0.90;
//
//	    else if(units > 100 && units<=150) bill=50+(units*0.90);
//
//	    else bill=(units*0.90)+100;
	    //end your code here
	    	System.out.println(bill);    
	    return bill;
	  }//end waterTax
public static void main(String[] args) {
	waterTax(151);
}
	  
	}