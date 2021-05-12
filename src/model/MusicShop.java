package model;

public class MusicShop{
	//relationships
	private Instruments[] instrumentos;
	//constructor
	public MusicShop(){
		instrumentos = new Instruments[5];
	}
	//get
	public Instruments[] getInstruments(){
		return instrumentos;
	}
	public void setInstruments(Instruments[] instrumentos){
		this.instrumentos = instrumentos;
	}
	//tostring
	public String toString(){
		String answer = "";
		for(int i = 0; i < 5; i++){
			answer+= instrumentos[i].toString() + "\n";
		}
		return answer;
	}
}