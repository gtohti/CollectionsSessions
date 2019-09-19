package replPractice;

public class replPractice164 {

	public boolean getThunderBlazz(boolean available,boolean gift, int ingredient1 
			  , int ingredient2, int ingredient3)
			  {
			    boolean drink = false;
			     
			    if (available == true || gift == true) drink = true;
			    else if (((ingredient1 == 1 && ingredient2 == 2) && ingredient3==3) || ((ingredient1 == 3 && ingredient2 == 1) && ingredient3==2))
			    drink = true;
			    
			  
			    return drink;
			    
			  }
			}