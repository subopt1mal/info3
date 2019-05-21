package p;

public class Schuh {

	public String marke;
	public String typ;
	public String farbe;
	
	public Schuh() {
		
	}
	
	public void printDetails() {
		System.out.println("Marke: "+marke+"\nTyp: "+typ+"\nFarbe: "+farbe+"\nKlasse: "+this.getClass()+"\n");
	}

}
