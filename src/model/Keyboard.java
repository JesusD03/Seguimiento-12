package model;

public class Keyboard{
	private int amountOctavas;
	private String material;
	//relationships
	private Dimension dimensions;
	//constructor
	public Keyboard(int amountOctavas, String material, double width, double length, double high){
		this.amountOctavas = amountOctavas;
		this.material = material;
		dimensions = new Dimension(width, length, high);
	}
	//set
	public void setDimension(Dimension dimensions){
		this.dimensions = dimensions;
	}
	//get
	public Dimension getDimension(){
		return dimensions;
	}
}