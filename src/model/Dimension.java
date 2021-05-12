package model;

public class Dimension{
	private double width;
	private double length;
	private double high;
	//constructor
	public Dimension(double width, double length, double high){
		this.width = width;
		this.length = length;
		this.high = high;
	}
	//set
	public void setWidth(double width){
		this.width = width;
	}
	public void setLength(double length){
		this.length = length;
	}
	public void setHigh(double high){
		this.high = high;
	}
	//get
	public double getWidth(){
		return width;
	}
	public double getLength(){
		return length;
	}
	public double getHigh(){
		return high;
	}
	//toString
	public String toString(){
		String answer = "\n Ancho: " + width + "\n Largo: " + length + "\n Alto: " + high;
		return answer;
	}
}