package ClothingDemo.business.concretes;

import java.util.List;

import ClothingDemo.business.abstracts.ClothService;
import ClothingDemo.core.extraLoggerService;
import ClothingDemo.dataAccess.abstracts.ClothDao;
import ClothingDemo.entities.concretes.Cloth;

public class ClothManager implements ClothService {

	
	private ClothDao clothDao;
	private extraLoggerService extraLogger;
	
	
	public ClothManager(ClothDao clothDao, extraLoggerService extraLogger) 
	{
		super();
		this.clothDao = clothDao;
		this.extraLogger = extraLogger;
	}
	
	//*****************
	
	@Override
	public void deliver(Cloth cloth) 
	{
		
		if(cloth.getAmount() == 1) 
		{
			System.out.println("Cloth is delivered, cloth id is : " + cloth.getLabelId());
			System.out.println("Payment successful : " + cloth.getPricePerUnit());
		}
		else if(cloth.getAmount() > 1) 
		{
			System.out.println("Clothes are delivered, cloth id is : " + cloth.getLabelId());
			System.out.println("Payment successful : " + cloth.getAmount() * cloth.getPricePerUnit());
		}
		
	}

	@Override
	public void takeBack(Cloth cloth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cloth> getAllSold() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
