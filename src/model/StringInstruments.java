package model;

public abstract  class StringInstruments extends Instruments{
	//constructor
	public StringInstruments(String idNumber, Distributor distributionCompany, Place place, Dimension dimensions){
		super(idNumber, distributionCompany, place, dimensions);
	}
}