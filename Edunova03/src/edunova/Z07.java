package edunova;

import javax.swing.JOptionPane;

public class Z07 {
	public static void main(String[] args) {
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi cijeli broj"));

		int j = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi cijeli broj"));
		
		if(i%2==0 && j%2==0) {
			System.out.println(i+j);
		}else {
			System.out.println(i-j);
		}
	}

}
