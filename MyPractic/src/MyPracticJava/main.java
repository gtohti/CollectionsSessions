package MyPracticJava;

import java.util.Scanner;

public class main {
public main() {

Scanner scan=new Scanner(System.in);

String message = scan.nextLine();
String sender;
String phoneNumber;
String messageBody;
sender = message.substring(message.indexOf("<")+1, message.indexOf(">"));
phoneNumber = message.substring(message.indexOf("[")+1, message.indexOf("]"));
messageBody = message.substring(message.indexOf("{")+1, message.indexOf("}"));

System.out.println("Sender: "+sender+"\n"+"Phone Number: "+phoneNumber+"\n"+"Message body: "+messageBody );
}
}