package edunova;

import javax.swing.JOptionPane;

public class TestLjubavi {
public static void main(String[] args) {
	
	String name1 = JOptionPane.showInputDialog("unesi ime 1");
	
	String name2 = JOptionPane.showInputDialog("unesi ime 2");
	
	String name3 = name1.concat(name2);
	
	int count=0;
	
	for(int i=0; i< name3.length(); i++) {
		if(name3.charAt(i) != ' ')
			count++;
	}
	
}
	
	
	static int rekurzija(String name3, char searchedChar, int index) {
		if(index >= name3.length()) {
			return 0;
		}
		int count = name3.charAt(index) == searchedChar ? 1 : 0;
		return count + rekurzija(name3, searchedChar, index + 1);
	
	
	
	
	
	
}
}