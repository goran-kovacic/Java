package decisionAndLoop;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		System.out.println("The first 20 Fibonacci numbers:");
		
		int fn;
		int n=3;
		int fnMinus1=1;
		int fnMinus2=1;
		int sum=0;
		
		System.out.print(fnMinus1 + " " + fnMinus2 + " ");
		
		while(n<=20) {
			
			fn = fnMinus2 + fnMinus1;
			sum+=fn;
			System.out.print(fn + " ");
			
			++n;
			fnMinus2=fnMinus1;
			fnMinus1=fn;
		}
		
		System.out.println("\n" + (double) sum / 20);
		
	}

}
