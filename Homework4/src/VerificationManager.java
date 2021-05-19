
public class VerificationManager extends Customer {
	
	
	public void verifywithNo(Customer no)
	{
		System.out.println(no.getNo() + ", verified with TCNO");
	}
	
	public void verifywithBirthdate(Customer birthdate)
	{
		System.out.println(birthdate.getDateofBirth() + ", verified with BirthDate");
	}
	
	public void verifywith(Customer name, Customer surname) 
	{
		System.out.println(name.getName() + surname.getSurname() + "verified with Name and Surname");
	}

}
