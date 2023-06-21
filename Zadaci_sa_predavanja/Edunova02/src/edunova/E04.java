package edunova;

import javax.swing.JOptionPane;

public class E04 {
public static void main(String[] args) {
	
	String ulazKorisnika = JOptionPane.showInputDialog("unesi broj");
	
	int b = Integer.parseInt(ulazKorisnika);
	
	System.out.println(b);
	
	int i = Integer.parseInt(JOptionPane.showInputDialog("unesi broj"));
	
	System.out.println(i);
}
}
