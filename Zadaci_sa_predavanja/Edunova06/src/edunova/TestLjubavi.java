package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TestLjubavi {
	public static void main(String[] args) {

		boolean dev = true;

		String name1 = dev ? "Marta" : JOptionPane.showInputDialog("unesi ime 1");

		String name2 = dev ? "Manuel" : JOptionPane.showInputDialog("unesi ime 2");


		String name = name1.toLowerCase() + name2.toLowerCase(); // name1name2

		int[] array1 = new int[name.length()];

		int count;
		char letter;

		for (int i = 0; i < name.length(); i++) {

			letter = name.charAt(i);
			count = 0;
			for (int j = 0; j < name.length(); j++) {
				if (name.charAt(j) == letter) {
					count++;
				}

			}
			array1[i] = count;
			System.out.print(name.charAt(i) + " ");
		}

		System.out.println();
		System.out.println(Arrays.toString(array1));

		System.out.println(ljubav(array1));
	}

	private static int ljubav(int[] array1) {

		if (array1.length < 3) {
			String s = "";
			for (int i : array1) {
				s += i;
			}
			if (Integer.parseInt(s) < 100) {
				return Integer.parseInt(s);
			}
		}

		int[] newArray = new int[array1.length % 2 == 0 ? array1.length / 2 : array1.length / 2 + 1];
		
		for (int i = 0, j = array1.length - 1; i <= j; i++, j--) {

			newArray[i] += (i != j ? array1[i] + array1[j] : array1[i]);
			

		}
		System.out.println(Arrays.toString(newArray));
		return ljubav(newArray);

	}

}
