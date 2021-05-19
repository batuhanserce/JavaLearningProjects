package ClothingDemo.dataAccess.abstracts;

import java.util.List;

import ClothingDemo.entities.concretes.Cloth;

public interface ClothDao {
	
	void add(Cloth cloth, int amount);
	void delete(Cloth cloth);
	void changePrice(Cloth cloth, double newPrice);
	double multipleSale(Cloth cloth, int number);
	Cloth get(String labelId);
	List<Cloth> getClothes();
	

}
