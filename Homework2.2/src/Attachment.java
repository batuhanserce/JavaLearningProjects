
public class Attachment {
	String scope = "4x";
	String rifleAttachment;
	
	public void Attach(Weapon weapon, Operator operator, String scope, String rifleAttachment) 
	{
		System.out.println(scope + " has been attached to " + weapon.name + "Operator : " + operator.operatorName );
	}

}
