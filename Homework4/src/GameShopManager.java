
public class GameShopManager extends Game {
	

	public void putOnMarket(Game game)
	{
		System.out.println("Game " + "'" + game.name + "'" + " has been put on market for sale");
	} 
	
	public void removeFromMarket(GameShop game)
	{
		System.out.println("Game, " + game.name + " has been removed from the market");
	}
	

}
