package edunova;

import javax.swing.JOptionPane;

public class TestLjubavi {
public static void main(String[] args) {
	
	String ime1 = JOptionPane.showInputDialog("unesi ime 1");
	
	String ime2 = JOptionPane.showInputDialog("unesi ime 2");
	
	String ime3 = ime1.concat(ime2);
	
	int count=0;
	
	for(int i=0; i< ime3.length(); i++) {
		if(ime3.charAt(i) != ' ')
			count++;
	}
	
	System.out.println(count);
	
	
}
}