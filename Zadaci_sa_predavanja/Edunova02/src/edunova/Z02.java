package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	
	public static void main(String[] args) {
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
		
		int j = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
		
		System.out.println(i/(float)j);
		
		
	}

}
