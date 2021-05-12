package model;

public class ExternalElements{
	private String material;
	private int amount;
	//relationships
	private Dimension dimension;
	//constructor
	public ExternalElements(String material, int amount, Dimension dimension){
		this.material = material;
		this.amount = amount;
		this.dimension = dimension;
	}
	//set
	public void setMaterial(String material){
		this.material = material;
	}
	public void setAmount(int amount){
		this.amount = amount;
	}
	public void setDimension(Dimension dimension){
		this.dimension = dimension;
	}
	//get
	public String getMaterial(){
		return material;
	}
	public  int getAmount(){
		return  amount;
	}
	public  Dimension getDimension(){
		return dimension;
	}
}