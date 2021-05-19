
public class GameManager {
		
	public void add()
	{
		System.out.println("Game is added");
	}
	
	public void delete(Game game)
	{
		System.out.println("Game is deleted");
	}
	
	public void sold(Game game, Gamer gamer) 
	{
		System.out.println("Game " + game.name + " has been bought by " + gamer.nickname);
	}

}
