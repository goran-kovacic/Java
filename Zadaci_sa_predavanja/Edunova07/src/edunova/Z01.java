package edunova;

public class Z01 {
	
	public static void main(String[] args) {
		
		Grad grad = new Grad();
		
		grad.setBrojStanovnika(50000);
		grad.setGlavniGrad(false);
		grad.setNaziv("grad1");
		grad.setProsjecnaTemp(20.2);
		grad.setZupanija("obz");
		
		System.out.println(grad.getProsjecnaTemp());
		
	}

}
