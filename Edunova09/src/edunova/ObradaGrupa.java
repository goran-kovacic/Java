package edunova;

import java.util.ArrayList;
import java.util.List;

import edunova.model.Grupa;

public class ObradaGrupa {

	private List<Grupa> grupe;
	
	public ObradaGrupa() {

		grupe = new ArrayList<>();
		
		
		
	}
	
	public void prikaziIzbornik() {
		System.out.println("Grupa izbornik");
		System.out.println("1. Pregled postojecih grupa");
		System.out.println("2. Unos nove grupe");
		System.out.println("3. Promjena postojece grupe");
		System.out.println("4. Brisanje postojece grupe");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
	}

	private void ucitajStavkuIzbornika() {
		int odabir = Pomocno.unosRasponBroja("Odaberi stavku izbornika: ", "Odabir mora biti 1-5", 1, 5);
		
		if(odabir==5) {
			return;
		}
		switch(odabir) {
	//		case 1 ->pregledGrupa();
			case 2 ->dodavanjeGrupa();
	//		case 3 ->promjenaGrupa();
	//		case 4 ->brisanjeGrupe();
		}
		prikaziIzbornik();
	}

	private void dodavanjeGrupa() {
		Grupa g = new Grupa();
		
		g.setSifra(Pomocno.unosRasponBroja("Unesi sifru grupe: ", "Pozitivan broj",
				1, Integer.MAX_VALUE));
		g.setNaziv(Pomocno.unosString("Unesi naziv grupe: ", "naziv obavezan"));
		
		grupe.add(g);
	}
	
}
