package day43_static_constructors02;

public class Application {
public static void main(String[] args) {
	
	AppUser user1 = new AppUser("ironman", "Mark Smith", "ac124");
	AppUser user2 = new AppUser("postman", "Sar Sma", "ac1dfg24");
    AppUser user3 = new AppUser("superman", "Hi Joe", "a43c124");
   
    
	System.out.println(user1.getCount());
	System.out.println(user2.getCount());
	System.out.println(user3.getCount());
	
	 AppUser user4 = new AppUser();
	 System.out.println(user4.getCount());
	 
	 System.out.println(user1.getUserId());
	 System.out.println(user2.getUserId());
	 
	 
	}
}
