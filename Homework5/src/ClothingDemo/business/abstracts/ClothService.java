package ClothingDemo.business.abstracts;

import java.util.List;

import ClothingDemo.entities.concretes.Cloth;

public interface ClothService {
	
	void deliver(Cloth cloth);
	void takeBack(Cloth cloth);
	List<Cloth> getAllSold();

}
