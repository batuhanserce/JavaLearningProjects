
public class Campaign extends GameShop {
	

	public Campaign(Game game, double priceAfterDiscount) 
	{
		super(game, priceAfterDiscount);
	}

	public double discount(Game game, double price, int discount, String sale) 
	{
		this.sale = sale;
		this.price = price;
		this.discount = discount;
		priceAfterDiscount = price - price*discount/100;
		System.out.println("Game name : " + game.name);
		System.out.println("Price without discount : " + price);
		System.out.println("Price with discount : " + priceAfterDiscount);
		return priceAfterDiscount;
	}
	
	

}
