package p;

public class DidadasSportschuhe extends Schuh{

	DidadasSportschuhe() {
		marke = "Didadas";
		typ = "Sportschuhe";
		farbe = "schwarz";
	}

	public static Schuh fabrikmethode() {
		return new DidadasSportschuhe();
	}

}
