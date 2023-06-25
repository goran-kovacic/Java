package edunova;

import javax.swing.JOptionPane;

public class E04 {
	public static void main(String[] args) {

		int broj;

		for (;;) {
			broj = Integer.parseInt(JOptionPane.showInputDialog("unesi broj izmedju 1 i 10"));
			if (broj >= 1 && broj <= 10) {
				break;
			}
			System.out.println("nije dobar");
		}
		System.out.println(broj);
	}

}
