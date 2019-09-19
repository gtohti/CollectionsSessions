package day51;

public class Dog extends Animal{

	public void makeNoise() {
		super.eat();
		this.eat();
		super.makeNoise();
		System.out.println("Dog Noise");
}
	
} 
