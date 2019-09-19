package replPractice;

public class replPractice158 {
	public String c_profits(int buyPrice, int sellPrice) {
		// your code here
		String determine = "";
		if(sellPrice > buyPrice)
		determine = "profit";
		if(sellPrice == buyPrice)
		determine = "no loss";
		if(sellPrice < buyPrice)
		determine = "loss";
		return determine;
	}
}