package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	public static void main(String[] args) {

		int prvi = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi cijeli broj"));

		int drugi = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi cijeli broj"));

		int zbroj = 0;

		int manji = prvi < drugi ? prvi : drugi;

		int veci = prvi > drugi ? prvi : drugi;

		for (int i = manji; i <= veci; i++) {
			if (i % 2 != 0) {
				zbroj += i;
			}
		}

		System.out.println(zbroj);
	}

}
