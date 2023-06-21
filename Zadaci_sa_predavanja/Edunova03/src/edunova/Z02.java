package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("unesi cijeli broj"));

		if (i % 2 == 0) {
			System.out.println("paran");
		} else {
			System.out.println("neparan");
		}

		System.out.println("broj je " + (i % 2 != 0 ? "ne" : "") + "paran");
	}

}
