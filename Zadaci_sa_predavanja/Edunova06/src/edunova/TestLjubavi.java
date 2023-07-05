package edunova;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class TestLjubavi {
	public static void main(String[] args) {

		boolean dev = true;

		String name1 = dev ? "Marta" : JOptionPane.showInputDialog("unesi ime 1");

		String name2 = dev ? "Manuel" : JOptionPane.showInputDialog("unesi ime 2");


		String name = name1.toLowerCase() + name2.toLowerCase(); // name1name2

		int[] initialArray = new int[name.length()];

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
			initialArray[i] = count;
			System.out.print(name.charAt(i) + " ");
		}

		System.out.println();
		System.out.println(Arrays.toString(initialArray));

		System.out.println(ljubav(initialArray));
		
		

	System.out.println(Arrays.toString(getSingleDigits(132)));
	}

	private static int ljubav(int[] initialArray) {

		if (initialArray.length < 3) {
			String s = "";
			for (int i : initialArray) {
				s += i;
			}
			if (Integer.parseInt(s) < 100) {
				return Integer.parseInt(s);
			}
		}

		//int[] newArray = new int[array1.length % 2 == 0 ? array1.length / 2 : array1.length / 2 + 1];
		
		int[] newArray =  new int[initialArray.length % 2 == 0 ? initialArray.length / 2 : initialArray.length / 2 + 1];
		
		
		
		for(int i=0, j=initialArray.length-1; i<=j; i++, j--) {
			newArray[i] += (i != j ? initialArray[i] + initialArray[j] : initialArray[i]);
		
			

		}
		
		System.out.println(Arrays.toString(separateDoubleDigits(newArray)));
		return ljubav(separateDoubleDigits(newArray));

	}

	
	
	
	
	
	
	
	public static int[] separateDoubleDigits(int[] initialArray) {
		int count = 0;	//velicina novog niza sa odvojenim znamenkama
		
		for (int number : initialArray) {
			if(isDoubleDigit(number)) {
				count += countDigits(number);
			}else {
				count++;
			}
				
		}
		
		int[] separatedArray = new int[count];	//niz sa odvojenim znamenkama
		int index = 0;
		
		for(int number : initialArray) {
			if (isDoubleDigit(number)) {
				int[] digits = getSingleDigits(number);
				for(int digit : digits) {
					separatedArray[index] = digit;
					index++;
				}
			}else {
				separatedArray[index] = number;
				index++;
			}
		}
		
		return separatedArray;
	}
	
	public static boolean isDoubleDigit(int number) {
		return number >= 10 && number <=99;
	}
	
	public static int countDigits(int number) {
		int count = 0;
		while (number > 0) {
			count++;
			number /= 10;
		}
		return count;
	}
		
	public static int[] getSingleDigits (int number){
		int numberOfDigits = countDigits(number);
		int[] digits = new int[numberOfDigits];
		int index = numberOfDigits -1;
		
		while(number > 0) {
			digits[index] = number % 10;
			number /= 10;
			index--;
		}
		
		/*while(number>9) {				//ovo ne radi
			digits[index]=number / 10;
			number = number % 10;
			if(number<10) {
				digits[index]=number;
			}
		}*/
		return digits;
	}
}
