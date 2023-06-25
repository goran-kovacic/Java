package edunova;

public class E05 {

	public static void main(String[] args) {

		int broj = 77;

		boolean prim = true;
		for (int i = 2; i < broj; i++) {
			if (broj % i == 0) {
				prim = false;
				break;
			}
		}

		System.out.println(broj + (prim ? " je" : " nije") + " prim broj");
	}

}
