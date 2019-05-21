package p;

public class DidadasWanderschuhe extends Schuh{

	DidadasWanderschuhe() {
		marke = "Didadas";
		typ = "Wanderschuhe";
		farbe = "blau";
	}

	public static Schuh fabrikmethode() {
		return new DidadasWanderschuhe();
	}

}
