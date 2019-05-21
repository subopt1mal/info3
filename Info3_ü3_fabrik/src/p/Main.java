package p;

public class Main {

	public static void main(String[] args) {
		
		Schuh schuh1 = (new DidadasSportschuheErzeuger()).fabrikmethode();
		Schuh schuh2 = (new EnkiSportschuheErzeuger()).fabrikmethode();
		Schuh schuh3 = (new EnkiStiefelErzeuger()).fabrikmethode();
		
		schuh1.printDetails();
		schuh2.printDetails();
		schuh3.printDetails();
		
	}

}
