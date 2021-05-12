package model;

public abstract class PercussionInstruments extends Instruments{
	//constructor
	public PercussionInstruments(String idNumber, Distributor distributionCompany, Place place, Dimension dimensions){
		super(idNumber, distributionCompany, place, dimensions);
	}
}