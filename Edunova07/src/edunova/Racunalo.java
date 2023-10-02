package edunova;

public class Racunalo {
	
	private String procesor;
	private float cijena;
	private boolean prijenosno;
	
	
	
	
	public Racunalo() {
		super();
	}
	public Racunalo(String procesor, float cijena, boolean prijenosno) {
		super();
		this.procesor = procesor;
		this.cijena = cijena;
		this.prijenosno = prijenosno;
	}
	public String getProcesor() {
		return procesor;
	}
	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}
	public float getCijena() {
		return cijena;
	}
	public void setCijena(float cijena) {
		this.cijena = cijena;
	}
	public boolean isPrijenosno() {
		return prijenosno;
	}
	public void setPrijenosno(boolean prijenosno) {
		this.prijenosno = prijenosno;
	}
	
	
	

}
