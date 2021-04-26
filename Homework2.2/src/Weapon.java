
public class Weapon {
	String name;
	String fireMod;
	boolean available;
	int damage;
	int id;
	
	public Weapon() 
	{
		
	}
	
	public Weapon(String name,String fireMod,boolean condition,int damage, int id)
	{
		this();
		this.name = name;
		this.available = condition;
		this.fireMod = fireMod;
		this.damage = damage;
		this.id = id;

	}
	

}
