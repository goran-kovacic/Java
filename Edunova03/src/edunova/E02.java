package edunova;

public class E02 {

	public static void main(String[] args) {

		int i = 1;

		if (i == 1) {
			System.out.println("nedovoljan");
		} else if (i == 2) {
			System.out.println("dovoljan");
		} else {
			System.out.println("nije ocjena");
		}

		switch (i) {
		case 1:
			System.out.println("nedovoljan");
			break;
		case 2:
		case 3:
			System.out.println("dovoljan");
		default:
			System.out.println("nije ocjena");
		}

		String grad = "Osijek";

		switch (grad) {
		case "Osijek":
			System.out.println("najbolji");
			break;
		default:
			System.out.println("svi drugi");
		}

		char c = 'A';

		switch (c) {
		case 'A':
			System.out.println("slovo A");
			break;
		default:
			System.out.println("nije A");
		}

	}

}
