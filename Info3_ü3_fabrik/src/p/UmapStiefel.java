package p;

public class UmapStiefel extends Schuh{

	UmapStiefel() {
		marke = "Umap";
		typ = "Stiefel";
		farbe = "ockergelb";
	}

	public static Schuh fabrikmethode() {
		return new UmapStiefel();
	}

}
