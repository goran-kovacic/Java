package edunova;

import java.util.ArrayList;
import java.util.List;

import edunova.model.Smjer;

public class ObradaSmjer {
	
	private List<Smjer> smjerovi; 
	
	
	public ObradaSmjer() {
		smjerovi = new ArrayList<>();
		if(Pomocno.dev) {
			testniPodaci();
		}
		
		
	}
	
	
	private void testniPodaci() {
		smjerovi.add(new Smjer(1, "java programiranje", 100, 100, 100, true));
		smjerovi.add(new Smjer(2, "web programiranje", 100, 100, 100, true));
		smjerovi.add(new Smjer(3, "web dizajn", 100, 100, 100, true));
		
	}


	public void prikaziIzbornik() {
		System.out.println("Smjer izbornik");
		System.out.println("1. Pregled postojecih smjerova");
		System.out.println("2. Unos novog smjera");
		System.out.println("3. Promjena postojeceg smjera");
		System.out.println("4. Brisanje postojeceg smjera");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
	}


	private void ucitajStavkuIzbornika() {
		
		switch(Pomocno.unosRasponBroja("Odaberi stavku smjer izbornika: ",
				"Odabir mora biti 1-5", 1, 5)) {
		
		case 1:
			pregledSmjerova();
			prikaziIzbornik();
			break;
		
		case 2:
			dodavanjeSmjera();
			prikaziIzbornik();
			break;
		
		case 5:
			break;
		
		}
		
	}


	private void pregledSmjerova() {
		for(Smjer s : smjerovi) {
			System.out.println(s.getNaziv());
		}
		
	}


	private void dodavanjeSmjera() {
		
		Smjer s = new Smjer();
		s.setSifra(Pomocno.unosRasponBroja("Unesi sifru smjera: ", "Pozitivan broj",
				0, Integer.MAX_VALUE));
		s.setNaziv(Pomocno.unosString("Unesi naziv smjer: ", "naziv obavezan"));
		s.setTrajanje(Pomocno.unosRasponBroja("unesi trajanje smjera", "broj izmedju 30 i 360",
				30, 360));
		
		smjerovi.add(s);
		
	}

}
