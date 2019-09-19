package MyPracticJava;

public class Aircontitioner {

	String brand;
	float currentTemp;
	boolean isOn;
	
	public void displayTheBrand() {
		System.out.println(brand);
	}
	public void showCurrentTemp() {
		System.out.println(currentTemp);
	}
	public void displayAllInfo() {
		System.out.println(brand+", "+isOn+" "+isOn);
	}
	public void turnOn() {
		System.out.println("current AC status " + isOn);
		if(isOn == false) {
			isOn =true;
		}else {
			System.out.println("It is already on !!!");
		}
	}
	public void turnOff() {
	    
	    if(isOn) {
	      isOn = false;
	      System.out.println("It has been turned off");
	    }else {
	      System.out.println("IT IS ALREADY OFF!@");
	    }
	    
	  }
	public void increaseTemp(int increaseBy) {
		
		currentTemp += increaseBy;
	}
     public void decreaseTemp(int decreaseBy) {
		
		currentTemp -= decreaseBy;
}
}