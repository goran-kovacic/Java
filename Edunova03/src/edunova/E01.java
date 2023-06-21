package edunova;

import javax.swing.JOptionPane;

public class E01 {

	public static void main(String[] args) {

		boolean uvjet = false;

		if (uvjet) {
			System.out.println("1");
		} else {
			System.out.println("2");

		}

		int i = 1;

		if (i > 0) {
			System.out.println("3");
		}

		if (i == 0)
			System.out.println("4");
		System.out.println("5");

		boolean tocno = true;

		if (tocno) {
			System.out.println("6");
		}

		int t = 2;
		int k = 3;

		if (t != 0) {
			if (k > -8) {
				System.out.println("7");
			}
		}

		if (t != 0 & k > -8) {
			System.out.println("8");
		}

		if (t != 0 && k > -8) {
			System.out.println("9");
		}

		if (t == 2 | k > 7) {
			System.out.println("10");
		}

		if (t == 2 || k > 7) {
			System.out.println("11");
		}

		if (!tocno) {
			System.out.println("12");
		} else {
			System.out.println("123");
		}

		int ocjena = 3;

		if (ocjena == 1) {
			System.out.println("nedovoljan");
		} else if (ocjena == 2) {
			System.out.println("doovljan");

		} else {
			System.out.println("super");
		}

		int broj = Integer.parseInt(JOptionPane.showInputDialog("unesi broj"));

		if (broj % 2 == 0) {
			System.out.println("paran");
		} else {
			System.out.println("neparan");
		}

		System.out.println("broj je " + (broj % 2 != 0 ? "ne" : "") + "paran");

	}

}
