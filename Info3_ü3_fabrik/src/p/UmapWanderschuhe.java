package p;

public class UmapWanderschuhe extends Schuh{

	UmapWanderschuhe() {
		marke = "Umap";
		typ = "Wanderschuhe";
		farbe = "beige";
	}

	public static Schuh fabrikmethode() {
		return new UmapWanderschuhe();
	}

}
