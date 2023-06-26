package edunova;

import javax.swing.JOptionPane;

public class TablicaMnozenja {
	public static void main(String[] args) {

		System.out.println("-------------------------------\n"

				+ ": : :  TABLICA  MNOZENJA  : : :\n"

				+ "-------------------------------\n"

				+ " * |  1  2  3  4  5  6  7  8  9\n"

				+ "-------------------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.print(" " + i + " |");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
				if (j == 9) {
					System.out.println();
				}
			}
		}

		System.out.println("-------------------------------");

		String ime = ":by " + JOptionPane.showInputDialog("unesi ime");

		String formatirano = String.format("%31s", ime).replaceAll("   ", ":  ");

		System.out.println(formatirano);

		System.out.println("-------------------------------");
	}
}