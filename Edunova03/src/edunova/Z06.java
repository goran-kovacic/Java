package edunova;

import javax.swing.JOptionPane;

public class Z06 {
	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("unesi cijeli broj"));

		if (i > 999 || i < 1) {
			System.out.println("greska");
			return;
			}
		
		int prva = Integer.parseInt(Integer.toString(i).substring(0,1));
		
		System.out.println(prva);
		
	}

}
