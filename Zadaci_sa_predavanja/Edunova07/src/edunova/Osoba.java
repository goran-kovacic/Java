package edunova;



public class Osoba {
	/*
	String ime;
	String prezime;
	int godine;
	*/
	
	private String ime;
	private String prezime;
	private int godine;
	
	
	public Osoba() {
		System.out.println("nalazim se u Osoba konstruktor");
	}
	
	
	
	
	public Osoba(String ime, String prezime, int godine) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
	}




	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}
	
	

}
