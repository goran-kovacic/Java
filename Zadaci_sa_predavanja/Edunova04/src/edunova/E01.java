package edunova;

public class E01 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i += 1) {
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}

		for (int i = 100; i > 0; i -= 5) {
			System.out.println(i);

		}

		int zbroj = 0;
		for (int i = 1; i <= 100; i++) {
			zbroj += i;
		}
		System.out.println(zbroj);

		for (int i = 1; i <= 27; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		int niz[] = { 2, 2, 3, 4, 5, 5, 6 };

		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}

		for (;;) {
			System.out.println(Math.random() + " " + Math.random() + " " + Math.random());
			break;
		}

		for (int i = 0; i < 10; i++) {
			if (i == 7) {
				break;
			}
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			if (i == 3 || i == 7) {
				continue;
			}
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			if (i == 3 || i == 7) {
				continue;
			}
			if (i == 8) {
				break;
			}
			System.out.println(i);
		}

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i * j + " ");
			}
			System.out.println();
		}

		vanjska: for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				break vanjska;
			}
		}

	}

}
