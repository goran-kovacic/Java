package edunova;

import java.util.Arrays;

public class E03 {
	public static void main(String[] args) {

		int[] niz;
		String drugiNiz[];

		niz = new int[4];

		niz[0] = 2;
		niz[1] = 4;
		niz[2] = 7;
		niz[niz.length - 1] = 8;

		System.out.println(niz[2]);

		System.out.println(Arrays.toString(niz));

		int brojevi[] = { 1, 2, 3, 4 };

		System.out.println(brojevi[3]);

		int matrica[][] = new int[10][10];

		int tablica[][] = { { 1, 2, 3 }, { 4, 2, 3 }, { 3, 2, 3 } };

		System.out.println(tablica[1][1]);

	}
}
