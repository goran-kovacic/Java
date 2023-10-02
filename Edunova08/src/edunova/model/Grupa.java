package edunova.model;

import java.util.Date;

public class Grupa extends Entitet{
	
	private String naziv;
	private Smjer smjer;
	private int maxPolaznika;
	private Predavac predavac;
	private Date datumPocetka;
	private Polaznik[] polaznici;
	
	
	
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
	public int getMaxPolaznika() {
		return maxPolaznika;
	}
	public void setMaxPolaznika(int maxPolaznika) {
		this.maxPolaznika = maxPolaznika;
	}
	public Predavac getPredavac() {
		return predavac;
	}
	public void setPredavac(Predavac predavac) {
		this.predavac = predavac;
	}
	public Date getDatumPocetka() {
		return datumPocetka;
	}
	public void setDatumPocetka(Date datumPocetka) {
		this.datumPocetka = datumPocetka;
	}
	public Polaznik[] getPolaznici() {
		return polaznici;
	}
	public void setPolaznici(Polaznik[] polaznici) {
		this.polaznici = polaznici;
	}
	
	

}
