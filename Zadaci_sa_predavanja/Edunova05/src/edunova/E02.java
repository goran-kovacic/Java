package edunova;

public class E02 {
	public static void main(String[] args) {

		do {
			System.out.println("ispisuje se");
		} while (false);

		int suma = 0;
		int i = 1;
		do {
			suma += i;

		} while (i++ < 100);
		System.out.println(suma);
	}
}
