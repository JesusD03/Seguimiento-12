package ui;

import model.Instruments;
import model.WindInstruments;
import model.PercussedsInstruments;
import model.PercussionsInstruments;
import model.PluckedsInstruments;
import model.WavingInstruments;
import model.StringInstruments;
import model.Material;
import model.Distributor;
import model.Dimension;
import model.Place;
import model.Keyboard;
import model.Box;
import model.Orientation;
import model.MusicShop;
import java.util.Scanner;                         	// javac -cp src src/ui/Main.java -d bin
													// java -cp bin ui.Main
													// javadoc -cp src src/ui/Main.java -d docs/javadoc/
public class Main{
	public Scanner sc = new Scanner(System.in);

	public static void main (String [] args){
		Main nuevo = new Main();
		System.out.println("Bienvenido a la aplicacion de En Clave de Sol");
		nuevo.execute();		
	}
	public void execute(){
		Instruments[] instrumentos = new Instruments[5];
		instrumentos[0] = new WindInstruments("A001",new Distributor("Instrumentos S.A.", "Calle #2", "3452485486"), Place.BODEGA,new Dimension(2.25, 2,  2.75), Material.MADERA);
		instrumentos[1] = new PercussedsInstruments("A002",new Distributor("Instrumentos S.A.", "Calle #3", "3542684257"), Place.EXHIBICION,new Dimension(2.25, 2,  2.75));
		instrumentos[2] = new WavingInstruments("A003",new Distributor("Instrumentos S.A.", "Calle #4", "321587459"), Place.DISTRIBUIDOR,new Dimension(2.25, 2,  2.75), "Madera");
		instrumentos[3] = new PluckedsInstruments("A004",new Distributor("Instrumentos S.A.", "Calle #5", "3685249574"), Place.EXHIBICION,new Dimension(2.25, 2,  2.75), 2, 2, true);
		instrumentos[4] = new PercussionsInstruments("A005",new Distributor("Instrumentos S.A.", "Calle #6", "3154865249"), Place.DISTRIBUIDOR,new Dimension(2.25, 2,  2.75), Orientation.VERTICAL, new Box(2, 3, 2), new Keyboard(8, "Madera", 10, 15, 5));
		for(int i = 0; i < 5; i++){
			System.out.println(instrumentos[i].toString() + "\n");
		}
		}

}