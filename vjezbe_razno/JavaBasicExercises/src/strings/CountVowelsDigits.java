package strings;

import java.math.BigDecimal;
import java.util.Scanner;

public class CountVowelsDigits {
	
	public static void main(String[] args) {
		
		String inputString;
		Scanner s = new Scanner(System.in);		
		System.out.println("Enter a string: ");
		inputString = s.next().toLowerCase().trim();
		
		System.out.println(inputString);
		
		
		char[] c = inputString.toCharArray();
		
		int totalLength = 0;
		int vowelCounter = 0;
		int digitsCounter = 0;
		
		for (char d : c) {
			
			
			
			if(Character.isDigit(d)) {
				digitsCounter++;
			}
			
			if(d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') {
				vowelCounter++;
			}
			
			totalLength++;			
		}
		
		float vowels =( ((float)vowelCounter) / (totalLength) )* 100;
		float digits =( ((float)digitsCounter) / (totalLength) ) * 100; 
		
		System.out.printf("number of vowels: %d (%.2f %%)", vowelCounter, vowels);
		System.out.println();
		System.out.printf("number of digits: %d (%.2f %%)", digitsCounter, digits );
		
		
		
		
	}

}
