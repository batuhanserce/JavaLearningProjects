
public class Operator {

	String operatorName;
	String operatorAbility;
	String operatorAffiliation;
	int operatorId;
	
	public Operator() 
	{
		
	}
	
	public Operator(String operatorName,String operatorAbility,String operatorAffiliation, int operatorId, Weapon weapon) 
	{
		this();
		this.operatorName = operatorName;
		this.operatorAbility = operatorAbility;
		this.operatorAffiliation = operatorAffiliation;
		this.operatorId = operatorId;
		
	}
	
}
