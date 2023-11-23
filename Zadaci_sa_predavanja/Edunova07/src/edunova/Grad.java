package edunova;

public class Grad {

	private String naziv;
	private String zupanija;
	private int brojStanovnika;
	private boolean glavniGrad;
	private double prosjecnaTemp;
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getZupanija() {
		return zupanija;
	}
	public void setZupanija(String zupanija) {
		this.zupanija = zupanija;
	}
	public int getBrojStanovnika() {
		return brojStanovnika;
	}
	public void setBrojStanovnika(int brojStanovnika) {
		this.brojStanovnika = brojStanovnika;
	}
	public boolean isGlavniGrad() {
		return glavniGrad;
	}
	public void setGlavniGrad(boolean glavniGrad) {
		this.glavniGrad = glavniGrad;
	}
	public double getProsjecnaTemp() {
		return prosjecnaTemp;
	}
	public void setProsjecnaTemp(double prosjecnaTemp) {
		this.prosjecnaTemp = prosjecnaTemp;
	}
	
	
	
}
