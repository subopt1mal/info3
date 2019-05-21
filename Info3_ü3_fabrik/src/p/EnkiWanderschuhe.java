package p;

public class EnkiWanderschuhe extends Schuh{

	EnkiWanderschuhe() {
		marke = "Enki";
		typ = "Wanderschuhe";
		farbe = "lapislazuli";
	}

	public static Schuh fabrikmehtode() {
		return new EnkiWanderschuhe();
	}

}
