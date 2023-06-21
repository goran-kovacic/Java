package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	public static void main(String[] args) {
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi cijeli broj"));
		
		int j = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi cijeli broj"));
		
		if(i>j) {
			System.out.println(i);
		}else if(j>i){
			System.out.println(j);
		}else {
			System.out.println("");
		}

	}
}
