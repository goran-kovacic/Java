package edunova;

public class Som extends Riba {
	
	private int	 duzinaBrkova;

	public Som(String latinskiNaziv, int dubinaZarona, int dob) {
		super(latinskiNaziv, dubinaZarona);
		this.duzinaBrkova = dob;
	}

	public Som() {
		super();
	}

	public int getDob() {
		return duzinaBrkova;
	}

	public void setDob(int dob) {
		this.duzinaBrkova = dob;
	}
	
	

}
