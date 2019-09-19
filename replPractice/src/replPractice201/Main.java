package replPractice201;

public class Main {
	public static void main(String[] args) {
//		int channel = 1;
//		int volumeLevel = 1;
//		boolean on = false;
//		String brand = "undefined";
	TV tv = new TV();
	
	tv.channel = 2;
	tv.volumeLevel = 6;
	tv.on = true;
	tv.isOn();
	System.out.println("Corrent channel is " + tv.channel);
	System.out.println("Corrent volume level is " + tv.volumeLevel);
	System.out.println(tv.on);
	//TV tv1 = new TV("Sony");
	//tv1.brand = "LG";
	System.out.println("The TV brand is " + tv.brand);
	
	}

}
