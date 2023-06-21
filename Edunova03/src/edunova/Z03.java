package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	public static void main(String[] args) {

		String grad = JOptionPane.showInputDialog("unesi grad");

		switch (grad) {
		case "osijek":
			System.out.println("zupanija 1");
			break;
		case "zagreb":
			System.out.println("zupanija 2");
			break;
		case "split":
			System.out.println("zupanija 3");
			break;
		default:
			System.out.println("nije u zupanijama");
		}
	}

}
