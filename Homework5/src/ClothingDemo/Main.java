package ClothingDemo;

import ClothingDemo.business.abstracts.ClothService;
import ClothingDemo.business.concretes.ClothManager;
import ClothingDemo.core.extraLoggerAdapter;
import ClothingDemo.dataAccess.concretes.HibernateClothDao;
import ClothingDemo.entities.concretes.Cloth;

public class Main {

	public static void main(String[] args) {
		
		ClothService clothService = new ClothManager(new HibernateClothDao(), new extraLoggerAdapter());
		
		Cloth cloth1 = new Cloth("Vest","Macy's","Cotton",5,78910,80);
		Cloth cloth2 = new Cloth("Jacket","Harley Davidson","Leather",1,78920,170);
		
		clothService.deliver(cloth2);
		clothService.takeBack(cloth2);
		
		clothService.deliver(cloth1);
		clothService.takeBack(cloth1);

	}

}
