package edunova;

public class Pas extends Sisavac {

	private String pasmina;

	public Pas(String latinskiNaziv, int danaGraviditeta, String pasmina) {
		super(latinskiNaziv, danaGraviditeta);
		this.pasmina = pasmina;
	}

	public Pas() {
		super();
	}

	public String getPasmina() {
		return pasmina;
	}

	public void setPasmina(String pasmina) {
		this.pasmina = pasmina;
	}
	
	
}
