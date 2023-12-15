package decisionAndLoop;

public class SumAverageRunningInt {
	
	public static void main(String[] args) {
		
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		int sumOdd = 0;
		int sumEven = 0;
		for(int number = LOWERBOUND; number<=UPPERBOUND; number++) {
			if(number%2==0) {
				sumEven+=number;
			}else {
				sumOdd+=number;
			}
		}
		
		System.out.println(sumEven + "\n" + sumOdd);		
						
	}

}
