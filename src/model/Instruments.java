package model;

public abstract class Instruments{
	protected String idNumber;
	//relationships
	protected Distributor distributionCompany;
	protected Place place;
	protected Dimension dimensions;
	//constructor
	public Instruments(String idNumber, Distributor distributionCompany, Place place, Dimension dimensions){
		this.idNumber = idNumber;
		this.distributionCompany = distributionCompany;
		this.place = place;
		this.dimensions = dimensions;
	}
	//set
	public void setIdNumber(String idNumber){
		this.idNumber = idNumber;
	}
	public void setDistributionCompany(Distributor distributionCompany){
		this.distributionCompany = distributionCompany;
	}
	public void setPlace(Place place){
		this.place = place;
	}
	public void setDimensions(Dimension dimensions){
		this.dimensions = dimensions;
	}
	//get
	public String getIdNumber(){
		return idNumber;
	}
	public Distributor getDistributionCompany(){
		return  distributionCompany;
	}
	public Place getPlace(){
		return place;
	}
	public Dimension getDimensions(){
		return dimensions;
	}
	//toString
	public String toString(){
		String answer = "\nID: " + idNumber + "\nDistribuidor: " + distributionCompany.toString() + 
		"\nUbicacion: " + place + "\nDimensiones: " + dimensions.toString();
		return answer;
	}
}