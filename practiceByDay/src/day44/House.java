package day44;

public class House {

	private String type;
	private int bedroom;
	private double price;

	public House(String type, int bedroom, double price) {
		this.type = type;
		this.bedroom = bedroom;
		this.price = price;
	}
	public String getType() {
		return type;
	}
//	public void setType(String type) {
//		this.type = type;
//	}
	public int getBedroom() {
		return bedroom;
	}
//	public void setBedroom(int bedroom) {
//		this.bedroom = bedroom;
//	}
	public double getPrice() {
		return price;
	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
	
	public String toString() {
		return "House [type=" + type + ", bedroom=" + bedroom + ", price=" + price + "]";
	}
	
	
}
