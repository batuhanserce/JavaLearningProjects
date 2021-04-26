
public class Main {
	public static void main(String [] args) 
	{
		Weapon weapon1 = new Weapon("R4-C","Auto/Single",false,39,9875);
		
		Weapon weapon2 = new Weapon("M762","Auto/Single",true,45,9876);
		
		Weapon weapon3 = new Weapon("Scorpion EVO3 A1","Auto",true,23,9877);
		
		Weapon weapon4 = new Weapon("416-C Carbine","Auto/Single",false,43,9878);
		
		Weapon weapon5 = new Weapon("Commando 9","Auto",true,36,9879);
		
		Weapon [] weapons = {weapon1,weapon3,weapon5};
		
		for (Weapon allWeapons : weapons) 
		{
			System.out.println("Weapon name : " + allWeapons.name);
		}
		
		Operator operator1 = new Operator("Ash","Breach Charge","Attacker",1234,weapon1);
		Operator operator2 = new Operator("Zofia","KS Lifeline","Attacker",1235,weapon2);
		Operator operator3 = new Operator("Ela","Grizmot Mine","Defender",1236,weapon3);
		Operator operator4 = new Operator("Jager","Active Defense System","Defender",1237,weapon4);
		Operator operator5 = new Operator("Mozzie","Pest Launcher","Defender",1238,weapon5);
		
		Operator [] operators = {operator1,operator2,operator3,operator4,operator5};
		
		for (Operator allOperators: operators) 
		{
			System.out.println("Operator : " + allOperators.operatorName);
		}
		
		Colour coloring = new Colour();
		
		Attachment attaching = new Attachment();
		
		coloring.Color(weapon5, operator5, "Pink");
		coloring.Color(weapon4, operator4, "Red");
		attaching.Attach(weapon3,operator3,"2x", "Compensator");
		
		
		
		
	}
}
