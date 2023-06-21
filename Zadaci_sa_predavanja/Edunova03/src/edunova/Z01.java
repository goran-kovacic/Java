package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	public static void main(String[] args) {
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("unesi cijeli broj"));
		
		if(i<10) {
			System.out.println("osijek");
		}else {
			System.out.println("donji miholjac");
		}
	}

}
