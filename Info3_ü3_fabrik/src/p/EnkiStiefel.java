package p;

public class EnkiStiefel extends Schuh{

	EnkiStiefel() {
		marke = "Enki";
		typ = "Stiefel";
		farbe = "grau";
	}

	public static Schuh fabrikmethode() {
		return new EnkiStiefel();
	}

}
