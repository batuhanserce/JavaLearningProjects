
public class Main {

	public static void main(String [] args) {
		
		Gamer gamer1 = new Gamer("shroud");
		
		Game game1 = new Game("Tom Clansy's Rainbow Six Siege");
		Game game2 = new Game("PlayerUnknown's Battlegrounds");
		Game game3 = new Game("Counter Strike Global Offensive");
		Game game4 = new Game("World of Warships");
		
		GameShop gameShop = new GameShop(game1, 40);
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.own(gamer1, game2);
		
		//****
		
		GameShopManager gameShopManager = new GameShopManager();
		gameShopManager.putOnMarket(game3);
		
		Campaign campaign = new Campaign(game4,20);
		campaign.discount(game4, 40, 30, "Winter Sale");
		
		
		

	}

}
