package p;

public class UmapSportschuhe extends Schuh{

	UmapSportschuhe() {
		marke = "Umap";
		typ = "Sportschuhe";
		farbe = "blutrot";
	}

	public static Schuh fabrikmethode() {
		return new UmapSportschuhe();
	}

}
