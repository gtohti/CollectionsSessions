package replPractice;

public class replPractice163 {

	  public boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
	  {
		  boolean available = false;
		  if(isAvailable == true && year == 2018)
			  if(!(month == 7 && day <= 8))
				  available = true;
				  return available;
	    
	  }
}