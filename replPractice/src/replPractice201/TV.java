package replPractice201;

public class TV{
	int channel;
	int volumeLevel;
	boolean on;
	String brand = "undefined";
	public TV() {
		this("SAMSUNG");
		System.out.println("Creating TV object using no Args - constructor");
	}
	
    public TV(String brand) {
		//this();
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor " + brand);
	}
    public int cannel() {
    	return channel;
    }
    public void channel(int channel) {
    	this.channel = channel;
    }
   public int getVolumeLevel() {
	    return volumeLevel;
    }
   public void setVolumeLevel(int volumeLevel) {
	   this.volumeLevel = volumeLevel;
    }
   public String getBrand() {
	return brand;
    }
   public void setBrand(String brand) {
	this.brand = brand;
    }
   public void setOn(boolean on) {
	   this.on = on;
   }
   public void isOn() {
	   if(on==true)
	   System.out.println("The TV is on");
	   else System.out.println("The TV is off");
	
   }
    public int volumeUp() {
    	if (volumeLevel >= 1) 
        this.volumeLevel += 1;
    	return volumeLevel;
    }
    public int volumeDown() {
    	if(volumeLevel > 1)
    	this.volumeLevel -= 1;
    	return volumeLevel;
    }
}

