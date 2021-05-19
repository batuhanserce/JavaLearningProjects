
public class GamerManager {
	
	public final void greet(Gamer gamer) 
	{
		System.out.println("Welcome " + gamer.nickname);
	}
	
	public void add(Gamer gamer) 
	{
		System.out.println(gamer.nickname + " has been added!");
	}
	
	public void delete(Gamer gamer) 
	{
		System.out.println(gamer.nickname + "has been deleted!");
	}
	
	public void own(Gamer gamer, Game game) 
	{
		System.out.println(gamer.nickname + ", now owns " + game.name);
	}

}
