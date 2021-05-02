
public class Instructor extends User {
	
	String details = ""; // Instructor information, career etc
	String proficiency;
	private double salary;
	
	public Instructor() 
	{
		
	}
	
	public Instructor(String details, String proficiency) 
	{
		this.details = details;
		this.proficiency = proficiency;
		
	}
	
	
	public double getSalary() 
	{
		return salary;
	}
	
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

}
