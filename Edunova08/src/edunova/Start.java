package edunova;

public class Start {
	
	public static void main(String[] args) {
		
		Osoba osoba = new Osoba(1, "pero", "peric");
		
		System.out.println(osoba);
		
		Osoba stanovnik = new Osoba(1, "pero", "peric");
		
		System.out.println(osoba.equals(stanovnik));
		
		
		
	}

}
