package edunova;

import javax.swing.JOptionPane;

public class E05 {
	public static void main(String[] args) {
		int broj = Integer.parseInt(JOptionPane.showInputDialog("unesi broj"));

		broj = broj + 5;

		System.out.println(broj);
	}

}
