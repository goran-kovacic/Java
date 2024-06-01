package strings;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String inputString;
		int inputStringLength;
		StringBuilder sb = new StringBuilder();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		inputString = s.next();
		inputStringLength = inputString.length();
		
		for( int characterIndex = inputStringLength-1; characterIndex >=0; --characterIndex) {
			sb.append(inputString.charAt(characterIndex));
		}
		
		System.out.println("Reverse String: " + sb);

		s.close();
		
	}

}
