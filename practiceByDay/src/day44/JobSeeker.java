package day44;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class JobSeeker {
public static void main(String[] args) {
	
	Job j1 = new Job ("SDET", "Google", 150000.0);
	Job j2 = new Job ("Java Instructor", "Cybertek", 170000.0);
	Job j3 = new Job ("Scrum Master", "My Own Company", 250000.0);
	Job j4 = new Job ("Tester", "Amazon", 130000.0);
	Job j5 = new Job ("SDET", "Apple", 160000.0);
	
	List<Job> jobs = new ArrayList<>();
	jobs.add(j1);
	jobs.add(j2);
	jobs.add(j3);
	jobs.add(j4);
	jobs.add(j5);
	
	for ( Job each : jobs) {
		System.out.println(each);
	}
	
  }
}
