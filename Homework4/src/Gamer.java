
public class Gamer extends Customer {
	
	String mostPlayedGame;
	String nickname;
	int gamesOwned;
	double totalHours;
	
	public void play() 
	{
		System.out.println("Playing");
	}
	
	public Gamer() 
	{
		
	}
	
	public Gamer(String nickname) 
	{
		this.nickname = nickname;
	}
	
	
	
	
}
