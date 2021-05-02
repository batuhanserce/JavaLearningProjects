
public class Main1 {

	public static void main(String [] args) {
		
		Student student1 = new Student(3,12000);
		Student student2 = new Student(4,14500);
		Student student3 = new Student(2,16000);
		Student student4 = new Student(2,15500);
		Student student5 = new Student(2,19500);
		Student student6 = new Student(2,13500);
		Student student7 = new Student(2,18000);
		Student student8 = new Student(2,17500);
		student2.setFee(14000);
		
		
		Student [] students = {student1,student2,student3,student4,student5,student6,
				student7,student8};
		
		
		for(Student allStudent : students) 
		{
			System.out.println("Student Salary : " + allStudent.getHalfFee());
		}
		
		
		Instructor instructor1 = new Instructor();
		Instructor instructor3 = new Instructor();
		Instructor instructor7 = new Instructor();
		Instructor instructor8 = new Instructor();
		
		instructor1.details = "Macroeconomics";
		instructor3.details = "Object Oriented Programming";
		instructor7.firstName = "Freeman";
		instructor8.firstName = "Prof. Freaky";
		
		student1.setField("European History");
		student1.firstName = "Manfred von Richthofen";
		
		StudentManager studentManager = new StudentManager();
		studentManager.evaluate(instructor8, "Teacher is not bad, his technical teaching is mediocre.");
		studentManager.evaluate(instructor7, "Teacher is very good, great skills of communication.");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.giveGrades(student1, 'A');
		
		
		
		
		
		
	}

}
