package printApp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Helper {

	public static Scanner input;
	public static boolean DEV;

	private static final String DATE_FORMAT = "dd. MM. yyyy.";
	private static SimpleDateFormat df = new SimpleDateFormat(DATE_FORMAT);

	public static boolean yesOrNo(String message) {
		String s;

		while (true) {

			System.out.println(message);
			s = input.nextLine().trim().toLowerCase();

			if (s.equals("y")) {
				System.out.println();
				return true;
			} else if (s.equals("n")) {
				System.out.println();
				return false;
			} else {
				System.out.println("Answer must be \"y\" or \"n\"");
			}
		}

	}

	public static int inputNumberRange(String message, String error, int min, int max) {

		int i;
		while (true) {
			try {
				System.out.print(message);
				i = Integer.parseInt(input.nextLine());

				if (i >= min && i <= max) {
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
		String s = "";
		while (true) {
			System.out.print(message);
			s = input.nextLine();
			if (s.trim().length() > 0) {
				return s;
			}
			System.out.println(error);
		}
	}

	public static Date inputDate(String message) {
		while (true) {
			try {
				System.out.println(message);
				return df.parse(input.nextLine());
			} catch (Exception e) {
				System.out.println("Date must be formatted as " + DATE_FORMAT + "i.e. " + df.format(new Date()));
			}

		}

	}

	public static float inputFloat(String message, String error) {
		while(true) {
			try {
				System.out.println(message);
				return Float.parseFloat(input.nextLine());
			} catch (Exception e) {
				System.out.println(error);
			}
		}
	}

}
