package edunova;

public class E03Rekurzija {
	
	public static void main(String[] args) {
		
		System.out.println(faktorijel(5));
	}
	
	private static void metoda() {
		metoda();
	}

	
	static int faktorijel(int broj) {
		if(broj==1) {
			return broj;
			
		}
		return broj * faktorijel(broj-1);
	}
}
