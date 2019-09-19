package day51;

public class SlackUser {
String displayName;
int timeZone;
String status;

public SlackUser() {
	//super();
}
public SlackUser(String displayName, 
		        int timeZone, 
		        String status) {

	this.displayName = displayName;
	this.timeZone = timeZone;
	this.status = status;
}

public void sendMessage(String message) {
	System.out.println("<" + displayName + "> is seding <" + message + ">");
}

public String getDisplayName() {
	return displayName;
}
public void setDisplayName(String displayName) {
	this.displayName = displayName;
}
public int getTimeZone() {
	return timeZone;
}
public void setTeimeZone(int timeZone) {
	this.timeZone = timeZone;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}


}
