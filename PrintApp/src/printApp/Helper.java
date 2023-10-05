package printApp;

import java.util.Scanner;

public class Helper {

	public static Scanner input;
	public static boolean dev;

	public static int inputNumberRange(String message, String error, int min, int max) {

		int i;
		while(true) {
			try {
				System.out.print(message);
				i = Integer.parseInt(input.nextLine());
				
				if(i>=min && i<=max) {
					System.out.println();
					return i;
				}
				
				System.out.println(error);
				
			} catch (Exception e) {
				System.out.println(error);
			}
		}

		
	}

	public static String inputString(String message, String error) {
		String s ="";
		while(true) {
			System.out.print(message);
			s=input.nextLine();
			if(s.trim().length()>0) {
				return s;
			}
			System.out.println(error);
		}
	}
	
	
	
}
