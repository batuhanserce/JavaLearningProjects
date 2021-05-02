
public class StudentManager extends UserManager {
	
	public void evaluate(Instructor instructor, String evaluation)
	{
		System.out.println("Instractor evaluation details for " + instructor.firstName + " : " + evaluation);
	}

}
