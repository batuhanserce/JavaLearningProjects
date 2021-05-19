package ClothingDemo.entities.concretes;

import ClothingDemo.entities.abstracts.Entity;

public class Cloth implements Entity {
	
	private String name;
	private String brand;
	private String components;
	private int amount;
	private int labelId;
	private double pricePerUnit;

	
	public Cloth(String name, String brand, String components, int amount, int labelId, double pricePerUnit) 
	{
		super();
		this.name = name;
		this.brand = brand;
		this.components = components;
		this.amount = amount;
		this.labelId = labelId;
		this.pricePerUnit = pricePerUnit;
	}

	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getBrand() 
	{
		return brand;
	}

	public void setBrand(String brand) 
	{
		this.brand = brand;
	}

	public String getComponents() 
	{
		return components;
	}

	public void setComponents(String components) 
	{
		this.components = components;
	}

	public int getAmount() 
	{
		return amount;
	}

	public void setAmount(int amount) 
	{
		this.amount = amount;
	}

	public int getLabelId() 
	{
		return labelId;
	}

	public void setLabelId(int labelId) 
	{
		this.labelId = labelId;
	}

	public double getPricePerUnit() 
	{
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) 
	{
		this.pricePerUnit = pricePerUnit;
	}
}
