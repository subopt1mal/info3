package p;

public class EnkiSportschuhe extends Schuh{

	EnkiSportschuhe() {
		marke = "Enki";
		typ = "Sportschuhe";
		farbe = "rosa";
	}

	public static Schuh fabrikmethode() {
		return new EnkiSportschuhe();
	}

}
