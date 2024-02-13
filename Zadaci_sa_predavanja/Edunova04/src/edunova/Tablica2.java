package edunova;

import javax.swing.JOptionPane;

public class Tablica2 {

	public static void main(String[] args) {

		boolean dev = true;

		int a = dev ? 10 : Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));

		int b = dev ? 10 : Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
		
	
		

		for (int i = 1; i <= b; i++) {
			if (i == 1) {
				System.out.print(" *  |");
				System.out.printf("%4d", i++);
			}
			System.out.printf("%4d", i);

		}

		System.out.println();

		for (int i = 1; i <= (b * 4 + 5); i++) {
			System.out.print("-");
		}

		System.out.println();

		for (int i = 1; i <= a; i++) {
			if(i<=9) {
				System.out.print(" " + i + "  |");
			}
			else {
			System.out.print(" " + i + " |");}
			for (int j = 1; j <= b; j++) {
				System.out.printf("%4d", i * j);
				if (j == b) {
					System.out.println();
				}
			}
		}


		for (int i = 1; i <= (b * 4 + 5); i++) {
			System.out.print("-");
		}

		System.out.println();
		
		
		
		String ime = "by " + JOptionPane.showInputDialog("unesi ime");

//		String formatirano = String.format("%s", ime).replaceAll("   ", ":  ");

//		System.out.println(formatirano);
	
		for (int i=0;i<b*4+5;i++) {
			if(i*3+ime.length()<(b*4+3)) {
				System.out.print(":  ");
			}
		
		}
		
		System.out.println(ime);
		
		for (int i = 1; i <= (b * 4 + 5); i++) {
			System.out.print("-");
		}

//	System.out.println(ime.length());

	}

}
