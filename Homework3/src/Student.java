
public class Student extends User {
	
	String [] classes;
	private double gpa; // Grade point average (x/4)
	private int level;
	private double fee;  // Annually
	private double halfFee;
	
	public Student() 
	{
		
	}
	
	public Student(int level, double fee) 
	{
		this.fee = fee;
		this.level = level;
	}
	
	public double getGrades() 
	{
		return gpa;
	}

	public void setGrades(double gpa) 
	{
		this.gpa = gpa;
	}

	public int getLevel() 
	{
		return level;
	}

	public void setLevel(int level) 
	{
		this.level = level;
	}

	public double getFee()
	{
		return fee;
	}
	
	public void setFee(double fee) 
	{
		this.fee = fee;
	}
	
	public double getHalfFee() 
	{
		halfFee = fee - fee/2;
		return halfFee;
	}
	
	public void setHalfFee(double halfFee) 
	{
		this.halfFee = halfFee;
	}

}
