package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	public static void main(String[] args) {

		while (true) {
			int i = Integer.parseInt(JOptionPane.showInputDialog("unesi broj"));
			if (i >= 20 && i <= 50 && i != 30) {
				break;
			}
			JOptionPane.showMessageDialog(null, "nije dobro");

		}

	}

}
