package model;

public class PercussionsInstruments extends StringInstruments{
	//relationships
	private Orientation orientation;
	private Box box;
	private Keyboard keyboard;
	//constructor
	public PercussionsInstruments(String idNumber, Distributor distributionCompany, Place place, Dimension dimensions, Orientation orientation, Box box, Keyboard keyboard){
		super(idNumber, distributionCompany, place, dimensions);
		this.orientation = orientation;
		this.box = box;
		this.keyboard = keyboard;
	}
}