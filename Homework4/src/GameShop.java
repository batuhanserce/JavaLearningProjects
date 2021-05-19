
public class GameShop extends Game {
	
	String sale;
	double price;
	int discount;
	double priceAfterDiscount;
	
	public GameShop(Game game, double price) 
	{
		this.price = price;
		System.out.println("Game, " + "'" + game.name + "'" + " is for sale, price : " + price);
	}
	

}
