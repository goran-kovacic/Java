package edunova;

public class Start {
	
	public static void main(String[] args) {
		
//		Osoba osoba = new Osoba(1, "pero", "peric");
		
//		System.out.println(osoba);
		
//		Osoba stanovnik = new Osoba(1, "pero", "peric");
		
//		System.out.println(osoba.equals(stanovnik));
		
		Polaznik polaznik = new Polaznik(1, "marija", "otis", "2023/12");
		
		System.out.println(polaznik);
		
		Predavac predavac = new Predavac(1, "karlo", "set", "hr4542166541");
		
		System.out.println(predavac);
		
		Osoba[] osobe = new Osoba[2];
		
		osobe[0] = polaznik;
		
		osobe[1] = predavac;
		
		for(Osoba o : osobe) {
			System.out.println(o.pozdravi());
		}
		
		
	}

}
