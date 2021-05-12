package model;

public class WindInstruments extends Instruments{
	private Material material;
	//constructor
	public WindInstruments(String idNumber, Distributor distributionCompany, Place place, Dimension dimensions, Material material){
		super(idNumber, distributionCompany, place, dimensions);
		this.material = material;
	}
}