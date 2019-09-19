package day44;

public class Job {

 private String title;
 private String company;
 private double AnnualSalary;
 
public Job(String title, String company, double annualSalary) {
	super();
	this.title = title;
	this.company = company;
	AnnualSalary = annualSalary;	
}

public String toString() {
	return "Job [title=" + title + ", company=" + company + ", AnnualSalary=" + AnnualSalary + "]";
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public double getAnnualSalary() {
	return AnnualSalary;
}
public void setAnnualSalary(double annualSalary) {
	AnnualSalary = annualSalary;
}
 

}
	
 
 

