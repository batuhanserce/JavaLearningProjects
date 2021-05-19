package ClothingDemo.dataAccess.concretes;

import java.util.List;

import ClothingDemo.dataAccess.abstracts.ClothDao;
import ClothingDemo.entities.concretes.Cloth;

public class HibernateClothDao implements ClothDao {

	@Override
	public void add(Cloth cloth, int amount) {
		System.out.println("Cloth added : " + cloth.getLabelId() + ", Amount : " + amount);
		
	}

	@Override
	public void delete(Cloth cloth) 
	{
		System.out.println("Cloth " + cloth.getLabelId() + " has been deleted!");
	}

	@Override
	public void changePrice(Cloth cloth, double newPrice) 
	{
		System.out.println("Cloth " + cloth.getName() + "'s price has been changed!");
		System.out.println("New price for " + cloth.getLabelId() + " is : " + newPrice);
	}

	@Override
	public Cloth get(String labelId) 
	{
		System.out.println("Getting id of a cloth");
		return null;
	}

	@Override
	public List<Cloth> getClothes() 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public double multipleSale(Cloth cloth, int number)
	{
		double totalAmount = 0;
		System.out.println("You bought multiple items!");
		totalAmount = cloth.getAmount() * number;
		return totalAmount;
	}
	
	

}
