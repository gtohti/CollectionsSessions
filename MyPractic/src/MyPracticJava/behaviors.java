package MyPracticJava;

public class behaviors {
	public static void main(String[] args) {
		Aircontitioner ac = new Aircontitioner(); 
	    ac.brand= "Samsung" ; 
	        ac.currentTemp=79.7f;
	        ac.isOn=true;
	        
	        ac.displayTheBrand();
	        ac.displayAllInfo();
	        
	        ac.turnOff();
	        ac.turnOn();
	        ac.showCurrentTemp();
	       
	        ac.increaseTemp(10);
	        System.out.println(ac.currentTemp);
            
	        ac.decreaseTemp(20);
	        ac.showCurrentTemp();
	        //ac.setTemperature(80);
	        ac.showCurrentTemp();
	  }

	}