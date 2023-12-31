package edunova;

import java.util.Scanner;

public class Izbornik {
	
	private ObradaSmjer obradaSmjer;
	private ObradaPolaznik obradaPolaznik;
	private ObradaGrupa obradaGrupa;
	
	
	

	public ObradaSmjer getObradaSmjer() {
		return obradaSmjer;
	}

	public ObradaPolaznik getObradaPolaznik() {
		return obradaPolaznik;
	}

	public Izbornik() {
		obradaSmjer = new ObradaSmjer();
		obradaPolaznik = new ObradaPolaznik();
		obradaGrupa = new ObradaGrupa(this);
		Pomocno.ulaz = new Scanner(System.in);
		pozdravnaPoruka();
		prikaziIzbornik();
		Pomocno.ulaz.close();
	}
	
	private void pozdravnaPoruka() {
		System.out.println("************************************");
		System.out.println("*** Edunova Console OOP APP v1.0 ***");
		System.out.println("************************************");
		
	}
	
	private void prikaziIzbornik() {
		
		System.out.println("Glavni izbornik");
		System.out.println("1.Smjerovi");
		System.out.println("2.Polaznici");
		System.out.println("3.Predavaci");
		System.out.println("4.Grupe");
		System.out.println("5.Izlaz iz programa");
		ucitajStavkuIzbornika();
	}

	private void ucitajStavkuIzbornika() {
		
		switch(Pomocno.unosRasponBroja("Odaberi stavku izbornika: ",
				"Obavezno 1-5", 1,5)) {
		
		case 1:
			obradaSmjer.prikaziIzbornik();
			prikaziIzbornik();
			break;
		
		case 2:
			obradaPolaznik.prikaziIzbornik();
			prikaziIzbornik();
			break;
			
		case 3:
			System.out.println("Predavaci");
			prikaziIzbornik();
			break;
			
		case 4:
			obradaGrupa.prikaziIzbornik();
			prikaziIzbornik();
			break;
			
		case 5:
			System.out.println("doviđenja");
			break;
		}
		
				
	}
	
}
