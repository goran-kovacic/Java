package decisionAndLoop;

public class ExtractDigits {
	
	public static void main(String[] args) {
		
		int n = 15432;
		
		int digit;
		
		while(n>0) {
			
			digit = n % 10; 			
			n = n / 10;			
			System.out.print(digit + " ");
			
		}
		
	}

}
