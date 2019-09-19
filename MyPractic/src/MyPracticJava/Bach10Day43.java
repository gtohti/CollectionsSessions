package MyPracticJava;

public class Bach10Day43 {
private String email;
private String firstName;
private String password;

public String getEmail() {
	return email;
}
public void setEmail(String newEmail) {
	email = newEmail;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String newFirstName) {
	if(newFirstName)
	firstName = newFirstName;
}
}
