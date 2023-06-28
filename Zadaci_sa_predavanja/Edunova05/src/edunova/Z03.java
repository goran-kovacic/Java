package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	public static void main(String[] args) {

		int velicinaNiza = Integer.parseInt(JOptionPane.showInputDialog("unesi velicinu niza"));

		int[] niz = new int[velicinaNiza];

		int brojac = 0;

		while (brojac < velicinaNiza) {
			niz[brojac++] = Integer.parseInt(JOptionPane.showInputDialog("unesi broj niza"));
		}

		for (int en : niz) {
			System.out.println(en);
		}
	}

}
