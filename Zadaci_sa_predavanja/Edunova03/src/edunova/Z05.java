package edunova;

import javax.swing.JOptionPane;

public class Z05 {
	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi cijeli broj"));

		int j = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi cijeli broj"));
		
		int k = Integer.parseInt(JOptionPane.showInputDialog("unesi treci cijeli broj"));
		
		if(i>j && i>k) {
			System.out.println(i);
		}else if(j>i && j>k) {
			System.out.println(j);
		}else {
			System.out.println(k);
		}
	}

}
