package edunova;

import java.util.Date;

public class Grupa {
	
	private int sifra;
	private String naziv;
	private Smjer smjer;
	private Date datumpocetka;
	private int brojPolaznika;
	
	
	
	
	public Grupa() {
		super();
	}
	
	public Grupa(int sifra, String naziv, Smjer smjer, Date datumpocetka, int brojPolaznika) {
		super();
		this.sifra = sifra;
		this.naziv = naziv;
		this.smjer = smjer;
		this.datumpocetka = datumpocetka;
		this.brojPolaznika = brojPolaznika;
	}
	
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Smjer getSmjer() {
		return smjer;
	}
	public void setSmjer(Smjer smjer) {
		this.smjer = smjer;
	}
	public Date getDatumpocetka() {
		return datumpocetka;
	}
	public void setDatumpocetka(Date datumpocetka) {
		this.datumpocetka = datumpocetka;
	}
	public int getBrojPolaznika() {
		return brojPolaznika;
	}
	public void setBrojPolaznika(int brojPolaznika) {
		this.brojPolaznika = brojPolaznika;
	}
	
	
	

}
