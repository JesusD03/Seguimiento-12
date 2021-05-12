package model;

public class RubbedsInstruments extends StringInstruments{
	private int stringNumber;
	private Bow bow;
	//constructor
	public RubbedsInstruments(String idNumber, Distributor distributionCompany, Place place, Dimension dimensions, int stringNumber, Bow bow){
		super(idNumber, distributionCompany, place, dimensions);
		this.stringNumber = stringNumber;
		this.bow = bow;
	}
}