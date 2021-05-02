
public class InstructorManager extends UserManager {
	
	public void giveGrades(Student student, char grade) 
	{
		System.out.println("Grade " + grade + " has been given to "+ student.firstName + ", Subject :  " + student.getField());
	}
	
	@Override
	public void show(Student student) // Example
	{
		System.out.println("Student : " + student.firstName);
	}

}
