package model;

public class PluckedsInstruments extends StringInstruments{
	private int stringNumber;
	private int fretsNumber;
	private boolean haveCase;
	//constructor
	public PluckedsInstruments(String idNumber, Distributor distributionCompany, Place place, Dimension dimensions, int stringNumber, int fretsNumber, boolean haveCase){
		super(idNumber, distributionCompany, place, dimensions);
		this.stringNumber = stringNumber;
		this.fretsNumber = fretsNumber;
		this.haveCase = haveCase;
	}
}