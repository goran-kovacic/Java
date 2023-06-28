package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	public static void main(String[] args) {

		int i;
		int j;

		do {
			i = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
			if (i >= 20 && i <= 80) {
				break;
			}
		} while (true);

		do {
			j = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
			if (j >= 20 && j <= 80) {
				break;
			}
		} while (true);

		int manji = i < j ? i : j;
		int veci = i > j ? i : j;

		int broj = veci;

		do {
			if (broj % 2 == 1) {
				System.out.println(broj);
			}
		} while (--broj >= manji);
	}

}
