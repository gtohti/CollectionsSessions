package day51;

public class AdminUser extends SlackUser {

	int adminLevel;
//	String displayName;
//	int timeZone;
//	String status;
	
	public AdminUser(String displayName, String status,
			int timeZone, int adminLevel) {
		
		super(displayName, timeZone, status);
		this.adminLevel = adminLevel;
		
	}
	//optional annotation to make sure
	//you are overriding  it correctly
	@Override
	public void sendMessage(String message) {
		System.out.println("@Channel Dear good people of sperta");
		System.out.println("<" + displayName + "> is seding <" + message + ">");
	    System.out.println("jlgdsgldkasjoeriyghdlhgsdl");
	}
	
	public static void main(String[] args) {
	
	AdminUser a1 = new AdminUser("B11", "FULLY CHARGED", 5, 1);
		a1.sendMessage("abc");
		
	
		
		
	}
	 
	
	
}
