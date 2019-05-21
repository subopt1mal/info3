package p;

public class DidadasStiefel extends Schuh{

	DidadasStiefel() {
		marke = "Didadas";
		typ = "Stiefel";
		farbe = "grün";
	}

	public static Schuh fabrikmethode() {
		return new DidadasStiefel();
	}

}
