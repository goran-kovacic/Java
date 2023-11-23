package edunova.model;

public class Polaznik extends Osoba{
	
	private String brojUgovora;
	
	public Polaznik() {
		
	}
	
	

	public Polaznik(String ime, String prezime) {
		super(ime, prezime);
	}



	public String getBrojUgovora() {
		return brojUgovora;
	}

	public void setBrojUgovora(String brojUgovora) {
		this.brojUgovora = brojUgovora;
	}
	
	

}
