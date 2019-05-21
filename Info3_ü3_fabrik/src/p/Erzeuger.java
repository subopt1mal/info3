package p;

public abstract class Erzeuger {

	
	/*public static Schuh fabrikmethode(String hersteller, String typ) {
		if(hersteller.equals("Didadas")) {
			if(typ.equals("Sportschuhe")) {
				return DidadasSportschuhe.fabrikmethode();
			}
			else if(typ.equals("Wanderschuhe")) {
				return DidadasWanderschuhe.fabrikmethode();
			}
			else if(typ.equals("Stiefel")) {
				return DidadasStiefel.fabrikmethode();
			}
		}
		else if(hersteller.equals("Umap")) {
			if(typ.equals("Sportschuhe")) {
				return UmapSportschuhe.fabrikmethode();
			}
			else if(typ.equals("Wanderschuhe")) {
				return UmapWanderschuhe.fabrikmethode();
			}
			else if(typ.equals("Stiefel")) {
				return UmapStiefel.fabrikmethode();
			}
		}
		else if(hersteller.equals("Enki")) {
			if(typ.equals("Sportschuhe")) {
				return EnkiSportschuhe.fabrikmethode();
			}
			else if(typ.equals("Wanderschuhe")) {
				return EnkiWanderschuhe.fabrikmehtode();
			}
			else if(typ.equals("Stiefel")) {
				return EnkiStiefel.fabrikmethode();
			}
		}
		return null;
	}*/
	
	public abstract Schuh fabrikmethode();
}
