
public class Game {
	
	String name;
	String publisher;
	String publishDate;
	int id;
	double imdb;
	
	public Game() 
	{
		
	}
	public Game(String name,String publisher,String publishDate,int id,double imdb) 
	{
		this();
		this.name = name;
		this.publisher = publisher;
		this.publishDate = publishDate;
		this.id = id;
		this.imdb = imdb;
	}
	
	
}
