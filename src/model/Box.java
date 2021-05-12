package model;

public class Box{
	//relationships
	private Dimension dimensions;
	//constructor
	public Box(double width, double length, double high){
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