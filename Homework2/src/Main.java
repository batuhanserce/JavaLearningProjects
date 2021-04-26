
public class Main {
	public static void main(String [] args) {
		
		Game game1 = new Game("Dishonored","Arkane Studios","2012",77108,8.4);
		Game game2 = new Game("Bioshock","Irrational Games","2007",77109,9.1);
		Game game3 = new Game("Saints Row : The Third","Deep Silver Volition","2011",77110,8.1);
		Game game4 = new Game("Tom Clancy's Rainbow Six Siege","Ubisoft Montreal","2015",77111,8.0);
		Game game5 = new Game("Deponia","Daedelic Entertainment","2012",77112,7.6);
		
		Genre genre1 = new Genre();
		genre1.genreId = 1;
		genre1.genreName = "Action";
		
		Genre genre2 = new Genre();
		genre2.genreId = 2;
		genre2.genreName = "Adventure";
		
		Genre genre3 = new Genre();
		genre3.genreId = 3;
		genre3.genreName = "Online Tactical Shooter";
		
		Genre genre4 = new Genre();
		genre4.genreId = 4;
		genre4.genreName = "Retrofuturistic";
		
		Genre genre5 = new Genre();
		genre5.genreId = 5;
		genre5.genreName = "Graphic Adventure";

		Game [] games = {game1,game2,game3,game4,game5};
		for(Game allGames : games) 
		{
			System.out.println(" " + allGames.name);
		}
		
		System.out.println("***Rating Part***");
		
		Rating rateNow = new Rating();
		rateNow.rateGame(game1);
		rateNow.rateGame(game3);
		rateNow.rateGame(game5);
		
		System.out.println("***Commenting Part***");
		
		Commenting commentNow = new Commenting();
		commentNow.commentOnGame(game5, "It was a good game, thanks!");
		commentNow.commentOnGame(game4,"Game is great but too hard to play and players are toxic af!");
		commentNow.commentOnGame(game1, "I hated this game so much, mechanics are bad and cannot recommend to other players out there, DOWNVOTE!");
		
		
	}
}
