package model;

public class WavingInstruments extends  PercussionInstruments{
	private String material;
	//constructor
	public WavingInstruments(String idNumber, Distributor distributionCompany, Place place, Dimension dimensions, String material){
		super(idNumber, distributionCompany, place, dimensions);
		this.material = material;
	}
}