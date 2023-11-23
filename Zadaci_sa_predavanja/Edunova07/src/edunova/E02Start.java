package edunova;

import java.util.Date;

public class E02Start {
	
	private Osoba osoba;

	public static void main(String[] args) {
		
		Osoba osoba = new Osoba();
		
		/*
		osoba.ime="pero";
		osoba.prezime="peric";
		osoba.godine=24;
		
		
		*/
		
		osoba.setIme("pero");
		osoba.setPrezime("peric");
		osoba.setGodine(24);
		
		Osoba[] osobe = new Osoba[5];
		
		osobe[0] = osoba;
		
		osoba = new Osoba();
		
		osoba.setIme("marija");
		osoba.setPrezime("zimska");
		osoba.setGodine(21);
		
		osobe[1] = osoba;
		
		osobe[2] = new Osoba("karlo","kat", 41);
		
		System.out.println(osobe[0].getPrezime() + " " + osoba.getPrezime() + " " + osobe[2].getIme().toString());
		
		Mjesto mjesto = new Mjesto();
		
		mjesto.setZupanija(new Zupanija("obz", 200000));
		
		System.out.println(mjesto.getZupanija().getNaziv());
		
		
		
		
		Grupa[] grupe = new Grupa[2];
		Smjer smjer = new Smjer(1, "Java programiranje", 1000.99f, true);
		
		grupe[0] = new Grupa(1, "JP27", smjer, new Date(), 25);
		
		grupe[1] = new Grupa(2, "JP28", smjer, new Date(), 25);
		
		for(Grupa g: grupe) {
			System.out.println(g.getNaziv() + " - " + g.getSmjer().getNaziv());
		}
		
	}
	
}
